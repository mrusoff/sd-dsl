package fr.chaunier.xtext.bom.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBomDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=62;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalBomDslLexer() {;} 
    public InternalBomDslLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:10:5: ( 'DTD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:10:7: 'DTD'
            {
            match("DTD"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:11:5: ( 'FLAT' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:11:7: 'FLAT'
            {
            match("FLAT"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:12:5: ( 'CSV' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:12:7: 'CSV'
            {
            match("CSV"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:13:5: ( 'DB' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:13:7: 'DB'
            {
            match("DB"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:14:5: ( 'false' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:14:7: 'false'
            {
            match("false"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:15:5: ( 'as String' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:15:7: 'as String'
            {
            match("as String"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:16:5: ( 'as bool String' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:16:7: 'as bool String'
            {
            match("as bool String"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:17:5: ( 'as Value' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:17:7: 'as Value'
            {
            match("as Value"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:18:5: ( 'as bool Value' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:18:7: 'as bool Value'
            {
            match("as bool Value"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:19:5: ( 'import' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:19:7: 'import'
            {
            match("import"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:20:5: ( 'package' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:20:7: 'package'
            {
            match("package"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:21:5: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:21:7: '{'
            {
            match('{'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:22:5: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:22:7: '}'
            {
            match('}'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:23:5: ( 'prefix' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:23:7: 'prefix'
            {
            match("prefix"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:24:5: ( 'namespace' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:24:7: 'namespace'
            {
            match("namespace"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:25:5: ( 'format' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:25:7: 'format'
            {
            match("format"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:26:5: ( 'delimiter' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:26:7: 'delimiter'
            {
            match("delimiter"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:27:5: ( 'lineSpec' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:27:7: 'lineSpec'
            {
            match("lineSpec"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:28:5: ( 'datatype' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:28:7: 'datatype'
            {
            match("datatype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:29:5: ( 'entity' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:29:7: 'entity'
            {
            match("entity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:30:5: ( 'extends' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:30:7: 'extends'
            {
            match("extends"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:31:5: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:31:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:32:5: ( 'ref' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:32:7: 'ref'
            {
            match("ref"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:33:5: ( 'opposite' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:33:7: 'opposite'
            {
            match("opposite"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:34:5: ( 'enumeration' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:34:7: 'enumeration'
            {
            match("enumeration"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:35:5: ( '[' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:35:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:36:5: ( ']' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:36:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:37:5: ( ';' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:37:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:38:5: ( '=' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:38:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:39:5: ( '.*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:39:7: '.*'
            {
            match(".*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:40:5: ( '.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:40:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:41:5: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:41:7: 'minLen'
            {
            match("minLen"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:42:5: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:42:7: 'maxLen'
            {
            match("maxLen"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:43:5: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:43:7: 'fixeLen'
            {
            match("fixeLen"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:44:5: ( 'regexp' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:44:7: 'regexp'
            {
            match("regexp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:45:5: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:45:7: 'minVal'
            {
            match("minVal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:46:5: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:46:7: 'maxVal'
            {
            match("maxVal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:47:5: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:47:7: 'paddle'
            {
            match("paddle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:48:5: ( 'enum' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:48:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:49:5: ( 'XSD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:49:7: 'XSD'
            {
            match("XSD"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:50:5: ( '*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:50:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:51:5: ( '?' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:51:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:52:5: ( 'boolean' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:52:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:53:5: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:53:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:54:5: ( 'true' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:54:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:55:5: ( 'string' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:55:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:56:5: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:56:7: 'fixed'
            {
            match("fixed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:57:5: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:57:7: 'xsd Att.'
            {
            match("xsd Att."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:58:5: ( 'datetime' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:58:7: 'datetime'
            {
            match("datetime"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:59:5: ( 'integer' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:59:7: 'integer'
            {
            match("integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:60:5: ( 'decimal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:60:7: 'decimal'
            {
            match("decimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6959:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6959:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6959:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6959:11: '^'
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

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6959:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6961:10: ( ( '0' .. '9' )+ )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6961:12: ( '0' .. '9' )+
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6961:12: ( '0' .. '9' )+
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
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6961:13: '0' .. '9'
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("6963:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6963:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6965:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6965:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6965:24: ( options {greedy=false; } : . )*
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
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6965:52: .
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6967:41: '\\r'
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6969:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6969:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6969:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6971:16: ( . )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6971:18: .
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
        // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=58;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'B':
                {
                int LA12_38 = input.LA(3);

                if ( ((LA12_38>='0' && LA12_38<='9')||(LA12_38>='A' && LA12_38<='Z')||LA12_38=='_'||(LA12_38>='a' && LA12_38<='z')) ) {
                    alt12=52;
                }
                else {
                    alt12=4;}
                }
                break;
            case 'T':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='D') ) {
                    int LA12_83 = input.LA(4);

                    if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                        alt12=52;
                    }
                    else {
                        alt12=1;}
                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='F') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='L') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='A') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='T') ) {
                        int LA12_115 = input.LA(5);

                        if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                            alt12=52;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='S') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='V') ) {
                    int LA12_85 = input.LA(4);

                    if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                        alt12=52;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='x') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'L':
                            {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='e') ) {
                                int LA12_181 = input.LA(7);

                                if ( (LA12_181=='n') ) {
                                    int LA12_209 = input.LA(8);

                                    if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                            }
                            break;
                        case 'd':
                            {
                            int LA12_152 = input.LA(6);

                            if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                alt12=52;
                            }
                            else {
                                alt12=47;}
                            }
                            break;
                        default:
                            alt12=52;}

                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            case 'a':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='l') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='s') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='e') ) {
                            int LA12_153 = input.LA(6);

                            if ( ((LA12_153>='0' && LA12_153<='9')||(LA12_153>='A' && LA12_153<='Z')||LA12_153=='_'||(LA12_153>='a' && LA12_153<='z')) ) {
                                alt12=52;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            case 'o':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='r') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='m') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='a') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='t') ) {
                                int LA12_184 = input.LA(7);

                                if ( ((LA12_184>='0' && LA12_184<='9')||(LA12_184>='A' && LA12_184<='Z')||LA12_184=='_'||(LA12_184>='a' && LA12_184<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='s') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46==' ') ) {
                    switch ( input.LA(4) ) {
                    case 'V':
                        {
                        alt12=8;
                        }
                        break;
                    case 'S':
                        {
                        alt12=6;
                        }
                        break;
                    case 'b':
                        {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='o') ) {
                            int LA12_155 = input.LA(6);

                            if ( (LA12_155=='o') ) {
                                int LA12_185 = input.LA(7);

                                if ( (LA12_185=='l') ) {
                                    int LA12_211 = input.LA(8);

                                    if ( (LA12_211==' ') ) {
                                        int LA12_236 = input.LA(9);

                                        if ( (LA12_236=='V') ) {
                                            alt12=9;
                                        }
                                        else if ( (LA12_236=='S') ) {
                                            alt12=7;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 236, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 211, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 185, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 155, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 122, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 89, input);

                        throw nvae;
                    }

                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='t') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='e') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='g') ) {
                            int LA12_156 = input.LA(6);

                            if ( (LA12_156=='e') ) {
                                int LA12_186 = input.LA(7);

                                if ( (LA12_186=='r') ) {
                                    int LA12_212 = input.LA(8);

                                    if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=50;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            case 'm':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='p') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='o') ) {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='r') ) {
                            int LA12_157 = input.LA(6);

                            if ( (LA12_157=='t') ) {
                                int LA12_187 = input.LA(7);

                                if ( ((LA12_187>='0' && LA12_187<='9')||(LA12_187>='A' && LA12_187<='Z')||LA12_187=='_'||(LA12_187>='a' && LA12_187<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=10;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='d') ) {
                        int LA12_125 = input.LA(5);

                        if ( (LA12_125=='l') ) {
                            int LA12_158 = input.LA(6);

                            if ( (LA12_158=='e') ) {
                                int LA12_188 = input.LA(7);

                                if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='k') ) {
                        int LA12_126 = input.LA(5);

                        if ( (LA12_126=='a') ) {
                            int LA12_159 = input.LA(6);

                            if ( (LA12_159=='g') ) {
                                int LA12_189 = input.LA(7);

                                if ( (LA12_189=='e') ) {
                                    int LA12_215 = input.LA(8);

                                    if ( ((LA12_215>='0' && LA12_215<='9')||(LA12_215>='A' && LA12_215<='Z')||LA12_215=='_'||(LA12_215>='a' && LA12_215<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=11;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                default:
                    alt12=52;}

                }
                break;
            case 'r':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='e') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='f') ) {
                        int LA12_127 = input.LA(5);

                        if ( (LA12_127=='i') ) {
                            int LA12_160 = input.LA(6);

                            if ( (LA12_160=='x') ) {
                                int LA12_190 = input.LA(7);

                                if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=12;
        }
        else if ( (LA12_0=='}') ) {
            alt12=13;
        }
        else if ( (LA12_0=='n') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='a') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='m') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='e') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='s') ) {
                            int LA12_161 = input.LA(6);

                            if ( (LA12_161=='p') ) {
                                int LA12_191 = input.LA(7);

                                if ( (LA12_191=='a') ) {
                                    int LA12_217 = input.LA(8);

                                    if ( (LA12_217=='c') ) {
                                        int LA12_239 = input.LA(9);

                                        if ( (LA12_239=='e') ) {
                                            int LA12_252 = input.LA(10);

                                            if ( ((LA12_252>='0' && LA12_252<='9')||(LA12_252>='A' && LA12_252<='Z')||LA12_252=='_'||(LA12_252>='a' && LA12_252<='z')) ) {
                                                alt12=52;
                                            }
                                            else {
                                                alt12=15;}
                                        }
                                        else {
                                            alt12=52;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='t') ) {
                            int LA12_162 = input.LA(6);

                            if ( (LA12_162=='i') ) {
                                int LA12_192 = input.LA(7);

                                if ( (LA12_192=='m') ) {
                                    int LA12_218 = input.LA(8);

                                    if ( (LA12_218=='e') ) {
                                        int LA12_240 = input.LA(9);

                                        if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                            alt12=52;
                                        }
                                        else {
                                            alt12=49;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    case 'a':
                        {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='t') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='y') ) {
                                int LA12_193 = input.LA(7);

                                if ( (LA12_193=='p') ) {
                                    int LA12_219 = input.LA(8);

                                    if ( (LA12_219=='e') ) {
                                        int LA12_241 = input.LA(9);

                                        if ( ((LA12_241>='0' && LA12_241<='9')||(LA12_241>='A' && LA12_241<='Z')||LA12_241=='_'||(LA12_241>='a' && LA12_241<='z')) ) {
                                            alt12=52;
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    default:
                        alt12=52;}

                }
                else {
                    alt12=52;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='a') ) {
                        int LA12_131 = input.LA(5);

                        if ( (LA12_131=='u') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='l') ) {
                                int LA12_194 = input.LA(7);

                                if ( (LA12_194=='t') ) {
                                    int LA12_220 = input.LA(8);

                                    if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=44;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='i') ) {
                        int LA12_132 = input.LA(5);

                        if ( (LA12_132=='m') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='i') ) {
                                int LA12_195 = input.LA(7);

                                if ( (LA12_195=='t') ) {
                                    int LA12_221 = input.LA(8);

                                    if ( (LA12_221=='e') ) {
                                        int LA12_243 = input.LA(9);

                                        if ( (LA12_243=='r') ) {
                                            int LA12_255 = input.LA(10);

                                            if ( ((LA12_255>='0' && LA12_255<='9')||(LA12_255>='A' && LA12_255<='Z')||LA12_255=='_'||(LA12_255>='a' && LA12_255<='z')) ) {
                                                alt12=52;
                                            }
                                            else {
                                                alt12=17;}
                                        }
                                        else {
                                            alt12=52;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='i') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='m') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='a') ) {
                                int LA12_196 = input.LA(7);

                                if ( (LA12_196=='l') ) {
                                    int LA12_222 = input.LA(8);

                                    if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=51;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                default:
                    alt12=52;}

                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='l') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='i') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='n') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='e') ) {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='S') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='p') ) {
                                int LA12_197 = input.LA(7);

                                if ( (LA12_197=='e') ) {
                                    int LA12_223 = input.LA(8);

                                    if ( (LA12_223=='c') ) {
                                        int LA12_245 = input.LA(9);

                                        if ( ((LA12_245>='0' && LA12_245<='9')||(LA12_245>='A' && LA12_245<='Z')||LA12_245=='_'||(LA12_245>='a' && LA12_245<='z')) ) {
                                            alt12=52;
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='m') ) {
                        switch ( input.LA(5) ) {
                        case 'e':
                            {
                            int LA12_168 = input.LA(6);

                            if ( (LA12_168=='r') ) {
                                int LA12_198 = input.LA(7);

                                if ( (LA12_198=='a') ) {
                                    int LA12_224 = input.LA(8);

                                    if ( (LA12_224=='t') ) {
                                        int LA12_246 = input.LA(9);

                                        if ( (LA12_246=='i') ) {
                                            int LA12_257 = input.LA(10);

                                            if ( (LA12_257=='o') ) {
                                                int LA12_261 = input.LA(11);

                                                if ( (LA12_261=='n') ) {
                                                    int LA12_262 = input.LA(12);

                                                    if ( ((LA12_262>='0' && LA12_262<='9')||(LA12_262>='A' && LA12_262<='Z')||LA12_262=='_'||(LA12_262>='a' && LA12_262<='z')) ) {
                                                        alt12=52;
                                                    }
                                                    else {
                                                        alt12=25;}
                                                }
                                                else {
                                                    alt12=52;}
                                            }
                                            else {
                                                alt12=52;}
                                        }
                                        else {
                                            alt12=52;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                            }
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=52;
                            }
                            break;
                        default:
                            alt12=39;}

                    }
                    else {
                        alt12=52;}
                    }
                    break;
                case 't':
                    {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='i') ) {
                        int LA12_136 = input.LA(5);

                        if ( (LA12_136=='t') ) {
                            int LA12_170 = input.LA(6);

                            if ( (LA12_170=='y') ) {
                                int LA12_199 = input.LA(7);

                                if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                default:
                    alt12=52;}

                }
                break;
            case 'x':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='t') ) {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='e') ) {
                        int LA12_137 = input.LA(5);

                        if ( (LA12_137=='n') ) {
                            int LA12_171 = input.LA(6);

                            if ( (LA12_171=='d') ) {
                                int LA12_200 = input.LA(7);

                                if ( (LA12_200=='s') ) {
                                    int LA12_226 = input.LA(8);

                                    if ( ((LA12_226>='0' && LA12_226<='9')||(LA12_226>='A' && LA12_226<='Z')||LA12_226=='_'||(LA12_226>='a' && LA12_226<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=21;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0==':') ) {
            alt12=22;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='e') ) {
                switch ( input.LA(3) ) {
                case 'g':
                    {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='e') ) {
                        int LA12_138 = input.LA(5);

                        if ( (LA12_138=='x') ) {
                            int LA12_172 = input.LA(6);

                            if ( (LA12_172=='p') ) {
                                int LA12_201 = input.LA(7);

                                if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_105 = input.LA(4);

                    if ( ((LA12_105>='0' && LA12_105<='9')||(LA12_105>='A' && LA12_105<='Z')||LA12_105=='_'||(LA12_105>='a' && LA12_105<='z')) ) {
                        alt12=52;
                    }
                    else {
                        alt12=23;}
                    }
                    break;
                default:
                    alt12=52;}

            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='p') ) {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='p') ) {
                    int LA12_106 = input.LA(4);

                    if ( (LA12_106=='o') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='s') ) {
                            int LA12_173 = input.LA(6);

                            if ( (LA12_173=='i') ) {
                                int LA12_202 = input.LA(7);

                                if ( (LA12_202=='t') ) {
                                    int LA12_228 = input.LA(8);

                                    if ( (LA12_228=='e') ) {
                                        int LA12_248 = input.LA(9);

                                        if ( ((LA12_248>='0' && LA12_248<='9')||(LA12_248>='A' && LA12_248<='Z')||LA12_248=='_'||(LA12_248>='a' && LA12_248<='z')) ) {
                                            alt12=52;
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=26;
        }
        else if ( (LA12_0==']') ) {
            alt12=27;
        }
        else if ( (LA12_0==';') ) {
            alt12=28;
        }
        else if ( (LA12_0=='=') ) {
            alt12=29;
        }
        else if ( (LA12_0=='.') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='*') ) {
                alt12=30;
            }
            else {
                alt12=31;}
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_68 = input.LA(3);

                if ( (LA12_68=='x') ) {
                    switch ( input.LA(4) ) {
                    case 'V':
                        {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='a') ) {
                            int LA12_174 = input.LA(6);

                            if ( (LA12_174=='l') ) {
                                int LA12_203 = input.LA(7);

                                if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    case 'L':
                        {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='e') ) {
                            int LA12_175 = input.LA(6);

                            if ( (LA12_175=='n') ) {
                                int LA12_204 = input.LA(7);

                                if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    default:
                        alt12=52;}

                }
                else {
                    alt12=52;}
                }
                break;
            case 'i':
                {
                int LA12_69 = input.LA(3);

                if ( (LA12_69=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'V':
                        {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='a') ) {
                            int LA12_176 = input.LA(6);

                            if ( (LA12_176=='l') ) {
                                int LA12_205 = input.LA(7);

                                if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    case 'L':
                        {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='e') ) {
                            int LA12_177 = input.LA(6);

                            if ( (LA12_177=='n') ) {
                                int LA12_206 = input.LA(7);

                                if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                        }
                        break;
                    default:
                        alt12=52;}

                }
                else {
                    alt12=52;}
                }
                break;
            default:
                alt12=52;}

        }
        else if ( (LA12_0=='X') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='S') ) {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='D') ) {
                    int LA12_109 = input.LA(4);

                    if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
                        alt12=52;
                    }
                    else {
                        alt12=40;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=41;
        }
        else if ( (LA12_0=='?') ) {
            alt12=42;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='o') ) {
                int LA12_73 = input.LA(3);

                if ( (LA12_73=='o') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='l') ) {
                        int LA12_146 = input.LA(5);

                        if ( (LA12_146=='e') ) {
                            int LA12_178 = input.LA(6);

                            if ( (LA12_178=='a') ) {
                                int LA12_207 = input.LA(7);

                                if ( (LA12_207=='n') ) {
                                    int LA12_233 = input.LA(8);

                                    if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                        alt12=52;
                                    }
                                    else {
                                        alt12=43;}
                                }
                                else {
                                    alt12=52;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='r') ) {
                int LA12_74 = input.LA(3);

                if ( (LA12_74=='u') ) {
                    int LA12_111 = input.LA(4);

                    if ( (LA12_111=='e') ) {
                        int LA12_147 = input.LA(5);

                        if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
                            alt12=52;
                        }
                        else {
                            alt12=45;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='t') ) {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='r') ) {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='i') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='n') ) {
                            int LA12_180 = input.LA(6);

                            if ( (LA12_180=='g') ) {
                                int LA12_208 = input.LA(7);

                                if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
                                    alt12=52;
                                }
                                else {
                                    alt12=46;}
                            }
                            else {
                                alt12=52;}
                        }
                        else {
                            alt12=52;}
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='x') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='s') ) {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='d') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113==' ') ) {
                        alt12=48;
                    }
                    else {
                        alt12=52;}
                }
                else {
                    alt12=52;}
            }
            else {
                alt12=52;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='A' && LA12_30<='Z')||LA12_30=='_'||(LA12_30>='a' && LA12_30<='z')) ) {
                alt12=52;
            }
            else {
                alt12=58;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||LA12_0=='E'||(LA12_0>='G' && LA12_0<='W')||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='c'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='w')||(LA12_0>='y' && LA12_0<='z')) ) {
            alt12=52;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=53;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_33 = input.LA(2);

            if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFE')) ) {
                alt12=54;
            }
            else {
                alt12=58;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_34 = input.LA(2);

            if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFE')) ) {
                alt12=54;
            }
            else {
                alt12=58;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=56;
                }
                break;
            case '*':
                {
                alt12=55;
                }
                break;
            default:
                alt12=58;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=57;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='-')||LA12_0=='<'||LA12_0=='>'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=58;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 54 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:231: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:243: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:259: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:275: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:283: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}