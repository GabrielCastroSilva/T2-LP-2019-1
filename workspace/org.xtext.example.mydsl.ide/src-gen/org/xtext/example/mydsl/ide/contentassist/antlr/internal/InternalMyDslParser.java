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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'sub'", "'subtraction'", "'+'", "'add'", "'addition'", "'*'", "'mult'", "'multiplication'", "'/'", "'div'", "'division'", "'('", "')'"
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
    // InternalMyDsl.g:112:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Command__Alternatives )
            // InternalMyDsl.g:119:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleAddition"
    // InternalMyDsl.g:153:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAddition EOF )
            // InternalMyDsl.g:155:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMyDsl.g:162:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Addition__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Addition__Group__0 )
            // InternalMyDsl.g:169:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMyDsl.g:178:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleMultiplication EOF )
            // InternalMyDsl.g:180:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMyDsl.g:187:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Multiplication__Group__0 )
            // InternalMyDsl.g:194:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleDivision"
    // InternalMyDsl.g:203:1: entryRuleDivision : ruleDivision EOF ;
    public final void entryRuleDivision() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleDivision EOF )
            // InternalMyDsl.g:205:1: ruleDivision EOF
            {
             before(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleDivision();

            state._fsp--;

             after(grammarAccess.getDivisionRule()); 
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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // InternalMyDsl.g:212:1: ruleDivision : ( ( rule__Division__Group__0 ) ) ;
    public final void ruleDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Division__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Division__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Division__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Division__Group__0 )
            {
             before(grammarAccess.getDivisionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Division__Group__0 )
            // InternalMyDsl.g:219:4: rule__Division__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getGroup()); 

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
    // $ANTLR end "ruleDivision"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:227:1: rule__Command__Alternatives : ( ( ruleSubtraction ) | ( ruleAddition ) | ( ruleMultiplication ) | ( ruleDivision ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ruleSubtraction ) | ( ruleAddition ) | ( ruleMultiplication ) | ( ruleDivision ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:232:2: ( ruleSubtraction )
                    {
                    // InternalMyDsl.g:232:2: ( ruleSubtraction )
                    // InternalMyDsl.g:233:3: ruleSubtraction
                    {
                     before(grammarAccess.getCommandAccess().getSubtractionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSubtraction();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getSubtractionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:238:2: ( ruleAddition )
                    {
                    // InternalMyDsl.g:238:2: ( ruleAddition )
                    // InternalMyDsl.g:239:3: ruleAddition
                    {
                     before(grammarAccess.getCommandAccess().getAdditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddition();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getAdditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:244:2: ( ruleMultiplication )
                    {
                    // InternalMyDsl.g:244:2: ( ruleMultiplication )
                    // InternalMyDsl.g:245:3: ruleMultiplication
                    {
                     before(grammarAccess.getCommandAccess().getMultiplicationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiplication();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMultiplicationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:250:2: ( ruleDivision )
                    {
                    // InternalMyDsl.g:250:2: ( ruleDivision )
                    // InternalMyDsl.g:251:3: ruleDivision
                    {
                     before(grammarAccess.getCommandAccess().getDivisionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDivision();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDivisionParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Subtraction__Alternatives_0"
    // InternalMyDsl.g:260:1: rule__Subtraction__Alternatives_0 : ( ( '-' ) | ( 'sub' ) | ( 'subtraction' ) );
    public final void rule__Subtraction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( ( '-' ) | ( 'sub' ) | ( 'subtraction' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:265:2: ( '-' )
                    {
                    // InternalMyDsl.g:265:2: ( '-' )
                    // InternalMyDsl.g:266:3: '-'
                    {
                     before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:271:2: ( 'sub' )
                    {
                    // InternalMyDsl.g:271:2: ( 'sub' )
                    // InternalMyDsl.g:272:3: 'sub'
                    {
                     before(grammarAccess.getSubtractionAccess().getSubKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSubtractionAccess().getSubKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:277:2: ( 'subtraction' )
                    {
                    // InternalMyDsl.g:277:2: ( 'subtraction' )
                    // InternalMyDsl.g:278:3: 'subtraction'
                    {
                     before(grammarAccess.getSubtractionAccess().getSubtractionKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSubtractionAccess().getSubtractionKeyword_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Subtraction__Alternatives_0"


    // $ANTLR start "rule__Addition__Alternatives_0"
    // InternalMyDsl.g:287:1: rule__Addition__Alternatives_0 : ( ( '+' ) | ( 'add' ) | ( 'addition' ) );
    public final void rule__Addition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( ( '+' ) | ( 'add' ) | ( 'addition' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:292:2: ( '+' )
                    {
                    // InternalMyDsl.g:292:2: ( '+' )
                    // InternalMyDsl.g:293:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getPlusSignKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:298:2: ( 'add' )
                    {
                    // InternalMyDsl.g:298:2: ( 'add' )
                    // InternalMyDsl.g:299:3: 'add'
                    {
                     before(grammarAccess.getAdditionAccess().getAddKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getAddKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:304:2: ( 'addition' )
                    {
                    // InternalMyDsl.g:304:2: ( 'addition' )
                    // InternalMyDsl.g:305:3: 'addition'
                    {
                     before(grammarAccess.getAdditionAccess().getAdditionKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getAdditionKeyword_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Addition__Alternatives_0"


    // $ANTLR start "rule__Multiplication__Alternatives_0"
    // InternalMyDsl.g:314:1: rule__Multiplication__Alternatives_0 : ( ( '*' ) | ( 'mult' ) | ( 'multiplication' ) );
    public final void rule__Multiplication__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( ( '*' ) | ( 'mult' ) | ( 'multiplication' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:319:2: ( '*' )
                    {
                    // InternalMyDsl.g:319:2: ( '*' )
                    // InternalMyDsl.g:320:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:325:2: ( 'mult' )
                    {
                    // InternalMyDsl.g:325:2: ( 'mult' )
                    // InternalMyDsl.g:326:3: 'mult'
                    {
                     before(grammarAccess.getMultiplicationAccess().getMultKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getMultKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:331:2: ( 'multiplication' )
                    {
                    // InternalMyDsl.g:331:2: ( 'multiplication' )
                    // InternalMyDsl.g:332:3: 'multiplication'
                    {
                     before(grammarAccess.getMultiplicationAccess().getMultiplicationKeyword_0_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getMultiplicationKeyword_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Multiplication__Alternatives_0"


    // $ANTLR start "rule__Division__Alternatives_0"
    // InternalMyDsl.g:341:1: rule__Division__Alternatives_0 : ( ( '/' ) | ( 'div' ) | ( 'division' ) );
    public final void rule__Division__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( '/' ) | ( 'div' ) | ( 'division' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:346:2: ( '/' )
                    {
                    // InternalMyDsl.g:346:2: ( '/' )
                    // InternalMyDsl.g:347:3: '/'
                    {
                     before(grammarAccess.getDivisionAccess().getSolidusKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDivisionAccess().getSolidusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:352:2: ( 'div' )
                    {
                    // InternalMyDsl.g:352:2: ( 'div' )
                    // InternalMyDsl.g:353:3: 'div'
                    {
                     before(grammarAccess.getDivisionAccess().getDivKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getDivisionAccess().getDivKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:358:2: ( 'division' )
                    {
                    // InternalMyDsl.g:358:2: ( 'division' )
                    // InternalMyDsl.g:359:3: 'division'
                    {
                     before(grammarAccess.getDivisionAccess().getDivisionKeyword_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getDivisionAccess().getDivisionKeyword_0_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Division__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:368:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:373:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:380:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefinitionsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( ( ( rule__Model__DefinitionsAssignment_0 )* ) )
            // InternalMyDsl.g:385:1: ( ( rule__Model__DefinitionsAssignment_0 )* )
            {
            // InternalMyDsl.g:385:1: ( ( rule__Model__DefinitionsAssignment_0 )* )
            // InternalMyDsl.g:386:2: ( rule__Model__DefinitionsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefinitionsAssignment_0()); 
            // InternalMyDsl.g:387:2: ( rule__Model__DefinitionsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:387:3: rule__Model__DefinitionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DefinitionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:395:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:400:2: rule__Model__Group__1__Impl
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
    // InternalMyDsl.g:406:1: rule__Model__Group__1__Impl : ( ( rule__Model__CommandsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( ( ( rule__Model__CommandsAssignment_1 )* ) )
            // InternalMyDsl.g:411:1: ( ( rule__Model__CommandsAssignment_1 )* )
            {
            // InternalMyDsl.g:411:1: ( ( rule__Model__CommandsAssignment_1 )* )
            // InternalMyDsl.g:412:2: ( rule__Model__CommandsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment_1()); 
            // InternalMyDsl.g:413:2: ( rule__Model__CommandsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:413:3: rule__Model__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:422:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalMyDsl.g:427:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
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
    // InternalMyDsl.g:434:1: rule__Definition__Group__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( '(' ) )
            // InternalMyDsl.g:439:1: ( '(' )
            {
            // InternalMyDsl.g:439:1: ( '(' )
            // InternalMyDsl.g:440:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:449:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalMyDsl.g:454:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
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
    // InternalMyDsl.g:461:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__CommandsAssignment_1 )* ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( ( rule__Definition__CommandsAssignment_1 )* ) )
            // InternalMyDsl.g:466:1: ( ( rule__Definition__CommandsAssignment_1 )* )
            {
            // InternalMyDsl.g:466:1: ( ( rule__Definition__CommandsAssignment_1 )* )
            // InternalMyDsl.g:467:2: ( rule__Definition__CommandsAssignment_1 )*
            {
             before(grammarAccess.getDefinitionAccess().getCommandsAssignment_1()); 
            // InternalMyDsl.g:468:2: ( rule__Definition__CommandsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:468:3: rule__Definition__CommandsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Definition__CommandsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:476:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalMyDsl.g:481:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__3();

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
    // InternalMyDsl.g:488:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__ValueAssignment_2 ) ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Definition__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Definition__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Definition__ValueAssignment_2 ) )
            // InternalMyDsl.g:494:2: ( rule__Definition__ValueAssignment_2 )
            {
             before(grammarAccess.getDefinitionAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:495:2: ( rule__Definition__ValueAssignment_2 )
            // InternalMyDsl.g:495:3: rule__Definition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getValueAssignment_2()); 

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


    // $ANTLR start "rule__Definition__Group__3"
    // InternalMyDsl.g:503:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Definition__Group__3__Impl )
            // InternalMyDsl.g:508:2: rule__Definition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__3__Impl();

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
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // InternalMyDsl.g:514:1: rule__Definition__Group__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( ( ')' ) )
            // InternalMyDsl.g:519:1: ( ')' )
            {
            // InternalMyDsl.g:519:1: ( ')' )
            // InternalMyDsl.g:520:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // InternalMyDsl.g:530:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // InternalMyDsl.g:535:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:542:1: rule__Subtraction__Group__0__Impl : ( ( rule__Subtraction__Alternatives_0 ) ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ( rule__Subtraction__Alternatives_0 ) ) )
            // InternalMyDsl.g:547:1: ( ( rule__Subtraction__Alternatives_0 ) )
            {
            // InternalMyDsl.g:547:1: ( ( rule__Subtraction__Alternatives_0 ) )
            // InternalMyDsl.g:548:2: ( rule__Subtraction__Alternatives_0 )
            {
             before(grammarAccess.getSubtractionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:549:2: ( rule__Subtraction__Alternatives_0 )
            // InternalMyDsl.g:549:3: rule__Subtraction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getAlternatives_0()); 

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
    // InternalMyDsl.g:557:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Subtraction__Group__1__Impl )
            // InternalMyDsl.g:562:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1__Impl();

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
    // InternalMyDsl.g:568:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__ValueAssignment_1 ) ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( ( ( rule__Subtraction__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:573:1: ( ( rule__Subtraction__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:573:1: ( ( rule__Subtraction__ValueAssignment_1 ) )
            // InternalMyDsl.g:574:2: ( rule__Subtraction__ValueAssignment_1 )
            {
             before(grammarAccess.getSubtractionAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:575:2: ( rule__Subtraction__ValueAssignment_1 )
            // InternalMyDsl.g:575:3: rule__Subtraction__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__Addition__Group__0"
    // InternalMyDsl.g:584:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMyDsl.g:589:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalMyDsl.g:596:1: rule__Addition__Group__0__Impl : ( ( rule__Addition__Alternatives_0 ) ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( ( rule__Addition__Alternatives_0 ) ) )
            // InternalMyDsl.g:601:1: ( ( rule__Addition__Alternatives_0 ) )
            {
            // InternalMyDsl.g:601:1: ( ( rule__Addition__Alternatives_0 ) )
            // InternalMyDsl.g:602:2: ( rule__Addition__Alternatives_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:603:2: ( rule__Addition__Alternatives_0 )
            // InternalMyDsl.g:603:3: rule__Addition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalMyDsl.g:611:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__Addition__Group__1__Impl )
            // InternalMyDsl.g:616:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalMyDsl.g:622:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__ValueAssignment_1 ) ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( ( ( rule__Addition__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:627:1: ( ( rule__Addition__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:627:1: ( ( rule__Addition__ValueAssignment_1 ) )
            // InternalMyDsl.g:628:2: ( rule__Addition__ValueAssignment_1 )
            {
             before(grammarAccess.getAdditionAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:629:2: ( rule__Addition__ValueAssignment_1 )
            // InternalMyDsl.g:629:3: rule__Addition__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalMyDsl.g:638:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMyDsl.g:643:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalMyDsl.g:650:1: rule__Multiplication__Group__0__Impl : ( ( rule__Multiplication__Alternatives_0 ) ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( ( ( rule__Multiplication__Alternatives_0 ) ) )
            // InternalMyDsl.g:655:1: ( ( rule__Multiplication__Alternatives_0 ) )
            {
            // InternalMyDsl.g:655:1: ( ( rule__Multiplication__Alternatives_0 ) )
            // InternalMyDsl.g:656:2: ( rule__Multiplication__Alternatives_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_0()); 
            // InternalMyDsl.g:657:2: ( rule__Multiplication__Alternatives_0 )
            // InternalMyDsl.g:657:3: rule__Multiplication__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalMyDsl.g:665:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMyDsl.g:670:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalMyDsl.g:676:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__ValueAssignment_1 ) ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( ( ( rule__Multiplication__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:681:1: ( ( rule__Multiplication__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:681:1: ( ( rule__Multiplication__ValueAssignment_1 ) )
            // InternalMyDsl.g:682:2: ( rule__Multiplication__ValueAssignment_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:683:2: ( rule__Multiplication__ValueAssignment_1 )
            // InternalMyDsl.g:683:3: rule__Multiplication__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Division__Group__0"
    // InternalMyDsl.g:692:1: rule__Division__Group__0 : rule__Division__Group__0__Impl rule__Division__Group__1 ;
    public final void rule__Division__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( rule__Division__Group__0__Impl rule__Division__Group__1 )
            // InternalMyDsl.g:697:2: rule__Division__Group__0__Impl rule__Division__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Division__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Division__Group__1();

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
    // $ANTLR end "rule__Division__Group__0"


    // $ANTLR start "rule__Division__Group__0__Impl"
    // InternalMyDsl.g:704:1: rule__Division__Group__0__Impl : ( ( rule__Division__Alternatives_0 ) ) ;
    public final void rule__Division__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( ( ( rule__Division__Alternatives_0 ) ) )
            // InternalMyDsl.g:709:1: ( ( rule__Division__Alternatives_0 ) )
            {
            // InternalMyDsl.g:709:1: ( ( rule__Division__Alternatives_0 ) )
            // InternalMyDsl.g:710:2: ( rule__Division__Alternatives_0 )
            {
             before(grammarAccess.getDivisionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:711:2: ( rule__Division__Alternatives_0 )
            // InternalMyDsl.g:711:3: rule__Division__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Division__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Division__Group__0__Impl"


    // $ANTLR start "rule__Division__Group__1"
    // InternalMyDsl.g:719:1: rule__Division__Group__1 : rule__Division__Group__1__Impl ;
    public final void rule__Division__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( rule__Division__Group__1__Impl )
            // InternalMyDsl.g:724:2: rule__Division__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Division__Group__1__Impl();

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
    // $ANTLR end "rule__Division__Group__1"


    // $ANTLR start "rule__Division__Group__1__Impl"
    // InternalMyDsl.g:730:1: rule__Division__Group__1__Impl : ( ( rule__Division__ValueAssignment_1 ) ) ;
    public final void rule__Division__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( ( rule__Division__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:735:1: ( ( rule__Division__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:735:1: ( ( rule__Division__ValueAssignment_1 ) )
            // InternalMyDsl.g:736:2: ( rule__Division__ValueAssignment_1 )
            {
             before(grammarAccess.getDivisionAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:737:2: ( rule__Division__ValueAssignment_1 )
            // InternalMyDsl.g:737:3: rule__Division__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Division__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDivisionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Division__Group__1__Impl"


    // $ANTLR start "rule__Model__DefinitionsAssignment_0"
    // InternalMyDsl.g:746:1: rule__Model__DefinitionsAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Model__DefinitionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:751:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:751:2: ( ruleDefinition )
            // InternalMyDsl.g:752:3: ruleDefinition
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
    // InternalMyDsl.g:761:1: rule__Model__CommandsAssignment_1 : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:766:2: ( ruleCommand )
            {
            // InternalMyDsl.g:766:2: ( ruleCommand )
            // InternalMyDsl.g:767:3: ruleCommand
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
    // InternalMyDsl.g:776:1: rule__Definition__CommandsAssignment_1 : ( ruleCommand ) ;
    public final void rule__Definition__CommandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:781:2: ( ruleCommand )
            {
            // InternalMyDsl.g:781:2: ( ruleCommand )
            // InternalMyDsl.g:782:3: ruleCommand
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


    // $ANTLR start "rule__Definition__ValueAssignment_2"
    // InternalMyDsl.g:791:1: rule__Definition__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Definition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:796:2: ( RULE_INT )
            {
            // InternalMyDsl.g:796:2: ( RULE_INT )
            // InternalMyDsl.g:797:3: RULE_INT
            {
             before(grammarAccess.getDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getValueINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Definition__ValueAssignment_2"


    // $ANTLR start "rule__Subtraction__ValueAssignment_1"
    // InternalMyDsl.g:806:1: rule__Subtraction__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Subtraction__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:811:2: ( RULE_INT )
            {
            // InternalMyDsl.g:811:2: ( RULE_INT )
            // InternalMyDsl.g:812:3: RULE_INT
            {
             before(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subtraction__ValueAssignment_1"


    // $ANTLR start "rule__Addition__ValueAssignment_1"
    // InternalMyDsl.g:821:1: rule__Addition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Addition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:826:2: ( RULE_INT )
            {
            // InternalMyDsl.g:826:2: ( RULE_INT )
            // InternalMyDsl.g:827:3: RULE_INT
            {
             before(grammarAccess.getAdditionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Addition__ValueAssignment_1"


    // $ANTLR start "rule__Multiplication__ValueAssignment_1"
    // InternalMyDsl.g:836:1: rule__Multiplication__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Multiplication__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:841:2: ( RULE_INT )
            {
            // InternalMyDsl.g:841:2: ( RULE_INT )
            // InternalMyDsl.g:842:3: RULE_INT
            {
             before(grammarAccess.getMultiplicationAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Multiplication__ValueAssignment_1"


    // $ANTLR start "rule__Division__ValueAssignment_1"
    // InternalMyDsl.g:851:1: rule__Division__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Division__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:856:2: ( RULE_INT )
            {
            // InternalMyDsl.g:856:2: ( RULE_INT )
            // InternalMyDsl.g:857:3: RULE_INT
            {
             before(grammarAccess.getDivisionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDivisionAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Division__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007FF802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007FF810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}