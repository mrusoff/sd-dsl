package fr.chaunier.xtext.omcst.om.parser.antlr.internal; 

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
import fr.chaunier.xtext.omcst.om.services.OmcstDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmcstDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'element'", "'package'", "'prefix'", "'namespace'", "'annotations'", "'{'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "'='", "';'", "'*'", "'?'", "'.*'", "'.'", "','", "'boolean'", "'string'", "'regexp'", "'datetime'", "'default'", "'decimal'", "'enum'", "'fixeLen'", "'fixed'", "'minVal'", "'maxVal'", "'minLen'", "'maxLen'", "'paddle'", "'id'", "'nullable'", "'derived'", "'writable'", "'xsdA.'", "'public'", "'private'", "'protected'", "'abstract'", "'as String'", "'as Value'"
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
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
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


        public InternalOmcstDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOmcstDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOmcstDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g"; }



     	private OmcstDslGrammarAccess grammarAccess;
     	
        public InternalOmcstDslParser(TokenStream input, OmcstDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected OmcstDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:68:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:69:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:70:2: iv_ruleDomainModel= ruleDomainModel EOF
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:77:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:80:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:81:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||(LA1_0>=19 && LA1_0<=20)||LA1_0==25||LA1_0==57) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:82:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:83:3: lv_elements_0_0= ruleAbstractElement
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:107:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:108:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:109:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:116:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_XsdElement_3= ruleXsdElement ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;

        EObject this_XsdElement_3 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:119:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_XsdElement_3= ruleXsdElement ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:120:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_XsdElement_3= ruleXsdElement )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:120:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport | this_XsdElement_3= ruleXsdElement )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 19:
            case 20:
            case 25:
            case 57:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:121:5: this_PackageDeclaration_0= rulePackageDeclaration
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
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:131:5: this_Type_1= ruleType
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
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:141:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement277);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:151:5: this_XsdElement_3= ruleXsdElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getXsdElementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleXsdElement_in_ruleAbstractElement304);
                    this_XsdElement_3=ruleXsdElement();

                    state._fsp--;

                     
                            current = this_XsdElement_3; 
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:167:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:168:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:169:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport339);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport349); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:176:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:179:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:180:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:180:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:180:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport386); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:184:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:185:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:185:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:186:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport407);
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


    // $ANTLR start "entryRuleXsdElement"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:210:1: entryRuleXsdElement returns [EObject current=null] : iv_ruleXsdElement= ruleXsdElement EOF ;
    public final EObject entryRuleXsdElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXsdElement = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:211:2: (iv_ruleXsdElement= ruleXsdElement EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:212:2: iv_ruleXsdElement= ruleXsdElement EOF
            {
             newCompositeNode(grammarAccess.getXsdElementRule()); 
            pushFollow(FOLLOW_ruleXsdElement_in_entryRuleXsdElement443);
            iv_ruleXsdElement=ruleXsdElement();

            state._fsp--;

             current =iv_ruleXsdElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXsdElement453); 

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
    // $ANTLR end "entryRuleXsdElement"


    // $ANTLR start "ruleXsdElement"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:219:1: ruleXsdElement returns [EObject current=null] : (otherlv_0= 'element' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleXsdElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:222:28: ( (otherlv_0= 'element' ( (otherlv_1= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:223:1: (otherlv_0= 'element' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:223:1: (otherlv_0= 'element' ( (otherlv_1= RULE_ID ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:223:3: otherlv_0= 'element' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleXsdElement490); 

                	newLeafNode(otherlv_0, grammarAccess.getXsdElementAccess().getElementKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:227:1: ( (otherlv_1= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:228:1: (otherlv_1= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:228:1: (otherlv_1= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:229:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXsdElementRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXsdElement510); 

            		newLeafNode(otherlv_1, grammarAccess.getXsdElementAccess().getXsdElementEntityCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleXsdElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:248:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:249:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:250:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration546);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration556); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:257:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )? (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_namespace_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        EObject lv_anno_7_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:260:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )? (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:261:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )? (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:261:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )? (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:261:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )? (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleAbstractElement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration593); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:265:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:266:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:266:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:267:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration614);
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:283:2: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:283:4: otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackageDeclaration627); 

                        	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:287:1: ( (lv_prefix_3_0= ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:288:1: (lv_prefix_3_0= ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:288:1: (lv_prefix_3_0= ruleQualifiedName )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:289:3: lv_prefix_3_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration648);
                    lv_prefix_3_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
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
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:305:4: (otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:305:6: otherlv_4= 'namespace' ( (lv_namespace_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePackageDeclaration663); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:309:1: ( (lv_namespace_5_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:310:1: (lv_namespace_5_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:310:1: (lv_namespace_5_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:311:3: lv_namespace_5_0= RULE_STRING
                    {
                    lv_namespace_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageDeclaration680); 

                    			newLeafNode(lv_namespace_5_0, grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"namespace",
                            		lv_namespace_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:327:4: (otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:327:6: otherlv_6= 'annotations' ( (lv_anno_7_0= ruleAnnotations ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_rulePackageDeclaration700); 

                        	newLeafNode(otherlv_6, grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:331:1: ( (lv_anno_7_0= ruleAnnotations ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:332:1: (lv_anno_7_0= ruleAnnotations )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:332:1: (lv_anno_7_0= ruleAnnotations )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:333:3: lv_anno_7_0= ruleAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotations_in_rulePackageDeclaration721);
                    lv_anno_7_0=ruleAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"anno",
                            		lv_anno_7_0, 
                            		"Annotations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_rulePackageDeclaration735); 

                	newLeafNode(otherlv_8, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:353:1: ( (lv_elements_9_0= ruleAbstractElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)||(LA6_0>=19 && LA6_0<=20)||LA6_0==25||LA6_0==57) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:354:1: (lv_elements_9_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:354:1: (lv_elements_9_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:355:3: lv_elements_9_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration756);
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
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_rulePackageDeclaration769); 

                	newLeafNode(otherlv_10, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:383:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:384:2: (iv_ruleType= ruleType EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:385:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType805);
            iv_ruleType=ruleType();

            state._fsp--;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:392:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:395:28: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:396:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:396:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
            case 57:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:397:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType862);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:407:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType889);
                    this_DataType_1=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:417:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType916);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:433:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:434:2: (iv_ruleDataType= ruleDataType EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:435:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType951);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:442:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_constraint_2_0 = null;

        EObject lv_anno_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:445:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:446:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:446:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:446:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraint ) )? (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDataType998); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:450:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:451:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:451:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:452:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1015); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:468:2: ( (lv_constraint_2_0= ruleConstraint ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=35 && LA8_0<=36)||LA8_0==38||(LA8_0>=40 && LA8_0<=41)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:469:1: (lv_constraint_2_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:469:1: (lv_constraint_2_0= ruleConstraint )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:470:3: lv_constraint_2_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getConstraintConstraintParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleDataType1041);
                    lv_constraint_2_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:486:3: (otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:486:5: otherlv_3= 'annotations' ( (lv_anno_4_0= ruleAnnotations ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDataType1055); 

                        	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getAnnotationsKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:490:1: ( (lv_anno_4_0= ruleAnnotations ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:491:1: (lv_anno_4_0= ruleAnnotations )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:491:1: (lv_anno_4_0= ruleAnnotations )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:492:3: lv_anno_4_0= ruleAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnoAnnotationsParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotations_in_ruleDataType1076);
                    lv_anno_4_0=ruleAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"anno",
                            		lv_anno_4_0, 
                            		"Annotations");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:516:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:517:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:518:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1114);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1124); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:525:1: ruleEntity returns [EObject current=null] : ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )? ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_entityType_0_0 = null;

        EObject lv_anno_6_0 = null;

        EObject lv_features_9_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:528:28: ( ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )? ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:529:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )? ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:529:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )? ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:529:2: ( (lv_entityType_0_0= ruleEntityType ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )? ( (lv_description_7_0= RULE_STRING ) )? otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}'
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:529:2: ( (lv_entityType_0_0= ruleEntityType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==57) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:530:1: (lv_entityType_0_0= ruleEntityType )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:530:1: (lv_entityType_0_0= ruleEntityType )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:531:3: lv_entityType_0_0= ruleEntityType
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleEntity1170);
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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleEntity1183); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:551:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:552:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:552:1: (lv_name_2_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:553:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1200); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:569:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:569:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleEntity1218); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:573:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:574:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:574:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:575:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1241);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:588:4: (otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:588:6: otherlv_5= 'annotations' ( (lv_anno_6_0= ruleAnnotations ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEntity1256); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getAnnotationsKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:592:1: ( (lv_anno_6_0= ruleAnnotations ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:593:1: (lv_anno_6_0= ruleAnnotations )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:593:1: (lv_anno_6_0= ruleAnnotations )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:594:3: lv_anno_6_0= ruleAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotations_in_ruleEntity1277);
                    lv_anno_6_0=ruleAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"anno",
                            		lv_anno_6_0, 
                            		"Annotations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:610:4: ( (lv_description_7_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:611:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:611:1: (lv_description_7_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:612:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1296); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
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

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEntity1314); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:632:1: ( (lv_features_9_0= ruleFeature ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:633:1: (lv_features_9_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:633:1: (lv_features_9_0= ruleFeature )
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:634:3: lv_features_9_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1335);
            	    lv_features_9_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_9_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEntity1348); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:662:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:663:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:664:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1384);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1394); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:671:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )? ( (lv_description_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_4_0=null;
        EObject this_StructuralFeature_0 = null;

        EObject lv_constraint_1_0 = null;

        EObject lv_anno_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:674:28: ( (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )? ( (lv_description_4_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:675:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )? ( (lv_description_4_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:675:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )? ( (lv_description_4_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:676:5: this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )? ( (lv_description_4_0= RULE_STRING ) )?
            {
             
                    newCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStructuralFeature_in_ruleFeature1441);
            this_StructuralFeature_0=ruleStructuralFeature();

            state._fsp--;

             
                    current = this_StructuralFeature_0; 
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:684:1: ( (lv_constraint_1_0= ruleConstraint ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=35 && LA15_0<=36)||LA15_0==38||(LA15_0>=40 && LA15_0<=41)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:685:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:685:1: (lv_constraint_1_0= ruleConstraint )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:686:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleFeature1461);
                    lv_constraint_1_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:702:3: (otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:702:5: otherlv_2= 'annotations' ( (lv_anno_3_0= ruleAnnotations ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFeature1475); 

                        	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getAnnotationsKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:706:1: ( (lv_anno_3_0= ruleAnnotations ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:707:1: (lv_anno_3_0= ruleAnnotations )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:707:1: (lv_anno_3_0= ruleAnnotations )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:708:3: lv_anno_3_0= ruleAnnotations
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getAnnoAnnotationsParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotations_in_ruleFeature1496);
                    lv_anno_3_0=ruleAnnotations();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"anno",
                            		lv_anno_3_0, 
                            		"Annotations");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:724:4: ( (lv_description_4_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:725:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:725:1: (lv_description_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:726:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeature1515); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:750:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:751:2: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:752:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1557);
            iv_ruleStructuralFeature=ruleStructuralFeature();

            state._fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature1567); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:759:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:762:28: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:763:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:763:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:764:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStructuralFeature1614);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:774:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStructuralFeature1641);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:790:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:791:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:792:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1676);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1686); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:799:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:802:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:803:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:803:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:803:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:803:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:804:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:804:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:805:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1728); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttribute1745); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:825:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:826:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:826:1: (lv_type_2_0= ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:827:3: lv_type_2_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute1766);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:851:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:852:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:853:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1802);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1812); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:860:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) ;
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
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:863:28: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:864:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:864:1: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:864:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeRef ) ) (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleReference1849); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:868:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:869:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:869:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:870:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1866); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleReference1883); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_2());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:890:1: ( (lv_type_3_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:891:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:891:1: (lv_type_3_0= ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:892:3: lv_type_3_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleReference1904);
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:908:2: (otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:908:4: otherlv_4= 'opposite' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleReference1917); 

                        	newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getOppositeKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:912:1: ( (otherlv_5= RULE_ID ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:913:1: (otherlv_5= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:913:1: (otherlv_5= RULE_ID )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:914:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1937); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:933:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:934:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:935:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1975);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1985); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:942:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumerationLiterals_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:945:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:946:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:946:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:946:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleEnumeration2022); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:950:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:951:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:951:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:952:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration2039); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleEnumeration2056); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:972:1: ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:973:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:973:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:974:3: lv_enumerationLiterals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration2077);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleEnumeration2090); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1002:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1003:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1004:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2126);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral2136); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1011:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_persistedValue_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1014:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1015:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1015:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1015:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) otherlv_3= ';'
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1015:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1016:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1016:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1017:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral2178); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1033:2: (otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1033:4: otherlv_1= '=' ( (lv_persistedValue_2_0= RULE_INT ) )
            {
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleEnumerationLiteral2196); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1037:1: ( (lv_persistedValue_2_0= RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1038:1: (lv_persistedValue_2_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1038:1: (lv_persistedValue_2_0= RULE_INT )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1039:3: lv_persistedValue_2_0= RULE_INT
            {
            lv_persistedValue_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral2213); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleEnumerationLiteral2231); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1069:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1070:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1071:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2269);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2279); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1078:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1081:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1082:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1082:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1082:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1082:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1083:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1083:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1084:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2321); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1100:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1101:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1101:1: (lv_type_1_0= ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1102:3: lv_type_1_0= ruleTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter2347);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1128:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1129:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1130:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2385);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2395); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1137:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token lv_option_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1140:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1141:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1141:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1141:2: ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1141:2: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1142:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1142:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1143:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef2443);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1156:2: ( (lv_multi_1_0= '*' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1157:1: (lv_multi_1_0= '*' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1157:1: (lv_multi_1_0= '*' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1158:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)match(input,30,FOLLOW_30_in_ruleTypeRef2461); 

                            newLeafNode(lv_multi_1_0, grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRefRule());
                    	        }
                           		setWithLastConsumed(current, "multi", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1171:3: ( (lv_option_2_0= '?' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1172:1: (lv_option_2_0= '?' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1172:1: (lv_option_2_0= '?' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1173:3: lv_option_2_0= '?'
                    {
                    lv_option_2_0=(Token)match(input,31,FOLLOW_31_in_ruleTypeRef2493); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1194:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1195:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1196:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2544);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2555); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1203:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1206:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1207:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1207:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1208:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2602);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1218:1: (kw= '.*' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1219:2: kw= '.*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedNameWithWildCard2621); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1232:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1233:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1234:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2664);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2675); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1241:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1244:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1245:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1245:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1245:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2715); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1252:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1253:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedName2734); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2749); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "entryRuleAnnotations"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1273:1: entryRuleAnnotations returns [EObject current=null] : iv_ruleAnnotations= ruleAnnotations EOF ;
    public final EObject entryRuleAnnotations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotations = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1274:2: (iv_ruleAnnotations= ruleAnnotations EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1275:2: iv_ruleAnnotations= ruleAnnotations EOF
            {
             newCompositeNode(grammarAccess.getAnnotationsRule()); 
            pushFollow(FOLLOW_ruleAnnotations_in_entryRuleAnnotations2796);
            iv_ruleAnnotations=ruleAnnotations();

            state._fsp--;

             current =iv_ruleAnnotations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotations2806); 

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
    // $ANTLR end "entryRuleAnnotations"


    // $ANTLR start "ruleAnnotations"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1282:1: ruleAnnotations returns [EObject current=null] : (otherlv_0= '[' ( (lv_annotations_1_0= ruleAnnotation ) ) (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* otherlv_4= ']' )? ;
    public final EObject ruleAnnotations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1285:28: ( (otherlv_0= '[' ( (lv_annotations_1_0= ruleAnnotation ) ) (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* otherlv_4= ']' )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1286:1: (otherlv_0= '[' ( (lv_annotations_1_0= ruleAnnotation ) ) (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* otherlv_4= ']' )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1286:1: (otherlv_0= '[' ( (lv_annotations_1_0= ruleAnnotation ) ) (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* otherlv_4= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1286:3: otherlv_0= '[' ( (lv_annotations_1_0= ruleAnnotation ) ) (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAnnotations2843); 

                        	newLeafNode(otherlv_0, grammarAccess.getAnnotationsAccess().getLeftSquareBracketKeyword_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1290:1: ( (lv_annotations_1_0= ruleAnnotation ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1291:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1291:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1292:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotations2864);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationsRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1308:2: (otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==34) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1308:4: otherlv_2= ',' ( (lv_annotations_3_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAnnotations2877); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAnnotationsAccess().getCommaKeyword_2_0());
                    	        
                    	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1312:1: ( (lv_annotations_3_0= ruleAnnotation ) )
                    	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1313:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1313:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1314:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotations2898);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_3_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleAnnotations2912); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnnotationsAccess().getRightSquareBracketKeyword_3());
                        

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
    // $ANTLR end "ruleAnnotations"


    // $ANTLR start "entryRuleAnnotation"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1342:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1343:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1344:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation2949);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation2959); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1351:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1354:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1355:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1355:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1355:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1355:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1356:1: (lv_key_0_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1356:1: (lv_key_0_0= RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1357:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation3001); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation3018); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getColonKeyword_1());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1377:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1378:1: (lv_value_2_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1378:1: (lv_value_2_0= RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1379:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation3035); 

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


    // $ANTLR start "entryRuleConstraint"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1403:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1404:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1405:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint3076);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint3086); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1412:1: ruleConstraint returns [EObject current=null] : (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BoolConstraint_0 = null;

        EObject this_StringConstraint_1 = null;

        EObject this_DateTimeConstraint_2 = null;

        EObject this_DecimalConstraint_3 = null;

        EObject this_EnumerationConstraint_4 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1415:28: ( (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1416:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1416:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_DecimalConstraint_3= ruleDecimalConstraint | this_EnumerationConstraint_4= ruleEnumerationConstraint )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt27=1;
                }
                break;
            case 36:
                {
                alt27=2;
                }
                break;
            case 38:
                {
                alt27=3;
                }
                break;
            case 40:
                {
                alt27=4;
                }
                break;
            case 41:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1417:5: this_BoolConstraint_0= ruleBoolConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBoolConstraint_in_ruleConstraint3133);
                    this_BoolConstraint_0=ruleBoolConstraint();

                    state._fsp--;

                     
                            current = this_BoolConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1427:5: this_StringConstraint_1= ruleStringConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringConstraint_in_ruleConstraint3160);
                    this_StringConstraint_1=ruleStringConstraint();

                    state._fsp--;

                     
                            current = this_StringConstraint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1437:5: this_DateTimeConstraint_2= ruleDateTimeConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_ruleConstraint3187);
                    this_DateTimeConstraint_2=ruleDateTimeConstraint();

                    state._fsp--;

                     
                            current = this_DateTimeConstraint_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1447:5: this_DecimalConstraint_3= ruleDecimalConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_ruleConstraint3214);
                    this_DecimalConstraint_3=ruleDecimalConstraint();

                    state._fsp--;

                     
                            current = this_DecimalConstraint_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1457:5: this_EnumerationConstraint_4= ruleEnumerationConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_ruleConstraint3241);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1473:1: entryRuleBoolConstraint returns [EObject current=null] : iv_ruleBoolConstraint= ruleBoolConstraint EOF ;
    public final EObject entryRuleBoolConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1474:2: (iv_ruleBoolConstraint= ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1475:2: iv_ruleBoolConstraint= ruleBoolConstraint EOF
            {
             newCompositeNode(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint3276);
            iv_ruleBoolConstraint=ruleBoolConstraint();

            state._fsp--;

             current =iv_ruleBoolConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint3286); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1482:1: ruleBoolConstraint returns [EObject current=null] : ( (lv_constraint_0_0= 'boolean' ) ) ;
    public final EObject ruleBoolConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1485:28: ( ( (lv_constraint_0_0= 'boolean' ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1486:1: ( (lv_constraint_0_0= 'boolean' ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1486:1: ( (lv_constraint_0_0= 'boolean' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1487:1: (lv_constraint_0_0= 'boolean' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1487:1: (lv_constraint_0_0= 'boolean' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1488:3: lv_constraint_0_0= 'boolean'
            {
            lv_constraint_0_0=(Token)match(input,35,FOLLOW_35_in_ruleBoolConstraint3328); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1509:1: entryRuleStringConstraint returns [EObject current=null] : iv_ruleStringConstraint= ruleStringConstraint EOF ;
    public final EObject entryRuleStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1510:2: (iv_ruleStringConstraint= ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1511:2: iv_ruleStringConstraint= ruleStringConstraint EOF
            {
             newCompositeNode(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint3376);
            iv_ruleStringConstraint=ruleStringConstraint();

            state._fsp--;

             current =iv_ruleStringConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint3386); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1518:1: ruleStringConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token otherlv_2=null;
        Token lv_regularExpression_3_0=null;
        EObject lv_constraintRef_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1521:28: ( ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1522:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1522:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1522:2: ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1522:2: ( (lv_constraint_0_0= 'string' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1523:1: (lv_constraint_0_0= 'string' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1523:1: (lv_constraint_0_0= 'string' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1524:3: lv_constraint_0_0= 'string'
            {
            lv_constraint_0_0=(Token)match(input,36,FOLLOW_36_in_ruleStringConstraint3429); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "string");
            	    

            }


            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1537:2: ( (lv_constraintRef_1_0= ruleAllConstraint ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1538:1: (lv_constraintRef_1_0= ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1538:1: (lv_constraintRef_1_0= ruleAllConstraint )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1539:3: lv_constraintRef_1_0= ruleAllConstraint
            {
             
            	        newCompositeNode(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAllConstraint_in_ruleStringConstraint3463);
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1555:2: (otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1555:4: otherlv_2= 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleStringConstraint3476); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1559:1: ( (lv_regularExpression_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1560:1: (lv_regularExpression_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1560:1: (lv_regularExpression_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1561:3: lv_regularExpression_3_0= RULE_STRING
                    {
                    lv_regularExpression_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint3493); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1585:1: entryRuleDateTimeConstraint returns [EObject current=null] : iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF ;
    public final EObject entryRuleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1586:2: (iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1587:2: iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3536);
            iv_ruleDateTimeConstraint=ruleDateTimeConstraint();

            state._fsp--;

             current =iv_ruleDateTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint3546); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1594:1: ruleDateTimeConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;

         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1597:28: ( ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1598:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1598:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1598:2: ( (lv_constraint_0_0= 'datetime' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1598:2: ( (lv_constraint_0_0= 'datetime' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1599:1: (lv_constraint_0_0= 'datetime' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1599:1: (lv_constraint_0_0= 'datetime' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1600:3: lv_constraint_0_0= 'datetime'
            {
            lv_constraint_0_0=(Token)match(input,38,FOLLOW_38_in_ruleDateTimeConstraint3589); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "datetime");
            	    

            }


            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1613:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1613:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1613:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1614:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1614:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1615:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)match(input,39,FOLLOW_39_in_ruleDateTimeConstraint3621); 

                            newLeafNode(lv_hasDefault_1_0, grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1628:2: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1629:1: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1629:1: (lv_defaultValue_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1630:3: lv_defaultValue_2_0= RULE_STRING
                    {
                    lv_defaultValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3651); 

                    			newLeafNode(lv_defaultValue_2_0, grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateTimeConstraintRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_2_0, 
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1654:1: entryRuleDecimalConstraint returns [EObject current=null] : iv_ruleDecimalConstraint= ruleDecimalConstraint EOF ;
    public final EObject entryRuleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1655:2: (iv_ruleDecimalConstraint= ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1656:2: iv_ruleDecimalConstraint= ruleDecimalConstraint EOF
            {
             newCompositeNode(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3694);
            iv_ruleDecimalConstraint=ruleDecimalConstraint();

            state._fsp--;

             current =iv_ruleDecimalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint3704); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1663:1: ruleDecimalConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) ;
    public final EObject ruleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        EObject lv_constraintRef_1_0 = null;


         enterRule(); 
            
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1666:28: ( ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1667:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1667:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1667:2: ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1667:2: ( (lv_constraint_0_0= 'decimal' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1668:1: (lv_constraint_0_0= 'decimal' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1668:1: (lv_constraint_0_0= 'decimal' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1669:3: lv_constraint_0_0= 'decimal'
            {
            lv_constraint_0_0=(Token)match(input,40,FOLLOW_40_in_ruleDecimalConstraint3747); 

                    newLeafNode(lv_constraint_0_0, grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecimalConstraintRule());
            	        }
                   		setWithLastConsumed(current, "constraint", lv_constraint_0_0, "decimal");
            	    

            }


            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1682:2: ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1683:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1683:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1684:3: lv_constraintRef_1_0= ruleNumberConstraint
            {
             
            	        newCompositeNode(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint3781);
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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1708:1: entryRuleEnumerationConstraint returns [EObject current=null] : iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF ;
    public final EObject entryRuleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1709:2: (iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1710:2: iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF
            {
             newCompositeNode(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3817);
            iv_ruleEnumerationConstraint=ruleEnumerationConstraint();

            state._fsp--;

             current =iv_ruleEnumerationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint3827); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1717:1: ruleEnumerationConstraint returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) ;
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
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1720:28: ( (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1721:1: (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1721:1: (otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1721:3: otherlv_0= 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleEnumerationConstraint3864); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0());
                
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1725:1: ( (lv_usage_1_0= ruleEnumUsage ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1726:1: (lv_usage_1_0= ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1726:1: (lv_usage_1_0= ruleEnumUsage )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1727:3: lv_usage_1_0= ruleEnumUsage
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3885);
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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1743:2: (otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1743:4: otherlv_2= 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleEnumerationConstraint3898); 

                        	newLeafNode(otherlv_2, grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1747:1: ( (lv_fixeLen_3_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1748:1: (lv_fixeLen_3_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1748:1: (lv_fixeLen_3_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1749:3: lv_fixeLen_3_0= RULE_INT
                    {
                    lv_fixeLen_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationConstraint3915); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1765:4: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1765:5: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1765:5: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1766:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1766:1: (lv_hasDefault_4_0= 'default' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1767:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumerationConstraint3941); 

                            newLeafNode(lv_hasDefault_4_0, grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEnumerationConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1780:2: ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1781:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1781:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1782:3: lv_defaultValueAsString_5_0= RULE_ID
                    {
                    lv_defaultValueAsString_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationConstraint3971); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1806:1: entryRuleNumberConstraint returns [EObject current=null] : iv_ruleNumberConstraint= ruleNumberConstraint EOF ;
    public final EObject entryRuleNumberConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1807:2: (iv_ruleNumberConstraint= ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1808:2: iv_ruleNumberConstraint= ruleNumberConstraint EOF
            {
             newCompositeNode(grammarAccess.getNumberConstraintRule()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint4014);
            iv_ruleNumberConstraint=ruleNumberConstraint();

            state._fsp--;

             current =iv_ruleNumberConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint4024); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1815:1: ruleNumberConstraint returns [EObject current=null] : ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? ) ;
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
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1818:28: ( ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )? (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )? (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_isId_16_0= 'id' ) )? ( (lv_nullable_17_0= 'nullable' ) )? ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )? ( (lv_isXSDAtt_20_0= 'xsdA.' ) )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:3: ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1819:3: ( (lv_hasDefault_0_0= 'default' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1820:1: (lv_hasDefault_0_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1820:1: (lv_hasDefault_0_0= 'default' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1821:3: lv_hasDefault_0_0= 'default'
                    {
                    lv_hasDefault_0_0=(Token)match(input,39,FOLLOW_39_in_ruleNumberConstraint4068); 

                            newLeafNode(lv_hasDefault_0_0, grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1834:2: ( (lv_defaultValue_1_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1835:1: (lv_defaultValue_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1835:1: (lv_defaultValue_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1836:3: lv_defaultValue_1_0= RULE_STRING
                    {
                    lv_defaultValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint4098); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1852:4: ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1852:5: ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1852:5: ( (lv_isFixed_2_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1853:1: (lv_isFixed_2_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1853:1: (lv_isFixed_2_0= 'fixed' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1854:3: lv_isFixed_2_0= 'fixed'
                    {
                    lv_isFixed_2_0=(Token)match(input,43,FOLLOW_43_in_ruleNumberConstraint4124); 

                            newLeafNode(lv_isFixed_2_0, grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isFixed", true, "fixed");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1867:2: ( (lv_fixedValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1868:1: (lv_fixedValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1868:1: (lv_fixedValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1869:3: lv_fixedValue_3_0= RULE_STRING
                    {
                    lv_fixedValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint4154); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1885:4: (otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1885:6: otherlv_4= 'minVal' ( (lv_minValue_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleNumberConstraint4174); 

                        	newLeafNode(otherlv_4, grammarAccess.getNumberConstraintAccess().getMinValKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1889:1: ( (lv_minValue_5_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1890:1: (lv_minValue_5_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1890:1: (lv_minValue_5_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1891:3: lv_minValue_5_0= RULE_INT
                    {
                    lv_minValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4191); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1907:4: (otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1907:6: otherlv_6= 'maxVal' ( (lv_maxValue_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleNumberConstraint4211); 

                        	newLeafNode(otherlv_6, grammarAccess.getNumberConstraintAccess().getMaxValKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1911:1: ( (lv_maxValue_7_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1912:1: (lv_maxValue_7_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1912:1: (lv_maxValue_7_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1913:3: lv_maxValue_7_0= RULE_INT
                    {
                    lv_maxValue_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4228); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1929:4: (otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1929:6: otherlv_8= 'minLen' ( (lv_minLen_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleNumberConstraint4248); 

                        	newLeafNode(otherlv_8, grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1933:1: ( (lv_minLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1934:1: (lv_minLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1934:1: (lv_minLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1935:3: lv_minLen_9_0= RULE_INT
                    {
                    lv_minLen_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4265); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1951:4: (otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1951:6: otherlv_10= 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_47_in_ruleNumberConstraint4285); 

                        	newLeafNode(otherlv_10, grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1955:1: ( (lv_maxLen_11_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1956:1: (lv_maxLen_11_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1956:1: (lv_maxLen_11_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1957:3: lv_maxLen_11_0= RULE_INT
                    {
                    lv_maxLen_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4302); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1973:4: (otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1973:6: otherlv_12= 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleNumberConstraint4322); 

                        	newLeafNode(otherlv_12, grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1977:1: ( (lv_fixeLen_13_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1978:1: (lv_fixeLen_13_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1978:1: (lv_fixeLen_13_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1979:3: lv_fixeLen_13_0= RULE_INT
                    {
                    lv_fixeLen_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4339); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1995:4: (otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1995:6: otherlv_14= 'paddle' ( (lv_paddle_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,48,FOLLOW_48_in_ruleNumberConstraint4359); 

                        	newLeafNode(otherlv_14, grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:1999:1: ( (lv_paddle_15_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2000:1: (lv_paddle_15_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2000:1: (lv_paddle_15_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2001:3: lv_paddle_15_0= RULE_STRING
                    {
                    lv_paddle_15_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint4376); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2017:4: ( (lv_isId_16_0= 'id' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2018:1: (lv_isId_16_0= 'id' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2018:1: (lv_isId_16_0= 'id' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2019:3: lv_isId_16_0= 'id'
                    {
                    lv_isId_16_0=(Token)match(input,49,FOLLOW_49_in_ruleNumberConstraint4401); 

                            newLeafNode(lv_isId_16_0, grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isId", true, "id");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2032:3: ( (lv_nullable_17_0= 'nullable' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2033:1: (lv_nullable_17_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2033:1: (lv_nullable_17_0= 'nullable' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2034:3: lv_nullable_17_0= 'nullable'
                    {
                    lv_nullable_17_0=(Token)match(input,50,FOLLOW_50_in_ruleNumberConstraint4433); 

                            newLeafNode(lv_nullable_17_0, grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", true, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2047:3: ( ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2047:4: ( (lv_derived_18_0= 'derived' ) ) ( (lv_writable_19_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2047:4: ( (lv_derived_18_0= 'derived' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2048:1: (lv_derived_18_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2048:1: (lv_derived_18_0= 'derived' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2049:3: lv_derived_18_0= 'derived'
                    {
                    lv_derived_18_0=(Token)match(input,51,FOLLOW_51_in_ruleNumberConstraint4466); 

                            newLeafNode(lv_derived_18_0, grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumberConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2062:2: ( (lv_writable_19_0= 'writable' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==52) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2063:1: (lv_writable_19_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2063:1: (lv_writable_19_0= 'writable' )
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2064:3: lv_writable_19_0= 'writable'
                            {
                            lv_writable_19_0=(Token)match(input,52,FOLLOW_52_in_ruleNumberConstraint4497); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2077:5: ( (lv_isXSDAtt_20_0= 'xsdA.' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2078:1: (lv_isXSDAtt_20_0= 'xsdA.' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2078:1: (lv_isXSDAtt_20_0= 'xsdA.' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2079:3: lv_isXSDAtt_20_0= 'xsdA.'
                    {
                    lv_isXSDAtt_20_0=(Token)match(input,53,FOLLOW_53_in_ruleNumberConstraint4531); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2100:1: entryRuleAllConstraint returns [EObject current=null] : iv_ruleAllConstraint= ruleAllConstraint EOF ;
    public final EObject entryRuleAllConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllConstraint = null;


        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2101:2: (iv_ruleAllConstraint= ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2102:2: iv_ruleAllConstraint= ruleAllConstraint EOF
            {
             newCompositeNode(grammarAccess.getAllConstraintRule()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint4581);
            iv_ruleAllConstraint=ruleAllConstraint();

            state._fsp--;

             current =iv_ruleAllConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint4591); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2109:1: ruleAllConstraint returns [EObject current=null] : ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? ) ;
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
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2112:28: ( ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )? )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_isId_12_0= 'id' ) )? ( (lv_nullable_13_0= 'nullable' ) )? ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )? ( (lv_isXSDAtt_16_0= 'xsdA.' ) )?
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:3: ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2113:3: ( (lv_hasDefault_0_0= 'default' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2114:1: (lv_hasDefault_0_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2114:1: (lv_hasDefault_0_0= 'default' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2115:3: lv_hasDefault_0_0= 'default'
                    {
                    lv_hasDefault_0_0=(Token)match(input,39,FOLLOW_39_in_ruleAllConstraint4635); 

                            newLeafNode(lv_hasDefault_0_0, grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "hasDefault", true, "default");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2128:2: ( (lv_defaultValue_1_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2129:1: (lv_defaultValue_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2129:1: (lv_defaultValue_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2130:3: lv_defaultValue_1_0= RULE_STRING
                    {
                    lv_defaultValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4665); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2146:4: ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2146:5: ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2146:5: ( (lv_isFixed_2_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2147:1: (lv_isFixed_2_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2147:1: (lv_isFixed_2_0= 'fixed' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2148:3: lv_isFixed_2_0= 'fixed'
                    {
                    lv_isFixed_2_0=(Token)match(input,43,FOLLOW_43_in_ruleAllConstraint4691); 

                            newLeafNode(lv_isFixed_2_0, grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isFixed", true, "fixed");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2161:2: ( (lv_fixedValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2162:1: (lv_fixedValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2162:1: (lv_fixedValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2163:3: lv_fixedValue_3_0= RULE_STRING
                    {
                    lv_fixedValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4721); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2179:4: (otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2179:6: otherlv_4= 'minLen' ( (lv_minLen_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleAllConstraint4741); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2183:1: ( (lv_minLen_5_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2184:1: (lv_minLen_5_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2184:1: (lv_minLen_5_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2185:3: lv_minLen_5_0= RULE_INT
                    {
                    lv_minLen_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4758); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2201:4: (otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2201:6: otherlv_6= 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleAllConstraint4778); 

                        	newLeafNode(otherlv_6, grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2205:1: ( (lv_maxLen_7_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2206:1: (lv_maxLen_7_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2206:1: (lv_maxLen_7_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2207:3: lv_maxLen_7_0= RULE_INT
                    {
                    lv_maxLen_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4795); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2223:4: (otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2223:6: otherlv_8= 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleAllConstraint4815); 

                        	newLeafNode(otherlv_8, grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2227:1: ( (lv_fixeLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2228:1: (lv_fixeLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2228:1: (lv_fixeLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2229:3: lv_fixeLen_9_0= RULE_INT
                    {
                    lv_fixeLen_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4832); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2245:4: (otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2245:6: otherlv_10= 'paddle' ( (lv_paddle_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleAllConstraint4852); 

                        	newLeafNode(otherlv_10, grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0());
                        
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2249:1: ( (lv_paddle_11_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2250:1: (lv_paddle_11_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2250:1: (lv_paddle_11_0= RULE_STRING )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2251:3: lv_paddle_11_0= RULE_STRING
                    {
                    lv_paddle_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4869); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2267:4: ( (lv_isId_12_0= 'id' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2268:1: (lv_isId_12_0= 'id' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2268:1: (lv_isId_12_0= 'id' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2269:3: lv_isId_12_0= 'id'
                    {
                    lv_isId_12_0=(Token)match(input,49,FOLLOW_49_in_ruleAllConstraint4894); 

                            newLeafNode(lv_isId_12_0, grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isId", true, "id");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2282:3: ( (lv_nullable_13_0= 'nullable' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2283:1: (lv_nullable_13_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2283:1: (lv_nullable_13_0= 'nullable' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2284:3: lv_nullable_13_0= 'nullable'
                    {
                    lv_nullable_13_0=(Token)match(input,50,FOLLOW_50_in_ruleAllConstraint4926); 

                            newLeafNode(lv_nullable_13_0, grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", true, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2297:3: ( ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2297:4: ( (lv_derived_14_0= 'derived' ) ) ( (lv_writable_15_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2297:4: ( (lv_derived_14_0= 'derived' ) )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2298:1: (lv_derived_14_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2298:1: (lv_derived_14_0= 'derived' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2299:3: lv_derived_14_0= 'derived'
                    {
                    lv_derived_14_0=(Token)match(input,51,FOLLOW_51_in_ruleAllConstraint4959); 

                            newLeafNode(lv_derived_14_0, grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "derived");
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2312:2: ( (lv_writable_15_0= 'writable' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==52) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2313:1: (lv_writable_15_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2313:1: (lv_writable_15_0= 'writable' )
                            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2314:3: lv_writable_15_0= 'writable'
                            {
                            lv_writable_15_0=(Token)match(input,52,FOLLOW_52_in_ruleAllConstraint4990); 

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

            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2327:5: ( (lv_isXSDAtt_16_0= 'xsdA.' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2328:1: (lv_isXSDAtt_16_0= 'xsdA.' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2328:1: (lv_isXSDAtt_16_0= 'xsdA.' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2329:3: lv_isXSDAtt_16_0= 'xsdA.'
                    {
                    lv_isXSDAtt_16_0=(Token)match(input,53,FOLLOW_53_in_ruleAllConstraint5024); 

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


    // $ANTLR start "ruleVisibility"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2350:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2352:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2353:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2353:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt56=1;
                }
                break;
            case 55:
                {
                alt56=2;
                }
                break;
            case 56:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2353:2: (enumLiteral_0= 'public' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2353:2: (enumLiteral_0= 'public' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2353:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleVisibility5088); 

                            current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2359:6: (enumLiteral_1= 'private' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2359:6: (enumLiteral_1= 'private' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2359:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleVisibility5105); 

                            current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2365:6: (enumLiteral_2= 'protected' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2365:6: (enumLiteral_2= 'protected' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2365:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleVisibility5122); 

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
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2375:1: ruleEntityType returns [Enumerator current=null] : (enumLiteral_0= 'abstract' ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2377:28: ( (enumLiteral_0= 'abstract' ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2378:1: (enumLiteral_0= 'abstract' )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2378:1: (enumLiteral_0= 'abstract' )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2378:3: enumLiteral_0= 'abstract'
            {
            enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleEntityType5166); 

                    current = grammarAccess.getEntityTypeAccess().getAbstractEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getEntityTypeAccess().getAbstractEnumLiteralDeclaration()); 
                

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


    // $ANTLR start "ruleEnumUsage"
    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2390:1: ruleEnumUsage returns [Enumerator current=null] : ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) ) ;
    public final Enumerator ruleEnumUsage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2392:28: ( ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) ) )
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2393:1: ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) )
            {
            // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2393:1: ( (enumLiteral_0= 'as String' ) | (enumLiteral_1= 'as Value' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            else if ( (LA57_0==59) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2393:2: (enumLiteral_0= 'as String' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2393:2: (enumLiteral_0= 'as String' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2393:4: enumLiteral_0= 'as String'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_58_in_ruleEnumUsage5212); 

                            current = grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2399:6: (enumLiteral_1= 'as Value' )
                    {
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2399:6: (enumLiteral_1= 'as Value' )
                    // ../fr.chaunier.xtext.omcst.om/src-gen/fr/chaunier/xtext/omcst/om/parser/antlr/internal/InternalOmcstDsl.g:2399:8: enumLiteral_1= 'as Value'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleEnumUsage5229); 

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


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x0200000002183802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdElement_in_ruleAbstractElement304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdElement_in_entryRuleXsdElement443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXsdElement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXsdElement490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXsdElement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration614 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration648 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration680 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration700 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rulePackageDeclaration721 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration735 = new BitSet(new long[]{0x02000000021C3800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration756 = new BitSet(new long[]{0x02000000021C3800L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDataType998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1015 = new BitSet(new long[]{0x0000035800010002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleDataType1041 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleDataType1055 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleDataType1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity1170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntity1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1200 = new BitSet(new long[]{0x0000000000230020L});
    public static final BitSet FOLLOW_21_in_ruleEntity1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1241 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1256 = new BitSet(new long[]{0x0000000004020020L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleEntity1277 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntity1314 = new BitSet(new long[]{0x0000000000840010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1335 = new BitSet(new long[]{0x0000000000840010L});
    public static final BitSet FOLLOW_18_in_ruleEntity1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_ruleFeature1441 = new BitSet(new long[]{0x0000035800010022L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleFeature1461 = new BitSet(new long[]{0x0000000000010022L});
    public static final BitSet FOLLOW_16_in_ruleFeature1475 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_ruleAnnotations_in_ruleFeature1496 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStructuralFeature1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStructuralFeature1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1728 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAttribute1745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReference1849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1866 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleReference1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleReference1904 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleReference1917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEnumeration2022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration2039 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumeration2056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration2077 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleEnumeration2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral2178 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEnumerationLiteral2196 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral2213 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumerationLiteral2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef2443 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeRef2461 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeRef2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2602 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedNameWithWildCard2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2715 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedName2734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2749 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAnnotations2843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotations2864 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotations2877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotations2898 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_27_in_ruleAnnotations2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation2949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation3001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation3018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_ruleConstraint3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_ruleConstraint3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_ruleConstraint3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_ruleConstraint3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_ruleConstraint3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint3276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBoolConstraint3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStringConstraint3429 = new BitSet(new long[]{0x002FCCA000000000L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_ruleStringConstraint3463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringConstraint3476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDateTimeConstraint3589 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleDateTimeConstraint3621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDecimalConstraint3747 = new BitSet(new long[]{0x002FFC8000000000L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEnumerationConstraint3864 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3885 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_42_in_ruleEnumerationConstraint3898 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationConstraint3915 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumerationConstraint3941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationConstraint3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint4014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumberConstraint4068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint4098 = new BitSet(new long[]{0x002FFC0000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumberConstraint4124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint4154 = new BitSet(new long[]{0x002FF40000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumberConstraint4174 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4191 = new BitSet(new long[]{0x002FE40000000002L});
    public static final BitSet FOLLOW_45_in_ruleNumberConstraint4211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4228 = new BitSet(new long[]{0x002FC40000000002L});
    public static final BitSet FOLLOW_46_in_ruleNumberConstraint4248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4265 = new BitSet(new long[]{0x002F840000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumberConstraint4285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4302 = new BitSet(new long[]{0x002F040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumberConstraint4322 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4339 = new BitSet(new long[]{0x002F000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNumberConstraint4359 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint4376 = new BitSet(new long[]{0x002E000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberConstraint4401 = new BitSet(new long[]{0x002C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumberConstraint4433 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberConstraint4466 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumberConstraint4497 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNumberConstraint4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint4581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAllConstraint4635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4665 = new BitSet(new long[]{0x002FCC0000000002L});
    public static final BitSet FOLLOW_43_in_ruleAllConstraint4691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4721 = new BitSet(new long[]{0x002FC40000000002L});
    public static final BitSet FOLLOW_46_in_ruleAllConstraint4741 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4758 = new BitSet(new long[]{0x002F840000000002L});
    public static final BitSet FOLLOW_47_in_ruleAllConstraint4778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4795 = new BitSet(new long[]{0x002F040000000002L});
    public static final BitSet FOLLOW_42_in_ruleAllConstraint4815 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4832 = new BitSet(new long[]{0x002F000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAllConstraint4852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4869 = new BitSet(new long[]{0x002E000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAllConstraint4894 = new BitSet(new long[]{0x002C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAllConstraint4926 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAllConstraint4959 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAllConstraint4990 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAllConstraint5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVisibility5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVisibility5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVisibility5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEntityType5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEnumUsage5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEnumUsage5229 = new BitSet(new long[]{0x0000000000000002L});

}