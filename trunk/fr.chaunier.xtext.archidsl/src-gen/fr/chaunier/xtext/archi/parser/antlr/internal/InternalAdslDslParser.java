package fr.chaunier.xtext.archi.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.chaunier.xtext.archi.services.AdslDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdslDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'system'", "'{'", "'}'", "'using'", "';'", "'component'", "'provides'", "'mandatory'", "'toMany'", "':'", "'requires'", "'interface'", "'oneway'", "'rr'", "'request'", "'='", "'reply'", "'('", "','", "')'"
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
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
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


        public InternalAdslDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdslDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdslDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g"; }



     	private AdslDslGrammarAccess grammarAccess;
     	
        public InternalAdslDslParser(TokenStream input, AdslDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ArchiModel";	
       	}
       	
       	@Override
       	protected AdslDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArchiModel"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:67:1: entryRuleArchiModel returns [EObject current=null] : iv_ruleArchiModel= ruleArchiModel EOF ;
    public final EObject entryRuleArchiModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchiModel = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:68:2: (iv_ruleArchiModel= ruleArchiModel EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:69:2: iv_ruleArchiModel= ruleArchiModel EOF
            {
             newCompositeNode(grammarAccess.getArchiModelRule()); 
            pushFollow(FOLLOW_ruleArchiModel_in_entryRuleArchiModel75);
            iv_ruleArchiModel=ruleArchiModel();

            state._fsp--;

             current =iv_ruleArchiModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchiModel85); 

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
    // $ANTLR end "entryRuleArchiModel"


    // $ANTLR start "ruleArchiModel"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:76:1: ruleArchiModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleSystem ) )* ) ;
    public final EObject ruleArchiModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleSystem ) )* ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleSystem ) )* )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleSystem ) )* )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleSystem ) )*
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchiModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleArchiModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchiModelRule());
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

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:98:3: ( (lv_elements_1_0= ruleSystem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:99:1: (lv_elements_1_0= ruleSystem )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:99:1: (lv_elements_1_0= ruleSystem )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:100:3: lv_elements_1_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchiModelAccess().getElementsSystemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleArchiModel153);
            	    lv_elements_1_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchiModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleArchiModel"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); 

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
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258);
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
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306); 

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
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard353);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:191:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard372); 

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
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:205:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:206:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:207:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName415);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName426); 

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
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:214:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:217:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:218:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:218:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName466); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:225:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:226:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName485); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName500); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleSystem"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:246:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:247:2: (iv_ruleSystem= ruleSystem EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:248:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem547);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem557); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:255:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_usings_3_0 = null;

        EObject lv_subSystems_4_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_interfaces_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:258:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )* otherlv_7= '}' ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:259:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )* otherlv_7= '}' )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:259:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )* otherlv_7= '}' )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:259:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSystem594); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:263:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:264:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:264:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem611); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSystem628); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:285:1: ( (lv_usings_3_0= ruleUsing ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:286:1: (lv_usings_3_0= ruleUsing )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:286:1: (lv_usings_3_0= ruleUsing )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:287:3: lv_usings_3_0= ruleUsing
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getUsingsUsingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsing_in_ruleSystem649);
            	    lv_usings_3_0=ruleUsing();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usings",
            	            		lv_usings_3_0, 
            	            		"Using");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:303:3: ( ( (lv_subSystems_4_0= ruleSystem ) ) | ( (lv_components_5_0= ruleComponent ) ) | ( (lv_interfaces_6_0= ruleInterface ) ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt6=1;
                    }
                    break;
                case 19:
                    {
                    alt6=2;
                    }
                    break;
                case 25:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:303:4: ( (lv_subSystems_4_0= ruleSystem ) )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:303:4: ( (lv_subSystems_4_0= ruleSystem ) )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:304:1: (lv_subSystems_4_0= ruleSystem )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:304:1: (lv_subSystems_4_0= ruleSystem )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:305:3: lv_subSystems_4_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getSubSystemsSystemParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleSystem672);
            	    lv_subSystems_4_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subSystems",
            	            		lv_subSystems_4_0, 
            	            		"System");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:322:6: ( (lv_components_5_0= ruleComponent ) )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:322:6: ( (lv_components_5_0= ruleComponent ) )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:323:1: (lv_components_5_0= ruleComponent )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:323:1: (lv_components_5_0= ruleComponent )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:324:3: lv_components_5_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleSystem699);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_5_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:341:6: ( (lv_interfaces_6_0= ruleInterface ) )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:341:6: ( (lv_interfaces_6_0= ruleInterface ) )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:342:1: (lv_interfaces_6_0= ruleInterface )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:342:1: (lv_interfaces_6_0= ruleInterface )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:343:3: lv_interfaces_6_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getInterfacesInterfaceParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleSystem726);
            	    lv_interfaces_6_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_6_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSystem740); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleUsing"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:371:1: entryRuleUsing returns [EObject current=null] : iv_ruleUsing= ruleUsing EOF ;
    public final EObject entryRuleUsing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsing = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:372:2: (iv_ruleUsing= ruleUsing EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:373:2: iv_ruleUsing= ruleUsing EOF
            {
             newCompositeNode(grammarAccess.getUsingRule()); 
            pushFollow(FOLLOW_ruleUsing_in_entryRuleUsing776);
            iv_ruleUsing=ruleUsing();

            state._fsp--;

             current =iv_ruleUsing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsing786); 

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
    // $ANTLR end "entryRuleUsing"


    // $ANTLR start "ruleUsing"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:380:1: ruleUsing returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleUsing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:383:28: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:384:1: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:384:1: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:384:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleUsing823); 

                	newLeafNode(otherlv_0, grammarAccess.getUsingAccess().getUsingKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:388:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:389:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:389:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:390:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUsingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsing843); 

            		newLeafNode(otherlv_1, grammarAccess.getUsingAccess().getSystemSystemCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleUsing855); 

                	newLeafNode(otherlv_2, grammarAccess.getUsingAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleUsing"


    // $ANTLR start "entryRuleComponent"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:413:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:414:2: (iv_ruleComponent= ruleComponent EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:415:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent891);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent901); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:422:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:425:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:426:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:426:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}' )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:426:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleComponent938); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:430:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:431:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:431:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:432:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent955); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleComponent972); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:452:1: ( (lv_ports_3_0= rulePort ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:453:1: (lv_ports_3_0= rulePort )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:453:1: (lv_ports_3_0= rulePort )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:454:3: lv_ports_3_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleComponent993);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_3_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleComponent1006); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:482:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:483:2: (iv_rulePort= rulePort EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:484:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1042);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1052); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:491:1: rulePort returns [EObject current=null] : (this_ProvidedPort_0= ruleProvidedPort | this_RequiredPort_1= ruleRequiredPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedPort_0 = null;

        EObject this_RequiredPort_1 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:494:28: ( (this_ProvidedPort_0= ruleProvidedPort | this_RequiredPort_1= ruleRequiredPort ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:495:1: (this_ProvidedPort_0= ruleProvidedPort | this_RequiredPort_1= ruleRequiredPort )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:495:1: (this_ProvidedPort_0= ruleProvidedPort | this_RequiredPort_1= ruleRequiredPort )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:496:5: this_ProvidedPort_0= ruleProvidedPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProvidedPort_in_rulePort1099);
                    this_ProvidedPort_0=ruleProvidedPort();

                    state._fsp--;

                     
                            current = this_ProvidedPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:506:5: this_RequiredPort_1= ruleRequiredPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRequiredPort_in_rulePort1126);
                    this_RequiredPort_1=ruleRequiredPort();

                    state._fsp--;

                     
                            current = this_RequiredPort_1; 
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProvidedPort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:522:1: entryRuleProvidedPort returns [EObject current=null] : iv_ruleProvidedPort= ruleProvidedPort EOF ;
    public final EObject entryRuleProvidedPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedPort = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:523:2: (iv_ruleProvidedPort= ruleProvidedPort EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:524:2: iv_ruleProvidedPort= ruleProvidedPort EOF
            {
             newCompositeNode(grammarAccess.getProvidedPortRule()); 
            pushFollow(FOLLOW_ruleProvidedPort_in_entryRuleProvidedPort1161);
            iv_ruleProvidedPort=ruleProvidedPort();

            state._fsp--;

             current =iv_ruleProvidedPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPort1171); 

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
    // $ANTLR end "entryRuleProvidedPort"


    // $ANTLR start "ruleProvidedPort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:531:1: ruleProvidedPort returns [EObject current=null] : (otherlv_0= 'provides' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleProvidedPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token lv_isToMany_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:534:28: ( (otherlv_0= 'provides' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:535:1: (otherlv_0= 'provides' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:535:1: (otherlv_0= 'provides' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:535:3: otherlv_0= 'provides' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleProvidedPort1208); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidedPortAccess().getProvidesKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:539:1: ( (lv_isMandatory_1_0= 'mandatory' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:540:1: (lv_isMandatory_1_0= 'mandatory' )
                    {
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:540:1: (lv_isMandatory_1_0= 'mandatory' )
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:541:3: lv_isMandatory_1_0= 'mandatory'
                    {
                    lv_isMandatory_1_0=(Token)match(input,21,FOLLOW_21_in_ruleProvidedPort1226); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getProvidedPortAccess().getIsMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProvidedPortRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:554:3: ( (lv_isToMany_2_0= 'toMany' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:555:1: (lv_isToMany_2_0= 'toMany' )
                    {
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:555:1: (lv_isToMany_2_0= 'toMany' )
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:556:3: lv_isToMany_2_0= 'toMany'
                    {
                    lv_isToMany_2_0=(Token)match(input,22,FOLLOW_22_in_ruleProvidedPort1258); 

                            newLeafNode(lv_isToMany_2_0, grammarAccess.getProvidedPortAccess().getIsToManyToManyKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProvidedPortRule());
                    	        }
                           		setWithLastConsumed(current, "isToMany", true, "toMany");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:569:3: ( (lv_name_3_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:570:1: (lv_name_3_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:570:1: (lv_name_3_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:571:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedPort1289); 

            			newLeafNode(lv_name_3_0, grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidedPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProvidedPort1306); 

                	newLeafNode(otherlv_4, grammarAccess.getProvidedPortAccess().getColonKeyword_4());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:591:1: ( (otherlv_5= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:592:1: (otherlv_5= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:592:1: (otherlv_5= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:593:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidedPortRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedPort1326); 

            		newLeafNode(otherlv_5, grammarAccess.getProvidedPortAccess().getInterfaceInterfaceCrossReference_5_0()); 
            	

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
    // $ANTLR end "ruleProvidedPort"


    // $ANTLR start "entryRuleRequiredPort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:612:1: entryRuleRequiredPort returns [EObject current=null] : iv_ruleRequiredPort= ruleRequiredPort EOF ;
    public final EObject entryRuleRequiredPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredPort = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:613:2: (iv_ruleRequiredPort= ruleRequiredPort EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:614:2: iv_ruleRequiredPort= ruleRequiredPort EOF
            {
             newCompositeNode(grammarAccess.getRequiredPortRule()); 
            pushFollow(FOLLOW_ruleRequiredPort_in_entryRuleRequiredPort1362);
            iv_ruleRequiredPort=ruleRequiredPort();

            state._fsp--;

             current =iv_ruleRequiredPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPort1372); 

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
    // $ANTLR end "entryRuleRequiredPort"


    // $ANTLR start "ruleRequiredPort"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:621:1: ruleRequiredPort returns [EObject current=null] : (otherlv_0= 'requires' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleRequiredPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isMandatory_1_0=null;
        Token lv_isToMany_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:624:28: ( (otherlv_0= 'requires' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:625:1: (otherlv_0= 'requires' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:625:1: (otherlv_0= 'requires' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:625:3: otherlv_0= 'requires' ( (lv_isMandatory_1_0= 'mandatory' ) )? ( (lv_isToMany_2_0= 'toMany' ) )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleRequiredPort1409); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredPortAccess().getRequiresKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:629:1: ( (lv_isMandatory_1_0= 'mandatory' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:630:1: (lv_isMandatory_1_0= 'mandatory' )
                    {
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:630:1: (lv_isMandatory_1_0= 'mandatory' )
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:631:3: lv_isMandatory_1_0= 'mandatory'
                    {
                    lv_isMandatory_1_0=(Token)match(input,21,FOLLOW_21_in_ruleRequiredPort1427); 

                            newLeafNode(lv_isMandatory_1_0, grammarAccess.getRequiredPortAccess().getIsMandatoryMandatoryKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredPortRule());
                    	        }
                           		setWithLastConsumed(current, "isMandatory", true, "mandatory");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:644:3: ( (lv_isToMany_2_0= 'toMany' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:645:1: (lv_isToMany_2_0= 'toMany' )
                    {
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:645:1: (lv_isToMany_2_0= 'toMany' )
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:646:3: lv_isToMany_2_0= 'toMany'
                    {
                    lv_isToMany_2_0=(Token)match(input,22,FOLLOW_22_in_ruleRequiredPort1459); 

                            newLeafNode(lv_isToMany_2_0, grammarAccess.getRequiredPortAccess().getIsToManyToManyKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredPortRule());
                    	        }
                           		setWithLastConsumed(current, "isToMany", true, "toMany");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:659:3: ( (lv_name_3_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:660:1: (lv_name_3_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:660:1: (lv_name_3_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:661:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredPort1490); 

            			newLeafNode(lv_name_3_0, grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRequiredPort1507); 

                	newLeafNode(otherlv_4, grammarAccess.getRequiredPortAccess().getColonKeyword_4());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:681:1: ( (otherlv_5= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:682:1: (otherlv_5= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:682:1: (otherlv_5= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:683:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiredPortRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredPort1527); 

            		newLeafNode(otherlv_5, grammarAccess.getRequiredPortAccess().getInterfaceInterfaceCrossReference_5_0()); 
            	

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
    // $ANTLR end "ruleRequiredPort"


    // $ANTLR start "entryRuleInterface"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:702:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:703:2: (iv_ruleInterface= ruleInterface EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:704:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1563);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1573); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:711:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interactions_3_0= ruleMessageInteraction ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_interactions_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:714:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interactions_3_0= ruleMessageInteraction ) )* otherlv_4= '}' ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:715:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interactions_3_0= ruleMessageInteraction ) )* otherlv_4= '}' )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:715:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interactions_3_0= ruleMessageInteraction ) )* otherlv_4= '}' )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:715:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interactions_3_0= ruleMessageInteraction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleInterface1610); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:719:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:720:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:720:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:721:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1627); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInterface1644); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:741:1: ( (lv_interactions_3_0= ruleMessageInteraction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:742:1: (lv_interactions_3_0= ruleMessageInteraction )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:742:1: (lv_interactions_3_0= ruleMessageInteraction )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:743:3: lv_interactions_3_0= ruleMessageInteraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getInteractionsMessageInteractionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageInteraction_in_ruleInterface1665);
            	    lv_interactions_3_0=ruleMessageInteraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interactions",
            	            		lv_interactions_3_0, 
            	            		"MessageInteraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInterface1678); 

                	newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMessageInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:771:1: entryRuleMessageInteraction returns [EObject current=null] : iv_ruleMessageInteraction= ruleMessageInteraction EOF ;
    public final EObject entryRuleMessageInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInteraction = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:772:2: (iv_ruleMessageInteraction= ruleMessageInteraction EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:773:2: iv_ruleMessageInteraction= ruleMessageInteraction EOF
            {
             newCompositeNode(grammarAccess.getMessageInteractionRule()); 
            pushFollow(FOLLOW_ruleMessageInteraction_in_entryRuleMessageInteraction1714);
            iv_ruleMessageInteraction=ruleMessageInteraction();

            state._fsp--;

             current =iv_ruleMessageInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageInteraction1724); 

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
    // $ANTLR end "entryRuleMessageInteraction"


    // $ANTLR start "ruleMessageInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:780:1: ruleMessageInteraction returns [EObject current=null] : (this_OnewayInteraction_0= ruleOnewayInteraction | this_RequestReplyInteraction_1= ruleRequestReplyInteraction ) ;
    public final EObject ruleMessageInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_OnewayInteraction_0 = null;

        EObject this_RequestReplyInteraction_1 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:783:28: ( (this_OnewayInteraction_0= ruleOnewayInteraction | this_RequestReplyInteraction_1= ruleRequestReplyInteraction ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:784:1: (this_OnewayInteraction_0= ruleOnewayInteraction | this_RequestReplyInteraction_1= ruleRequestReplyInteraction )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:784:1: (this_OnewayInteraction_0= ruleOnewayInteraction | this_RequestReplyInteraction_1= ruleRequestReplyInteraction )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:785:5: this_OnewayInteraction_0= ruleOnewayInteraction
                    {
                     
                            newCompositeNode(grammarAccess.getMessageInteractionAccess().getOnewayInteractionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOnewayInteraction_in_ruleMessageInteraction1771);
                    this_OnewayInteraction_0=ruleOnewayInteraction();

                    state._fsp--;

                     
                            current = this_OnewayInteraction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:795:5: this_RequestReplyInteraction_1= ruleRequestReplyInteraction
                    {
                     
                            newCompositeNode(grammarAccess.getMessageInteractionAccess().getRequestReplyInteractionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRequestReplyInteraction_in_ruleMessageInteraction1798);
                    this_RequestReplyInteraction_1=ruleRequestReplyInteraction();

                    state._fsp--;

                     
                            current = this_RequestReplyInteraction_1; 
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
    // $ANTLR end "ruleMessageInteraction"


    // $ANTLR start "entryRuleOnewayInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:811:1: entryRuleOnewayInteraction returns [EObject current=null] : iv_ruleOnewayInteraction= ruleOnewayInteraction EOF ;
    public final EObject entryRuleOnewayInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnewayInteraction = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:812:2: (iv_ruleOnewayInteraction= ruleOnewayInteraction EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:813:2: iv_ruleOnewayInteraction= ruleOnewayInteraction EOF
            {
             newCompositeNode(grammarAccess.getOnewayInteractionRule()); 
            pushFollow(FOLLOW_ruleOnewayInteraction_in_entryRuleOnewayInteraction1833);
            iv_ruleOnewayInteraction=ruleOnewayInteraction();

            state._fsp--;

             current =iv_ruleOnewayInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnewayInteraction1843); 

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
    // $ANTLR end "entryRuleOnewayInteraction"


    // $ANTLR start "ruleOnewayInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:820:1: ruleOnewayInteraction returns [EObject current=null] : (otherlv_0= 'oneway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_message_3_0= ruleMessage ) ) ) ;
    public final EObject ruleOnewayInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_message_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:823:28: ( (otherlv_0= 'oneway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_message_3_0= ruleMessage ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:824:1: (otherlv_0= 'oneway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_message_3_0= ruleMessage ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:824:1: (otherlv_0= 'oneway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_message_3_0= ruleMessage ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:824:3: otherlv_0= 'oneway' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_message_3_0= ruleMessage ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOnewayInteraction1880); 

                	newLeafNode(otherlv_0, grammarAccess.getOnewayInteractionAccess().getOnewayKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:828:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:829:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:829:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:830:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOnewayInteraction1897); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOnewayInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOnewayInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleOnewayInteraction1914); 

                	newLeafNode(otherlv_2, grammarAccess.getOnewayInteractionAccess().getColonKeyword_2());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:850:1: ( (lv_message_3_0= ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:851:1: (lv_message_3_0= ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:851:1: (lv_message_3_0= ruleMessage )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:852:3: lv_message_3_0= ruleMessage
            {
             
            	        newCompositeNode(grammarAccess.getOnewayInteractionAccess().getMessageMessageParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMessage_in_ruleOnewayInteraction1935);
            lv_message_3_0=ruleMessage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnewayInteractionRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_3_0, 
                    		"Message");
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
    // $ANTLR end "ruleOnewayInteraction"


    // $ANTLR start "entryRuleRequestReplyInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:876:1: entryRuleRequestReplyInteraction returns [EObject current=null] : iv_ruleRequestReplyInteraction= ruleRequestReplyInteraction EOF ;
    public final EObject entryRuleRequestReplyInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestReplyInteraction = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:877:2: (iv_ruleRequestReplyInteraction= ruleRequestReplyInteraction EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:878:2: iv_ruleRequestReplyInteraction= ruleRequestReplyInteraction EOF
            {
             newCompositeNode(grammarAccess.getRequestReplyInteractionRule()); 
            pushFollow(FOLLOW_ruleRequestReplyInteraction_in_entryRuleRequestReplyInteraction1971);
            iv_ruleRequestReplyInteraction=ruleRequestReplyInteraction();

            state._fsp--;

             current =iv_ruleRequestReplyInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestReplyInteraction1981); 

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
    // $ANTLR end "entryRuleRequestReplyInteraction"


    // $ANTLR start "ruleRequestReplyInteraction"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:885:1: ruleRequestReplyInteraction returns [EObject current=null] : (otherlv_0= 'rr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'request' otherlv_4= '=' ( (lv_request_5_0= ruleMessage ) ) otherlv_6= 'reply' otherlv_7= '=' ( (lv_reply_8_0= ruleMessage ) ) ) ;
    public final EObject ruleRequestReplyInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_request_5_0 = null;

        EObject lv_reply_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:888:28: ( (otherlv_0= 'rr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'request' otherlv_4= '=' ( (lv_request_5_0= ruleMessage ) ) otherlv_6= 'reply' otherlv_7= '=' ( (lv_reply_8_0= ruleMessage ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:889:1: (otherlv_0= 'rr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'request' otherlv_4= '=' ( (lv_request_5_0= ruleMessage ) ) otherlv_6= 'reply' otherlv_7= '=' ( (lv_reply_8_0= ruleMessage ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:889:1: (otherlv_0= 'rr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'request' otherlv_4= '=' ( (lv_request_5_0= ruleMessage ) ) otherlv_6= 'reply' otherlv_7= '=' ( (lv_reply_8_0= ruleMessage ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:889:3: otherlv_0= 'rr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'request' otherlv_4= '=' ( (lv_request_5_0= ruleMessage ) ) otherlv_6= 'reply' otherlv_7= '=' ( (lv_reply_8_0= ruleMessage ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleRequestReplyInteraction2018); 

                	newLeafNode(otherlv_0, grammarAccess.getRequestReplyInteractionAccess().getRrKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:893:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:894:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:894:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:895:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestReplyInteraction2035); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequestReplyInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequestReplyInteractionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleRequestReplyInteraction2052); 

                	newLeafNode(otherlv_2, grammarAccess.getRequestReplyInteractionAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleRequestReplyInteraction2064); 

                	newLeafNode(otherlv_3, grammarAccess.getRequestReplyInteractionAccess().getRequestKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleRequestReplyInteraction2076); 

                	newLeafNode(otherlv_4, grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_4());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:923:1: ( (lv_request_5_0= ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:924:1: (lv_request_5_0= ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:924:1: (lv_request_5_0= ruleMessage )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:925:3: lv_request_5_0= ruleMessage
            {
             
            	        newCompositeNode(grammarAccess.getRequestReplyInteractionAccess().getRequestMessageParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMessage_in_ruleRequestReplyInteraction2097);
            lv_request_5_0=ruleMessage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestReplyInteractionRule());
            	        }
                   		set(
                   			current, 
                   			"request",
                    		lv_request_5_0, 
                    		"Message");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleRequestReplyInteraction2109); 

                	newLeafNode(otherlv_6, grammarAccess.getRequestReplyInteractionAccess().getReplyKeyword_6());
                
            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleRequestReplyInteraction2121); 

                	newLeafNode(otherlv_7, grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_7());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:949:1: ( (lv_reply_8_0= ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:950:1: (lv_reply_8_0= ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:950:1: (lv_reply_8_0= ruleMessage )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:951:3: lv_reply_8_0= ruleMessage
            {
             
            	        newCompositeNode(grammarAccess.getRequestReplyInteractionAccess().getReplyMessageParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleMessage_in_ruleRequestReplyInteraction2142);
            lv_reply_8_0=ruleMessage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestReplyInteractionRule());
            	        }
                   		set(
                   			current, 
                   			"reply",
                    		lv_reply_8_0, 
                    		"Message");
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
    // $ANTLR end "ruleRequestReplyInteraction"


    // $ANTLR start "entryRuleMessage"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:975:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:976:2: (iv_ruleMessage= ruleMessage EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:977:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2178);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2188); 

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:984:1: ruleMessage returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )* otherlv_3= ')' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_parameters_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:987:28: ( (otherlv_0= '(' ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )* otherlv_3= ')' ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:988:1: (otherlv_0= '(' ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )* otherlv_3= ')' )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:988:1: (otherlv_0= '(' ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )* otherlv_3= ')' )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:988:3: otherlv_0= '(' ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMessage2225); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_0());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:992:1: ( ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:992:2: ( (lv_parameters_1_0= ruleMessageParameter ) ) (otherlv_2= ',' )?
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:992:2: ( (lv_parameters_1_0= ruleMessageParameter ) )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:993:1: (lv_parameters_1_0= ruleMessageParameter )
            	    {
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:993:1: (lv_parameters_1_0= ruleMessageParameter )
            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:994:3: lv_parameters_1_0= ruleMessageParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageAccess().getParametersMessageParameterParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageParameter_in_ruleMessage2247);
            	    lv_parameters_1_0=ruleMessageParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_1_0, 
            	            		"MessageParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1010:2: (otherlv_2= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1010:4: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleMessage2260); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getCommaKeyword_1_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleMessage2276); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageParameter"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1026:1: entryRuleMessageParameter returns [EObject current=null] : iv_ruleMessageParameter= ruleMessageParameter EOF ;
    public final EObject entryRuleMessageParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageParameter = null;


        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1027:2: (iv_ruleMessageParameter= ruleMessageParameter EOF )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1028:2: iv_ruleMessageParameter= ruleMessageParameter EOF
            {
             newCompositeNode(grammarAccess.getMessageParameterRule()); 
            pushFollow(FOLLOW_ruleMessageParameter_in_entryRuleMessageParameter2312);
            iv_ruleMessageParameter=ruleMessageParameter();

            state._fsp--;

             current =iv_ruleMessageParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageParameter2322); 

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
    // $ANTLR end "entryRuleMessageParameter"


    // $ANTLR start "ruleMessageParameter"
    // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1035:1: ruleMessageParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleMessageParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1038:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1039:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1039:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1039:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1039:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1040:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1040:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1041:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageParameter2364); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMessageParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleMessageParameter2381); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageParameterAccess().getColonKeyword_1());
                
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1061:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1062:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1062:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.archidsl/src-gen/fr/chaunier/xtext/archi/parser/antlr/internal/InternalAdslDsl.g:1063:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageParameterAccess().getTyperefEntityCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMessageParameter2404);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleMessageParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchiModel_in_entryRuleArchiModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchiModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleArchiModel131 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleArchiModel153 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard353 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName466 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName500 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSystem594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem611 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSystem628 = new BitSet(new long[]{0x00000000020B4000L});
    public static final BitSet FOLLOW_ruleUsing_in_ruleSystem649 = new BitSet(new long[]{0x00000000020B4000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleSystem672 = new BitSet(new long[]{0x0000000002094000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSystem699 = new BitSet(new long[]{0x0000000002094000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleSystem726 = new BitSet(new long[]{0x0000000002094000L});
    public static final BitSet FOLLOW_16_in_ruleSystem740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsing_in_entryRuleUsing776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsing786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUsing823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsing843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUsing855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleComponent938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent955 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent972 = new BitSet(new long[]{0x0000000001110000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent993 = new BitSet(new long[]{0x0000000001110000L});
    public static final BitSet FOLLOW_16_in_ruleComponent1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPort_in_rulePort1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPort_in_rulePort1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPort_in_entryRuleProvidedPort1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPort1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleProvidedPort1208 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_21_in_ruleProvidedPort1226 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleProvidedPort1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedPort1289 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProvidedPort1306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedPort1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPort_in_entryRuleRequiredPort1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPort1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRequiredPort1409 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_21_in_ruleRequiredPort1427 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleRequiredPort1459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredPort1490 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequiredPort1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredPort1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInterface1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface1644 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_ruleMessageInteraction_in_ruleInterface1665 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_16_in_ruleInterface1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInteraction_in_entryRuleMessageInteraction1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageInteraction1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnewayInteraction_in_ruleMessageInteraction1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestReplyInteraction_in_ruleMessageInteraction1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnewayInteraction_in_entryRuleOnewayInteraction1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnewayInteraction1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOnewayInteraction1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOnewayInteraction1897 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOnewayInteraction1914 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleOnewayInteraction1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestReplyInteraction_in_entryRuleRequestReplyInteraction1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestReplyInteraction1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRequestReplyInteraction2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestReplyInteraction2035 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequestReplyInteraction2052 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRequestReplyInteraction2064 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRequestReplyInteraction2076 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleRequestReplyInteraction2097 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRequestReplyInteraction2109 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRequestReplyInteraction2121 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleRequestReplyInteraction2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMessage2225 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleMessageParameter_in_ruleMessage2247 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_32_in_ruleMessage2260 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleMessage2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParameter_in_entryRuleMessageParameter2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageParameter2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageParameter2364 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMessageParameter2381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageParameter2404 = new BitSet(new long[]{0x0000000000000002L});

}