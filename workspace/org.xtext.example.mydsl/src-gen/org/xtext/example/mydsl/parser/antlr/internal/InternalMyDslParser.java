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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'-'", "'sub'", "'subtraction'", "'+'", "'add'", "'addition'", "'*'", "'mult'", "'multiplication'", "'/'", "'div'", "'division'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( ((LA2_0>=13 && LA2_0<=24)) ) {
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
    // InternalMyDsl.g:128:1: ruleDefinition returns [EObject current=null] : (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        EObject lv_commands_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:135:2: (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalMyDsl.g:136:3: otherlv_0= '(' ( (lv_commands_1_0= ruleCommand ) )* ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_commands_1_0= ruleCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=24)) ) {
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

            // InternalMyDsl.g:159:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:160:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:160:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:161:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDefinitionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3());
            		

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
    // InternalMyDsl.g:185:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:185:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:186:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDsl.g:192:1: ruleCommand returns [EObject current=null] : (this_Subtraction_0= ruleSubtraction | this_Addition_1= ruleAddition | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Subtraction_0 = null;

        EObject this_Addition_1 = null;

        EObject this_Multiplication_2 = null;

        EObject this_Division_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:198:2: ( (this_Subtraction_0= ruleSubtraction | this_Addition_1= ruleAddition | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision ) )
            // InternalMyDsl.g:199:2: (this_Subtraction_0= ruleSubtraction | this_Addition_1= ruleAddition | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision )
            {
            // InternalMyDsl.g:199:2: (this_Subtraction_0= ruleSubtraction | this_Addition_1= ruleAddition | this_Multiplication_2= ruleMultiplication | this_Division_3= ruleDivision )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
            case 17:
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:200:3: this_Subtraction_0= ruleSubtraction
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getSubtractionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subtraction_0=ruleSubtraction();

                    state._fsp--;


                    			current = this_Subtraction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:209:3: this_Addition_1= ruleAddition
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAdditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Addition_1=ruleAddition();

                    state._fsp--;


                    			current = this_Addition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:218:3: this_Multiplication_2= ruleMultiplication
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getMultiplicationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Multiplication_2=ruleMultiplication();

                    state._fsp--;


                    			current = this_Multiplication_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:227:3: this_Division_3= ruleDivision
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDivisionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Division_3=ruleDivision();

                    state._fsp--;


                    			current = this_Division_3;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSubtraction"
    // InternalMyDsl.g:239:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalMyDsl.g:239:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalMyDsl.g:240:2: iv_ruleSubtraction= ruleSubtraction EOF
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
    // InternalMyDsl.g:246:1: ruleSubtraction returns [EObject current=null] : ( (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:252:2: ( ( (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:253:2: ( (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:253:2: ( (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:254:3: (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalMyDsl.g:254:3: (otherlv_0= '-' | otherlv_1= 'sub' | otherlv_2= 'subtraction' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:255:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:260:4: otherlv_1= 'sub'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubtractionAccess().getSubKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:265:4: otherlv_2= 'subtraction'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getSubtractionKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:270:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:271:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:271:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:272:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubtractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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


    // $ANTLR start "entryRuleAddition"
    // InternalMyDsl.g:292:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalMyDsl.g:292:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalMyDsl.g:293:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMyDsl.g:299:1: ruleAddition returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:305:2: ( ( (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:306:2: ( (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:306:2: ( (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:307:3: (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalMyDsl.g:307:3: (otherlv_0= '+' | otherlv_1= 'add' | otherlv_2= 'addition' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
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
                    // InternalMyDsl.g:308:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAdditionAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:4: otherlv_1= 'add'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getAdditionAccess().getAddKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:318:4: otherlv_2= 'addition'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getAdditionKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:323:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:324:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:324:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:325:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAdditionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMyDsl.g:345:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalMyDsl.g:345:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalMyDsl.g:346:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMyDsl.g:352:1: ruleMultiplication returns [EObject current=null] : ( (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:358:2: ( ( (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:359:2: ( (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:359:2: ( (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:360:3: (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalMyDsl.g:360:3: (otherlv_0= '*' | otherlv_1= 'mult' | otherlv_2= 'multiplication' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:361:4: otherlv_0= '*'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:366:4: otherlv_1= 'mult'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getMultiplicationAccess().getMultKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:371:4: otherlv_2= 'multiplication'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getMultiplicationKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:376:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:377:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:377:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:378:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getMultiplicationAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalMyDsl.g:398:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // InternalMyDsl.g:398:49: (iv_ruleDivision= ruleDivision EOF )
            // InternalMyDsl.g:399:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalMyDsl.g:405:1: ruleDivision returns [EObject current=null] : ( (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( ( (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:412:2: ( (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:412:2: ( (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:413:3: (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalMyDsl.g:413:3: (otherlv_0= '/' | otherlv_1= 'div' | otherlv_2= 'division' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:414:4: otherlv_0= '/'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDivisionAccess().getSolidusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:419:4: otherlv_1= 'div'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getDivisionAccess().getDivKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:424:4: otherlv_2= 'division'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getDivisionKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:429:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalMyDsl.g:430:4: (lv_value_3_0= RULE_INT )
            {
            // InternalMyDsl.g:430:4: (lv_value_3_0= RULE_INT )
            // InternalMyDsl.g:431:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getDivisionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleDivision"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FFE802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FFE002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FFE010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});

}