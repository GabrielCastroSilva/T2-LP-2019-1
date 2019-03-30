package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDefinition EOF )
            // InternalMyDsl.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:87:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Definition__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Definition__Group__0 )
            // InternalMyDsl.g:94:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCommand EOF )
            // InternalMyDsl.g:105:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:112:1: ruleCommand : ( ruleSubtraction ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ruleSubtraction ) )
            // InternalMyDsl.g:117:2: ( ruleSubtraction )
            {
            // InternalMyDsl.g:117:2: ( ruleSubtraction )
            // InternalMyDsl.g:118:3: ruleSubtraction
            {
             before(grammarAccess.getCommandAccess().getSubtractionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getSubtractionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleSubtraction"
    // InternalMyDsl.g:128:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSubtraction EOF )
            // InternalMyDsl.g:130:1: ruleSubtraction EOF
            {
             before(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getSubtractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalMyDsl.g:137:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Subtraction__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Subtraction__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Subtraction__Group__0 )
            {
             before(grammarAccess.getSubtractionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Subtraction__Group__0 )
            // InternalMyDsl.g:144:4: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:157:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefinitionsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ( rule__Model__DefinitionsAssignment_0 )* ) )
            // InternalMyDsl.g:169:1: ( ( rule__Model__DefinitionsAssignment_0 )* )
            {
            // InternalMyDsl.g:169:1: ( ( rule__Model__DefinitionsAssignment_0 )* )
            // InternalMyDsl.g:170:2: ( rule__Model__DefinitionsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_0()); 
            // InternalMyDsl.g:171:2: ( rule__Model__DefinitionsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:171:3: rule__Model__DefinitionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DefinitionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinitionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:179:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:184:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:190:1: rule__Model__Group__1__Impl : ( ( rule__Model__CommandsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:194:1: ( ( ( rule__Model__CommandsAssignment_1 )* ) )
            // InternalMyDsl.g:195:1: ( ( rule__Model__CommandsAssignment_1 )* )
            {
            // InternalMyDsl.g:195:1: ( ( rule__Model__CommandsAssignment_1 )* )
            // InternalMyDsl.g:196:2: ( rule__Model__CommandsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment_1()); 
            // InternalMyDsl.g:197:2: ( rule__Model__CommandsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:197:3: rule__Model__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalMyDsl.g:206:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalMyDsl.g:211:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalMyDsl.g:218:1: rule__Definition__Group__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( '(' ) )
            // InternalMyDsl.g:223:1: ( '(' )
            {
            // InternalMyDsl.g:223:1: ( '(' )
            // InternalMyDsl.g:224:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalMyDsl.g:233:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalMyDsl.g:238:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalMyDsl.g:245:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__CommandsAssignment_1 )* ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:249:1: ( ( ( rule__Definition__CommandsAssignment_1 )* ) )
            // InternalMyDsl.g:250:1: ( ( rule__Definition__CommandsAssignment_1 )* )
            {
            // InternalMyDsl.g:250:1: ( ( rule__Definition__CommandsAssignment_1 )* )
            // InternalMyDsl.g:251:2: ( rule__Definition__CommandsAssignment_1 )*
            {
             before(grammarAccess.getDefinitionAccess().getCommandsAssignment_1()); 
            // InternalMyDsl.g:252:2: ( rule__Definition__CommandsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:252:3: rule__Definition__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Definition__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getCommandsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalMyDsl.g:260:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Definition__Group__2__Impl )
            // InternalMyDsl.g:265:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalMyDsl.g:271:1: rule__Definition__Group__2__Impl : ( ')' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( ( ')' ) )
            // InternalMyDsl.g:276:1: ( ')' )
            {
            // InternalMyDsl.g:276:1: ( ')' )
            // InternalMyDsl.g:277:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // InternalMyDsl.g:287:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // InternalMyDsl.g:292:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0"


    // $ANTLR start "rule__Subtraction__Group__0__Impl"
    // InternalMyDsl.g:299:1: rule__Subtraction__Group__0__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( '-' ) )
            // InternalMyDsl.g:304:1: ( '-' )
            {
            // InternalMyDsl.g:304:1: ( '-' )
            // InternalMyDsl.g:305:2: '-'
            {
             before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // InternalMyDsl.g:314:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2 ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2 )
            // InternalMyDsl.g:319:2: rule__Subtraction__Group__1__Impl rule__Subtraction__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Subtraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1"


    // $ANTLR start "rule__Subtraction__Group__1__Impl"
    // InternalMyDsl.g:326:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__NameAssignment_1 ) ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( ( rule__Subtraction__NameAssignment_1 ) ) )
            // InternalMyDsl.g:331:1: ( ( rule__Subtraction__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:331:1: ( ( rule__Subtraction__NameAssignment_1 ) )
            // InternalMyDsl.g:332:2: ( rule__Subtraction__NameAssignment_1 )
            {
             before(grammarAccess.getSubtractionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:333:2: ( rule__Subtraction__NameAssignment_1 )
            // InternalMyDsl.g:333:3: rule__Subtraction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group__2"
    // InternalMyDsl.g:341:1: rule__Subtraction__Group__2 : rule__Subtraction__Group__2__Impl rule__Subtraction__Group__3 ;
    public final void rule__Subtraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__Subtraction__Group__2__Impl rule__Subtraction__Group__3 )
            // InternalMyDsl.g:346:2: rule__Subtraction__Group__2__Impl rule__Subtraction__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Subtraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__2"


    // $ANTLR start "rule__Subtraction__Group__2__Impl"
    // InternalMyDsl.g:353:1: rule__Subtraction__Group__2__Impl : ( ( rule__Subtraction__ValueAssignment_2 ) ) ;
    public final void rule__Subtraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__Subtraction__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:358:1: ( ( rule__Subtraction__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:358:1: ( ( rule__Subtraction__ValueAssignment_2 ) )
            // InternalMyDsl.g:359:2: ( rule__Subtraction__ValueAssignment_2 )
            {
             before(grammarAccess.getSubtractionAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:360:2: ( rule__Subtraction__ValueAssignment_2 )
            // InternalMyDsl.g:360:3: rule__Subtraction__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__2__Impl"


    // $ANTLR start "rule__Subtraction__Group__3"
    // InternalMyDsl.g:368:1: rule__Subtraction__Group__3 : rule__Subtraction__Group__3__Impl ;
    public final void rule__Subtraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Subtraction__Group__3__Impl )
            // InternalMyDsl.g:373:2: rule__Subtraction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__3"


    // $ANTLR start "rule__Subtraction__Group__3__Impl"
    // InternalMyDsl.g:379:1: rule__Subtraction__Group__3__Impl : ( ( rule__Subtraction__ValueAssignment_3 ) ) ;
    public final void rule__Subtraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( ( rule__Subtraction__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:384:1: ( ( rule__Subtraction__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:384:1: ( ( rule__Subtraction__ValueAssignment_3 ) )
            // InternalMyDsl.g:385:2: ( rule__Subtraction__ValueAssignment_3 )
            {
             before(grammarAccess.getSubtractionAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:386:2: ( rule__Subtraction__ValueAssignment_3 )
            // InternalMyDsl.g:386:3: rule__Subtraction__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__3__Impl"


    // $ANTLR start "rule__Model__DefinitionsAssignment_0"
    // InternalMyDsl.g:395:1: rule__Model__DefinitionsAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Model__DefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:400:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:400:2: ( ruleDefinition )
            // InternalMyDsl.g:401:3: ruleDefinition
            {
             before(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionsDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefinitionsAssignment_0"


    // $ANTLR start "rule__Model__CommandsAssignment_1"
    // InternalMyDsl.g:410:1: rule__Model__CommandsAssignment_1 : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:415:2: ( ruleCommand )
            {
            // InternalMyDsl.g:415:2: ( ruleCommand )
            // InternalMyDsl.g:416:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommandsAssignment_1"


    // $ANTLR start "rule__Definition__CommandsAssignment_1"
    // InternalMyDsl.g:425:1: rule__Definition__CommandsAssignment_1 : ( ruleCommand ) ;
    public final void rule__Definition__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:430:2: ( ruleCommand )
            {
            // InternalMyDsl.g:430:2: ( ruleCommand )
            // InternalMyDsl.g:431:3: ruleCommand
            {
             before(grammarAccess.getDefinitionAccess().getCommandsCommandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCommandsCommandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CommandsAssignment_1"


    // $ANTLR start "rule__Subtraction__NameAssignment_1"
    // InternalMyDsl.g:440:1: rule__Subtraction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Subtraction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:444:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:445:2: ( RULE_ID )
            {
            // InternalMyDsl.g:445:2: ( RULE_ID )
            // InternalMyDsl.g:446:3: RULE_ID
            {
             before(grammarAccess.getSubtractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__NameAssignment_1"


    // $ANTLR start "rule__Subtraction__ValueAssignment_2"
    // InternalMyDsl.g:455:1: rule__Subtraction__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Subtraction__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:460:2: ( RULE_INT )
            {
            // InternalMyDsl.g:460:2: ( RULE_INT )
            // InternalMyDsl.g:461:3: RULE_INT
            {
             before(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__ValueAssignment_2"


    // $ANTLR start "rule__Subtraction__ValueAssignment_3"
    // InternalMyDsl.g:470:1: rule__Subtraction__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Subtraction__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:475:2: ( RULE_INT )
            {
            // InternalMyDsl.g:475:2: ( RULE_INT )
            // InternalMyDsl.g:476:3: RULE_INT
            {
             before(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}