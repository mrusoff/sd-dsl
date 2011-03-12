package fr.chaunier.xtext.mapdsl.parser.antlr.internal; 

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
import fr.chaunier.xtext.mapdsl.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'.'", "'root'", "'module'", "'{'", "';'", "'}'", "'map'", "','", "'=>'", "'set left'", "'='", "'set right'", "'ignore left'", "'ignore right'", "'call module'", "'rule'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g"; }



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
        	return classLoader.getResourceAsStream("fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.tokens");
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
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:79:2: iv_ruleModel= ruleModel EOF
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
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:86:1: ruleModel returns [EObject current=null] : ( 'model' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_mappingModules_3_0= ruleMappingModule ) )* ( (lv_roots_4_0= ruleRootModule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mappingModules_3_0 = null;

        EObject lv_roots_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:91:6: ( ( 'model' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_mappingModules_3_0= ruleMappingModule ) )* ( (lv_roots_4_0= ruleRootModule ) )* ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:92:1: ( 'model' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_mappingModules_3_0= ruleMappingModule ) )* ( (lv_roots_4_0= ruleRootModule ) )* )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:92:1: ( 'model' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_mappingModules_3_0= ruleMappingModule ) )* ( (lv_roots_4_0= ruleRootModule ) )* )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:92:3: 'model' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_mappingModules_3_0= ruleMappingModule ) )* ( (lv_roots_4_0= ruleRootModule ) )*
            {
            match(input,11,FOLLOW_11_in_ruleModel120); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:96:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:97:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:97:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:98:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel141);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:120:2: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:121:1: (lv_documentation_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:121:1: (lv_documentation_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:122:3: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel158); 

                    			createLeafNode(grammarAccess.getModelAccess().getDocumentationSTRINGTerminalRuleCall_2_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:144:3: ( (lv_mappingModules_3_0= ruleMappingModule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:145:1: (lv_mappingModules_3_0= ruleMappingModule )
            	    {
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:145:1: (lv_mappingModules_3_0= ruleMappingModule )
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:146:3: lv_mappingModules_3_0= ruleMappingModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMappingModule_in_ruleModel185);
            	    lv_mappingModules_3_0=ruleMappingModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappingModules",
            	    	        		lv_mappingModules_3_0, 
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
            	    break loop2;
                }
            } while (true);

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:168:3: ( (lv_roots_4_0= ruleRootModule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:169:1: (lv_roots_4_0= ruleRootModule )
            	    {
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:169:1: (lv_roots_4_0= ruleRootModule )
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:170:3: lv_roots_4_0= ruleRootModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRootModule_in_ruleModel207);
            	    lv_roots_4_0=ruleRootModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"roots",
            	    	        		lv_roots_4_0, 
            	    	        		"RootModule", 
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:202:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:203:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:204:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName258); 

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
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:211:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:216:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:217:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:217:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:217:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName298); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:224:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:225:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleQualifiedName317); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName332); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start entryRuleRootModule
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:245:1: entryRuleRootModule returns [EObject current=null] : iv_ruleRootModule= ruleRootModule EOF ;
    public final EObject entryRuleRootModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootModule = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:246:2: (iv_ruleRootModule= ruleRootModule EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:247:2: iv_ruleRootModule= ruleRootModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRootModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRootModule_in_entryRuleRootModule379);
            iv_ruleRootModule=ruleRootModule();
            _fsp--;

             current =iv_ruleRootModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootModule389); 

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
    // $ANTLR end entryRuleRootModule


    // $ANTLR start ruleRootModule
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:254:1: ruleRootModule returns [EObject current=null] : ( 'root' ( ( RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleRootModule() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:259:6: ( ( 'root' ( ( RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:260:1: ( 'root' ( ( RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:260:1: ( 'root' ( ( RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:260:3: 'root' ( ( RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )?
            {
            match(input,13,FOLLOW_13_in_ruleRootModule424); 

                    createLeafNode(grammarAccess.getRootModuleAccess().getRootKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:264:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:265:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:265:1: ( RULE_ID )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:266:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRootModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootModule442); 

            		createLeafNode(grammarAccess.getRootModuleAccess().getRootRefMappingModuleCrossReference_1_0(), "rootRef"); 
            	

            }


            }

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:278:2: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:279:1: (lv_documentation_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:279:1: (lv_documentation_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:280:3: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRootModule459); 

                    			createLeafNode(grammarAccess.getRootModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_2_0, 
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
    // $ANTLR end ruleRootModule


    // $ANTLR start entryRuleMappingModule
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:310:1: entryRuleMappingModule returns [EObject current=null] : iv_ruleMappingModule= ruleMappingModule EOF ;
    public final EObject entryRuleMappingModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModule = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:311:2: (iv_ruleMappingModule= ruleMappingModule EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:312:2: iv_ruleMappingModule= ruleMappingModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappingModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule501);
            iv_ruleMappingModule=ruleMappingModule();
            _fsp--;

             current =iv_ruleMappingModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule511); 

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
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:319:1: ruleMappingModule returns [EObject current=null] : ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) ;
    public final EObject ruleMappingModule() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mappedFeatures_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:324:6: ( ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:325:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:325:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:325:3: 'module' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_documentation_2_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )* '}'
            {
            match(input,14,FOLLOW_14_in_ruleMappingModule546); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getModuleKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:329:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:330:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:330:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:331:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMappingModule567);
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

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:353:2: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:354:1: (lv_documentation_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:354:1: (lv_documentation_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:355:3: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingModule584); 

                    			createLeafNode(grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleMappingModule600); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:381:1: ( ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )? )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==21||(LA8_0>=23 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:381:2: ( (lv_mappedFeatures_4_0= ruleFeatureMap ) ) ( ';' )?
            	    {
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:381:2: ( (lv_mappedFeatures_4_0= ruleFeatureMap ) )
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:382:1: (lv_mappedFeatures_4_0= ruleFeatureMap )
            	    {
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:382:1: (lv_mappedFeatures_4_0= ruleFeatureMap )
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:383:3: lv_mappedFeatures_4_0= ruleFeatureMap
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureMap_in_ruleMappingModule622);
            	    lv_mappedFeatures_4_0=ruleFeatureMap();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappedFeatures",
            	    	        		lv_mappedFeatures_4_0, 
            	    	        		"FeatureMap", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:405:2: ( ';' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==16) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:405:4: ';'
            	            {
            	            match(input,16,FOLLOW_16_in_ruleMappingModule633); 

            	                    createLeafNode(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_4_1(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleMappingModule647); 

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


    // $ANTLR start entryRuleFeatureMap
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:421:1: entryRuleFeatureMap returns [EObject current=null] : iv_ruleFeatureMap= ruleFeatureMap EOF ;
    public final EObject entryRuleFeatureMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMap = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:422:2: (iv_ruleFeatureMap= ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:423:2: iv_ruleFeatureMap= ruleFeatureMap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureMapRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap683);
            iv_ruleFeatureMap=ruleFeatureMap();
            _fsp--;

             current =iv_ruleFeatureMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap693); 

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
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:430:1: ruleFeatureMap returns [EObject current=null] : ( ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) ) ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )? ( (lv_documentation_30_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeatureMap() throws RecognitionException {
        EObject current = null;

        Token lv_rules_27_0=null;
        Token lv_rules_29_0=null;
        Token lv_documentation_30_0=null;
        EObject lv_expr_11_0 = null;

        EObject lv_expr_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:435:6: ( ( ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) ) ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )? ( (lv_documentation_30_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:1: ( ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) ) ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )? ( (lv_documentation_30_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:1: ( ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) ) ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )? ( (lv_documentation_30_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:2: ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) ) ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )? ( (lv_documentation_30_0= RULE_STRING ) )?
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:2: ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 23:
                {
                alt13=3;
                }
                break;
            case 24:
                {
                alt13=4;
                }
                break;
            case 25:
                {
                alt13=5;
                }
                break;
            case 26:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("436:2: ( ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* ) | ( 'call module' ( ( RULE_ID ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:3: ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:3: ( 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:436:5: 'map' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* '=>' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )*
                    {
                    match(input,18,FOLLOW_18_in_ruleFeatureMap730); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:440:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:441:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:441:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:442:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap753);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:456:2: ( ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:456:4: ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFeatureMap764); 

                    	            createLeafNode(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_2_0(), null); 
                    	        
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:460:1: ( ( ruleQualifiedName ) )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:461:1: ( ruleQualifiedName )
                    	    {
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:461:1: ( ruleQualifiedName )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:462:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap787);
                    	    ruleQualifiedName();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,20,FOLLOW_20_in_ruleFeatureMap799); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_0_3(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:480:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:481:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:481:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:482:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap822);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:496:2: ( ',' ( ( ruleQualifiedName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:496:4: ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFeatureMap833); 

                    	            createLeafNode(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_5_0(), null); 
                    	        
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:500:1: ( ( ruleQualifiedName ) )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:501:1: ( ruleQualifiedName )
                    	    {
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:501:1: ( ruleQualifiedName )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:502:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_5_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap856);
                    	    ruleQualifiedName();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:517:6: ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:517:6: ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:517:8: 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_11_0= ruleExpression ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleFeatureMap876); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_0_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:521:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:522:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:522:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:523:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_0_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap899);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleFeatureMap909); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_1_2(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:541:1: ( (lv_expr_11_0= ruleExpression ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:542:1: (lv_expr_11_0= ruleExpression )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:542:1: (lv_expr_11_0= ruleExpression )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:543:3: lv_expr_11_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureMap930);
                    lv_expr_11_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_11_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:566:6: ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:566:6: ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:566:8: 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_expr_15_0= ruleExpression ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFeatureMap948); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetRightKeyword_0_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:570:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:571:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:571:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:572:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_0_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap971);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleFeatureMap981); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_2_2(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:590:1: ( (lv_expr_15_0= ruleExpression ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:591:1: (lv_expr_15_0= ruleExpression )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:591:1: (lv_expr_15_0= ruleExpression )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:592:3: lv_expr_15_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureMap1002);
                    lv_expr_15_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_15_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:615:6: ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:615:6: ( 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:615:8: 'ignore left' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )*
                    {
                    match(input,24,FOLLOW_24_in_ruleFeatureMap1020); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_0_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:619:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:620:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:620:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:621:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap1043);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:635:2: ( ',' ( ( ruleQualifiedName ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:635:4: ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFeatureMap1054); 

                    	            createLeafNode(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_3_2_0(), null); 
                    	        
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:639:1: ( ( ruleQualifiedName ) )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:640:1: ( ruleQualifiedName )
                    	    {
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:640:1: ( ruleQualifiedName )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:641:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap1077);
                    	    ruleQualifiedName();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:656:6: ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:656:6: ( 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )* )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:656:8: 'ignore right' ( ( ruleQualifiedName ) ) ( ',' ( ( ruleQualifiedName ) ) )*
                    {
                    match(input,25,FOLLOW_25_in_ruleFeatureMap1097); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getIgnoreRightKeyword_0_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:660:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:661:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:661:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:662:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap1120);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:676:2: ( ',' ( ( ruleQualifiedName ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:676:4: ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFeatureMap1131); 

                    	            createLeafNode(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_4_2_0(), null); 
                    	        
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:680:1: ( ( ruleQualifiedName ) )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:681:1: ( ruleQualifiedName )
                    	    {
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:681:1: ( ruleQualifiedName )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:682:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap1154);
                    	    ruleQualifiedName();
                    	    _fsp--;

                    	     
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:697:6: ( 'call module' ( ( RULE_ID ) ) )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:697:6: ( 'call module' ( ( RULE_ID ) ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:697:8: 'call module' ( ( RULE_ID ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleFeatureMap1174); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getCallModuleKeyword_0_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:701:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:702:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:702:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:703:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1192); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getModuleMappingModuleCrossReference_0_5_1_0(), "module"); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:715:4: ( 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:715:6: 'rule' ( (lv_rules_27_0= RULE_STRING ) ) ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )*
                    {
                    match(input,27,FOLLOW_27_in_ruleFeatureMap1205); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getRuleKeyword_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:719:1: ( (lv_rules_27_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:720:1: (lv_rules_27_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:720:1: (lv_rules_27_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:721:3: lv_rules_27_0= RULE_STRING
                    {
                    lv_rules_27_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1222); 

                    			createLeafNode(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_1_0(), "rules"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"rules",
                    	        		lv_rules_27_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:743:2: ( ',' ( (lv_rules_29_0= RULE_STRING ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:743:4: ',' ( (lv_rules_29_0= RULE_STRING ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFeatureMap1238); 

                    	            createLeafNode(grammarAccess.getFeatureMapAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:747:1: ( (lv_rules_29_0= RULE_STRING ) )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:748:1: (lv_rules_29_0= RULE_STRING )
                    	    {
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:748:1: (lv_rules_29_0= RULE_STRING )
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:749:3: lv_rules_29_0= RULE_STRING
                    	    {
                    	    lv_rules_29_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1255); 

                    	    			createLeafNode(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_2_1_0(), "rules"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"rules",
                    	    	        		lv_rules_29_0, 
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:771:6: ( (lv_documentation_30_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:772:1: (lv_documentation_30_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:772:1: (lv_documentation_30_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:773:3: lv_documentation_30_0= RULE_STRING
                    {
                    lv_documentation_30_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1281); 

                    			createLeafNode(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_2_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_30_0, 
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
    // $ANTLR end ruleFeatureMap


    // $ANTLR start entryRuleExpression
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:803:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:804:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:805:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1323);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1333); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:812:1: ruleExpression returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_intValue_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:817:6: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:818:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:818:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("818:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:818:2: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:818:2: ( (lv_value_0_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:819:1: (lv_value_0_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:819:1: (lv_value_0_0= RULE_STRING )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:820:3: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExpression1375); 

                    			createLeafNode(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_0_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:843:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:843:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:844:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:844:1: (lv_intValue_1_0= RULE_INT )
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:845:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpression1403); 

                    			createLeafNode(grammarAccess.getExpressionAccess().getIntValueINTTerminalRuleCall_1_0(), "intValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intValue",
                    	        		lv_intValue_1_0, 
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
    // $ANTLR end ruleExpression


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel141 = new BitSet(new long[]{0x0000000000006012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel158 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_ruleModel185 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleRootModule_in_ruleModel207 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName298 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName332 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleRootModule_in_entryRuleRootModule379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootModule389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRootModule424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootModule442 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRootModule459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMappingModule546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMappingModule567 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingModule584 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMappingModule600 = new BitSet(new long[]{0x0000000007A60000L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_ruleMappingModule622 = new BitSet(new long[]{0x0000000007A70000L});
    public static final BitSet FOLLOW_16_in_ruleMappingModule633 = new BitSet(new long[]{0x0000000007A60000L});
    public static final BitSet FOLLOW_17_in_ruleMappingModule647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFeatureMap730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap753 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap787 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleFeatureMap799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap822 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap856 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_21_in_ruleFeatureMap876 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap899 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureMap909 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureMap930 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_23_in_ruleFeatureMap948 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap971 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureMap981 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureMap1002 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_24_in_ruleFeatureMap1020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap1043 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap1054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap1077 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_25_in_ruleFeatureMap1097 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap1120 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap1131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap1154 = new BitSet(new long[]{0x0000000008080012L});
    public static final BitSet FOLLOW_26_in_ruleFeatureMap1174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1192 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_27_in_ruleFeatureMap1205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1222 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap1238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1255 = new BitSet(new long[]{0x0000000000080012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpression1403 = new BitSet(new long[]{0x0000000000000002L});

}