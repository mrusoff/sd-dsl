package fr.chaunier.xtext.path.map.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPathDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_BIGINT=6;
    public static final int T__29=29;
    public static final int RULE_DATE=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalPathDslLexer() {;} 
    public InternalPathDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPathDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:11:7: ( 'false' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:12:7: ( 'In' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:12:9: 'In'
            {
            match("In"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:13:7: ( 'Out' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:13:9: 'Out'
            {
            match("Out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:14:7: ( '[' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:15:7: ( ']' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:16:7: ( 'import' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:16:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:17:7: ( '.*' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:17:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:18:7: ( '.' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:19:7: ( 'mapping' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:19:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:20:7: ( 'Entity source' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:20:9: 'Entity source'
            {
            match("Entity source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:21:7: ( 'Entity target' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:21:9: 'Entity target'
            {
            match("Entity target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:22:7: ( '(' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:23:7: ( ')' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:24:7: ( 'use mapping' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:24:9: 'use mapping'
            {
            match("use mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:25:7: ( 'whith map' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:25:9: 'whith map'
            {
            match("whith map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:26:7: ( 'doc' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:26:9: 'doc'
            {
            match("doc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:27:7: ( 'define rule' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:27:9: 'define rule'
            {
            match("define rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:28:7: ( 'operation' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:28:9: 'operation'
            {
            match("operation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:29:7: ( 'fonction' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:29:9: 'fonction'
            {
            match("fonction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:30:7: ( '{' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:31:7: ( '}' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:32:7: ( 'rule' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:32:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:33:7: ( 'set' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:33:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:34:7: ( '=' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:35:7: ( 'from' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:35:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:36:7: ( 'to' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:36:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:37:7: ( 'source path' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:37:9: 'source path'
            {
            match("source path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:38:7: ( 'target path' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:38:9: 'target path'
            {
            match("target path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:39:7: ( 'info' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:39:9: 'info'
            {
            match("info"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:40:7: ( 'version' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:40:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:41:7: ( 'comment' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:41:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:42:7: ( 'for each' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:42:9: 'for each'
            {
            match("for each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:43:7: ( 'null' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:43:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:44:7: ( 'true' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:44:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_BIGINT"
    public final void mRULE_BIGINT() throws RecognitionException {
        try {
            int _type = RULE_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4562:13: ( ( '0' .. '9' )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4562:15: ( '0' .. '9' )*
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4562:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4562:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIGINT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:15: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:27: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:32: ( '0' .. '9' )+
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
                    	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4564:33: '0' .. '9'
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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4566:11: ( '0' .. '1' '0' .. '9' '.' '0' .. '3' '0' .. '9' '.' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4566:13: '0' .. '1' '0' .. '9' '.' '0' .. '3' '0' .. '9' '.' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','1'); 
            matchRange('0','9'); 
            match('.'); 
            matchRange('0','3'); 
            matchRange('0','9'); 
            match('.'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4568:10: ( 'this one has been deactivated' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4568:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4570:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4570:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4570:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4570:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4570:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4572:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4574:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4574:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4574:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4574:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4576:41: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4578:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4578:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4580:16: ( . )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4580:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BIGINT | RULE_NUMBER | RULE_DATE | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=44;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:214: RULE_BIGINT
                {
                mRULE_BIGINT(); 

                }
                break;
            case 36 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:226: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 37 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:238: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 38 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:248: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:257: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:265: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:277: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:293: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:309: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1:317: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\32\3\46\2\uffff\1\46\1\56\2\46\2\uffff\4\46\2\uffff\2\46\1\uffff"+
        "\4\46\1\32\1\uffff\1\32\1\42\1\uffff\3\42\2\uffff\3\46\1\uffff\1"+
        "\120\1\46\2\uffff\2\46\3\uffff\2\46\2\uffff\5\46\2\uffff\3\46\1"+
        "\uffff\1\136\6\46\2\32\4\uffff\4\46\1\uffff\1\152\6\46\1\161\3\46"+
        "\1\165\1\46\1\uffff\6\46\1\uffff\2\46\1\uffff\1\u0080\1\uffff\1"+
        "\46\1\u0082\2\46\1\uffff\1\46\1\uffff\2\46\1\u0088\1\uffff\2\46"+
        "\1\u008b\3\46\1\u008f\1\57\1\u0091\1\46\1\uffff\1\46\1\uffff\5\46"+
        "\1\uffff\2\46\2\uffff\2\46\1\uffff\1\57\1\uffff\1\46\1\u009f\2\46"+
        "\1\uffff\6\46\1\uffff\1\46\1\uffff\1\u00a9\2\uffff\1\46\2\uffff"+
        "\1\u00ad\1\u00ae\1\u00af\3\uffff\1\46\3\uffff\1\u00b1\1\uffff";
    static final String DFA15_eofS =
        "\u00b2\uffff";
    static final String DFA15_minS =
        "\1\0\1\141\1\156\1\165\2\uffff\1\155\1\52\1\141\1\156\2\uffff\1"+
        "\163\1\150\1\145\1\160\2\uffff\1\165\1\145\1\uffff\1\141\1\145\1"+
        "\157\1\165\1\56\1\uffff\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\154"+
        "\1\156\1\157\1\uffff\1\60\1\164\2\uffff\1\160\1\146\3\uffff\1\160"+
        "\1\164\2\uffff\1\145\1\151\1\143\1\146\1\145\2\uffff\1\154\1\164"+
        "\1\165\1\uffff\1\60\1\162\1\165\1\151\1\162\1\155\1\154\2\56\4\uffff"+
        "\1\163\1\143\1\40\1\155\1\uffff\1\60\2\157\1\160\1\151\1\40\1\164"+
        "\1\60\1\151\1\162\1\145\1\60\1\162\1\uffff\1\147\1\145\2\163\1\155"+
        "\1\154\1\60\1\145\1\164\1\uffff\1\60\1\uffff\1\162\1\60\1\151\1"+
        "\164\1\uffff\1\150\1\uffff\1\156\1\141\1\60\1\uffff\1\143\1\145"+
        "\1\60\1\40\1\151\1\145\3\60\1\151\1\uffff\1\164\1\uffff\1\156\1"+
        "\171\1\40\1\145\1\164\1\uffff\1\145\1\164\2\uffff\1\157\1\156\1"+
        "\uffff\1\56\1\uffff\1\157\1\60\1\147\1\40\1\uffff\1\40\1\151\2\40"+
        "\1\156\1\164\1\uffff\1\156\1\uffff\1\60\1\163\1\uffff\1\157\2\uffff"+
        "\3\60\3\uffff\1\156\3\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\162\1\156\1\165\2\uffff\1\156\1\71\1\141\1\156\2\uffff"+
        "\1\163\1\150\1\157\1\160\2\uffff\1\165\1\157\1\uffff\1\162\1\145"+
        "\1\157\1\165\1\71\1\uffff\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff"+
        "\1\154\1\162\1\157\1\uffff\1\172\1\164\2\uffff\1\160\1\146\3\uffff"+
        "\1\160\1\164\2\uffff\1\145\1\151\1\143\1\146\1\145\2\uffff\1\154"+
        "\1\164\1\165\1\uffff\1\172\1\162\1\165\1\151\1\162\1\155\1\154\2"+
        "\71\4\uffff\1\163\1\143\1\40\1\155\1\uffff\1\172\2\157\1\160\1\151"+
        "\1\40\1\164\1\172\1\151\1\162\1\145\1\172\1\162\1\uffff\1\147\1"+
        "\145\2\163\1\155\1\154\1\71\1\145\1\164\1\uffff\1\172\1\uffff\1"+
        "\162\1\172\1\151\1\164\1\uffff\1\150\1\uffff\1\156\1\141\1\172\1"+
        "\uffff\1\143\1\145\1\172\1\40\1\151\1\145\1\172\1\71\1\172\1\151"+
        "\1\uffff\1\164\1\uffff\1\156\1\171\1\40\1\145\1\164\1\uffff\1\145"+
        "\1\164\2\uffff\1\157\1\156\1\uffff\1\56\1\uffff\1\157\1\172\1\147"+
        "\1\40\1\uffff\1\40\1\151\2\40\1\156\1\164\1\uffff\1\156\1\uffff"+
        "\1\172\1\164\1\uffff\1\157\2\uffff\3\172\3\uffff\1\156\3\uffff\1"+
        "\172\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\5\4\uffff\1\14\1\15\4\uffff\1\24\1\25\2\uffff\1"+
        "\30\5\uffff\1\43\2\uffff\1\47\3\uffff\1\53\1\54\3\uffff\1\47\2\uffff"+
        "\1\4\1\5\2\uffff\1\7\1\10\1\44\2\uffff\1\14\1\15\5\uffff\1\24\1"+
        "\25\3\uffff\1\30\11\uffff\1\50\1\51\1\52\1\53\4\uffff\1\2\15\uffff"+
        "\1\32\11\uffff\1\40\1\uffff\1\3\4\uffff\1\16\1\uffff\1\20\3\uffff"+
        "\1\27\12\uffff\1\31\1\uffff\1\35\5\uffff\1\26\2\uffff\1\42\1\46"+
        "\2\uffff\1\41\1\uffff\1\1\4\uffff\1\17\6\uffff\1\45\1\uffff\1\6"+
        "\2\uffff\1\21\1\uffff\1\33\1\34\3\uffff\1\11\1\12\1\13\1\uffff\1"+
        "\36\1\37\1\23\1\uffff\1\22";
    static final String DFA15_specialS =
        "\1\0\35\uffff\1\1\1\2\u0092\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\1\12\1"+
            "\13\4\42\1\7\1\40\2\31\10\33\3\42\1\24\3\42\4\35\1\11\3\35\1"+
            "\2\5\35\1\3\13\35\1\4\1\42\1\5\1\34\1\35\1\42\2\35\1\27\1\16"+
            "\1\35\1\1\2\35\1\6\3\35\1\10\1\30\1\17\2\35\1\22\1\23\1\25\1"+
            "\14\1\26\1\15\3\35\1\20\1\42\1\21\uff82\42",
            "\1\43\15\uffff\1\44\2\uffff\1\45",
            "\1\47",
            "\1\50",
            "",
            "",
            "\1\53\1\54",
            "\1\55\5\uffff\12\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\67\11\uffff\1\66",
            "\1\70",
            "",
            "",
            "\1\73",
            "\1\74\11\uffff\1\75",
            "",
            "\1\100\6\uffff\1\102\6\uffff\1\77\2\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\57\1\uffff\12\106",
            "",
            "\1\57\1\uffff\12\107",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\0\110",
            "\0\110",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\1\114",
            "\1\115\3\uffff\1\116",
            "\1\117",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145\1\uffff\12\107",
            "\1\57\1\uffff\12\107",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\4\175\6\57",
            "\1\176",
            "\1\177",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0081",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0089",
            "\1\u008a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\u0090",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0092",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "\1\u009e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00aa\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u00b0",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BIGINT | RULE_NUMBER | RULE_DATE | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='f') ) {s = 1;}

                        else if ( (LA15_0=='I') ) {s = 2;}

                        else if ( (LA15_0=='O') ) {s = 3;}

                        else if ( (LA15_0=='[') ) {s = 4;}

                        else if ( (LA15_0==']') ) {s = 5;}

                        else if ( (LA15_0=='i') ) {s = 6;}

                        else if ( (LA15_0=='.') ) {s = 7;}

                        else if ( (LA15_0=='m') ) {s = 8;}

                        else if ( (LA15_0=='E') ) {s = 9;}

                        else if ( (LA15_0=='(') ) {s = 10;}

                        else if ( (LA15_0==')') ) {s = 11;}

                        else if ( (LA15_0=='u') ) {s = 12;}

                        else if ( (LA15_0=='w') ) {s = 13;}

                        else if ( (LA15_0=='d') ) {s = 14;}

                        else if ( (LA15_0=='o') ) {s = 15;}

                        else if ( (LA15_0=='{') ) {s = 16;}

                        else if ( (LA15_0=='}') ) {s = 17;}

                        else if ( (LA15_0=='r') ) {s = 18;}

                        else if ( (LA15_0=='s') ) {s = 19;}

                        else if ( (LA15_0=='=') ) {s = 20;}

                        else if ( (LA15_0=='t') ) {s = 21;}

                        else if ( (LA15_0=='v') ) {s = 22;}

                        else if ( (LA15_0=='c') ) {s = 23;}

                        else if ( (LA15_0=='n') ) {s = 24;}

                        else if ( ((LA15_0>='0' && LA15_0<='1')) ) {s = 25;}

                        else if ( ((LA15_0>='2' && LA15_0<='9')) ) {s = 27;}

                        else if ( (LA15_0=='^') ) {s = 28;}

                        else if ( ((LA15_0>='A' && LA15_0<='D')||(LA15_0>='F' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='b')||LA15_0=='e'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||(LA15_0>='p' && LA15_0<='q')||(LA15_0>='x' && LA15_0<='z')) ) {s = 29;}

                        else if ( (LA15_0=='\"') ) {s = 30;}

                        else if ( (LA15_0=='\'') ) {s = 31;}

                        else if ( (LA15_0=='/') ) {s = 32;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 33;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='-')||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 34;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( ((LA15_30>='\u0000' && LA15_30<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_31 = input.LA(1);

                        s = -1;
                        if ( ((LA15_31>='\u0000' && LA15_31<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}