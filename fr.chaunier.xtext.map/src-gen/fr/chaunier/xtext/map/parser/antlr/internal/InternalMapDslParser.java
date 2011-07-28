package fr.chaunier.xtext.map.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.chaunier.xtext.map.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'import'", "'.*'", "'.'", "'root'", "'define rule'", "'op'", "'args'", "'define fonction'", "'in'", "'['", "']'", "'out'", "'module'", "'source'", "'target'", "'{'", "';'", "'}'", "'fuction'", "'map atribute'", "'->'", "'map module'", "'set <-'", "'='", "'set ->'", "'ignore <-'", "'ignore ->'", "'rule'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g"; }



     	private MapDslGrammarAccess grammarAccess;
     	
        public InternalMapDslParser(TokenStream input, MapDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MapDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_rules_4_0= ruleRule ) )* ( (lv_fuctions_5_0= ruleFuction ) )* ( (lv_mappingModules_6_0= ruleMappingModule ) )* ( (lv_roots_7_0= ruleRootModule ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_documentation_2_0=null;
        EObject lv_imports_3_0 = null;

        EObject lv_rules_4_0 = null;

        EObject lv_fuctions_5_0 = null;

        EObject lv_mappingModules_6_0 = null;

        EObject lv_roots_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_rules_4_0= ruleRule ) )* ( (lv_fuctions_5_0= ruleFuction ) )* ( (lv_mappingModules_6_0= ruleMappingModule ) )* ( (lv_roots_7_0= ruleRootModule ) ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_rules_4_0= ruleRule ) )* ( (lv_fuctions_5_0= ruleFuction ) )* ( (lv_mappingModules_6_0= ruleMappingModule ) )* ( (lv_roots_7_0= ruleRootModule ) ) )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_rules_4_0= ruleRule ) )* ( (lv_fuctions_5_0= ruleFuction ) )* ( (lv_mappingModules_6_0= ruleMappingModule ) )* ( (lv_roots_7_0= ruleRootModule ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_rules_4_0= ruleRule ) )* ( (lv_fuctions_5_0= ruleFuction ) )* ( (lv_mappingModules_6_0= ruleMappingModule ) )* ( (lv_roots_7_0= ruleRootModule ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:102:2: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:103:1: (lv_documentation_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:103:1: (lv_documentation_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:104:3: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel161); 

                    			newLeafNode(lv_documentation_2_0, grammarAccess.getModelAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:120:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:121:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:121:1: (lv_imports_3_0= ruleImport )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:122:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel188);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:138:3: ( (lv_rules_4_0= ruleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:139:1: (lv_rules_4_0= ruleRule )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:139:1: (lv_rules_4_0= ruleRule )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:140:3: lv_rules_4_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleModel210);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_4_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:156:3: ( (lv_fuctions_5_0= ruleFuction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:157:1: (lv_fuctions_5_0= ruleFuction )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:157:1: (lv_fuctions_5_0= ruleFuction )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:158:3: lv_fuctions_5_0= ruleFuction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFuctionsFuctionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFuction_in_ruleModel232);
            	    lv_fuctions_5_0=ruleFuction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fuctions",
            	            		lv_fuctions_5_0, 
            	            		"Fuction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:174:3: ( (lv_mappingModules_6_0= ruleMappingModule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:175:1: (lv_mappingModules_6_0= ruleMappingModule )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:175:1: (lv_mappingModules_6_0= ruleMappingModule )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:176:3: lv_mappingModules_6_0= ruleMappingModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMappingModule_in_ruleModel254);
            	    lv_mappingModules_6_0=ruleMappingModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappingModules",
            	            		lv_mappingModules_6_0, 
            	            		"MappingModule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:192:3: ( (lv_roots_7_0= ruleRootModule ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:193:1: (lv_roots_7_0= ruleRootModule )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:193:1: (lv_roots_7_0= ruleRootModule )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:194:3: lv_roots_7_0= ruleRootModule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRootModule_in_ruleModel276);
            lv_roots_7_0=ruleRootModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"roots",
                    		lv_roots_7_0, 
                    		"RootModule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:218:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:219:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:220:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport312);
            iv_ruleImport=ruleImport();

            state._fsp--;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:227:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:230:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:231:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:231:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:231:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport359); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:235:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:236:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:236:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:237:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport380);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:261:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:262:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:263:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard417);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard428); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:270:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:273:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:274:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:274:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:275:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard475);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:285:1: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:286:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:299:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:300:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:301:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName537);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName548); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:308:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:311:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:312:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:312:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:312:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName588); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:319:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:320:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName607); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName622); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRootModule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:340:1: entryRuleRootModule returns [EObject current=null] : iv_ruleRootModule= ruleRootModule EOF ;
    public final EObject entryRuleRootModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootModule = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:341:2: (iv_ruleRootModule= ruleRootModule EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:342:2: iv_ruleRootModule= ruleRootModule EOF
            {
             newCompositeNode(grammarAccess.getRootModuleRule()); 
            pushFollow(FOLLOW_ruleRootModule_in_entryRuleRootModule669);
            iv_ruleRootModule=ruleRootModule();

            state._fsp--;

             current =iv_ruleRootModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootModule679); 

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
    // $ANTLR end "entryRuleRootModule"


    // $ANTLR start "ruleRootModule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:349:1: ruleRootModule returns [EObject current=null] : (otherlv_0= 'root' ( (otherlv_1= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleRootModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_documentation_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:352:28: ( (otherlv_0= 'root' ( (otherlv_1= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:353:1: (otherlv_0= 'root' ( (otherlv_1= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:353:1: (otherlv_0= 'root' ( (otherlv_1= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:353:3: otherlv_0= 'root' ( (otherlv_1= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRootModule716); 

                	newLeafNode(otherlv_0, grammarAccess.getRootModuleAccess().getRootKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:357:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:358:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:358:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:359:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRootModuleRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRootModule736); 

            		newLeafNode(otherlv_1, grammarAccess.getRootModuleAccess().getRootRefMappingModuleCrossReference_1_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:370:2: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:371:1: (lv_documentation_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:371:1: (lv_documentation_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:372:3: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRootModule753); 

                    			newLeafNode(lv_documentation_2_0, grammarAccess.getRootModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRootModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootModule"


    // $ANTLR start "entryRuleRule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:396:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:397:2: (iv_ruleRule= ruleRule EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:398:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule795);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule805); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:405:1: ruleRule returns [EObject current=null] : (otherlv_0= 'define rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )? (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_operation_3_0=null;
        Token otherlv_4=null;
        Token lv_args_5_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:408:28: ( (otherlv_0= 'define rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )? (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:409:1: (otherlv_0= 'define rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )? (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:409:1: (otherlv_0= 'define rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )? (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:409:3: otherlv_0= 'define rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )? (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRule842); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getDefineRuleKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:413:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:414:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:414:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:415:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule859); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:431:2: (otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:431:4: otherlv_2= 'op' ( (lv_operation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRule877); 

                        	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getOpKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:435:1: ( (lv_operation_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:436:1: (lv_operation_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:436:1: (lv_operation_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:437:3: lv_operation_3_0= RULE_STRING
                    {
                    lv_operation_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule894); 

                    			newLeafNode(lv_operation_3_0, grammarAccess.getRuleAccess().getOperationSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operation",
                            		lv_operation_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:453:4: (otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:453:6: otherlv_4= 'args' ( (lv_args_5_0= RULE_STRING ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRule914); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getArgsKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:457:1: ( (lv_args_5_0= RULE_STRING ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_STRING) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:458:1: (lv_args_5_0= RULE_STRING )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:458:1: (lv_args_5_0= RULE_STRING )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:459:3: lv_args_5_0= RULE_STRING
                    	    {
                    	    lv_args_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRule931); 

                    	    			newLeafNode(lv_args_5_0, grammarAccess.getRuleAccess().getArgsSTRINGTerminalRuleCall_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_5_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFuction"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:483:1: entryRuleFuction returns [EObject current=null] : iv_ruleFuction= ruleFuction EOF ;
    public final EObject entryRuleFuction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuction = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:484:2: (iv_ruleFuction= ruleFuction EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:485:2: iv_ruleFuction= ruleFuction EOF
            {
             newCompositeNode(grammarAccess.getFuctionRule()); 
            pushFollow(FOLLOW_ruleFuction_in_entryRuleFuction975);
            iv_ruleFuction=ruleFuction();

            state._fsp--;

             current =iv_ruleFuction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuction985); 

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
    // $ANTLR end "entryRuleFuction"


    // $ANTLR start "ruleFuction"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:492:1: ruleFuction returns [EObject current=null] : (otherlv_0= 'define fonction' ( (lv_name_1_0= RULE_ID ) ) ( (lv_in_2_0= ruleFuctionIn ) )* ( (lv_out_3_0= ruleFuctionOut ) )* ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleFuction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_documentation_4_0=null;
        EObject lv_in_2_0 = null;

        EObject lv_out_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:495:28: ( (otherlv_0= 'define fonction' ( (lv_name_1_0= RULE_ID ) ) ( (lv_in_2_0= ruleFuctionIn ) )* ( (lv_out_3_0= ruleFuctionOut ) )* ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:496:1: (otherlv_0= 'define fonction' ( (lv_name_1_0= RULE_ID ) ) ( (lv_in_2_0= ruleFuctionIn ) )* ( (lv_out_3_0= ruleFuctionOut ) )* ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:496:1: (otherlv_0= 'define fonction' ( (lv_name_1_0= RULE_ID ) ) ( (lv_in_2_0= ruleFuctionIn ) )* ( (lv_out_3_0= ruleFuctionOut ) )* ( (lv_documentation_4_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:496:3: otherlv_0= 'define fonction' ( (lv_name_1_0= RULE_ID ) ) ( (lv_in_2_0= ruleFuctionIn ) )* ( (lv_out_3_0= ruleFuctionOut ) )* ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFuction1022); 

                	newLeafNode(otherlv_0, grammarAccess.getFuctionAccess().getDefineFonctionKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:500:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:501:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:501:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:502:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuction1039); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFuctionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFuctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:518:2: ( (lv_in_2_0= ruleFuctionIn ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:519:1: (lv_in_2_0= ruleFuctionIn )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:519:1: (lv_in_2_0= ruleFuctionIn )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:520:3: lv_in_2_0= ruleFuctionIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFuctionAccess().getInFuctionInParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFuctionIn_in_ruleFuction1065);
            	    lv_in_2_0=ruleFuctionIn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFuctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"in",
            	            		lv_in_2_0, 
            	            		"FuctionIn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:536:3: ( (lv_out_3_0= ruleFuctionOut ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:537:1: (lv_out_3_0= ruleFuctionOut )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:537:1: (lv_out_3_0= ruleFuctionOut )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:538:3: lv_out_3_0= ruleFuctionOut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFuctionAccess().getOutFuctionOutParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFuctionOut_in_ruleFuction1087);
            	    lv_out_3_0=ruleFuctionOut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFuctionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"out",
            	            		lv_out_3_0, 
            	            		"FuctionOut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:554:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:555:1: (lv_documentation_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:555:1: (lv_documentation_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:556:3: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFuction1105); 

                    			newLeafNode(lv_documentation_4_0, grammarAccess.getFuctionAccess().getDocumentationSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFuctionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuction"


    // $ANTLR start "entryRuleFuctionIn"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:580:1: entryRuleFuctionIn returns [EObject current=null] : iv_ruleFuctionIn= ruleFuctionIn EOF ;
    public final EObject entryRuleFuctionIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuctionIn = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:581:2: (iv_ruleFuctionIn= ruleFuctionIn EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:582:2: iv_ruleFuctionIn= ruleFuctionIn EOF
            {
             newCompositeNode(grammarAccess.getFuctionInRule()); 
            pushFollow(FOLLOW_ruleFuctionIn_in_entryRuleFuctionIn1147);
            iv_ruleFuctionIn=ruleFuctionIn();

            state._fsp--;

             current =iv_ruleFuctionIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuctionIn1157); 

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
    // $ANTLR end "entryRuleFuctionIn"


    // $ANTLR start "ruleFuctionIn"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:589:1: ruleFuctionIn returns [EObject current=null] : (otherlv_0= 'in' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleFuctionIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:592:28: ( (otherlv_0= 'in' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:593:1: (otherlv_0= 'in' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:593:1: (otherlv_0= 'in' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:593:3: otherlv_0= 'in' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFuctionIn1194); 

                	newLeafNode(otherlv_0, grammarAccess.getFuctionInAccess().getInKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:597:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:598:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:598:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:599:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFuctionInRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFuctionInAccess().getInEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFuctionIn1217);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFuctionIn1229); 

                	newLeafNode(otherlv_2, grammarAccess.getFuctionInAccess().getLeftSquareBracketKeyword_2());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:616:1: ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:616:2: ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:616:2: ( (otherlv_3= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:617:1: (otherlv_3= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:617:1: (otherlv_3= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:618:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFuctionInRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuctionIn1250); 

                    		newLeafNode(otherlv_3, grammarAccess.getFuctionInAccess().getInAttributeAttributeCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:629:2: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:629:3: () otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:629:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:630:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFuctionInAccess().getNestedInTransformationParameterTargetAction_3_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFuctionIn1272); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuctionInAccess().getFullStopKeyword_3_1_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:639:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:640:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:640:1: (otherlv_6= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:641:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFuctionInRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuctionIn1292); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getFuctionInAccess().getInRefAttributeAttributeCrossReference_3_1_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFuctionIn1308); 

                	newLeafNode(otherlv_7, grammarAccess.getFuctionInAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuctionIn"


    // $ANTLR start "entryRuleFuctionOut"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:664:1: entryRuleFuctionOut returns [EObject current=null] : iv_ruleFuctionOut= ruleFuctionOut EOF ;
    public final EObject entryRuleFuctionOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuctionOut = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:665:2: (iv_ruleFuctionOut= ruleFuctionOut EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:666:2: iv_ruleFuctionOut= ruleFuctionOut EOF
            {
             newCompositeNode(grammarAccess.getFuctionOutRule()); 
            pushFollow(FOLLOW_ruleFuctionOut_in_entryRuleFuctionOut1344);
            iv_ruleFuctionOut=ruleFuctionOut();

            state._fsp--;

             current =iv_ruleFuctionOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuctionOut1354); 

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
    // $ANTLR end "entryRuleFuctionOut"


    // $ANTLR start "ruleFuctionOut"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:673:1: ruleFuctionOut returns [EObject current=null] : (otherlv_0= 'out' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleFuctionOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:676:28: ( (otherlv_0= 'out' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:677:1: (otherlv_0= 'out' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:677:1: (otherlv_0= 'out' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']' )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:677:3: otherlv_0= 'out' ( ( ruleQualifiedName ) ) otherlv_2= '[' ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleFuctionOut1391); 

                	newLeafNode(otherlv_0, grammarAccess.getFuctionOutAccess().getOutKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:681:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:682:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:682:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:683:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFuctionOutRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFuctionOutAccess().getOutEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFuctionOut1414);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFuctionOut1426); 

                	newLeafNode(otherlv_2, grammarAccess.getFuctionOutAccess().getLeftSquareBracketKeyword_2());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:700:1: ( ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:700:2: ( (otherlv_3= RULE_ID ) ) ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:700:2: ( (otherlv_3= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:701:1: (otherlv_3= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:701:1: (otherlv_3= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:702:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFuctionOutRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuctionOut1447); 

                    		newLeafNode(otherlv_3, grammarAccess.getFuctionOutAccess().getOutAttributeAttributeCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:713:2: ( () otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:713:3: () otherlv_5= '.' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:713:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:714:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFuctionOutAccess().getNestedOutTransformationParameterTargetAction_3_1_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFuctionOut1469); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuctionOutAccess().getFullStopKeyword_3_1_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:723:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:724:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:724:1: (otherlv_6= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:725:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFuctionOutRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuctionOut1489); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getFuctionOutAccess().getOutRefAttributeAttributeCrossReference_3_1_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFuctionOut1505); 

                	newLeafNode(otherlv_7, grammarAccess.getFuctionOutAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuctionOut"


    // $ANTLR start "entryRuleMappingModule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:748:1: entryRuleMappingModule returns [EObject current=null] : iv_ruleMappingModule= ruleMappingModule EOF ;
    public final EObject entryRuleMappingModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModule = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:749:2: (iv_ruleMappingModule= ruleMappingModule EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:750:2: iv_ruleMappingModule= ruleMappingModule EOF
            {
             newCompositeNode(grammarAccess.getMappingModuleRule()); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule1541);
            iv_ruleMappingModule=ruleMappingModule();

            state._fsp--;

             current =iv_ruleMappingModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule1551); 

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
    // $ANTLR end "entryRuleMappingModule"


    // $ANTLR start "ruleMappingModule"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:757:1: ruleMappingModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'source' ( ( ruleQualifiedName ) ) otherlv_4= 'target' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? otherlv_7= '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) ;
    public final EObject ruleMappingModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_mappedFeatures_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:760:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'source' ( ( ruleQualifiedName ) ) otherlv_4= 'target' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? otherlv_7= '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )* otherlv_10= '}' ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:761:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'source' ( ( ruleQualifiedName ) ) otherlv_4= 'target' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? otherlv_7= '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:761:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'source' ( ( ruleQualifiedName ) ) otherlv_4= 'target' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? otherlv_7= '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )* otherlv_10= '}' )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:761:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'source' ( ( ruleQualifiedName ) ) otherlv_4= 'target' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? otherlv_7= '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleMappingModule1588); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingModuleAccess().getModuleKeyword_0());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:765:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:766:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:766:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:767:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappingModule1605); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMappingModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleMappingModule1622); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingModuleAccess().getSourceKeyword_2());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:787:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:788:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:788:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:789:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingModuleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMappingModuleAccess().getEntitySourceEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMappingModule1645);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleMappingModule1657); 

                	newLeafNode(otherlv_4, grammarAccess.getMappingModuleAccess().getTargetKeyword_4());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:806:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:807:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:807:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:808:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingModuleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMappingModuleAccess().getEntityTargetEntityCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMappingModule1680);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:821:2: ( (lv_documentation_6_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:822:1: (lv_documentation_6_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:822:1: (lv_documentation_6_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:823:3: lv_documentation_6_0= RULE_STRING
                    {
                    lv_documentation_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingModule1697); 

                    			newLeafNode(lv_documentation_6_0, grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMappingModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_6_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMappingModule1715); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_7());
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:843:1: ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=31)||(LA21_0>=33 && LA21_0<=34)||(LA21_0>=36 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:843:2: ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) (otherlv_9= ';' )?
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:843:2: ( (lv_mappedFeatures_8_0= ruleFeatureMap ) )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:844:1: (lv_mappedFeatures_8_0= ruleFeatureMap )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:844:1: (lv_mappedFeatures_8_0= ruleFeatureMap )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:845:3: lv_mappedFeatures_8_0= ruleFeatureMap
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureMap_in_ruleMappingModule1737);
            	    lv_mappedFeatures_8_0=ruleFeatureMap();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappedFeatures",
            	            		lv_mappedFeatures_8_0, 
            	            		"FeatureMap");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:861:2: (otherlv_9= ';' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==28) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:861:4: otherlv_9= ';'
            	            {
            	            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleMappingModule1750); 

            	                	newLeafNode(otherlv_9, grammarAccess.getMappingModuleAccess().getSemicolonKeyword_8_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleMappingModule1766); 

                	newLeafNode(otherlv_10, grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingModule"


    // $ANTLR start "entryRuleFeatureMap"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:877:1: entryRuleFeatureMap returns [EObject current=null] : iv_ruleFeatureMap= ruleFeatureMap EOF ;
    public final EObject entryRuleFeatureMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMap = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:878:2: (iv_ruleFeatureMap= ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:879:2: iv_ruleFeatureMap= ruleFeatureMap EOF
            {
             newCompositeNode(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap1802);
            iv_ruleFeatureMap=ruleFeatureMap();

            state._fsp--;

             current =iv_ruleFeatureMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap1812); 

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
    // $ANTLR end "entryRuleFeatureMap"


    // $ANTLR start "ruleFeatureMap"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:886:1: ruleFeatureMap returns [EObject current=null] : ( ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) ) (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )? ( (lv_documentation_37_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeatureMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_documentation_37_0=null;
        EObject lv_expr_20_0 = null;

        EObject lv_expr_27_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:889:28: ( ( ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) ) (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )? ( (lv_documentation_37_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:1: ( ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) ) (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )? ( (lv_documentation_37_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:1: ( ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) ) (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )? ( (lv_documentation_37_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:2: ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) ) (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )? ( (lv_documentation_37_0= RULE_STRING ) )?
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:2: ( (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* ) | (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) ) | (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) ) | (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) ) | (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt26=1;
                }
                break;
            case 31:
                {
                alt26=2;
                }
                break;
            case 33:
                {
                alt26=3;
                }
                break;
            case 34:
                {
                alt26=4;
                }
                break;
            case 36:
                {
                alt26=5;
                }
                break;
            case 37:
                {
                alt26=6;
                }
                break;
            case 38:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:3: (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:3: (otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:890:5: otherlv_0= 'fuction' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFeatureMap1851); 

                        	newLeafNode(otherlv_0, grammarAccess.getFeatureMapAccess().getFuctionKeyword_0_0_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:894:1: ( (otherlv_1= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:895:1: (otherlv_1= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:895:1: (otherlv_1= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:896:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1871); 

                    		newLeafNode(otherlv_1, grammarAccess.getFeatureMapAccess().getFuctionMapFuctionCrossReference_0_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:908:6: (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:908:6: (otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )* )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:908:8: otherlv_2= 'map atribute' ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleFeatureMap1891); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureMapAccess().getMapAtributeKeyword_0_1_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:912:1: ( (otherlv_3= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:913:1: (otherlv_3= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:913:1: (otherlv_3= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:914:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1911); 

                    		newLeafNode(otherlv_3, grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_1_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleFeatureMap1923); 

                        	newLeafNode(otherlv_4, grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_1_2());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:929:1: ( (otherlv_5= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:930:1: (otherlv_5= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:930:1: (otherlv_5= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:931:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1943); 

                    		newLeafNode(otherlv_5, grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_1_3_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:942:2: ( () otherlv_7= '.' ( (otherlv_8= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:942:3: () otherlv_7= '.' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:942:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:943:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_1_4_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleFeatureMap1965); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_1_4_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:952:1: ( (otherlv_8= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:953:1: (otherlv_8= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:953:1: (otherlv_8= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:954:3: otherlv_8= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	    	        }
                    	            
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1985); 

                    	    		newLeafNode(otherlv_8, grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_1_4_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:966:6: (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:966:6: (otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )* )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:966:8: otherlv_9= 'map module' ( (otherlv_10= RULE_ID ) ) ( (otherlv_11= RULE_ID ) ) otherlv_12= '->' ( (otherlv_13= RULE_ID ) ) ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleFeatureMap2007); 

                        	newLeafNode(otherlv_9, grammarAccess.getFeatureMapAccess().getMapModuleKeyword_0_2_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:970:1: ( (otherlv_10= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:971:1: (otherlv_10= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:971:1: (otherlv_10= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:972:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2027); 

                    		newLeafNode(otherlv_10, grammarAccess.getFeatureMapAccess().getWithModuleMappingModuleCrossReference_0_2_1_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:983:2: ( (otherlv_11= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:984:1: (otherlv_11= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:984:1: (otherlv_11= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:985:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2047); 

                    		newLeafNode(otherlv_11, grammarAccess.getFeatureMapAccess().getAttributeSourcesAttributeCrossReference_0_2_2_0()); 
                    	

                    }


                    }

                    otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleFeatureMap2059); 

                        	newLeafNode(otherlv_12, grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_2_3());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1000:1: ( (otherlv_13= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1001:1: (otherlv_13= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1001:1: (otherlv_13= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1002:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2079); 

                    		newLeafNode(otherlv_13, grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_2_4_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1013:2: ( () otherlv_15= '.' ( (otherlv_16= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1013:3: () otherlv_15= '.' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1013:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1014:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_2_5_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleFeatureMap2101); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_2_5_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1023:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1024:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1024:1: (otherlv_16= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1025:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2121); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_2_5_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1037:6: (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1037:6: (otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1037:8: otherlv_17= 'set <-' ( (otherlv_18= RULE_ID ) ) otherlv_19= '=' ( (lv_expr_20_0= ruleExpression ) )
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_34_in_ruleFeatureMap2143); 

                        	newLeafNode(otherlv_17, grammarAccess.getFeatureMapAccess().getSetKeyword_0_3_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1041:1: ( (otherlv_18= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1042:1: (otherlv_18= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1042:1: (otherlv_18= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1043:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2163); 

                    		newLeafNode(otherlv_18, grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_3_1_0()); 
                    	

                    }


                    }

                    otherlv_19=(Token)match(input,35,FOLLOW_35_in_ruleFeatureMap2175); 

                        	newLeafNode(otherlv_19, grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_3_2());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1058:1: ( (lv_expr_20_0= ruleExpression ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1059:1: (lv_expr_20_0= ruleExpression )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1059:1: (lv_expr_20_0= ruleExpression )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1060:3: lv_expr_20_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureMap2196);
                    lv_expr_20_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureMapRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_20_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1077:6: (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1077:6: (otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1077:8: otherlv_21= 'set ->' ( (otherlv_22= RULE_ID ) ) ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )* otherlv_26= '=' ( (lv_expr_27_0= ruleExpression ) )
                    {
                    otherlv_21=(Token)match(input,36,FOLLOW_36_in_ruleFeatureMap2216); 

                        	newLeafNode(otherlv_21, grammarAccess.getFeatureMapAccess().getSetKeyword_0_4_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1081:1: ( (otherlv_22= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1082:1: (otherlv_22= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1082:1: (otherlv_22= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1083:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2236); 

                    		newLeafNode(otherlv_22, grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_4_1_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1094:2: ( () otherlv_24= '.' ( (otherlv_25= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1094:3: () otherlv_24= '.' ( (otherlv_25= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1094:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1095:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_4_2_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_24=(Token)match(input,14,FOLLOW_14_in_ruleFeatureMap2258); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_4_2_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1104:1: ( (otherlv_25= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1105:1: (otherlv_25= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1105:1: (otherlv_25= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1106:3: otherlv_25= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	    	        }
                    	            
                    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2278); 

                    	    		newLeafNode(otherlv_25, grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_4_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,35,FOLLOW_35_in_ruleFeatureMap2292); 

                        	newLeafNode(otherlv_26, grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_4_3());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1121:1: ( (lv_expr_27_0= ruleExpression ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1122:1: (lv_expr_27_0= ruleExpression )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1122:1: (lv_expr_27_0= ruleExpression )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1123:3: lv_expr_27_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureMap2313);
                    lv_expr_27_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureMapRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_27_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1140:6: (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1140:6: (otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1140:8: otherlv_28= 'ignore <-' ( (otherlv_29= RULE_ID ) )
                    {
                    otherlv_28=(Token)match(input,37,FOLLOW_37_in_ruleFeatureMap2333); 

                        	newLeafNode(otherlv_28, grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_5_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1144:1: ( (otherlv_29= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1145:1: (otherlv_29= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1145:1: (otherlv_29= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1146:3: otherlv_29= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2353); 

                    		newLeafNode(otherlv_29, grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_5_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1158:6: (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1158:6: (otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )* )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1158:8: otherlv_30= 'ignore ->' ( (otherlv_31= RULE_ID ) ) ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )*
                    {
                    otherlv_30=(Token)match(input,38,FOLLOW_38_in_ruleFeatureMap2373); 

                        	newLeafNode(otherlv_30, grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_6_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1162:1: ( (otherlv_31= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1163:1: (otherlv_31= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1163:1: (otherlv_31= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1164:3: otherlv_31= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2393); 

                    		newLeafNode(otherlv_31, grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_6_1_0()); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1175:2: ( () otherlv_33= '.' ( (otherlv_34= RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1175:3: () otherlv_33= '.' ( (otherlv_34= RULE_ID ) )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1175:3: ()
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1176:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_6_2_0(),
                    	                current);
                    	        

                    	    }

                    	    otherlv_33=(Token)match(input,14,FOLLOW_14_in_ruleFeatureMap2415); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_6_2_1());
                    	        
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1185:1: ( (otherlv_34= RULE_ID ) )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1186:1: (otherlv_34= RULE_ID )
                    	    {
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1186:1: (otherlv_34= RULE_ID )
                    	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1187:3: otherlv_34= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	    	        }
                    	            
                    	    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2435); 

                    	    		newLeafNode(otherlv_34, grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_6_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1198:6: (otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1198:8: otherlv_35= 'rule' ( (otherlv_36= RULE_ID ) )
                    {
                    otherlv_35=(Token)match(input,39,FOLLOW_39_in_ruleFeatureMap2452); 

                        	newLeafNode(otherlv_35, grammarAccess.getFeatureMapAccess().getRuleKeyword_1_0());
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1202:1: ( (otherlv_36= RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1203:1: (otherlv_36= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1203:1: (otherlv_36= RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1204:3: otherlv_36= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                            
                    otherlv_36=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap2472); 

                    		newLeafNode(otherlv_36, grammarAccess.getFeatureMapAccess().getRuleRuleCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1215:4: ( (lv_documentation_37_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1216:1: (lv_documentation_37_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1216:1: (lv_documentation_37_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1217:3: lv_documentation_37_0= RULE_STRING
                    {
                    lv_documentation_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap2491); 

                    			newLeafNode(lv_documentation_37_0, grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMapRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_37_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureMap"


    // $ANTLR start "entryRuleExpression"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1241:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1242:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1243:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2533);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2543); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1250:1: ruleExpression returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_intValue_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1253:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1254:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1254:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_INT) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1254:2: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1254:2: ( (lv_value_0_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1255:1: (lv_value_0_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1255:1: (lv_value_0_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1256:3: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExpression2585); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1273:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1273:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1274:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1274:1: (lv_intValue_1_0= RULE_INT )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:1275:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpression2613); 

                    			newLeafNode(lv_intValue_1_0, grammarAccess.getExpressionAccess().getIntValueINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intValue",
                            		lv_intValue_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel161 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel188 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel210 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_ruleFuction_in_ruleModel232 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_ruleMappingModule_in_ruleModel254 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_ruleRootModule_in_ruleModel276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard475 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName588 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName622 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleRootModule_in_entryRuleRootModule669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootModule679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRootModule716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRootModule736 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRootModule753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRule842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule859 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_17_in_ruleRule877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule894 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleRule914 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRule931 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleFuction_in_entryRuleFuction975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuction985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFuction1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuction1039 = new BitSet(new long[]{0x0000000000900022L});
    public static final BitSet FOLLOW_ruleFuctionIn_in_ruleFuction1065 = new BitSet(new long[]{0x0000000000900022L});
    public static final BitSet FOLLOW_ruleFuctionOut_in_ruleFuction1087 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFuction1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionIn_in_entryRuleFuctionIn1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuctionIn1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFuctionIn1194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFuctionIn1217 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFuctionIn1229 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuctionIn1250 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleFuctionIn1272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuctionIn1292 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleFuctionIn1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionOut_in_entryRuleFuctionOut1344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuctionOut1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFuctionOut1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFuctionOut1414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFuctionOut1426 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuctionOut1447 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleFuctionOut1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuctionOut1489 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_ruleFuctionOut1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMappingModule1588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappingModule1605 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMappingModule1622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMappingModule1645 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMappingModule1657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMappingModule1680 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingModule1697 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMappingModule1715 = new BitSet(new long[]{0x00000076E0000000L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_ruleMappingModule1737 = new BitSet(new long[]{0x00000076F0000000L});
    public static final BitSet FOLLOW_28_in_ruleMappingModule1750 = new BitSet(new long[]{0x00000076E0000000L});
    public static final BitSet FOLLOW_29_in_ruleMappingModule1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFeatureMap1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1871 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_31_in_ruleFeatureMap1891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1911 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureMap1923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1943 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_14_in_ruleFeatureMap1965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1985 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_33_in_ruleFeatureMap2007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2047 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFeatureMap2059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2079 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_14_in_ruleFeatureMap2101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2121 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_34_in_ruleFeatureMap2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2163 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFeatureMap2175 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureMap2196 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_36_in_ruleFeatureMap2216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2236 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_14_in_ruleFeatureMap2258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2278 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_35_in_ruleFeatureMap2292 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureMap2313 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_37_in_ruleFeatureMap2333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2353 = new BitSet(new long[]{0x0000008000000022L});
    public static final BitSet FOLLOW_38_in_ruleFeatureMap2373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2393 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_14_in_ruleFeatureMap2415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2435 = new BitSet(new long[]{0x0000008000004022L});
    public static final BitSet FOLLOW_39_in_ruleFeatureMap2452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap2472 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpression2613 = new BitSet(new long[]{0x0000000000000002L});

}