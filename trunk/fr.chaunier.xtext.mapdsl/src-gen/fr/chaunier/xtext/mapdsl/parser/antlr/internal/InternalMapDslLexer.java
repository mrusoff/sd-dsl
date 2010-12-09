package fr.chaunier.xtext.mapdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=28;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalMapDslLexer() {;} 
    public InternalMapDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:10:5: ( 'model' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:10:7: 'model'
            {
            match("model"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:11:5: ( '.' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:11:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:12:5: ( 'root' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:12:7: 'root'
            {
            match("root"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:13:5: ( 'module' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:13:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:14:5: ( '{' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:14:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:15:5: ( ';' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:15:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:16:5: ( '}' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:17:5: ( 'map' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:17:7: 'map'
            {
            match("map"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:18:5: ( ',' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:18:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:19:5: ( '=>' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:19:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:20:5: ( 'set left' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:20:7: 'set left'
            {
            match("set left"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:21:5: ( '=' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:21:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:22:5: ( 'set right' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:22:7: 'set right'
            {
            match("set right"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:23:5: ( 'ignore left' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:23:7: 'ignore left'
            {
            match("ignore left"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:24:5: ( 'ignore right' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:24:7: 'ignore right'
            {
            match("ignore right"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:25:5: ( 'call module' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:25:7: 'call module'
            {
            match("call module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:26:5: ( 'rule' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:26:7: 'rule'
            {
            match("rule"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:874:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:874:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:874:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:874:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:874:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:876:10: ( ( '0' .. '9' )+ )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:876:12: ( '0' .. '9' )+
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:876:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:876:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("878:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:878:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:880:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:880:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:880:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:880:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:882:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:884:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:884:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:886:16: ( . )
            // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:886:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='d') ) {
                    switch ( input.LA(4) ) {
                    case 'u':
                        {
                        int LA12_47 = input.LA(5);

                        if ( (LA12_47=='l') ) {
                            int LA12_55 = input.LA(6);

                            if ( (LA12_55=='e') ) {
                                int LA12_63 = input.LA(7);

                                if ( ((LA12_63>='0' && LA12_63<='9')||(LA12_63>='A' && LA12_63<='Z')||LA12_63=='_'||(LA12_63>='a' && LA12_63<='z')) ) {
                                    alt12=18;
                                }
                                else {
                                    alt12=4;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                        }
                        break;
                    case 'e':
                        {
                        int LA12_48 = input.LA(5);

                        if ( (LA12_48=='l') ) {
                            int LA12_56 = input.LA(6);

                            if ( ((LA12_56>='0' && LA12_56<='9')||(LA12_56>='A' && LA12_56<='Z')||LA12_56=='_'||(LA12_56>='a' && LA12_56<='z')) ) {
                                alt12=18;
                            }
                            else {
                                alt12=1;}
                        }
                        else {
                            alt12=18;}
                        }
                        break;
                    default:
                        alt12=18;}

                }
                else {
                    alt12=18;}
                }
                break;
            case 'a':
                {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='p') ) {
                    int LA12_41 = input.LA(4);

                    if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                        alt12=18;
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=18;}
                }
                break;
            default:
                alt12=18;}

        }
        else if ( (LA12_0=='.') ) {
            alt12=2;
        }
        else if ( (LA12_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='o') ) {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='t') ) {
                        int LA12_50 = input.LA(5);

                        if ( ((LA12_50>='0' && LA12_50<='9')||(LA12_50>='A' && LA12_50<='Z')||LA12_50=='_'||(LA12_50>='a' && LA12_50<='z')) ) {
                            alt12=18;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            case 'u':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='l') ) {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='e') ) {
                        int LA12_51 = input.LA(5);

                        if ( ((LA12_51>='0' && LA12_51<='9')||(LA12_51>='A' && LA12_51<='Z')||LA12_51=='_'||(LA12_51>='a' && LA12_51<='z')) ) {
                            alt12=18;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
                }
                break;
            default:
                alt12=18;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=5;
        }
        else if ( (LA12_0==';') ) {
            alt12=6;
        }
        else if ( (LA12_0=='}') ) {
            alt12=7;
        }
        else if ( (LA12_0==',') ) {
            alt12=9;
        }
        else if ( (LA12_0=='=') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='>') ) {
                alt12=10;
            }
            else {
                alt12=12;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='e') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='t') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44==' ') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='r') ) {
                            alt12=13;
                        }
                        else if ( (LA12_52=='l') ) {
                            alt12=11;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 52, input);

                            throw nvae;
                        }
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='i') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='g') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='n') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='o') ) {
                        int LA12_53 = input.LA(5);

                        if ( (LA12_53=='r') ) {
                            int LA12_61 = input.LA(6);

                            if ( (LA12_61=='e') ) {
                                int LA12_65 = input.LA(7);

                                if ( (LA12_65==' ') ) {
                                    int LA12_67 = input.LA(8);

                                    if ( (LA12_67=='l') ) {
                                        alt12=14;
                                    }
                                    else if ( (LA12_67=='r') ) {
                                        alt12=15;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 67, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=18;}
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='a') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='l') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='l') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54==' ') ) {
                            alt12=16;
                        }
                        else {
                            alt12=18;}
                    }
                    else {
                        alt12=18;}
                }
                else {
                    alt12=18;}
            }
            else {
                alt12=18;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='A' && LA12_12<='Z')||LA12_12=='_'||(LA12_12>='a' && LA12_12<='z')) ) {
                alt12=18;
            }
            else {
                alt12=24;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='d' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='q')||(LA12_0>='t' && LA12_0<='z')) ) {
            alt12=18;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=19;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_15 = input.LA(2);

            if ( ((LA12_15>='\u0000' && LA12_15<='\uFFFE')) ) {
                alt12=20;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_16 = input.LA(2);

            if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFE')) ) {
                alt12=20;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=21;
                }
                break;
            case '/':
                {
                alt12=22;
                }
                break;
            default:
                alt12=24;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=23;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='-'||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=24;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:78: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:86: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:95: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:107: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:123: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:139: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../fr.chaunier.xtext.mapdsl/src-gen/fr/chaunier/xtext/mapdsl/parser/antlr/internal/InternalMapDsl.g:1:147: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}