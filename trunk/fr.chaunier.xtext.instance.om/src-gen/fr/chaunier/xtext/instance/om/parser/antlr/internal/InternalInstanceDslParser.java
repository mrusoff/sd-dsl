package fr.chaunier.xtext.instance.om.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.chaunier.xtext.instance.om.services.InstanceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInstanceDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'+='", "'='", "'{'", "'}'", "'this'", "'new'", "'null'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInstanceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInstanceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInstanceDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g"; }



     	private InstanceDslGrammarAccess grammarAccess;
     	
        public InternalInstanceDslParser(TokenStream input, InstanceDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Factory";	
       	}
       	
       	@Override
       	protected InstanceDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFactory"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:67:1: entryRuleFactory returns [EObject current=null] : iv_ruleFactory= ruleFactory EOF ;
    public final EObject entryRuleFactory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactory = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:68:2: (iv_ruleFactory= ruleFactory EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:69:2: iv_ruleFactory= ruleFactory EOF
            {
             newCompositeNode(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_ruleFactory_in_entryRuleFactory75);
            iv_ruleFactory=ruleFactory();

            state._fsp--;

             current =iv_ruleFactory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactory85); 

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:76:1: ruleFactory returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_root_1_0= ruleNewObject ) ) ) ;
    public final EObject ruleFactory() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_root_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_root_1_0= ruleNewObject ) ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_root_1_0= ruleNewObject ) ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_root_1_0= ruleNewObject ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_root_1_0= ruleNewObject ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactoryAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFactory131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:98:3: ( (lv_root_1_0= ruleNewObject ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:99:1: (lv_root_1_0= ruleNewObject )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:99:1: (lv_root_1_0= ruleNewObject )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:100:3: lv_root_1_0= ruleNewObject
            {
             
            	        newCompositeNode(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNewObject_in_ruleFactory153);
            lv_root_1_0=ruleNewObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactoryRule());
            	        }
                   		set(
                   			current, 
                   			"root",
                    		lv_root_1_0, 
                    		"NewObject");
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
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); 

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
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport236); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257);
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
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard294);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard305); 

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
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard352);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:191:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard371); 

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
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:205:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:206:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:207:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName414);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName425); 

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
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:214:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:217:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:218:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName465); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:225:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:226:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName484); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName499); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleFeature"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:246:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:247:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:248:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature546);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature556); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:255:1: ruleFeature returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMany_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:258:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_value_3_0= ruleValue ) ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:259:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:259:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_value_3_0= ruleValue ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:259:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' ) ( (lv_value_3_0= ruleValue ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:259:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:260:1: (otherlv_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:260:1: (otherlv_0= RULE_ID )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:261:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature601); 

            		newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getEFeatureStructuralFeatureCrossReference_0_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:272:2: ( ( (lv_isMany_1_0= '+=' ) ) | otherlv_2= '=' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:272:3: ( (lv_isMany_1_0= '+=' ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:272:3: ( (lv_isMany_1_0= '+=' ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:273:1: (lv_isMany_1_0= '+=' )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:273:1: (lv_isMany_1_0= '+=' )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:274:3: lv_isMany_1_0= '+='
                    {
                    lv_isMany_1_0=(Token)match(input,14,FOLLOW_14_in_ruleFeature620); 

                            newLeafNode(lv_isMany_1_0, grammarAccess.getFeatureAccess().getIsManyPlusSignEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "isMany", true, "+=");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:288:7: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFeature651); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:292:2: ( (lv_value_3_0= ruleValue ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:293:1: (lv_value_3_0= ruleValue )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:293:1: (lv_value_3_0= ruleValue )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:294:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleFeature673);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNewObject"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:318:1: entryRuleNewObject returns [EObject current=null] : iv_ruleNewObject= ruleNewObject EOF ;
    public final EObject entryRuleNewObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewObject = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:319:2: (iv_ruleNewObject= ruleNewObject EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:320:2: iv_ruleNewObject= ruleNewObject EOF
            {
             newCompositeNode(grammarAccess.getNewObjectRule()); 
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject709);
            iv_ruleNewObject=ruleNewObject();

            state._fsp--;

             current =iv_ruleNewObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject719); 

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
    // $ANTLR end "entryRuleNewObject"


    // $ANTLR start "ruleNewObject"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:327:1: ruleNewObject returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleNewObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:330:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:331:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:331:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:331:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:331:2: ( (otherlv_0= RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:332:1: (otherlv_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:332:1: (otherlv_0= RULE_ID )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:333:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNewObjectRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewObject764); 

            		newLeafNode(otherlv_0, grammarAccess.getNewObjectAccess().getEClassEntityCrossReference_0_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:344:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:345:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:345:1: (lv_name_1_0= RULE_ID )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:346:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewObject781); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getNewObjectAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNewObjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNewObject799); 

                	newLeafNode(otherlv_2, grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:366:1: ( (lv_features_3_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:367:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:367:1: (lv_features_3_0= ruleFeature )
            	    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:368:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleNewObject820);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNewObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNewObject833); 

                	newLeafNode(otherlv_4, grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleNewObject"


    // $ANTLR start "entryRuleValue"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:396:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:397:2: (iv_ruleValue= ruleValue EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:398:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue869);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue879); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:405:1: ruleValue returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_Reference_1= ruleReference | this_Containment_2= ruleContainment ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        EObject this_Reference_1 = null;

        EObject this_Containment_2 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:408:28: ( (this_TerminalExpression_0= ruleTerminalExpression | this_Reference_1= ruleReference | this_Containment_2= ruleContainment ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:409:1: (this_TerminalExpression_0= ruleTerminalExpression | this_Reference_1= ruleReference | this_Containment_2= ruleContainment )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:409:1: (this_TerminalExpression_0= ruleTerminalExpression | this_Reference_1= ruleReference | this_Containment_2= ruleContainment )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||(LA7_0>=18 && LA7_0<=20)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 17:
                    {
                    alt7=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==16) ) {
                        alt7=3;
                    }
                    else if ( ((LA7_4>=14 && LA7_4<=15)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:410:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getTerminalExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_ruleValue926);
                    this_TerminalExpression_0=ruleTerminalExpression();

                    state._fsp--;

                     
                            current = this_TerminalExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:420:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleValue953);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:430:5: this_Containment_2= ruleContainment
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleContainment_in_ruleValue980);
                    this_Containment_2=ruleContainment();

                    state._fsp--;

                     
                            current = this_Containment_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReference"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:446:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:447:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:448:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1015);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1025); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:455:1: ruleReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:458:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:459:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:459:1: ( (otherlv_0= RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:460:1: (otherlv_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:460:1: (otherlv_0= RULE_ID )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:461:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1069); 

            		newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            	

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleContainment"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:480:1: entryRuleContainment returns [EObject current=null] : iv_ruleContainment= ruleContainment EOF ;
    public final EObject entryRuleContainment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainment = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:481:2: (iv_ruleContainment= ruleContainment EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:482:2: iv_ruleContainment= ruleContainment EOF
            {
             newCompositeNode(grammarAccess.getContainmentRule()); 
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment1104);
            iv_ruleContainment=ruleContainment();

            state._fsp--;

             current =iv_ruleContainment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment1114); 

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
    // $ANTLR end "entryRuleContainment"


    // $ANTLR start "ruleContainment"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:489:1: ruleContainment returns [EObject current=null] : ( (lv_value_0_0= ruleNewObject ) ) ;
    public final EObject ruleContainment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:492:28: ( ( (lv_value_0_0= ruleNewObject ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:493:1: ( (lv_value_0_0= ruleNewObject ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:493:1: ( (lv_value_0_0= ruleNewObject ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:494:1: (lv_value_0_0= ruleNewObject )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:494:1: (lv_value_0_0= ruleNewObject )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:495:3: lv_value_0_0= ruleNewObject
            {
             
            	        newCompositeNode(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNewObject_in_ruleContainment1159);
            lv_value_0_0=ruleNewObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NewObject");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleContainment"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:521:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:522:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:523:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1196);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1206); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:530:1: ruleTerminalExpression returns [EObject current=null] : ( ( (lv_this_0_0= ruleThis ) ) | ( (lv_new_1_0= ruleNew ) ) | ( (lv_int_2_0= ruleIntero ) ) | ( (lv_string_3_0= ruleStringa ) ) | ( (lv_null_4_0= ruleNullo ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_new_1_0 = null;

        EObject lv_int_2_0 = null;

        EObject lv_string_3_0 = null;

        EObject lv_null_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:533:28: ( ( ( (lv_this_0_0= ruleThis ) ) | ( (lv_new_1_0= ruleNew ) ) | ( (lv_int_2_0= ruleIntero ) ) | ( (lv_string_3_0= ruleStringa ) ) | ( (lv_null_4_0= ruleNullo ) ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:534:1: ( ( (lv_this_0_0= ruleThis ) ) | ( (lv_new_1_0= ruleNew ) ) | ( (lv_int_2_0= ruleIntero ) ) | ( (lv_string_3_0= ruleStringa ) ) | ( (lv_null_4_0= ruleNullo ) ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:534:1: ( ( (lv_this_0_0= ruleThis ) ) | ( (lv_new_1_0= ruleNew ) ) | ( (lv_int_2_0= ruleIntero ) ) | ( (lv_string_3_0= ruleStringa ) ) | ( (lv_null_4_0= ruleNullo ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case RULE_STRING:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:534:2: ( (lv_this_0_0= ruleThis ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:534:2: ( (lv_this_0_0= ruleThis ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:535:1: (lv_this_0_0= ruleThis )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:535:1: (lv_this_0_0= ruleThis )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:536:3: lv_this_0_0= ruleThis
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getThisThisParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleThis_in_ruleTerminalExpression1252);
                    lv_this_0_0=ruleThis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"this",
                            		lv_this_0_0, 
                            		"This");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:553:6: ( (lv_new_1_0= ruleNew ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:553:6: ( (lv_new_1_0= ruleNew ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:554:1: (lv_new_1_0= ruleNew )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:554:1: (lv_new_1_0= ruleNew )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:555:3: lv_new_1_0= ruleNew
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getNewNewParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNew_in_ruleTerminalExpression1279);
                    lv_new_1_0=ruleNew();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"new",
                            		lv_new_1_0, 
                            		"New");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:572:6: ( (lv_int_2_0= ruleIntero ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:572:6: ( (lv_int_2_0= ruleIntero ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:573:1: (lv_int_2_0= ruleIntero )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:573:1: (lv_int_2_0= ruleIntero )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:574:3: lv_int_2_0= ruleIntero
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntInteroParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntero_in_ruleTerminalExpression1306);
                    lv_int_2_0=ruleIntero();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"int",
                            		lv_int_2_0, 
                            		"Intero");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:591:6: ( (lv_string_3_0= ruleStringa ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:591:6: ( (lv_string_3_0= ruleStringa ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:592:1: (lv_string_3_0= ruleStringa )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:592:1: (lv_string_3_0= ruleStringa )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:593:3: lv_string_3_0= ruleStringa
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringStringaParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringa_in_ruleTerminalExpression1333);
                    lv_string_3_0=ruleStringa();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"string",
                            		lv_string_3_0, 
                            		"Stringa");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:610:6: ( (lv_null_4_0= ruleNullo ) )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:610:6: ( (lv_null_4_0= ruleNullo ) )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:611:1: (lv_null_4_0= ruleNullo )
                    {
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:611:1: (lv_null_4_0= ruleNullo )
                    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:612:3: lv_null_4_0= ruleNullo
                    {
                     
                    	        newCompositeNode(grammarAccess.getTerminalExpressionAccess().getNullNulloParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNullo_in_ruleTerminalExpression1360);
                    lv_null_4_0=ruleNullo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"null",
                            		lv_null_4_0, 
                            		"Nullo");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleThis"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:636:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:637:2: (iv_ruleThis= ruleThis EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:638:2: iv_ruleThis= ruleThis EOF
            {
             newCompositeNode(grammarAccess.getThisRule()); 
            pushFollow(FOLLOW_ruleThis_in_entryRuleThis1396);
            iv_ruleThis=ruleThis();

            state._fsp--;

             current =iv_ruleThis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThis1406); 

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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:645:1: ruleThis returns [EObject current=null] : ( (lv_variable_0_0= 'this' ) ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:648:28: ( ( (lv_variable_0_0= 'this' ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:649:1: ( (lv_variable_0_0= 'this' ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:649:1: ( (lv_variable_0_0= 'this' ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:650:1: (lv_variable_0_0= 'this' )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:650:1: (lv_variable_0_0= 'this' )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:651:3: lv_variable_0_0= 'this'
            {
            lv_variable_0_0=(Token)match(input,18,FOLLOW_18_in_ruleThis1448); 

                    newLeafNode(lv_variable_0_0, grammarAccess.getThisAccess().getVariableThisKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThisRule());
            	        }
                   		setWithLastConsumed(current, "variable", lv_variable_0_0, "this");
            	    

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
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleNew"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:672:1: entryRuleNew returns [EObject current=null] : iv_ruleNew= ruleNew EOF ;
    public final EObject entryRuleNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNew = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:673:2: (iv_ruleNew= ruleNew EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:674:2: iv_ruleNew= ruleNew EOF
            {
             newCompositeNode(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew1496);
            iv_ruleNew=ruleNew();

            state._fsp--;

             current =iv_ruleNew; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew1506); 

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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:681:1: ruleNew returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:684:28: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:685:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:685:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:685:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleNew1543); 

                	newLeafNode(otherlv_0, grammarAccess.getNewAccess().getNewKeyword_0());
                
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:689:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:690:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:690:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:691:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNewRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNew1563); 

            		newLeafNode(otherlv_1, grammarAccess.getNewAccess().getTypeEntityCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleIntero"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:710:1: entryRuleIntero returns [EObject current=null] : iv_ruleIntero= ruleIntero EOF ;
    public final EObject entryRuleIntero() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntero = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:711:2: (iv_ruleIntero= ruleIntero EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:712:2: iv_ruleIntero= ruleIntero EOF
            {
             newCompositeNode(grammarAccess.getInteroRule()); 
            pushFollow(FOLLOW_ruleIntero_in_entryRuleIntero1599);
            iv_ruleIntero=ruleIntero();

            state._fsp--;

             current =iv_ruleIntero; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntero1609); 

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
    // $ANTLR end "entryRuleIntero"


    // $ANTLR start "ruleIntero"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:719:1: ruleIntero returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntero() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:722:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:723:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:723:1: ( (lv_value_0_0= RULE_INT ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:724:1: (lv_value_0_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:724:1: (lv_value_0_0= RULE_INT )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:725:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntero1650); 

            			newLeafNode(lv_value_0_0, grammarAccess.getInteroAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInteroRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleIntero"


    // $ANTLR start "entryRuleStringa"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:749:1: entryRuleStringa returns [EObject current=null] : iv_ruleStringa= ruleStringa EOF ;
    public final EObject entryRuleStringa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringa = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:750:2: (iv_ruleStringa= ruleStringa EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:751:2: iv_ruleStringa= ruleStringa EOF
            {
             newCompositeNode(grammarAccess.getStringaRule()); 
            pushFollow(FOLLOW_ruleStringa_in_entryRuleStringa1690);
            iv_ruleStringa=ruleStringa();

            state._fsp--;

             current =iv_ruleStringa; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringa1700); 

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
    // $ANTLR end "entryRuleStringa"


    // $ANTLR start "ruleStringa"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:758:1: ruleStringa returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringa() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:761:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:762:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:762:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:763:1: (lv_value_0_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:763:1: (lv_value_0_0= RULE_STRING )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:764:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringa1741); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringaAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringa"


    // $ANTLR start "entryRuleNullo"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:788:1: entryRuleNullo returns [EObject current=null] : iv_ruleNullo= ruleNullo EOF ;
    public final EObject entryRuleNullo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullo = null;


        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:789:2: (iv_ruleNullo= ruleNullo EOF )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:790:2: iv_ruleNullo= ruleNullo EOF
            {
             newCompositeNode(grammarAccess.getNulloRule()); 
            pushFollow(FOLLOW_ruleNullo_in_entryRuleNullo1781);
            iv_ruleNullo=ruleNullo();

            state._fsp--;

             current =iv_ruleNullo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullo1791); 

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
    // $ANTLR end "entryRuleNullo"


    // $ANTLR start "ruleNullo"
    // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:797:1: ruleNullo returns [EObject current=null] : ( (lv_value_0_0= 'null' ) ) ;
    public final EObject ruleNullo() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:800:28: ( ( (lv_value_0_0= 'null' ) ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:801:1: ( (lv_value_0_0= 'null' ) )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:801:1: ( (lv_value_0_0= 'null' ) )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:802:1: (lv_value_0_0= 'null' )
            {
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:802:1: (lv_value_0_0= 'null' )
            // ../fr.chaunier.xtext.instance.om/src-gen/fr/chaunier/xtext/instance/om/parser/antlr/internal/InternalInstanceDsl.g:803:3: lv_value_0_0= 'null'
            {
            lv_value_0_0=(Token)match(input,20,FOLLOW_20_in_ruleNullo1833); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNulloAccess().getValueNullKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNulloRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "null");
            	    

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
    // $ANTLR end "ruleNullo"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFactory131 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleNewObject_in_ruleFactory153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard352 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName465 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName499 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature601 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleFeature620 = new BitSet(new long[]{0x00000000001C0070L});
    public static final BitSet FOLLOW_15_in_ruleFeature651 = new BitSet(new long[]{0x00000000001C0070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFeature673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewObject764 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewObject781 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNewObject799 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleNewObject820 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleNewObject833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleValue926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleValue953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_ruleValue980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_ruleContainment1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_ruleTerminalExpression1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_ruleTerminalExpression1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntero_in_ruleTerminalExpression1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringa_in_ruleTerminalExpression1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullo_in_ruleTerminalExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_entryRuleThis1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThis1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleThis1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew1496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNew1543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNew1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntero_in_entryRuleIntero1599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntero1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntero1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringa_in_entryRuleStringa1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringa1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringa1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullo_in_entryRuleNullo1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullo1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNullo1833 = new BitSet(new long[]{0x0000000000000002L});

}