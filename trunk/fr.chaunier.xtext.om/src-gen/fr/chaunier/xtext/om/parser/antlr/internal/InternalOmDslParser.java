package fr.chaunier.xtext.om.parser.antlr.internal; 

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
import fr.chaunier.xtext.om.services.OmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'annotations'", "'['", "','", "']'", "'{'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'='", "';'", "'*'", "'?'", "'.*'", "'.'", "'public'", "'private'", "'protected'", "'abstract'"
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
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOmDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOmDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOmDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g"; }



     	private OmDslGrammarAccess grammarAccess;
     	
        public InternalOmDslParser(TokenStream input, OmDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected OmDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:68:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:69:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:70:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:77:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=19 && LA1_0<=20)||LA1_0==25||LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:83:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:116:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:119:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:120:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:120:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 19:
            case 20:
            case 25:
            case 35:
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:121:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:131:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement250);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:141:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement277);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:157:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:158:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:159:2: iv_ruleImport= ruleImport EOF
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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:166:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:169:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:170:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:170:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:170:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport359); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:174:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:175:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:175:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:176:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:200:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:201:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:202:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration426); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:209:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_annotations_6_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:212:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:213:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:213:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:213:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration463); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:217:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:218:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:218:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:219:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:235:2: (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:235:4: otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration497); 

                        	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration509); 

                        	newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getLeftSquareBracketKeyword_2_1());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:243:1: ( (lv_annotations_4_0= ruleAnnotation ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:244:1: (lv_annotations_4_0= ruleAnnotation )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:244:1: (lv_annotations_4_0= ruleAnnotation )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:245:3: lv_annotations_4_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_rulePackageDeclaration530);
                    lv_annotations_4_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_4_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:261:2: (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:261:4: otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration543); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:265:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:266:1: (lv_annotations_6_0= ruleAnnotation )
                    	    {
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:266:1: (lv_annotations_6_0= ruleAnnotation )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:267:3: lv_annotations_6_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_rulePackageDeclaration564);
                    	    lv_annotations_6_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_6_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePackageDeclaration578); 

                        	newLeafNode(otherlv_7, grammarAccess.getPackageDeclarationAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_rulePackageDeclaration592); 

                	newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:291:1: ( (lv_elements_9_0= ruleAbstractElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=12)||(LA5_0>=19 && LA5_0<=20)||LA5_0==25||LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:292:1: (lv_elements_9_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:292:1: (lv_elements_9_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:293:3: lv_elements_9_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration613);
            	    lv_elements_9_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_9_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_rulePackageDeclaration626); 

                	newLeafNode(otherlv_10, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:321:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:322:2: (iv_ruleType= ruleType EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:323:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType662);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType672); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:330:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:333:28: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:334:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:334:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
            case 35:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:335:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType719);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:345:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType746);
                    this_DataType_1=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:355:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType773);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_2; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:371:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:372:2: (iv_ruleDataType= ruleDataType EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:373:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType808);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType818); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:380:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? ( (lv_description_8_0= RULE_STRING ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        EObject lv_annotations_4_0 = null;

        EObject lv_annotations_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:383:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? ( (lv_description_8_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:384:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? ( (lv_description_8_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:384:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? ( (lv_description_8_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:384:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )? ( (lv_description_8_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDataType855); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:388:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:389:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:389:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:390:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType872); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:406:2: (otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:406:4: otherlv_2= 'annotations' otherlv_3= '[' ( (lv_annotations_4_0= ruleAnnotation ) ) (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* otherlv_7= ']'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDataType890); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getAnnotationsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDataType902); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:414:1: ( (lv_annotations_4_0= ruleAnnotation ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:415:1: (lv_annotations_4_0= ruleAnnotation )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:415:1: (lv_annotations_4_0= ruleAnnotation )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:416:3: lv_annotations_4_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleDataType923);
                    lv_annotations_4_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_4_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:432:2: (otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:432:4: otherlv_5= ',' ( (lv_annotations_6_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDataType936); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:436:1: ( (lv_annotations_6_0= ruleAnnotation ) )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:437:1: (lv_annotations_6_0= ruleAnnotation )
                    	    {
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:437:1: (lv_annotations_6_0= ruleAnnotation )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:438:3: lv_annotations_6_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDataType957);
                    	    lv_annotations_6_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_6_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDataType971); 

                        	newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:458:3: ( (lv_description_8_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:459:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:459:1: (lv_description_8_0= RULE_STRING )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:460:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataType990); 

                    			newLeafNode(lv_description_8_0, grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:484:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:485:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:486:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1032);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1042); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:493:1: ruleEntity returns [EObject current=null] : ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) )* otherlv_14= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_entityType_0_0 = null;

        EObject lv_annotations_7_0 = null;

        EObject lv_annotations_9_0 = null;

        EObject lv_features_13_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:496:28: ( ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) )* otherlv_14= '}' ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:497:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) )* otherlv_14= '}' )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:497:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) )* otherlv_14= '}' )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:497:2: ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_description_11_0= RULE_STRING ) )? otherlv_12= '{' ( (lv_features_13_0= ruleFeature ) )* otherlv_14= '}'
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:497:2: ( (lv_entityType_0_0= ruleEntityType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:498:1: (lv_entityType_0_0= ruleEntityType )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:498:1: (lv_entityType_0_0= ruleEntityType )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:499:3: lv_entityType_0_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleEntity1088);
                    lv_entityType_0_0=ruleEntityType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"entityType",
                            		lv_entityType_0_0, 
                            		"EntityType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEntity1101); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:519:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:520:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:520:1: (lv_name_2_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:521:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1118); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:537:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:537:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleEntity1136); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:541:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:542:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:542:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:543:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1159);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:556:4: (otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:556:6: otherlv_5= 'annotations' otherlv_6= '[' ( (lv_annotations_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity1174); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getAnnotationsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEntity1186); 

                        	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_4_1());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:564:1: ( (lv_annotations_7_0= ruleAnnotation ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:565:1: (lv_annotations_7_0= ruleAnnotation )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:565:1: (lv_annotations_7_0= ruleAnnotation )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:566:3: lv_annotations_7_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleEntity1207);
                    lv_annotations_7_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_7_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:582:2: (otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:582:4: otherlv_8= ',' ( (lv_annotations_9_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEntity1220); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:586:1: ( (lv_annotations_9_0= ruleAnnotation ) )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:587:1: (lv_annotations_9_0= ruleAnnotation )
                    	    {
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:587:1: (lv_annotations_9_0= ruleAnnotation )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:588:3: lv_annotations_9_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEntity1241);
                    	    lv_annotations_9_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_9_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleEntity1255); 

                        	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:608:3: ( (lv_description_11_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:609:1: (lv_description_11_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:609:1: (lv_description_11_0= RULE_STRING )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:610:3: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1274); 

                    			newLeafNode(lv_description_11_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_11_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleEntity1292); 

                	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:630:1: ( (lv_features_13_0= ruleFeature ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:631:1: (lv_features_13_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:631:1: (lv_features_13_0= ruleFeature )
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:632:3: lv_features_13_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1313);
            	    lv_features_13_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_13_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleEntity1326); 

                	newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:660:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:661:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:662:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1362);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1372); 

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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:669:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        EObject this_StructuralFeature_0 = null;

        EObject lv_annotations_3_0 = null;

        EObject lv_annotations_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:672:28: ( (this_StructuralFeature_0= ruleStructuralFeature (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:673:1: (this_StructuralFeature_0= ruleStructuralFeature (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:673:1: (this_StructuralFeature_0= ruleStructuralFeature (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:674:5: this_StructuralFeature_0= ruleStructuralFeature (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )? ( (lv_description_7_0= RULE_STRING ) )?
            {
             
                    newCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStructuralFeature_in_ruleFeature1419);
            this_StructuralFeature_0=ruleStructuralFeature();

            state._fsp--;

             
                    current = this_StructuralFeature_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:682:1: (otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:682:3: otherlv_1= 'annotations' otherlv_2= '[' ( (lv_annotations_3_0= ruleAnnotation ) ) (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )* otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFeature1431); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getAnnotationsKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFeature1443); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_1());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:690:1: ( (lv_annotations_3_0= ruleAnnotation ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:691:1: (lv_annotations_3_0= ruleAnnotation )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:691:1: (lv_annotations_3_0= ruleAnnotation )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:692:3: lv_annotations_3_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleFeature1464);
                    lv_annotations_3_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_3_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:708:2: (otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:708:4: otherlv_4= ',' ( (lv_annotations_5_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFeature1477); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:712:1: ( (lv_annotations_5_0= ruleAnnotation ) )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:713:1: (lv_annotations_5_0= ruleAnnotation )
                    	    {
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:713:1: (lv_annotations_5_0= ruleAnnotation )
                    	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:714:3: lv_annotations_5_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFeature1498);
                    	    lv_annotations_5_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_5_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFeature1512); 

                        	newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_4());
                        

                    }
                    break;

            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:734:3: ( (lv_description_7_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:735:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:735:1: (lv_description_7_0= RULE_STRING )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:736:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeature1531); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleStructuralFeature"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:760:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:761:2: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:762:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1573);
            iv_ruleStructuralFeature=ruleStructuralFeature();

            state._fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature1583); 

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
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:769:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:772:28: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:773:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:773:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:774:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStructuralFeature1630);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:784:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStructuralFeature1657);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
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
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:800:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:801:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:802:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1692);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1702); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:809:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:812:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:813:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:813:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:813:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:813:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:814:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:814:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:815:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1744); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttribute1761); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:835:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:836:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:836:1: (lv_type_2_0= ruleTypeRef )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:837:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute1782);
            lv_type_2_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeRef");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:861:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:862:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:863:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1818);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1828); 

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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:870:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:873:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:874:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:874:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:874:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleReference1865); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:878:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:879:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:879:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:880:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1882); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleReference1899); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:900:1: ( (lv_type_3_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:901:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:901:1: (lv_type_3_0= ruleTypeRef )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:902:3: lv_type_3_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleReference1920);
            lv_type_3_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:918:2: (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:918:4: otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleReference1933); 

                        	newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getOppositeKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:922:1: ( (otherlv_5= RULE_ID ) )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:923:1: (otherlv_5= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:923:1: (otherlv_5= RULE_ID )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:924:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1953); 

                    		newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
                    	

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEnumeration"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:943:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:944:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:945:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1991);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration2001); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:952:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumerationLiterals_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:955:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:956:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:956:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:956:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleEnumeration2038); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:960:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:961:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:961:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:962:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration2055); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEnumeration2072); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:982:1: ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:983:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:983:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:984:3: lv_enumerationLiterals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration2093);
            	    lv_enumerationLiterals_3_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerationLiterals",
            	            		lv_enumerationLiterals_3_0, 
            	            		"EnumerationLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnumeration2106); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1012:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1013:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1014:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2142);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral2152); 

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1021:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_persistedValue_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1024:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1025:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1025:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1025:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';'
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1025:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1026:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1026:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1027:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral2194); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1043:2: (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1043:4: otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) )
            {
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleEnumerationLiteral2212); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1047:1: ( (lv_persistedValue_2_0= RULE_INT ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1048:1: (lv_persistedValue_2_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1048:1: (lv_persistedValue_2_0= RULE_INT )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1049:3: lv_persistedValue_2_0= RULE_INT
            {
            lv_persistedValue_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral2229); 

            			newLeafNode(lv_persistedValue_2_0, grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"persistedValue",
                    		lv_persistedValue_2_0, 
                    		"INT");
            	    

            }


            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleEnumerationLiteral2247); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleParameter"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1079:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1080:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1081:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2285);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2295); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1088:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1091:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1092:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1092:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1092:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1092:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1093:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1093:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1094:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1110:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1111:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1111:1: (lv_type_1_0= ruleTypeRef )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1112:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter2363);
            lv_type_1_0=ruleTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeRef");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1138:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1139:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1140:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2401);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2411); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1147:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token lv_option_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1150:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1151:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1151:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1151:2: ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )?
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1151:2: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1152:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1152:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1153:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef2459);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1166:2: ( (lv_multi_1_0= '*' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1167:1: (lv_multi_1_0= '*' )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1167:1: (lv_multi_1_0= '*' )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1168:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)match(input,28,FOLLOW_28_in_ruleTypeRef2477); 

                            newLeafNode(lv_multi_1_0, grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                           		setWithLastConsumed(current, "multi", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1181:3: ( (lv_option_2_0= '?' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1182:1: (lv_option_2_0= '?' )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1182:1: (lv_option_2_0= '?' )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1183:3: lv_option_2_0= '?'
                    {
                    lv_option_2_0=(Token)match(input,29,FOLLOW_29_in_ruleTypeRef2509); 

                            newLeafNode(lv_option_2_0, grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                           		setWithLastConsumed(current, "option", true, "?");
                    	    

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1204:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1205:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1206:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2560);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2571); 

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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1213:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1216:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1217:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1217:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1218:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2618);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1228:1: (kw= '.*' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1229:2: kw= '.*'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedNameWithWildCard2637); 

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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1242:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1243:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1244:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2680);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2691); 

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
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1251:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1254:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1255:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1255:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1255:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2731); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1262:1: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1263:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleQualifiedName2750); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2765); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop25;
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


    // $ANTLR start "entryRuleAnnotation"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1285:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1286:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1287:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation2814);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation2824); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1294:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1297:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1298:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1298:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1298:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1298:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1299:1: (lv_key_0_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1299:1: (lv_key_0_0= RULE_STRING )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1300:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation2866); 

            			newLeafNode(lv_key_0_0, grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation2883); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getColonKeyword_1());
                
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1320:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1321:1: (lv_value_2_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1321:1: (lv_value_2_0= RULE_STRING )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1322:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation2900); 

            			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "ruleVisibility"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1346:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1348:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1349:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1349:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 33:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1349:2: (enumLiteral_0= 'public' )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1349:2: (enumLiteral_0= 'public' )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1349:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleVisibility2955); 

                            current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1355:6: (enumLiteral_1= 'private' )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1355:6: (enumLiteral_1= 'private' )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1355:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleVisibility2972); 

                            current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1361:6: (enumLiteral_2= 'protected' )
                    {
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1361:6: (enumLiteral_2= 'protected' )
                    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1361:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_ruleVisibility2989); 

                            current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleEntityType"
    // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1371:1: ruleEntityType returns [Enumerator current=null] : (enumLiteral_0= 'abstract' ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1373:28: ( (enumLiteral_0= 'abstract' ) )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1374:1: (enumLiteral_0= 'abstract' )
            {
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1374:1: (enumLiteral_0= 'abstract' )
            // ../fr.chaunier.xtext.om/src-gen/fr/chaunier/xtext/om/parser/antlr/internal/InternalOmDsl.g:1374:3: enumLiteral_0= 'abstract'
            {
            enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleEntityType3033); 

                    current = grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleEntityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000802181802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration484 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration497 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackageDeclaration530 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackageDeclaration564 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration578 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration592 = new BitSet(new long[]{0x00000008021C1800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration613 = new BitSet(new long[]{0x00000008021C1800L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDataType855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType872 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleDataType890 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataType902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDataType923 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleDataType936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDataType957 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleDataType971 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity1088 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntity1101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1118 = new BitSet(new long[]{0x0000000000222020L});
    public static final BitSet FOLLOW_21_in_ruleEntity1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1159 = new BitSet(new long[]{0x0000000000022020L});
    public static final BitSet FOLLOW_13_in_ruleEntity1174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEntity1186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity1207 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEntity1241 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleEntity1255 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1274 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity1292 = new BitSet(new long[]{0x0000000000840010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1313 = new BitSet(new long[]{0x0000000000840010L});
    public static final BitSet FOLLOW_18_in_ruleEntity1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_ruleFeature1419 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleFeature1431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFeature1443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFeature1464 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFeature1477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFeature1498 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFeature1512 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStructuralFeature1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStructuralFeature1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1744 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAttribute1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReference1865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1882 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReference1899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleReference1920 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleReference1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEnumeration2038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration2055 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEnumeration2072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration2093 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEnumeration2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral2194 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumerationLiteral2212 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral2229 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEnumerationLiteral2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef2459 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeRef2477 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeRef2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2618 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedNameWithWildCard2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2731 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleQualifiedName2750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2765 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation2814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation2866 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation2883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVisibility2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVisibility2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVisibility2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntityType3033 = new BitSet(new long[]{0x0000000000000002L});

}