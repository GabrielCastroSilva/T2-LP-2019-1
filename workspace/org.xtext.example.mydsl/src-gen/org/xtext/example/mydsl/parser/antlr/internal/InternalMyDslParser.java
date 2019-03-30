package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_definitions_0_0= ruleDefinition ) )* ( (lv_commands_1_0= ruleCommand ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;

        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_definitions_0_0= ruleDefinition ) )* ( (lv_commands_1_0= ruleCommand ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_definitions_0_0= ruleDefinition ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_definitions_0_0= ruleDefinition ) )* ( (lv_commands_1_0= ruleCommand ) )* )
            // InternalMyDsl.g:79:3: ( (lv_definitions_0_0= ruleDefinition ) )* ( (lv_commands_1_0= ruleCommand ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_definitions_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_definitions_0_0= ruleDefinition )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_definitions_0_0= ruleDefinition )
            	    // InternalMyDsl.g:81:5: lv_definitions_0_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_definitions_0_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_commands_1_0= ruleCommand )
            	    // InternalMyDsl.g:100:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Command");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:121:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:121:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:122:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:128:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* otherlv_2= ')' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* otherlv_2= ')' ) )
            // InternalMyDsl.g:135:2: (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* otherlv_2= ')' )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* otherlv_2= ')' )
            // InternalMyDsl.g:136:3: otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:141:4: (lv_commands_1_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:141:4: (lv_commands_1_0= ruleCommand )
            	    // InternalMyDsl.g:142:5: lv_commands_1_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_commands_1_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:167:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:167:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:168:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:174:1: ruleCommand returns [EObject current=null] : this_Subtraction_0= ruleSubtraction ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Subtraction_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:180:2: (this_Subtraction_0= ruleSubtraction )
            // InternalMyDsl.g:181:2: this_Subtraction_0= ruleSubtraction
            {

            		newCompositeNode(grammarAccess.getCommandAccess().getSubtractionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;


            		current = this_Subtraction_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSubtraction"
    // InternalMyDsl.g:192:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalMyDsl.g:192:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalMyDsl.g:193:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
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
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalMyDsl.g:199:1: ruleSubtraction returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Value_2_0= RULE_INT ) ) ( (lv_Value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_Value_2_0=null;
        Token lv_Value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Value_2_0= RULE_INT ) ) ( (lv_Value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:206:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Value_2_0= RULE_INT ) ) ( (lv_Value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:206:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Value_2_0= RULE_INT ) ) ( (lv_Value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:207:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) ( (lv_Value_2_0= RULE_INT ) ) ( (lv_Value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:211:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:212:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:212:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:213:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubtractionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubtractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:229:3: ( (lv_Value_2_0= RULE_INT ) )
            // InternalMyDsl.g:230:4: (lv_Value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:230:4: (lv_Value_2_0= RULE_INT )
            // InternalMyDsl.g:231:5: lv_Value_2_0= RULE_INT
            {
            lv_Value_2_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_Value_2_0, grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubtractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Value",
            						lv_Value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:247:3: ( (lv_Value_3_0= RULE_INT ) )
            // InternalMyDsl.g:248:4: (lv_Value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:248:4: (lv_Value_3_0= RULE_INT )
            // InternalMyDsl.g:249:5: lv_Value_3_0= RULE_INT
            {
            lv_Value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_Value_3_0, grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubtractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Value",
            						lv_Value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleSubtraction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});

}