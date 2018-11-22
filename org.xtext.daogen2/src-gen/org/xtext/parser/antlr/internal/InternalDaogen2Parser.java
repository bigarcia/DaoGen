package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.Daogen2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDaogen2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "';'", "'class'", "'extends'", "'{'", "'}'", "'private'", "'insertCode'", "'('", "')'", "'inserir_objeto'", "'buscar_objeto,'", "'listar_objeto'", "'remover_objeto,'", "'atualizar_objeto,'", "'deletar_tabela'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDaogen2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDaogen2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDaogen2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalDaogen2.g"; }



     	private Daogen2GrammarAccess grammarAccess;

        public InternalDaogen2Parser(TokenStream input, Daogen2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Daogen";
       	}

       	@Override
       	protected Daogen2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDaogen"
    // InternalDaogen2.g:64:1: entryRuleDaogen returns [EObject current=null] : iv_ruleDaogen= ruleDaogen EOF ;
    public final EObject entryRuleDaogen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaogen = null;


        try {
            // InternalDaogen2.g:64:47: (iv_ruleDaogen= ruleDaogen EOF )
            // InternalDaogen2.g:65:2: iv_ruleDaogen= ruleDaogen EOF
            {
             newCompositeNode(grammarAccess.getDaogenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDaogen=ruleDaogen();

            state._fsp--;

             current =iv_ruleDaogen; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDaogen"


    // $ANTLR start "ruleDaogen"
    // InternalDaogen2.g:71:1: ruleDaogen returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDaogen() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalDaogen2.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalDaogen2.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDaogen2.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalDaogen2.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalDaogen2.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDaogenAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDaogenRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.Daogen2.Type");
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
    // $ANTLR end "ruleDaogen"


    // $ANTLR start "entryRuleType"
    // InternalDaogen2.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDaogen2.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalDaogen2.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDaogen2.g:107:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Classe_1= ruleClasse ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Classe_1 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:113:2: ( (this_DataType_0= ruleDataType | this_Classe_1= ruleClasse ) )
            // InternalDaogen2.g:114:2: (this_DataType_0= ruleDataType | this_Classe_1= ruleClasse )
            {
            // InternalDaogen2.g:114:2: (this_DataType_0= ruleDataType | this_Classe_1= ruleClasse )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDaogen2.g:115:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDaogen2.g:124:3: this_Classe_1= ruleClasse
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getClasseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Classe_1=ruleClasse();

                    state._fsp--;


                    			current = this_Classe_1;
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
    // InternalDaogen2.g:136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDaogen2.g:136:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDaogen2.g:137:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDaogen2.g:143:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDaogen2.g:149:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalDaogen2.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalDaogen2.g:150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalDaogen2.g:151:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDaogen2.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDaogen2.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDaogen2.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalDaogen2.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getSemicolonKeyword_2());
            		

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


    // $ANTLR start "entryRuleClasse"
    // InternalDaogen2.g:181:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalDaogen2.g:181:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalDaogen2.g:182:2: iv_ruleClasse= ruleClasse EOF
            {
             newCompositeNode(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasse=ruleClasse();

            state._fsp--;

             current =iv_ruleClasse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalDaogen2.g:188:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:194:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // InternalDaogen2.g:195:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // InternalDaogen2.g:195:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // InternalDaogen2.g:196:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
            		
            // InternalDaogen2.g:200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDaogen2.g:201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDaogen2.g:201:4: (lv_name_1_0= RULE_ID )
            // InternalDaogen2.g:202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClasseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDaogen2.g:218:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDaogen2.g:219:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDaogen2.g:223:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDaogen2.g:224:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDaogen2.g:224:5: (otherlv_3= RULE_ID )
                    // InternalDaogen2.g:225:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getSuperTypeClasseCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDaogen2.g:241:3: ( (lv_features_5_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDaogen2.g:242:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalDaogen2.g:242:4: (lv_features_5_0= ruleFeature )
            	    // InternalDaogen2.g:243:5: lv_features_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getFeaturesFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_5_0,
            	    						"org.xtext.Daogen2.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleFeature"
    // InternalDaogen2.g:268:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalDaogen2.g:268:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalDaogen2.g:269:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDaogen2.g:275:1: ruleFeature returns [EObject current=null] : (this_Atributo_0= ruleAtributo | this_InsertCode_1= ruleInsertCode ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Atributo_0 = null;

        EObject this_InsertCode_1 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:281:2: ( (this_Atributo_0= ruleAtributo | this_InsertCode_1= ruleInsertCode ) )
            // InternalDaogen2.g:282:2: (this_Atributo_0= ruleAtributo | this_InsertCode_1= ruleInsertCode )
            {
            // InternalDaogen2.g:282:2: (this_Atributo_0= ruleAtributo | this_InsertCode_1= ruleInsertCode )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDaogen2.g:283:3: this_Atributo_0= ruleAtributo
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getAtributoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atributo_0=ruleAtributo();

                    state._fsp--;


                    			current = this_Atributo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDaogen2.g:292:3: this_InsertCode_1= ruleInsertCode
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getInsertCodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InsertCode_1=ruleInsertCode();

                    state._fsp--;


                    			current = this_InsertCode_1;
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAtributo"
    // InternalDaogen2.g:304:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalDaogen2.g:304:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalDaogen2.g:305:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalDaogen2.g:311:1: ruleAtributo returns [EObject current=null] : (otherlv_0= 'private' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDaogen2.g:317:2: ( (otherlv_0= 'private' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalDaogen2.g:318:2: (otherlv_0= 'private' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalDaogen2.g:318:2: (otherlv_0= 'private' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalDaogen2.g:319:3: otherlv_0= 'private' ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getPrivateKeyword_0());
            		
            // InternalDaogen2.g:323:3: ( (otherlv_1= RULE_ID ) )
            // InternalDaogen2.g:324:4: (otherlv_1= RULE_ID )
            {
            // InternalDaogen2.g:324:4: (otherlv_1= RULE_ID )
            // InternalDaogen2.g:325:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getTypeTypeCrossReference_1_0());
            				

            }


            }

            // InternalDaogen2.g:336:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDaogen2.g:337:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDaogen2.g:337:4: (lv_name_2_0= RULE_ID )
            // InternalDaogen2.g:338:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleInsertCode"
    // InternalDaogen2.g:362:1: entryRuleInsertCode returns [EObject current=null] : iv_ruleInsertCode= ruleInsertCode EOF ;
    public final EObject entryRuleInsertCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertCode = null;


        try {
            // InternalDaogen2.g:362:51: (iv_ruleInsertCode= ruleInsertCode EOF )
            // InternalDaogen2.g:363:2: iv_ruleInsertCode= ruleInsertCode EOF
            {
             newCompositeNode(grammarAccess.getInsertCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertCode=ruleInsertCode();

            state._fsp--;

             current =iv_ruleInsertCode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsertCode"


    // $ANTLR start "ruleInsertCode"
    // InternalDaogen2.g:369:1: ruleInsertCode returns [EObject current=null] : (otherlv_0= 'insertCode' otherlv_1= '(' ( (lv_parametro_2_0= ruleParametro ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleInsertCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_parametro_2_0 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:375:2: ( (otherlv_0= 'insertCode' otherlv_1= '(' ( (lv_parametro_2_0= ruleParametro ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalDaogen2.g:376:2: (otherlv_0= 'insertCode' otherlv_1= '(' ( (lv_parametro_2_0= ruleParametro ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalDaogen2.g:376:2: (otherlv_0= 'insertCode' otherlv_1= '(' ( (lv_parametro_2_0= ruleParametro ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalDaogen2.g:377:3: otherlv_0= 'insertCode' otherlv_1= '(' ( (lv_parametro_2_0= ruleParametro ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertCodeAccess().getInsertCodeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertCodeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDaogen2.g:385:3: ( (lv_parametro_2_0= ruleParametro ) )
            // InternalDaogen2.g:386:4: (lv_parametro_2_0= ruleParametro )
            {
            // InternalDaogen2.g:386:4: (lv_parametro_2_0= ruleParametro )
            // InternalDaogen2.g:387:5: lv_parametro_2_0= ruleParametro
            {

            					newCompositeNode(grammarAccess.getInsertCodeAccess().getParametroParametroParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_parametro_2_0=ruleParametro();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertCodeRule());
            					}
            					set(
            						current,
            						"parametro",
            						lv_parametro_2_0,
            						"org.xtext.Daogen2.Parametro");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertCodeAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertCodeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleInsertCode"


    // $ANTLR start "entryRuleParametro"
    // InternalDaogen2.g:416:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalDaogen2.g:416:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalDaogen2.g:417:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalDaogen2.g:423:1: ruleParametro returns [EObject current=null] : (this_InserirObjeto_0= ruleInserirObjeto | this_BuscarObjeto_1= ruleBuscarObjeto | this_ListarObjeto_2= ruleListarObjeto | this_RemoverObjeto_3= ruleRemoverObjeto | this_AtualizarObjeto_4= ruleAtualizarObjeto | this_DeletarTabela_5= ruleDeletarTabela ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        EObject this_InserirObjeto_0 = null;

        EObject this_BuscarObjeto_1 = null;

        EObject this_ListarObjeto_2 = null;

        EObject this_RemoverObjeto_3 = null;

        EObject this_AtualizarObjeto_4 = null;

        EObject this_DeletarTabela_5 = null;



        	enterRule();

        try {
            // InternalDaogen2.g:429:2: ( (this_InserirObjeto_0= ruleInserirObjeto | this_BuscarObjeto_1= ruleBuscarObjeto | this_ListarObjeto_2= ruleListarObjeto | this_RemoverObjeto_3= ruleRemoverObjeto | this_AtualizarObjeto_4= ruleAtualizarObjeto | this_DeletarTabela_5= ruleDeletarTabela ) )
            // InternalDaogen2.g:430:2: (this_InserirObjeto_0= ruleInserirObjeto | this_BuscarObjeto_1= ruleBuscarObjeto | this_ListarObjeto_2= ruleListarObjeto | this_RemoverObjeto_3= ruleRemoverObjeto | this_AtualizarObjeto_4= ruleAtualizarObjeto | this_DeletarTabela_5= ruleDeletarTabela )
            {
            // InternalDaogen2.g:430:2: (this_InserirObjeto_0= ruleInserirObjeto | this_BuscarObjeto_1= ruleBuscarObjeto | this_ListarObjeto_2= ruleListarObjeto | this_RemoverObjeto_3= ruleRemoverObjeto | this_AtualizarObjeto_4= ruleAtualizarObjeto | this_DeletarTabela_5= ruleDeletarTabela )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDaogen2.g:431:3: this_InserirObjeto_0= ruleInserirObjeto
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getInserirObjetoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InserirObjeto_0=ruleInserirObjeto();

                    state._fsp--;


                    			current = this_InserirObjeto_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDaogen2.g:440:3: this_BuscarObjeto_1= ruleBuscarObjeto
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getBuscarObjetoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuscarObjeto_1=ruleBuscarObjeto();

                    state._fsp--;


                    			current = this_BuscarObjeto_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDaogen2.g:449:3: this_ListarObjeto_2= ruleListarObjeto
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getListarObjetoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListarObjeto_2=ruleListarObjeto();

                    state._fsp--;


                    			current = this_ListarObjeto_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDaogen2.g:458:3: this_RemoverObjeto_3= ruleRemoverObjeto
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getRemoverObjetoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoverObjeto_3=ruleRemoverObjeto();

                    state._fsp--;


                    			current = this_RemoverObjeto_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDaogen2.g:467:3: this_AtualizarObjeto_4= ruleAtualizarObjeto
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getAtualizarObjetoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtualizarObjeto_4=ruleAtualizarObjeto();

                    state._fsp--;


                    			current = this_AtualizarObjeto_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDaogen2.g:476:3: this_DeletarTabela_5= ruleDeletarTabela
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getDeletarTabelaParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeletarTabela_5=ruleDeletarTabela();

                    state._fsp--;


                    			current = this_DeletarTabela_5;
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
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleInserirObjeto"
    // InternalDaogen2.g:488:1: entryRuleInserirObjeto returns [EObject current=null] : iv_ruleInserirObjeto= ruleInserirObjeto EOF ;
    public final EObject entryRuleInserirObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInserirObjeto = null;


        try {
            // InternalDaogen2.g:488:54: (iv_ruleInserirObjeto= ruleInserirObjeto EOF )
            // InternalDaogen2.g:489:2: iv_ruleInserirObjeto= ruleInserirObjeto EOF
            {
             newCompositeNode(grammarAccess.getInserirObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInserirObjeto=ruleInserirObjeto();

            state._fsp--;

             current =iv_ruleInserirObjeto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInserirObjeto"


    // $ANTLR start "ruleInserirObjeto"
    // InternalDaogen2.g:495:1: ruleInserirObjeto returns [EObject current=null] : ( () otherlv_1= 'inserir_objeto' ) ;
    public final EObject ruleInserirObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:501:2: ( ( () otherlv_1= 'inserir_objeto' ) )
            // InternalDaogen2.g:502:2: ( () otherlv_1= 'inserir_objeto' )
            {
            // InternalDaogen2.g:502:2: ( () otherlv_1= 'inserir_objeto' )
            // InternalDaogen2.g:503:3: () otherlv_1= 'inserir_objeto'
            {
            // InternalDaogen2.g:503:3: ()
            // InternalDaogen2.g:504:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInserirObjetoAccess().getInserirObjetoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInserirObjetoAccess().getInserir_objetoKeyword_1());
            		

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
    // $ANTLR end "ruleInserirObjeto"


    // $ANTLR start "entryRuleBuscarObjeto"
    // InternalDaogen2.g:518:1: entryRuleBuscarObjeto returns [EObject current=null] : iv_ruleBuscarObjeto= ruleBuscarObjeto EOF ;
    public final EObject entryRuleBuscarObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuscarObjeto = null;


        try {
            // InternalDaogen2.g:518:53: (iv_ruleBuscarObjeto= ruleBuscarObjeto EOF )
            // InternalDaogen2.g:519:2: iv_ruleBuscarObjeto= ruleBuscarObjeto EOF
            {
             newCompositeNode(grammarAccess.getBuscarObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuscarObjeto=ruleBuscarObjeto();

            state._fsp--;

             current =iv_ruleBuscarObjeto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBuscarObjeto"


    // $ANTLR start "ruleBuscarObjeto"
    // InternalDaogen2.g:525:1: ruleBuscarObjeto returns [EObject current=null] : (otherlv_0= 'buscar_objeto,' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBuscarObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:531:2: ( (otherlv_0= 'buscar_objeto,' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDaogen2.g:532:2: (otherlv_0= 'buscar_objeto,' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDaogen2.g:532:2: (otherlv_0= 'buscar_objeto,' ( (otherlv_1= RULE_ID ) ) )
            // InternalDaogen2.g:533:3: otherlv_0= 'buscar_objeto,' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBuscarObjetoAccess().getBuscar_objetoKeyword_0());
            		
            // InternalDaogen2.g:537:3: ( (otherlv_1= RULE_ID ) )
            // InternalDaogen2.g:538:4: (otherlv_1= RULE_ID )
            {
            // InternalDaogen2.g:538:4: (otherlv_1= RULE_ID )
            // InternalDaogen2.g:539:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuscarObjetoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getBuscarObjetoAccess().getAtrAtributoCrossReference_1_0());
            				

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
    // $ANTLR end "ruleBuscarObjeto"


    // $ANTLR start "entryRuleListarObjeto"
    // InternalDaogen2.g:554:1: entryRuleListarObjeto returns [EObject current=null] : iv_ruleListarObjeto= ruleListarObjeto EOF ;
    public final EObject entryRuleListarObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListarObjeto = null;


        try {
            // InternalDaogen2.g:554:53: (iv_ruleListarObjeto= ruleListarObjeto EOF )
            // InternalDaogen2.g:555:2: iv_ruleListarObjeto= ruleListarObjeto EOF
            {
             newCompositeNode(grammarAccess.getListarObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListarObjeto=ruleListarObjeto();

            state._fsp--;

             current =iv_ruleListarObjeto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListarObjeto"


    // $ANTLR start "ruleListarObjeto"
    // InternalDaogen2.g:561:1: ruleListarObjeto returns [EObject current=null] : ( () otherlv_1= 'listar_objeto' ) ;
    public final EObject ruleListarObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:567:2: ( ( () otherlv_1= 'listar_objeto' ) )
            // InternalDaogen2.g:568:2: ( () otherlv_1= 'listar_objeto' )
            {
            // InternalDaogen2.g:568:2: ( () otherlv_1= 'listar_objeto' )
            // InternalDaogen2.g:569:3: () otherlv_1= 'listar_objeto'
            {
            // InternalDaogen2.g:569:3: ()
            // InternalDaogen2.g:570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListarObjetoAccess().getListarObjetoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListarObjetoAccess().getListar_objetoKeyword_1());
            		

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
    // $ANTLR end "ruleListarObjeto"


    // $ANTLR start "entryRuleRemoverObjeto"
    // InternalDaogen2.g:584:1: entryRuleRemoverObjeto returns [EObject current=null] : iv_ruleRemoverObjeto= ruleRemoverObjeto EOF ;
    public final EObject entryRuleRemoverObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoverObjeto = null;


        try {
            // InternalDaogen2.g:584:54: (iv_ruleRemoverObjeto= ruleRemoverObjeto EOF )
            // InternalDaogen2.g:585:2: iv_ruleRemoverObjeto= ruleRemoverObjeto EOF
            {
             newCompositeNode(grammarAccess.getRemoverObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoverObjeto=ruleRemoverObjeto();

            state._fsp--;

             current =iv_ruleRemoverObjeto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRemoverObjeto"


    // $ANTLR start "ruleRemoverObjeto"
    // InternalDaogen2.g:591:1: ruleRemoverObjeto returns [EObject current=null] : (otherlv_0= 'remover_objeto,' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRemoverObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:597:2: ( (otherlv_0= 'remover_objeto,' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDaogen2.g:598:2: (otherlv_0= 'remover_objeto,' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDaogen2.g:598:2: (otherlv_0= 'remover_objeto,' ( (otherlv_1= RULE_ID ) ) )
            // InternalDaogen2.g:599:3: otherlv_0= 'remover_objeto,' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoverObjetoAccess().getRemover_objetoKeyword_0());
            		
            // InternalDaogen2.g:603:3: ( (otherlv_1= RULE_ID ) )
            // InternalDaogen2.g:604:4: (otherlv_1= RULE_ID )
            {
            // InternalDaogen2.g:604:4: (otherlv_1= RULE_ID )
            // InternalDaogen2.g:605:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoverObjetoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRemoverObjetoAccess().getAtrAtributoCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRemoverObjeto"


    // $ANTLR start "entryRuleAtualizarObjeto"
    // InternalDaogen2.g:620:1: entryRuleAtualizarObjeto returns [EObject current=null] : iv_ruleAtualizarObjeto= ruleAtualizarObjeto EOF ;
    public final EObject entryRuleAtualizarObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtualizarObjeto = null;


        try {
            // InternalDaogen2.g:620:56: (iv_ruleAtualizarObjeto= ruleAtualizarObjeto EOF )
            // InternalDaogen2.g:621:2: iv_ruleAtualizarObjeto= ruleAtualizarObjeto EOF
            {
             newCompositeNode(grammarAccess.getAtualizarObjetoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtualizarObjeto=ruleAtualizarObjeto();

            state._fsp--;

             current =iv_ruleAtualizarObjeto; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtualizarObjeto"


    // $ANTLR start "ruleAtualizarObjeto"
    // InternalDaogen2.g:627:1: ruleAtualizarObjeto returns [EObject current=null] : (otherlv_0= 'atualizar_objeto,' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAtualizarObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:633:2: ( (otherlv_0= 'atualizar_objeto,' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDaogen2.g:634:2: (otherlv_0= 'atualizar_objeto,' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDaogen2.g:634:2: (otherlv_0= 'atualizar_objeto,' ( (otherlv_1= RULE_ID ) ) )
            // InternalDaogen2.g:635:3: otherlv_0= 'atualizar_objeto,' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAtualizarObjetoAccess().getAtualizar_objetoKeyword_0());
            		
            // InternalDaogen2.g:639:3: ( (otherlv_1= RULE_ID ) )
            // InternalDaogen2.g:640:4: (otherlv_1= RULE_ID )
            {
            // InternalDaogen2.g:640:4: (otherlv_1= RULE_ID )
            // InternalDaogen2.g:641:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtualizarObjetoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAtualizarObjetoAccess().getAtrAtributoCrossReference_1_0());
            				

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
    // $ANTLR end "ruleAtualizarObjeto"


    // $ANTLR start "entryRuleDeletarTabela"
    // InternalDaogen2.g:656:1: entryRuleDeletarTabela returns [EObject current=null] : iv_ruleDeletarTabela= ruleDeletarTabela EOF ;
    public final EObject entryRuleDeletarTabela() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletarTabela = null;


        try {
            // InternalDaogen2.g:656:54: (iv_ruleDeletarTabela= ruleDeletarTabela EOF )
            // InternalDaogen2.g:657:2: iv_ruleDeletarTabela= ruleDeletarTabela EOF
            {
             newCompositeNode(grammarAccess.getDeletarTabelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletarTabela=ruleDeletarTabela();

            state._fsp--;

             current =iv_ruleDeletarTabela; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeletarTabela"


    // $ANTLR start "ruleDeletarTabela"
    // InternalDaogen2.g:663:1: ruleDeletarTabela returns [EObject current=null] : ( () otherlv_1= 'deletar_tabela' ) ;
    public final EObject ruleDeletarTabela() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDaogen2.g:669:2: ( ( () otherlv_1= 'deletar_tabela' ) )
            // InternalDaogen2.g:670:2: ( () otherlv_1= 'deletar_tabela' )
            {
            // InternalDaogen2.g:670:2: ( () otherlv_1= 'deletar_tabela' )
            // InternalDaogen2.g:671:3: () otherlv_1= 'deletar_tabela'
            {
            // InternalDaogen2.g:671:3: ()
            // InternalDaogen2.g:672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeletarTabelaAccess().getDeletarTabelaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDeletarTabelaAccess().getDeletar_tabelaKeyword_1());
            		

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
    // $ANTLR end "ruleDeletarTabela"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}