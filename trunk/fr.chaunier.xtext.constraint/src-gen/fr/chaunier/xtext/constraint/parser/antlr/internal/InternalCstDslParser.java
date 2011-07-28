package fr.chaunier.xtext.constraint.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.chaunier.xtext.constraint.services.CstDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCstDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XSD'", "'DTD'", "'FLAT'", "'CSV'", "'delimiter'", "'DB'", "'line'", "'import'", "'.*'", "'.'", "'package'", "'prefix'", "'namespace'", "'{'", "'}'", "'datatype'", "'entity'", "'boolean'", "'string'", "'regexp'", "'datetime'", "'default'", "'decimal'", "'enum'", "'fixeLen'", "'fixed'", "'minVal'", "'maxVal'", "'minLen'", "'maxLen'", "'paddle'", "'id'", "'nullable'", "'derived'", "'writable'", "'xsdA.'", "'as String'", "'as Value'"
    };
    public static final int RULE_ID=5;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCstDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCstDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCstDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g"; }



     	private CstDslGrammarAccess grammarAccess;
     	
        public InternalCstDslParser(TokenStream input, CstDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModelConstraint";	
       	}
       	
       	@Override
       	protected CstDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModelConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:68:1: entryRuleDomainModelConstraint returns [EObject current=null] : iv_ruleDomainModelConstraint= ruleDomainModelConstraint EOF ;
    public final EObject entryRuleDomainModelConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModelConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:69:2: (iv_ruleDomainModelConstraint= ruleDomainModelConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:70:2: iv_ruleDomainModelConstraint= ruleDomainModelConstraint EOF
            {
             newCompositeNode(grammarAccess.getDomainModelConstraintRule()); 
            pushFollow(FOLLOW_ruleDomainModelConstraint_in_entryRuleDomainModelConstraint75);
            iv_ruleDomainModelConstraint=ruleDomainModelConstraint();

            state._fsp--;

             current =iv_ruleDomainModelConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModelConstraint85); 

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
    // $ANTLR end "entryRuleDomainModelConstraint"


    // $ANTLR start "ruleDomainModelConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:77:1: ruleDomainModelConstraint returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElementConstraint ) )* ) ;
    public final EObject ruleDomainModelConstraint() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElementConstraint ) )* ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElementConstraint ) )* )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElementConstraint ) )* )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElementConstraint ) )*
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelConstraintAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomainModelConstraint131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelConstraintRule());
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

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:99:3: ( (lv_elements_1_0= ruleAbstractElementConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21||(LA2_0>=26 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:100:1: (lv_elements_1_0= ruleAbstractElementConstraint )
            	    {
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:100:1: (lv_elements_1_0= ruleAbstractElementConstraint )
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:101:3: lv_elements_1_0= ruleAbstractElementConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelConstraintAccess().getElementsAbstractElementConstraintParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElementConstraint_in_ruleDomainModelConstraint153);
            	    lv_elements_1_0=ruleAbstractElementConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"AbstractElementConstraint");
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
    // $ANTLR end "ruleDomainModelConstraint"


    // $ANTLR start "entryRuleFileSpecification"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:127:1: entryRuleFileSpecification returns [EObject current=null] : iv_ruleFileSpecification= ruleFileSpecification EOF ;
    public final EObject entryRuleFileSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileSpecification = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:128:2: (iv_ruleFileSpecification= ruleFileSpecification EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:129:2: iv_ruleFileSpecification= ruleFileSpecification EOF
            {
             newCompositeNode(grammarAccess.getFileSpecificationRule()); 
            pushFollow(FOLLOW_ruleFileSpecification_in_entryRuleFileSpecification192);
            iv_ruleFileSpecification=ruleFileSpecification();

            state._fsp--;

             current =iv_ruleFileSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileSpecification202); 

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
    // $ANTLR end "entryRuleFileSpecification"


    // $ANTLR start "ruleFileSpecification"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:136:1: ruleFileSpecification returns [EObject current=null] : ( ( (lv_format_0_0= 'XSD' ) ) | otherlv_1= 'DTD' | otherlv_2= 'FLAT' | (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) ) | otherlv_6= 'DB' ) ;
    public final EObject ruleFileSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_format_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_delimiter_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:139:28: ( ( ( (lv_format_0_0= 'XSD' ) ) | otherlv_1= 'DTD' | otherlv_2= 'FLAT' | (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) ) | otherlv_6= 'DB' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:140:1: ( ( (lv_format_0_0= 'XSD' ) ) | otherlv_1= 'DTD' | otherlv_2= 'FLAT' | (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) ) | otherlv_6= 'DB' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:140:1: ( ( (lv_format_0_0= 'XSD' ) ) | otherlv_1= 'DTD' | otherlv_2= 'FLAT' | (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) ) | otherlv_6= 'DB' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:140:2: ( (lv_format_0_0= 'XSD' ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:140:2: ( (lv_format_0_0= 'XSD' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:141:1: (lv_format_0_0= 'XSD' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:141:1: (lv_format_0_0= 'XSD' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:142:3: lv_format_0_0= 'XSD'
                    {
                    lv_format_0_0=(Token)match(input,11,FOLLOW_11_in_ruleFileSpecification245); 

                            newLeafNode(lv_format_0_0, grammarAccess.getFileSpecificationAccess().getFormatXSDKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFileSpecificationRule());
                    	        }
                           		setWithLastConsumed(current, "format", lv_format_0_0, "XSD");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:156:7: otherlv_1= 'DTD'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFileSpecification276); 

                        	newLeafNode(otherlv_1, grammarAccess.getFileSpecificationAccess().getDTDKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:161:7: otherlv_2= 'FLAT'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFileSpecification294); 

                        	newLeafNode(otherlv_2, grammarAccess.getFileSpecificationAccess().getFLATKeyword_2());
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:166:6: (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:166:6: (otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:166:8: otherlv_3= 'CSV' otherlv_4= 'delimiter' ( (lv_delimiter_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFileSpecification313); 

                        	newLeafNode(otherlv_3, grammarAccess.getFileSpecificationAccess().getCSVKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFileSpecification325); 

                        	newLeafNode(otherlv_4, grammarAccess.getFileSpecificationAccess().getDelimiterKeyword_3_1());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:174:1: ( (lv_delimiter_5_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:175:1: (lv_delimiter_5_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:175:1: (lv_delimiter_5_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:176:3: lv_delimiter_5_0= RULE_STRING
                    {
                    lv_delimiter_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFileSpecification342); 

                    			newLeafNode(lv_delimiter_5_0, grammarAccess.getFileSpecificationAccess().getDelimiterSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFileSpecificationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"delimiter",
                            		lv_delimiter_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:193:7: otherlv_6= 'DB'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFileSpecification366); 

                        	newLeafNode(otherlv_6, grammarAccess.getFileSpecificationAccess().getDBKeyword_4());
                        

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
    // $ANTLR end "ruleFileSpecification"


    // $ANTLR start "entryRuleFreeSpecification"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:205:1: entryRuleFreeSpecification returns [EObject current=null] : iv_ruleFreeSpecification= ruleFreeSpecification EOF ;
    public final EObject entryRuleFreeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeSpecification = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:206:2: (iv_ruleFreeSpecification= ruleFreeSpecification EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:207:2: iv_ruleFreeSpecification= ruleFreeSpecification EOF
            {
             newCompositeNode(grammarAccess.getFreeSpecificationRule()); 
            pushFollow(FOLLOW_ruleFreeSpecification_in_entryRuleFreeSpecification402);
            iv_ruleFreeSpecification=ruleFreeSpecification();

            state._fsp--;

             current =iv_ruleFreeSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeSpecification412); 

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
    // $ANTLR end "entryRuleFreeSpecification"


    // $ANTLR start "ruleFreeSpecification"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:214:1: ruleFreeSpecification returns [EObject current=null] : (otherlv_0= 'line' ( (lv_lines_1_0= RULE_STRING ) )* ) ;
    public final EObject ruleFreeSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lines_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:217:28: ( (otherlv_0= 'line' ( (lv_lines_1_0= RULE_STRING ) )* ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:218:1: (otherlv_0= 'line' ( (lv_lines_1_0= RULE_STRING ) )* )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:218:1: (otherlv_0= 'line' ( (lv_lines_1_0= RULE_STRING ) )* )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:218:3: otherlv_0= 'line' ( (lv_lines_1_0= RULE_STRING ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleFreeSpecification449); 

                	newLeafNode(otherlv_0, grammarAccess.getFreeSpecificationAccess().getLineKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:222:1: ( (lv_lines_1_0= RULE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:223:1: (lv_lines_1_0= RULE_STRING )
            	    {
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:223:1: (lv_lines_1_0= RULE_STRING )
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:224:3: lv_lines_1_0= RULE_STRING
            	    {
            	    lv_lines_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreeSpecification466); 

            	    			newLeafNode(lv_lines_1_0, grammarAccess.getFreeSpecificationAccess().getLinesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFreeSpecificationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"lines",
            	            		lv_lines_1_0, 
            	            		"STRING");
            	    	    

            	    }


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
    // $ANTLR end "ruleFreeSpecification"


    // $ANTLR start "entryRuleAbstractElementConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:248:1: entryRuleAbstractElementConstraint returns [EObject current=null] : iv_ruleAbstractElementConstraint= ruleAbstractElementConstraint EOF ;
    public final EObject entryRuleAbstractElementConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElementConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:249:2: (iv_ruleAbstractElementConstraint= ruleAbstractElementConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:250:2: iv_ruleAbstractElementConstraint= ruleAbstractElementConstraint EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementConstraintRule()); 
            pushFollow(FOLLOW_ruleAbstractElementConstraint_in_entryRuleAbstractElementConstraint508);
            iv_ruleAbstractElementConstraint=ruleAbstractElementConstraint();

            state._fsp--;

             current =iv_ruleAbstractElementConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElementConstraint518); 

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
    // $ANTLR end "entryRuleAbstractElementConstraint"


    // $ANTLR start "ruleAbstractElementConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:257:1: ruleAbstractElementConstraint returns [EObject current=null] : (this_PackageConstraint_0= rulePackageConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint | this_EntityConstraint_2= ruleEntityConstraint ) ;
    public final EObject ruleAbstractElementConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PackageConstraint_0 = null;

        EObject this_DataTypeConstraint_1 = null;

        EObject this_EntityConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:260:28: ( (this_PackageConstraint_0= rulePackageConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint | this_EntityConstraint_2= ruleEntityConstraint ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:261:1: (this_PackageConstraint_0= rulePackageConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint | this_EntityConstraint_2= ruleEntityConstraint )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:261:1: (this_PackageConstraint_0= rulePackageConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint | this_EntityConstraint_2= ruleEntityConstraint )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:262:5: this_PackageConstraint_0= rulePackageConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementConstraintAccess().getPackageConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageConstraint_in_ruleAbstractElementConstraint565);
                    this_PackageConstraint_0=rulePackageConstraint();

                    state._fsp--;

                     
                            current = this_PackageConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:272:5: this_DataTypeConstraint_1= ruleDataTypeConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeConstraint_in_ruleAbstractElementConstraint592);
                    this_DataTypeConstraint_1=ruleDataTypeConstraint();

                    state._fsp--;

                     
                            current = this_DataTypeConstraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:282:5: this_EntityConstraint_2= ruleEntityConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementConstraintAccess().getEntityConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEntityConstraint_in_ruleAbstractElementConstraint619);
                    this_EntityConstraint_2=ruleEntityConstraint();

                    state._fsp--;

                     
                            current = this_EntityConstraint_2; 
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
    // $ANTLR end "ruleAbstractElementConstraint"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:298:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:299:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:300:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport654);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport664); 

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
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:307:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:310:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:311:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:311:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:311:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport701); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:315:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:316:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:316:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:317:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport722);
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
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:341:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:342:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:343:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard759);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard770); 

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
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:350:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:353:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:354:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:354:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:355:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard817);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:365:1: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:366:2: kw= '.*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildCard836); 

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
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:379:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:380:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:381:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName879);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName890); 

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
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:388:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:391:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:392:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:392:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:392:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName930); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:399:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:400:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName949); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName964); 

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


    // $ANTLR start "entryRulePackageConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:420:1: entryRulePackageConstraint returns [EObject current=null] : iv_rulePackageConstraint= rulePackageConstraint EOF ;
    public final EObject entryRulePackageConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:421:2: (iv_rulePackageConstraint= rulePackageConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:422:2: iv_rulePackageConstraint= rulePackageConstraint EOF
            {
             newCompositeNode(grammarAccess.getPackageConstraintRule()); 
            pushFollow(FOLLOW_rulePackageConstraint_in_entryRulePackageConstraint1011);
            iv_rulePackageConstraint=rulePackageConstraint();

            state._fsp--;

             current =iv_rulePackageConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageConstraint1021); 

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
    // $ANTLR end "entryRulePackageConstraint"


    // $ANTLR start "rulePackageConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:429:1: rulePackageConstraint returns [EObject current=null] : (otherlv_0= 'package' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) otherlv_6= '{' ( (lv_types_7_0= ruleTypeConstraint ) )* otherlv_8= '}' ) ;
    public final EObject rulePackageConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_namespace_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        EObject lv_types_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:432:28: ( (otherlv_0= 'package' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) otherlv_6= '{' ( (lv_types_7_0= ruleTypeConstraint ) )* otherlv_8= '}' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:433:1: (otherlv_0= 'package' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) otherlv_6= '{' ( (lv_types_7_0= ruleTypeConstraint ) )* otherlv_8= '}' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:433:1: (otherlv_0= 'package' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) otherlv_6= '{' ( (lv_types_7_0= ruleTypeConstraint ) )* otherlv_8= '}' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:433:3: otherlv_0= 'package' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) otherlv_6= '{' ( (lv_types_7_0= ruleTypeConstraint ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePackageConstraint1058); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageConstraintAccess().getPackageKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:437:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:438:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:438:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:439:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackageConstraint1078); 

            		newLeafNode(otherlv_1, grammarAccess.getPackageConstraintAccess().getPackageDeclarationPackageDeclarationCrossReference_1_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:450:2: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:450:4: otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) )
            {
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePackageConstraint1091); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageConstraintAccess().getPrefixKeyword_2_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:454:1: ( (lv_prefix_3_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:455:1: (lv_prefix_3_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:455:1: (lv_prefix_3_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:456:3: lv_prefix_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageConstraintAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageConstraint1112);
            lv_prefix_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"prefix",
                    		lv_prefix_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:472:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:472:5: otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) )
            {
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_rulePackageConstraint1126); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageConstraintAccess().getNamespaceKeyword_3_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:476:1: ( (lv_namespace_5_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:477:1: (lv_namespace_5_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:477:1: (lv_namespace_5_0= RULE_STRING )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:478:3: lv_namespace_5_0= RULE_STRING
            {
            lv_namespace_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageConstraint1143); 

            			newLeafNode(lv_namespace_5_0, grammarAccess.getPackageConstraintAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"namespace",
                    		lv_namespace_5_0, 
                    		"STRING");
            	    

            }


            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_rulePackageConstraint1161); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageConstraintAccess().getLeftCurlyBracketKeyword_4());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:498:1: ( (lv_types_7_0= ruleTypeConstraint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=26 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:499:1: (lv_types_7_0= ruleTypeConstraint )
            	    {
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:499:1: (lv_types_7_0= ruleTypeConstraint )
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:500:3: lv_types_7_0= ruleTypeConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageConstraintAccess().getTypesTypeConstraintParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeConstraint_in_rulePackageConstraint1182);
            	    lv_types_7_0=ruleTypeConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_7_0, 
            	            		"TypeConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_rulePackageConstraint1195); 

                	newLeafNode(otherlv_8, grammarAccess.getPackageConstraintAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePackageConstraint"


    // $ANTLR start "entryRuleTypeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:528:1: entryRuleTypeConstraint returns [EObject current=null] : iv_ruleTypeConstraint= ruleTypeConstraint EOF ;
    public final EObject entryRuleTypeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:529:2: (iv_ruleTypeConstraint= ruleTypeConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:530:2: iv_ruleTypeConstraint= ruleTypeConstraint EOF
            {
             newCompositeNode(grammarAccess.getTypeConstraintRule()); 
            pushFollow(FOLLOW_ruleTypeConstraint_in_entryRuleTypeConstraint1231);
            iv_ruleTypeConstraint=ruleTypeConstraint();

            state._fsp--;

             current =iv_ruleTypeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeConstraint1241); 

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
    // $ANTLR end "entryRuleTypeConstraint"


    // $ANTLR start "ruleTypeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:537:1: ruleTypeConstraint returns [EObject current=null] : (this_EntityConstraint_0= ruleEntityConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint ) ;
    public final EObject ruleTypeConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_EntityConstraint_0 = null;

        EObject this_DataTypeConstraint_1 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:540:28: ( (this_EntityConstraint_0= ruleEntityConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:541:1: (this_EntityConstraint_0= ruleEntityConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:541:1: (this_EntityConstraint_0= ruleEntityConstraint | this_DataTypeConstraint_1= ruleDataTypeConstraint )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:542:5: this_EntityConstraint_0= ruleEntityConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getTypeConstraintAccess().getEntityConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntityConstraint_in_ruleTypeConstraint1288);
                    this_EntityConstraint_0=ruleEntityConstraint();

                    state._fsp--;

                     
                            current = this_EntityConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:552:5: this_DataTypeConstraint_1= ruleDataTypeConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getTypeConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeConstraint_in_ruleTypeConstraint1315);
                    this_DataTypeConstraint_1=ruleDataTypeConstraint();

                    state._fsp--;

                     
                            current = this_DataTypeConstraint_1; 
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
    // $ANTLR end "ruleTypeConstraint"


    // $ANTLR start "entryRuleDataTypeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:568:1: entryRuleDataTypeConstraint returns [EObject current=null] : iv_ruleDataTypeConstraint= ruleDataTypeConstraint EOF ;
    public final EObject entryRuleDataTypeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:569:2: (iv_ruleDataTypeConstraint= ruleDataTypeConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:570:2: iv_ruleDataTypeConstraint= ruleDataTypeConstraint EOF
            {
             newCompositeNode(grammarAccess.getDataTypeConstraintRule()); 
            pushFollow(FOLLOW_ruleDataTypeConstraint_in_entryRuleDataTypeConstraint1350);
            iv_ruleDataTypeConstraint=ruleDataTypeConstraint();

            state._fsp--;

             current =iv_ruleDataTypeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeConstraint1360); 

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
    // $ANTLR end "entryRuleDataTypeConstraint"


    // $ANTLR start "ruleDataTypeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:577:1: ruleDataTypeConstraint returns [EObject current=null] : (otherlv_0= 'datatype' ( (otherlv_1= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? ( (lv_description_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleDataTypeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_3_0=null;
        EObject lv_constraint_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:580:28: ( (otherlv_0= 'datatype' ( (otherlv_1= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? ( (lv_description_3_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:581:1: (otherlv_0= 'datatype' ( (otherlv_1= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? ( (lv_description_3_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:581:1: (otherlv_0= 'datatype' ( (otherlv_1= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? ( (lv_description_3_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:581:3: otherlv_0= 'datatype' ( (otherlv_1= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? ( (lv_description_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDataTypeConstraint1397); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeConstraintAccess().getDatatypeKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:585:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:586:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:586:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:587:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeConstraint1417); 

            		newLeafNode(otherlv_1, grammarAccess.getDataTypeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:598:2: ( (lv_constraint_2_0= ruleConstraint ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=28 && LA10_0<=29)||LA10_0==31||(LA10_0>=33 && LA10_0<=34)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:599:1: (lv_constraint_2_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:599:1: (lv_constraint_2_0= ruleConstraint )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:600:3: lv_constraint_2_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeConstraintAccess().getConstraintConstraintParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleDataTypeConstraint1438);
                    lv_constraint_2_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"constraint",
                            		lv_constraint_2_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:616:3: ( (lv_description_3_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:617:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:617:1: (lv_description_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:618:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataTypeConstraint1456); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getDataTypeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
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
    // $ANTLR end "ruleDataTypeConstraint"


    // $ANTLR start "entryRuleEntityConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:642:1: entryRuleEntityConstraint returns [EObject current=null] : iv_ruleEntityConstraint= ruleEntityConstraint EOF ;
    public final EObject entryRuleEntityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:643:2: (iv_ruleEntityConstraint= ruleEntityConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:644:2: iv_ruleEntityConstraint= ruleEntityConstraint EOF
            {
             newCompositeNode(grammarAccess.getEntityConstraintRule()); 
            pushFollow(FOLLOW_ruleEntityConstraint_in_entryRuleEntityConstraint1498);
            iv_ruleEntityConstraint=ruleEntityConstraint();

            state._fsp--;

             current =iv_ruleEntityConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConstraint1508); 

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
    // $ANTLR end "entryRuleEntityConstraint"


    // $ANTLR start "ruleEntityConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:651:1: ruleEntityConstraint returns [EObject current=null] : (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeatureConstraint ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:654:28: ( (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeatureConstraint ) )* otherlv_5= '}' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:655:1: (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeatureConstraint ) )* otherlv_5= '}' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:655:1: (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeatureConstraint ) )* otherlv_5= '}' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:655:3: otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeatureConstraint ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleEntityConstraint1545); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityConstraintAccess().getEntityKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:659:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:660:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:660:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:661:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityConstraint1565); 

            		newLeafNode(otherlv_1, grammarAccess.getEntityConstraintAccess().getEntityEntityCrossReference_1_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:672:2: ( (lv_description_2_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:673:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:673:1: (lv_description_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:674:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntityConstraint1582); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getEntityConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleEntityConstraint1600); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityConstraintAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:694:1: ( (lv_features_4_0= ruleFeatureConstraint ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:695:1: (lv_features_4_0= ruleFeatureConstraint )
            	    {
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:695:1: (lv_features_4_0= ruleFeatureConstraint )
            	    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:696:3: lv_features_4_0= ruleFeatureConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityConstraintAccess().getFeaturesFeatureConstraintParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureConstraint_in_ruleEntityConstraint1621);
            	    lv_features_4_0=ruleFeatureConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_4_0, 
            	            		"FeatureConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleEntityConstraint1634); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityConstraintAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntityConstraint"


    // $ANTLR start "entryRuleFeatureConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:724:1: entryRuleFeatureConstraint returns [EObject current=null] : iv_ruleFeatureConstraint= ruleFeatureConstraint EOF ;
    public final EObject entryRuleFeatureConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:725:2: (iv_ruleFeatureConstraint= ruleFeatureConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:726:2: iv_ruleFeatureConstraint= ruleFeatureConstraint EOF
            {
             newCompositeNode(grammarAccess.getFeatureConstraintRule()); 
            pushFollow(FOLLOW_ruleFeatureConstraint_in_entryRuleFeatureConstraint1670);
            iv_ruleFeatureConstraint=ruleFeatureConstraint();

            state._fsp--;

             current =iv_ruleFeatureConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureConstraint1680); 

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
    // $ANTLR end "entryRuleFeatureConstraint"


    // $ANTLR start "ruleFeatureConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:733:1: ruleFeatureConstraint returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeatureConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_description_2_0=null;
        EObject this_AttributeConstraint_0 = null;

        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:736:28: ( (this_AttributeConstraint_0= ruleAttributeConstraint ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:737:1: (this_AttributeConstraint_0= ruleAttributeConstraint ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:737:1: (this_AttributeConstraint_0= ruleAttributeConstraint ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:738:5: this_AttributeConstraint_0= ruleAttributeConstraint ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )?
            {
             
                    newCompositeNode(grammarAccess.getFeatureConstraintAccess().getAttributeConstraintParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAttributeConstraint_in_ruleFeatureConstraint1727);
            this_AttributeConstraint_0=ruleAttributeConstraint();

            state._fsp--;

             
                    current = this_AttributeConstraint_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:746:1: ( (lv_constraint_1_0= ruleConstraint ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=28 && LA14_0<=29)||LA14_0==31||(LA14_0>=33 && LA14_0<=34)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:747:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:747:1: (lv_constraint_1_0= ruleConstraint )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:748:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureConstraintAccess().getConstraintConstraintParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleFeatureConstraint1747);
                    lv_constraint_1_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"constraint",
                            		lv_constraint_1_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:764:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:765:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:765:1: (lv_description_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:766:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureConstraint1765); 

                    			newLeafNode(lv_description_2_0, grammarAccess.getFeatureConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_2_0, 
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
    // $ANTLR end "ruleFeatureConstraint"


    // $ANTLR start "entryRuleAttributeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:790:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:791:2: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:792:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
            {
             newCompositeNode(grammarAccess.getAttributeConstraintRule()); 
            pushFollow(FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint1807);
            iv_ruleAttributeConstraint=ruleAttributeConstraint();

            state._fsp--;

             current =iv_ruleAttributeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstraint1817); 

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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:799:1: ruleAttributeConstraint returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:802:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:803:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:803:1: ( (otherlv_0= RULE_ID ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:804:1: (otherlv_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:804:1: (otherlv_0= RULE_ID )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:805:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeConstraintRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeConstraint1861); 

            		newLeafNode(otherlv_0, grammarAccess.getAttributeConstraintAccess().getAttributeAttributeCrossReference_0()); 
            	

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
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:824:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:825:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:826:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1896);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1906); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:833:1: ruleConstraint returns [EObject current=null] : (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BoolConstraint_0 = null;

        EObject this_StringConstraint_1 = null;

        EObject this_DateTimeConstraint_2 = null;

        EObject this_DecimalConstraint_3 = null;

        EObject this_EnumerationConstraint_4 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:836:28: ( (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:837:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:837:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            case 34:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:838:5: this_BoolConstraint_0= ruleBoolConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolConstraint_in_ruleConstraint1953);
                    this_BoolConstraint_0=ruleBoolConstraint();

                    state._fsp--;

                     
                            current = this_BoolConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:848:5: this_StringConstraint_1= ruleStringConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringConstraint_in_ruleConstraint1980);
                    this_StringConstraint_1=ruleStringConstraint();

                    state._fsp--;

                     
                            current = this_StringConstraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:858:5: this_DateTimeConstraint_2= ruleDateTimeConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2007);
                    this_DateTimeConstraint_2=ruleDateTimeConstraint();

                    state._fsp--;

                     
                            current = this_DateTimeConstraint_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:868:5: this_DecimalConstraint_3= ruleDecimalConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_ruleConstraint2034);
                    this_DecimalConstraint_3=ruleDecimalConstraint();

                    state._fsp--;

                     
                            current = this_DecimalConstraint_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:878:5: this_EnumerationConstraint_4= ruleEnumerationConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2061);
                    this_EnumerationConstraint_4=ruleEnumerationConstraint();

                    state._fsp--;

                     
                            current = this_EnumerationConstraint_4; 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleBoolConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:894:1: entryRuleBoolConstraint returns [EObject current=null] : iv_ruleBoolConstraint= ruleBoolConstraint EOF ;
    public final EObject entryRuleBoolConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:895:2: (iv_ruleBoolConstraint= ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:896:2: iv_ruleBoolConstraint= ruleBoolConstraint EOF
            {
             newCompositeNode(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2096);
            iv_ruleBoolConstraint=ruleBoolConstraint();

            state._fsp--;

             current =iv_ruleBoolConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint2106); 

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
    // $ANTLR end "entryRuleBoolConstraint"


    // $ANTLR start "ruleBoolConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:903:1: ruleBoolConstraint returns [EObject current=null] : ( (lv_constraint_0_0= 'boolean' ) ) ;
    public final EObject ruleBoolConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:906:28: ( ( (lv_constraint_0_0= 'boolean' ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:907:1: ( (lv_constraint_0_0= 'boolean' ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:907:1: ( (lv_constraint_0_0= 'boolean' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:908:1: (lv_constraint_0_0= 'boolean' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:908:1: (lv_constraint_0_0= 'boolean' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:909:3: lv_constraint_0_0= 'boolean'
            {
            lv_constraint_0_0=(Token)match(input,28,FOLLOW_28_in_ruleBoolConstraint2148); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBoolConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "boolean");
            	    

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
    // $ANTLR end "ruleBoolConstraint"


    // $ANTLR start "entryRuleStringConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:930:1: entryRuleStringConstraint returns [EObject current=null] : iv_ruleStringConstraint= ruleStringConstraint EOF ;
    public final EObject entryRuleStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:931:2: (iv_ruleStringConstraint= ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:932:2: iv_ruleStringConstraint= ruleStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2196);
            iv_ruleStringConstraint=ruleStringConstraint();

            state._fsp--;

             current =iv_ruleStringConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint2206); 

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
    // $ANTLR end "entryRuleStringConstraint"


    // $ANTLR start "ruleStringConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:939:1: ruleStringConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token otherlv_2=null;
        Token lv_regularExpression_3_0=null;
        EObject lv_constraintRef_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:942:28: ( ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:943:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:943:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:943:2: ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:943:2: ( (lv_constraint_0_0= 'string' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:944:1: (lv_constraint_0_0= 'string' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:944:1: (lv_constraint_0_0= 'string' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:945:3: lv_constraint_0_0= 'string'
            {
            lv_constraint_0_0=(Token)match(input,29,FOLLOW_29_in_ruleStringConstraint2249); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "string");
            	    

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:958:2: ( (lv_constraintRef_1_0= ruleAllConstraint ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:959:1: (lv_constraintRef_1_0= ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:959:1: (lv_constraintRef_1_0= ruleAllConstraint )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:960:3: lv_constraintRef_1_0= ruleAllConstraint
            {
             
            	        newCompositeNode(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAllConstraint_in_ruleStringConstraint2283);
            lv_constraintRef_1_0=ruleAllConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"constraintRef",
                    		lv_constraintRef_1_0, 
                    		"AllConstraint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:976:2: (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:976:4: otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleStringConstraint2296); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:980:1: ( (lv_regularExpression_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:981:1: (lv_regularExpression_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:981:1: (lv_regularExpression_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:982:3: lv_regularExpression_3_0= RULE_STRING
                    {
                    lv_regularExpression_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint2313); 

                    			newLeafNode(lv_regularExpression_3_0, grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"regularExpression",
                            		lv_regularExpression_3_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleStringConstraint"


    // $ANTLR start "entryRuleDateTimeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1006:1: entryRuleDateTimeConstraint returns [EObject current=null] : iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF ;
    public final EObject entryRuleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1007:2: (iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1008:2: iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint2356);
            iv_ruleDateTimeConstraint=ruleDateTimeConstraint();

            state._fsp--;

             current =iv_ruleDateTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint2366); 

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
    // $ANTLR end "entryRuleDateTimeConstraint"


    // $ANTLR start "ruleDateTimeConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1015:1: ruleDateTimeConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'datetime' ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token otherlv_1=null;
        Token lv_hasDefault_2_0=null;
        Token lv_defaultValue_3_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1018:28: ( ( ( (lv_constraint_0_0= 'datetime' ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1019:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1019:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1019:2: ( (lv_constraint_0_0= 'datetime' ) ) ( (otherlv_1= RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1019:2: ( (lv_constraint_0_0= 'datetime' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1020:1: (lv_constraint_0_0= 'datetime' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1020:1: (lv_constraint_0_0= 'datetime' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1021:3: lv_constraint_0_0= 'datetime'
            {
            lv_constraint_0_0=(Token)match(input,31,FOLLOW_31_in_ruleDateTimeConstraint2409); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "datetime");
            	    

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1034:2: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1035:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1035:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1036:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeConstraint2442); 

            		newLeafNode(otherlv_1, grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            	

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1047:2: ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1047:3: ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1047:3: ( (lv_hasDefault_2_0= 'default' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1048:1: (lv_hasDefault_2_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1048:1: (lv_hasDefault_2_0= 'default' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1049:3: lv_hasDefault_2_0= 'default'
                    {
                    lv_hasDefault_2_0=(Token)match(input,32,FOLLOW_32_in_ruleDateTimeConstraint2461); 

                            newLeafNode(lv_hasDefault_2_0, grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1062:2: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1063:1: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1063:1: (lv_defaultValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1064:3: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeConstraint2491); 

                    			newLeafNode(lv_defaultValue_3_0, grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_3_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleDateTimeConstraint"


    // $ANTLR start "entryRuleDecimalConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1088:1: entryRuleDecimalConstraint returns [EObject current=null] : iv_ruleDecimalConstraint= ruleDecimalConstraint EOF ;
    public final EObject entryRuleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1089:2: (iv_ruleDecimalConstraint= ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1090:2: iv_ruleDecimalConstraint= ruleDecimalConstraint EOF
            {
             newCompositeNode(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint2534);
            iv_ruleDecimalConstraint=ruleDecimalConstraint();

            state._fsp--;

             current =iv_ruleDecimalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint2544); 

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
    // $ANTLR end "entryRuleDecimalConstraint"


    // $ANTLR start "ruleDecimalConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1097:1: ruleDecimalConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) ;
    public final EObject ruleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        EObject lv_constraintRef_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1100:28: ( ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1101:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1101:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1101:2: ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1101:2: ( (lv_constraint_0_0= 'decimal' ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1102:1: (lv_constraint_0_0= 'decimal' )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1102:1: (lv_constraint_0_0= 'decimal' )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1103:3: lv_constraint_0_0= 'decimal'
            {
            lv_constraint_0_0=(Token)match(input,33,FOLLOW_33_in_ruleDecimalConstraint2587); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecimalConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "decimal");
            	    

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1116:2: ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1117:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1117:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1118:3: lv_constraintRef_1_0= ruleNumberConstraint
            {
             
            	        newCompositeNode(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint2621);
            lv_constraintRef_1_0=ruleNumberConstraint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecimalConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"constraintRef",
                    		lv_constraintRef_1_0, 
                    		"NumberConstraint");
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
    // $ANTLR end "ruleDecimalConstraint"


    // $ANTLR start "entryRuleEnumerationConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1142:1: entryRuleEnumerationConstraint returns [EObject current=null] : iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF ;
    public final EObject entryRuleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1143:2: (iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1144:2: iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF
            {
             newCompositeNode(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint2657);
            iv_ruleEnumerationConstraint=ruleEnumerationConstraint();

            state._fsp--;

             current =iv_ruleEnumerationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint2667); 

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
    // $ANTLR end "entryRuleEnumerationConstraint"


    // $ANTLR start "ruleEnumerationConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1151:1: ruleEnumerationConstraint returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_fixeLen_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValueAsString_5_0=null;
        Enumerator lv_usage_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1154:28: ( (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1155:1: (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1155:1: (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1155:3: otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleEnumerationConstraint2704); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0());
                
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1159:1: ( (lv_usage_1_0= ruleEnumUsage ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1160:1: (lv_usage_1_0= ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1160:1: (lv_usage_1_0= ruleEnumUsage )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1161:3: lv_usage_1_0= ruleEnumUsage
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint2725);
            lv_usage_1_0=ruleEnumUsage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"usage",
                    		lv_usage_1_0, 
                    		"EnumUsage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1177:2: (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1177:4: otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleEnumerationConstraint2738); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1181:1: ( (lv_fixeLen_3_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1182:1: (lv_fixeLen_3_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1182:1: (lv_fixeLen_3_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1183:3: lv_fixeLen_3_0= RULE_INT
                    {
                    lv_fixeLen_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationConstraint2755); 

                    			newLeafNode(lv_fixeLen_3_0, grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumerationConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fixeLen",
                            		lv_fixeLen_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1199:4: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1199:5: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1199:5: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1200:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1200:1: (lv_hasDefault_4_0= 'default' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1201:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,32,FOLLOW_32_in_ruleEnumerationConstraint2781); 

                            newLeafNode(lv_hasDefault_4_0, grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumerationConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1214:2: ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1215:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1215:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1216:3: lv_defaultValueAsString_5_0= RULE_ID
                    {
                    lv_defaultValueAsString_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationConstraint2811); 

                    			newLeafNode(lv_defaultValueAsString_5_0, grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumerationConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValueAsString",
                            		lv_defaultValueAsString_5_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleEnumerationConstraint"


    // $ANTLR start "entryRuleNumberConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1240:1: entryRuleNumberConstraint returns [EObject current=null] : iv_ruleNumberConstraint= ruleNumberConstraint EOF ;
    public final EObject entryRuleNumberConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1241:2: (iv_ruleNumberConstraint= ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1242:2: iv_ruleNumberConstraint= ruleNumberConstraint EOF
            {
             newCompositeNode(grammarAccess.getNumberConstraintRule()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint2854);
            iv_ruleNumberConstraint=ruleNumberConstraint();

            state._fsp--;

             current =iv_ruleNumberConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint2864); 

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
    // $ANTLR end "entryRuleNumberConstraint"


    // $ANTLR start "ruleNumberConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1249:1: ruleNumberConstraint returns [EObject current=null] : ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? ) ;
    public final EObject ruleNumberConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_hasDefault_0_0=null;
        Token lv_defaultValue_1_0=null;
        Token lv_isFixed_2_0=null;
        Token lv_fixedValue_3_0=null;
        Token otherlv_4=null;
        Token lv_minValue_5_0=null;
        Token otherlv_6=null;
        Token lv_maxValue_7_0=null;
        Token otherlv_8=null;
        Token lv_minLen_9_0=null;
        Token otherlv_10=null;
        Token lv_maxLen_11_0=null;
        Token otherlv_12=null;
        Token lv_fixeLen_13_0=null;
        Token otherlv_14=null;
        Token lv_paddle_15_0=null;
        Token lv_isId_16_0=null;
        Token lv_nullable_17_0=null;
        Token lv_derived_18_0=null;
        Token lv_writable_19_0=null;
        Token lv_isXSDAtt_20_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1252:28: ( ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )?
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:3: ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1253:3: ( (lv_hasDefault_0_0= 'default' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1254:1: (lv_hasDefault_0_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1254:1: (lv_hasDefault_0_0= 'default' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1255:3: lv_hasDefault_0_0= 'default'
                    {
                    lv_hasDefault_0_0=(Token)match(input,32,FOLLOW_32_in_ruleNumberConstraint2908); 

                            newLeafNode(lv_hasDefault_0_0, grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1268:2: ( (lv_defaultValue_1_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1269:1: (lv_defaultValue_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1269:1: (lv_defaultValue_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1270:3: lv_defaultValue_1_0= RULE_STRING
                    {
                    lv_defaultValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint2938); 

                    			newLeafNode(lv_defaultValue_1_0, grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1286:4: ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1286:5: ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1286:5: ( (lv_isFixed_2_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1287:1: (lv_isFixed_2_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1287:1: (lv_isFixed_2_0= 'fixed' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1288:3: lv_isFixed_2_0= 'fixed'
                    {
                    lv_isFixed_2_0=(Token)match(input,36,FOLLOW_36_in_ruleNumberConstraint2964); 

                            newLeafNode(lv_isFixed_2_0, grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isFixed", true, "fixed");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1301:2: ( (lv_fixedValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1302:1: (lv_fixedValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1302:1: (lv_fixedValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1303:3: lv_fixedValue_3_0= RULE_STRING
                    {
                    lv_fixedValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint2994); 

                    			newLeafNode(lv_fixedValue_3_0, grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fixedValue",
                            		lv_fixedValue_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1319:4: (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1319:6: otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleNumberConstraint3014); 

                        	newLeafNode(otherlv_4, grammarAccess.getNumberConstraintAccess().getMinValKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1323:1: ( (lv_minValue_5_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1324:1: (lv_minValue_5_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1324:1: (lv_minValue_5_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1325:3: lv_minValue_5_0= RULE_INT
                    {
                    lv_minValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3031); 

                    			newLeafNode(lv_minValue_5_0, grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minValue",
                            		lv_minValue_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1341:4: (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1341:6: otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleNumberConstraint3051); 

                        	newLeafNode(otherlv_6, grammarAccess.getNumberConstraintAccess().getMaxValKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1345:1: ( (lv_maxValue_7_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1346:1: (lv_maxValue_7_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1346:1: (lv_maxValue_7_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1347:3: lv_maxValue_7_0= RULE_INT
                    {
                    lv_maxValue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3068); 

                    			newLeafNode(lv_maxValue_7_0, grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maxValue",
                            		lv_maxValue_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1363:4: (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1363:6: otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleNumberConstraint3088); 

                        	newLeafNode(otherlv_8, grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1367:1: ( (lv_minLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1368:1: (lv_minLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1368:1: (lv_minLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1369:3: lv_minLen_9_0= RULE_INT
                    {
                    lv_minLen_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3105); 

                    			newLeafNode(lv_minLen_9_0, grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minLen",
                            		lv_minLen_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1385:4: (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1385:6: otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleNumberConstraint3125); 

                        	newLeafNode(otherlv_10, grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1389:1: ( (lv_maxLen_11_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1390:1: (lv_maxLen_11_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1390:1: (lv_maxLen_11_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1391:3: lv_maxLen_11_0= RULE_INT
                    {
                    lv_maxLen_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3142); 

                    			newLeafNode(lv_maxLen_11_0, grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maxLen",
                            		lv_maxLen_11_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1407:4: (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1407:6: otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleNumberConstraint3162); 

                        	newLeafNode(otherlv_12, grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1411:1: ( (lv_fixeLen_13_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1412:1: (lv_fixeLen_13_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1412:1: (lv_fixeLen_13_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1413:3: lv_fixeLen_13_0= RULE_INT
                    {
                    lv_fixeLen_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3179); 

                    			newLeafNode(lv_fixeLen_13_0, grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fixeLen",
                            		lv_fixeLen_13_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1429:4: (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1429:6: otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleNumberConstraint3199); 

                        	newLeafNode(otherlv_14, grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1433:1: ( (lv_paddle_15_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1434:1: (lv_paddle_15_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1434:1: (lv_paddle_15_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1435:3: lv_paddle_15_0= RULE_STRING
                    {
                    lv_paddle_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint3216); 

                    			newLeafNode(lv_paddle_15_0, grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"paddle",
                            		lv_paddle_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1451:4: ( (lv_isId_16_0= 'id' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1452:1: (lv_isId_16_0= 'id' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1452:1: (lv_isId_16_0= 'id' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1453:3: lv_isId_16_0= 'id'
                    {
                    lv_isId_16_0=(Token)match(input,42,FOLLOW_42_in_ruleNumberConstraint3241); 

                            newLeafNode(lv_isId_16_0, grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isId", true, "id");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1466:3: ( (lv_nullable_17_0= 'nullable' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1467:1: (lv_nullable_17_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1467:1: (lv_nullable_17_0= 'nullable' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1468:3: lv_nullable_17_0= 'nullable'
                    {
                    lv_nullable_17_0=(Token)match(input,43,FOLLOW_43_in_ruleNumberConstraint3273); 

                            newLeafNode(lv_nullable_17_0, grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", true, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1481:3: ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1481:4: ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1481:4: ( (lv_derived_18_0= 'derived' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1482:1: (lv_derived_18_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1482:1: (lv_derived_18_0= 'derived' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1483:3: lv_derived_18_0= 'derived'
                    {
                    lv_derived_18_0=(Token)match(input,44,FOLLOW_44_in_ruleNumberConstraint3306); 

                            newLeafNode(lv_derived_18_0, grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1496:2: ( (lv_writable_19_0= 'writable' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==45) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1497:1: (lv_writable_19_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1497:1: (lv_writable_19_0= 'writable' )
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1498:3: lv_writable_19_0= 'writable'
                            {
                            lv_writable_19_0=(Token)match(input,45,FOLLOW_45_in_ruleNumberConstraint3337); 

                                    newLeafNode(lv_writable_19_0, grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "writable", true, "writable");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1511:5: ( (lv_isXSDAtt_20_0= 'xsdA.' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1512:1: (lv_isXSDAtt_20_0= 'xsdA.' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1512:1: (lv_isXSDAtt_20_0= 'xsdA.' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1513:3: lv_isXSDAtt_20_0= 'xsdA.'
                    {
                    lv_isXSDAtt_20_0=(Token)match(input,46,FOLLOW_46_in_ruleNumberConstraint3371); 

                            newLeafNode(lv_isXSDAtt_20_0, grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isXSDAtt", true, "xsdA.");
                    	    

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
    // $ANTLR end "ruleNumberConstraint"


    // $ANTLR start "entryRuleAllConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1534:1: entryRuleAllConstraint returns [EObject current=null] : iv_ruleAllConstraint= ruleAllConstraint EOF ;
    public final EObject entryRuleAllConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllConstraint = null;


        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1535:2: (iv_ruleAllConstraint= ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1536:2: iv_ruleAllConstraint= ruleAllConstraint EOF
            {
             newCompositeNode(grammarAccess.getAllConstraintRule()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint3421);
            iv_ruleAllConstraint=ruleAllConstraint();

            state._fsp--;

             current =iv_ruleAllConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint3431); 

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
    // $ANTLR end "entryRuleAllConstraint"


    // $ANTLR start "ruleAllConstraint"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1543:1: ruleAllConstraint returns [EObject current=null] : ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? ) ;
    public final EObject ruleAllConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_hasDefault_0_0=null;
        Token lv_defaultValue_1_0=null;
        Token lv_isFixed_2_0=null;
        Token lv_fixedValue_3_0=null;
        Token otherlv_4=null;
        Token lv_minLen_5_0=null;
        Token otherlv_6=null;
        Token lv_maxLen_7_0=null;
        Token otherlv_8=null;
        Token lv_fixeLen_9_0=null;
        Token otherlv_10=null;
        Token lv_paddle_11_0=null;
        Token lv_isId_12_0=null;
        Token lv_nullable_13_0=null;
        Token lv_derived_14_0=null;
        Token lv_writable_15_0=null;
        Token lv_isXSDAtt_16_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1546:28: ( ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )?
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:3: ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1547:3: ( (lv_hasDefault_0_0= 'default' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1548:1: (lv_hasDefault_0_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1548:1: (lv_hasDefault_0_0= 'default' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1549:3: lv_hasDefault_0_0= 'default'
                    {
                    lv_hasDefault_0_0=(Token)match(input,32,FOLLOW_32_in_ruleAllConstraint3475); 

                            newLeafNode(lv_hasDefault_0_0, grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1562:2: ( (lv_defaultValue_1_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1563:1: (lv_defaultValue_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1563:1: (lv_defaultValue_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1564:3: lv_defaultValue_1_0= RULE_STRING
                    {
                    lv_defaultValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint3505); 

                    			newLeafNode(lv_defaultValue_1_0, grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1580:4: ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1580:5: ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1580:5: ( (lv_isFixed_2_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1581:1: (lv_isFixed_2_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1581:1: (lv_isFixed_2_0= 'fixed' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1582:3: lv_isFixed_2_0= 'fixed'
                    {
                    lv_isFixed_2_0=(Token)match(input,36,FOLLOW_36_in_ruleAllConstraint3531); 

                            newLeafNode(lv_isFixed_2_0, grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isFixed", true, "fixed");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1595:2: ( (lv_fixedValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1596:1: (lv_fixedValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1596:1: (lv_fixedValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1597:3: lv_fixedValue_3_0= RULE_STRING
                    {
                    lv_fixedValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint3561); 

                    			newLeafNode(lv_fixedValue_3_0, grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fixedValue",
                            		lv_fixedValue_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1613:4: (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1613:6: otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleAllConstraint3581); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1617:1: ( (lv_minLen_5_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1618:1: (lv_minLen_5_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1618:1: (lv_minLen_5_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1619:3: lv_minLen_5_0= RULE_INT
                    {
                    lv_minLen_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint3598); 

                    			newLeafNode(lv_minLen_5_0, grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minLen",
                            		lv_minLen_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1635:4: (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1635:6: otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleAllConstraint3618); 

                        	newLeafNode(otherlv_6, grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1639:1: ( (lv_maxLen_7_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1640:1: (lv_maxLen_7_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1640:1: (lv_maxLen_7_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1641:3: lv_maxLen_7_0= RULE_INT
                    {
                    lv_maxLen_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint3635); 

                    			newLeafNode(lv_maxLen_7_0, grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maxLen",
                            		lv_maxLen_7_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1657:4: (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1657:6: otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleAllConstraint3655); 

                        	newLeafNode(otherlv_8, grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1661:1: ( (lv_fixeLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1662:1: (lv_fixeLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1662:1: (lv_fixeLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1663:3: lv_fixeLen_9_0= RULE_INT
                    {
                    lv_fixeLen_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint3672); 

                    			newLeafNode(lv_fixeLen_9_0, grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fixeLen",
                            		lv_fixeLen_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1679:4: (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1679:6: otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_41_in_ruleAllConstraint3692); 

                        	newLeafNode(otherlv_10, grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0());
                        
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1683:1: ( (lv_paddle_11_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1684:1: (lv_paddle_11_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1684:1: (lv_paddle_11_0= RULE_STRING )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1685:3: lv_paddle_11_0= RULE_STRING
                    {
                    lv_paddle_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint3709); 

                    			newLeafNode(lv_paddle_11_0, grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"paddle",
                            		lv_paddle_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1701:4: ( (lv_isId_12_0= 'id' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1702:1: (lv_isId_12_0= 'id' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1702:1: (lv_isId_12_0= 'id' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1703:3: lv_isId_12_0= 'id'
                    {
                    lv_isId_12_0=(Token)match(input,42,FOLLOW_42_in_ruleAllConstraint3734); 

                            newLeafNode(lv_isId_12_0, grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isId", true, "id");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1716:3: ( (lv_nullable_13_0= 'nullable' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1717:1: (lv_nullable_13_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1717:1: (lv_nullable_13_0= 'nullable' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1718:3: lv_nullable_13_0= 'nullable'
                    {
                    lv_nullable_13_0=(Token)match(input,43,FOLLOW_43_in_ruleAllConstraint3766); 

                            newLeafNode(lv_nullable_13_0, grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", true, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1731:3: ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1731:4: ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1731:4: ( (lv_derived_14_0= 'derived' ) )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1732:1: (lv_derived_14_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1732:1: (lv_derived_14_0= 'derived' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1733:3: lv_derived_14_0= 'derived'
                    {
                    lv_derived_14_0=(Token)match(input,44,FOLLOW_44_in_ruleAllConstraint3799); 

                            newLeafNode(lv_derived_14_0, grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1746:2: ( (lv_writable_15_0= 'writable' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==45) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1747:1: (lv_writable_15_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1747:1: (lv_writable_15_0= 'writable' )
                            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1748:3: lv_writable_15_0= 'writable'
                            {
                            lv_writable_15_0=(Token)match(input,45,FOLLOW_45_in_ruleAllConstraint3830); 

                                    newLeafNode(lv_writable_15_0, grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAllConstraintRule());
                            	        }
                                   		setWithLastConsumed(current, "writable", true, "writable");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1761:5: ( (lv_isXSDAtt_16_0= 'xsdA.' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1762:1: (lv_isXSDAtt_16_0= 'xsdA.' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1762:1: (lv_isXSDAtt_16_0= 'xsdA.' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1763:3: lv_isXSDAtt_16_0= 'xsdA.'
                    {
                    lv_isXSDAtt_16_0=(Token)match(input,46,FOLLOW_46_in_ruleAllConstraint3864); 

                            newLeafNode(lv_isXSDAtt_16_0, grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isXSDAtt", true, "xsdA.");
                    	    

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
    // $ANTLR end "ruleAllConstraint"


    // $ANTLR start "ruleEnumUsage"
    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1784:1: ruleEnumUsage returns [Enumerator current=null] : ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) ) ;
    public final Enumerator ruleEnumUsage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1786:28: ( ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) ) )
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1787:1: ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) )
            {
            // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1787:1: ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            else if ( (LA45_0==48) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1787:2: (enumLiteral_0= 'as String' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1787:2: (enumLiteral_0= 'as String' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1787:4: enumLiteral_0= 'as String'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleEnumUsage3928); 

                            current = grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1793:6: (enumLiteral_1= 'as Value' )
                    {
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1793:6: (enumLiteral_1= 'as Value' )
                    // ../fr.chaunier.xtext.constraint/src-gen/fr/chaunier/xtext/constraint/parser/antlr/internal/InternalCstDsl.g:1793:8: enumLiteral_1= 'as Value'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleEnumUsage3945); 

                            current = grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleEnumUsage"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModelConstraint_in_entryRuleDomainModelConstraint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModelConstraint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomainModelConstraint131 = new BitSet(new long[]{0x000000000C240002L});
    public static final BitSet FOLLOW_ruleAbstractElementConstraint_in_ruleDomainModelConstraint153 = new BitSet(new long[]{0x000000000C200002L});
    public static final BitSet FOLLOW_ruleFileSpecification_in_entryRuleFileSpecification192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileSpecification202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFileSpecification245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFileSpecification276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFileSpecification294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFileSpecification313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFileSpecification325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFileSpecification342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFileSpecification366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeSpecification_in_entryRuleFreeSpecification402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeSpecification412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFreeSpecification449 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeSpecification466 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAbstractElementConstraint_in_entryRuleAbstractElementConstraint508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElementConstraint518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageConstraint_in_ruleAbstractElementConstraint565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_ruleAbstractElementConstraint592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_ruleAbstractElementConstraint619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard817 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildCard836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName930 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName964 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rulePackageConstraint_in_entryRulePackageConstraint1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageConstraint1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePackageConstraint1058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackageConstraint1078 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePackageConstraint1091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageConstraint1112 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePackageConstraint1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageConstraint1143 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePackageConstraint1161 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_ruleTypeConstraint_in_rulePackageConstraint1182 = new BitSet(new long[]{0x000000000E200000L});
    public static final BitSet FOLLOW_25_in_rulePackageConstraint1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeConstraint_in_entryRuleTypeConstraint1231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeConstraint1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_ruleTypeConstraint1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_ruleTypeConstraint1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_entryRuleDataTypeConstraint1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeConstraint1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataTypeConstraint1397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeConstraint1417 = new BitSet(new long[]{0x00000006B0000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleDataTypeConstraint1438 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataTypeConstraint1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_entryRuleEntityConstraint1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConstraint1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntityConstraint1545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityConstraint1565 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntityConstraint1582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEntityConstraint1600 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_ruleFeatureConstraint_in_ruleEntityConstraint1621 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleEntityConstraint1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureConstraint_in_entryRuleFeatureConstraint1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureConstraint1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_ruleFeatureConstraint1727 = new BitSet(new long[]{0x00000006B0000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleFeatureConstraint1747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureConstraint1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstraint1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeConstraint1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_ruleConstraint1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_ruleConstraint1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_ruleConstraint2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBoolConstraint2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStringConstraint2249 = new BitSet(new long[]{0x00005F9940000000L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_ruleStringConstraint2283 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleStringConstraint2296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDateTimeConstraint2409 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeConstraint2442 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleDateTimeConstraint2461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeConstraint2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDecimalConstraint2587 = new BitSet(new long[]{0x00005FF900000000L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint2657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEnumerationConstraint2704 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint2725 = new BitSet(new long[]{0x0000000900000002L});
    public static final BitSet FOLLOW_35_in_ruleEnumerationConstraint2738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationConstraint2755 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumerationConstraint2781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationConstraint2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNumberConstraint2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint2938 = new BitSet(new long[]{0x00005FF800000002L});
    public static final BitSet FOLLOW_36_in_ruleNumberConstraint2964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint2994 = new BitSet(new long[]{0x00005FE800000002L});
    public static final BitSet FOLLOW_37_in_ruleNumberConstraint3014 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3031 = new BitSet(new long[]{0x00005FC800000002L});
    public static final BitSet FOLLOW_38_in_ruleNumberConstraint3051 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3068 = new BitSet(new long[]{0x00005F8800000002L});
    public static final BitSet FOLLOW_39_in_ruleNumberConstraint3088 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3105 = new BitSet(new long[]{0x00005F0800000002L});
    public static final BitSet FOLLOW_40_in_ruleNumberConstraint3125 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3142 = new BitSet(new long[]{0x00005E0800000002L});
    public static final BitSet FOLLOW_35_in_ruleNumberConstraint3162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3179 = new BitSet(new long[]{0x00005E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumberConstraint3199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint3216 = new BitSet(new long[]{0x00005C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumberConstraint3241 = new BitSet(new long[]{0x0000580000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumberConstraint3273 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumberConstraint3306 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleNumberConstraint3337 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleNumberConstraint3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAllConstraint3475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint3505 = new BitSet(new long[]{0x00005F9800000002L});
    public static final BitSet FOLLOW_36_in_ruleAllConstraint3531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint3561 = new BitSet(new long[]{0x00005F8800000002L});
    public static final BitSet FOLLOW_39_in_ruleAllConstraint3581 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint3598 = new BitSet(new long[]{0x00005F0800000002L});
    public static final BitSet FOLLOW_40_in_ruleAllConstraint3618 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint3635 = new BitSet(new long[]{0x00005E0800000002L});
    public static final BitSet FOLLOW_35_in_ruleAllConstraint3655 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint3672 = new BitSet(new long[]{0x00005E0000000002L});
    public static final BitSet FOLLOW_41_in_ruleAllConstraint3692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint3709 = new BitSet(new long[]{0x00005C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleAllConstraint3734 = new BitSet(new long[]{0x0000580000000002L});
    public static final BitSet FOLLOW_43_in_ruleAllConstraint3766 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleAllConstraint3799 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleAllConstraint3830 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleAllConstraint3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEnumUsage3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumUsage3945 = new BitSet(new long[]{0x0000000000000002L});

}