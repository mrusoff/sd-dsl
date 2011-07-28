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
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
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
    public static final int Tokens=65;
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:10:5: ( 'abstract' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:10:7: 'abstract'
            {
            match("abstract"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:11:5: ( 'DTD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:11:7: 'DTD'
            {
            match("DTD"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:12:5: ( 'FLAT' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:12:7: 'FLAT'
            {
            match("FLAT"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:13:5: ( 'CSV' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:13:7: 'CSV'
            {
            match("CSV"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:14:5: ( 'DB' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:14:7: 'DB'
            {
            match("DB"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:15:5: ( 'public' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:15:7: 'public'
            {
            match("public"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:16:5: ( 'private' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:16:7: 'private'
            {
            match("private"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:17:5: ( 'protected' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:17:7: 'protected'
            {
            match("protected"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:18:5: ( 'as String' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:18:7: 'as String'
            {
            match("as String"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:19:5: ( 'as Value' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:19:7: 'as Value'
            {
            match("as Value"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:20:5: ( 'import' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:20:7: 'import'
            {
            match("import"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:21:5: ( 'package' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:21:7: 'package'
            {
            match("package"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:22:5: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:22:7: '{'
            {
            match('{'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:23:5: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:23:7: '}'
            {
            match('}'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:24:5: ( 'prefix' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:24:7: 'prefix'
            {
            match("prefix"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:25:5: ( 'namespace' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:25:7: 'namespace'
            {
            match("namespace"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:26:5: ( 'format' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:26:7: 'format'
            {
            match("format"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:27:5: ( 'delimiter' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:27:7: 'delimiter'
            {
            match("delimiter"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:28:5: ( 'lineSpec' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:28:7: 'lineSpec'
            {
            match("lineSpec"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:29:5: ( 'datatype' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:29:7: 'datatype'
            {
            match("datatype"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:30:5: ( 'entity' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:30:7: 'entity'
            {
            match("entity"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:31:5: ( 'extends' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:31:7: 'extends'
            {
            match("extends"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:32:5: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:32:7: ':'
            {
            match(':'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:33:5: ( 'ref' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:33:7: 'ref'
            {
            match("ref"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:34:5: ( 'opposite' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:34:7: 'opposite'
            {
            match("opposite"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:35:5: ( 'enumeration' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:35:7: 'enumeration'
            {
            match("enumeration"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:36:5: ( '[' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:36:7: '['
            {
            match('['); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:37:5: ( ']' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:37:7: ']'
            {
            match(']'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:38:5: ( ';' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:38:7: ';'
            {
            match(';'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:39:5: ( '=' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:39:7: '='
            {
            match('='); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:40:5: ( '.*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:40:7: '.*'
            {
            match(".*"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:41:5: ( '.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:41:7: '.'
            {
            match('.'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:42:5: ( 'regexp' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:42:7: 'regexp'
            {
            match("regexp"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:43:5: ( 'enum' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:43:7: 'enum'
            {
            match("enum"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:44:5: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:44:7: 'fixeLen'
            {
            match("fixeLen"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:47:5: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:47:7: 'minLen'
            {
            match("minLen"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:48:5: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:48:7: 'maxLen'
            {
            match("maxLen"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:49:5: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:49:7: 'paddle'
            {
            match("paddle"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:50:5: ( 'XSD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:50:7: 'XSD'
            {
            match("XSD"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:51:5: ( '*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:51:7: '*'
            {
            match('*'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:52:5: ( '?' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:52:7: '?'
            {
            match('?'); 

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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:53:5: ( 'boolean' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:53:7: 'boolean'
            {
            match("boolean"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:54:5: ( 'string' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:54:7: 'string'
            {
            match("string"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:55:5: ( 'datetime' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:55:7: 'datetime'
            {
            match("datetime"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:56:5: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:56:7: 'default'
            {
            match("default"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:57:5: ( 'integer' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:57:7: 'integer'
            {
            match("integer"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:58:5: ( 'decimal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:58:7: 'decimal'
            {
            match("decimal"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:59:5: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:59:7: 'fixed'
            {
            match("fixed"); 


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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:60:5: ( 'nullable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:60:7: 'nullable'
            {
            match("nullable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:61:5: ( 'derived' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:61:7: 'derived'
            {
            match("derived"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:62:5: ( 'writable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:62:7: 'writable'
            {
            match("writable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:63:5: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:63:7: 'xsd Att.'
            {
            match("xsd Att."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6814:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6814:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6814:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6814:11: '^'
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

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6814:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6816:10: ( ( '0' .. '9' )+ )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6816:12: ( '0' .. '9' )+
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6816:12: ( '0' .. '9' )+
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
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6816:13: '0' .. '9'
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("6818:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6818:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6820:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6820:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6820:24: ( options {greedy=false; } : . )*
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
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6820:52: .
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:41: '\\r'
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6824:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6824:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6824:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6826:16: ( . )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6826:18: .
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
        // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=61;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='s') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='t') ) {
                        int LA12_121 = input.LA(5);

                        if ( (LA12_121=='r') ) {
                            int LA12_161 = input.LA(6);

                            if ( (LA12_161=='a') ) {
                                int LA12_196 = input.LA(7);

                                if ( (LA12_196=='c') ) {
                                    int LA12_229 = input.LA(8);

                                    if ( (LA12_229=='t') ) {
                                        int LA12_261 = input.LA(9);

                                        if ( ((LA12_261>='0' && LA12_261<='9')||(LA12_261>='A' && LA12_261<='Z')||LA12_261=='_'||(LA12_261>='a' && LA12_261<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=1;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            case 's':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39==' ') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='V') ) {
                        alt12=10;
                    }
                    else if ( (LA12_85=='S') ) {
                        alt12=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 85, input);

                        throw nvae;
                    }
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'B':
                {
                int LA12_41 = input.LA(3);

                if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                    alt12=55;
                }
                else {
                    alt12=5;}
                }
                break;
            case 'T':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='D') ) {
                    int LA12_87 = input.LA(4);

                    if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                        alt12=55;
                    }
                    else {
                        alt12=2;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='F') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='L') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='A') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='T') ) {
                        int LA12_125 = input.LA(5);

                        if ( ((LA12_125>='0' && LA12_125<='9')||(LA12_125>='A' && LA12_125<='Z')||LA12_125=='_'||(LA12_125>='a' && LA12_125<='z')) ) {
                            alt12=55;
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='C') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='S') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='V') ) {
                    int LA12_89 = input.LA(4);

                    if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                        alt12=55;
                    }
                    else {
                        alt12=4;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='k') ) {
                        int LA12_127 = input.LA(5);

                        if ( (LA12_127=='a') ) {
                            int LA12_163 = input.LA(6);

                            if ( (LA12_163=='g') ) {
                                int LA12_197 = input.LA(7);

                                if ( (LA12_197=='e') ) {
                                    int LA12_230 = input.LA(8);

                                    if ( ((LA12_230>='0' && LA12_230<='9')||(LA12_230>='A' && LA12_230<='Z')||LA12_230=='_'||(LA12_230>='a' && LA12_230<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'd':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='d') ) {
                        int LA12_128 = input.LA(5);

                        if ( (LA12_128=='l') ) {
                            int LA12_164 = input.LA(6);

                            if ( (LA12_164=='e') ) {
                                int LA12_198 = input.LA(7);

                                if ( ((LA12_198>='0' && LA12_198<='9')||(LA12_198>='A' && LA12_198<='Z')||LA12_198=='_'||(LA12_198>='a' && LA12_198<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=40;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                default:
                    alt12=55;}

                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='v') ) {
                        int LA12_129 = input.LA(5);

                        if ( (LA12_129=='a') ) {
                            int LA12_165 = input.LA(6);

                            if ( (LA12_165=='t') ) {
                                int LA12_199 = input.LA(7);

                                if ( (LA12_199=='e') ) {
                                    int LA12_232 = input.LA(8);

                                    if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=7;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'o':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='t') ) {
                        int LA12_130 = input.LA(5);

                        if ( (LA12_130=='e') ) {
                            int LA12_166 = input.LA(6);

                            if ( (LA12_166=='c') ) {
                                int LA12_200 = input.LA(7);

                                if ( (LA12_200=='t') ) {
                                    int LA12_233 = input.LA(8);

                                    if ( (LA12_233=='e') ) {
                                        int LA12_264 = input.LA(9);

                                        if ( (LA12_264=='d') ) {
                                            int LA12_282 = input.LA(10);

                                            if ( ((LA12_282>='0' && LA12_282<='9')||(LA12_282>='A' && LA12_282<='Z')||LA12_282=='_'||(LA12_282>='a' && LA12_282<='z')) ) {
                                                alt12=55;
                                            }
                                            else {
                                                alt12=8;}
                                        }
                                        else {
                                            alt12=55;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'e':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='f') ) {
                        int LA12_131 = input.LA(5);

                        if ( (LA12_131=='i') ) {
                            int LA12_167 = input.LA(6);

                            if ( (LA12_167=='x') ) {
                                int LA12_201 = input.LA(7);

                                if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                default:
                    alt12=55;}

                }
                break;
            case 'u':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='b') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='l') ) {
                        int LA12_132 = input.LA(5);

                        if ( (LA12_132=='i') ) {
                            int LA12_168 = input.LA(6);

                            if ( (LA12_168=='c') ) {
                                int LA12_202 = input.LA(7);

                                if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=6;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='t') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='e') ) {
                        int LA12_133 = input.LA(5);

                        if ( (LA12_133=='g') ) {
                            int LA12_169 = input.LA(6);

                            if ( (LA12_169=='e') ) {
                                int LA12_203 = input.LA(7);

                                if ( (LA12_203=='r') ) {
                                    int LA12_236 = input.LA(8);

                                    if ( ((LA12_236>='0' && LA12_236<='9')||(LA12_236>='A' && LA12_236<='Z')||LA12_236=='_'||(LA12_236>='a' && LA12_236<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=48;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            case 'm':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='p') ) {
                    int LA12_97 = input.LA(4);

                    if ( (LA12_97=='o') ) {
                        int LA12_134 = input.LA(5);

                        if ( (LA12_134=='r') ) {
                            int LA12_170 = input.LA(6);

                            if ( (LA12_170=='t') ) {
                                int LA12_204 = input.LA(7);

                                if ( ((LA12_204>='0' && LA12_204<='9')||(LA12_204>='A' && LA12_204<='Z')||LA12_204=='_'||(LA12_204>='a' && LA12_204<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='{') ) {
            alt12=13;
        }
        else if ( (LA12_0=='}') ) {
            alt12=14;
        }
        else if ( (LA12_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='l') ) {
                    int LA12_98 = input.LA(4);

                    if ( (LA12_98=='l') ) {
                        int LA12_135 = input.LA(5);

                        if ( (LA12_135=='a') ) {
                            int LA12_171 = input.LA(6);

                            if ( (LA12_171=='b') ) {
                                int LA12_205 = input.LA(7);

                                if ( (LA12_205=='l') ) {
                                    int LA12_238 = input.LA(8);

                                    if ( (LA12_238=='e') ) {
                                        int LA12_266 = input.LA(9);

                                        if ( ((LA12_266>='0' && LA12_266<='9')||(LA12_266>='A' && LA12_266<='Z')||LA12_266=='_'||(LA12_266>='a' && LA12_266<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=51;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            case 'a':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='m') ) {
                    int LA12_99 = input.LA(4);

                    if ( (LA12_99=='e') ) {
                        int LA12_136 = input.LA(5);

                        if ( (LA12_136=='s') ) {
                            int LA12_172 = input.LA(6);

                            if ( (LA12_172=='p') ) {
                                int LA12_206 = input.LA(7);

                                if ( (LA12_206=='a') ) {
                                    int LA12_239 = input.LA(8);

                                    if ( (LA12_239=='c') ) {
                                        int LA12_267 = input.LA(9);

                                        if ( (LA12_267=='e') ) {
                                            int LA12_284 = input.LA(10);

                                            if ( ((LA12_284>='0' && LA12_284<='9')||(LA12_284>='A' && LA12_284<='Z')||LA12_284=='_'||(LA12_284>='a' && LA12_284<='z')) ) {
                                                alt12=55;
                                            }
                                            else {
                                                alt12=16;}
                                        }
                                        else {
                                            alt12=55;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='x') ) {
                    int LA12_100 = input.LA(4);

                    if ( (LA12_100=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'd':
                            {
                            int LA12_173 = input.LA(6);

                            if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                alt12=55;
                            }
                            else {
                                alt12=50;}
                            }
                            break;
                        case 'L':
                            {
                            int LA12_174 = input.LA(6);

                            if ( (LA12_174=='e') ) {
                                int LA12_208 = input.LA(7);

                                if ( (LA12_208=='n') ) {
                                    int LA12_240 = input.LA(8);

                                    if ( ((LA12_240>='0' && LA12_240<='9')||(LA12_240>='A' && LA12_240<='Z')||LA12_240=='_'||(LA12_240>='a' && LA12_240<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                            }
                            break;
                        default:
                            alt12=55;}

                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            case 'o':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='r') ) {
                    int LA12_101 = input.LA(4);

                    if ( (LA12_101=='m') ) {
                        int LA12_138 = input.LA(5);

                        if ( (LA12_138=='a') ) {
                            int LA12_175 = input.LA(6);

                            if ( (LA12_175=='t') ) {
                                int LA12_209 = input.LA(7);

                                if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_102 = input.LA(4);

                    if ( (LA12_102=='i') ) {
                        int LA12_139 = input.LA(5);

                        if ( (LA12_139=='m') ) {
                            int LA12_176 = input.LA(6);

                            if ( (LA12_176=='a') ) {
                                int LA12_210 = input.LA(7);

                                if ( (LA12_210=='l') ) {
                                    int LA12_242 = input.LA(8);

                                    if ( ((LA12_242>='0' && LA12_242<='9')||(LA12_242>='A' && LA12_242<='Z')||LA12_242=='_'||(LA12_242>='a' && LA12_242<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=49;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_103 = input.LA(4);

                    if ( (LA12_103=='a') ) {
                        int LA12_140 = input.LA(5);

                        if ( (LA12_140=='u') ) {
                            int LA12_177 = input.LA(6);

                            if ( (LA12_177=='l') ) {
                                int LA12_211 = input.LA(7);

                                if ( (LA12_211=='t') ) {
                                    int LA12_243 = input.LA(8);

                                    if ( ((LA12_243>='0' && LA12_243<='9')||(LA12_243>='A' && LA12_243<='Z')||LA12_243=='_'||(LA12_243>='a' && LA12_243<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=47;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_104 = input.LA(4);

                    if ( (LA12_104=='i') ) {
                        int LA12_141 = input.LA(5);

                        if ( (LA12_141=='m') ) {
                            int LA12_178 = input.LA(6);

                            if ( (LA12_178=='i') ) {
                                int LA12_212 = input.LA(7);

                                if ( (LA12_212=='t') ) {
                                    int LA12_244 = input.LA(8);

                                    if ( (LA12_244=='e') ) {
                                        int LA12_271 = input.LA(9);

                                        if ( (LA12_271=='r') ) {
                                            int LA12_285 = input.LA(10);

                                            if ( ((LA12_285>='0' && LA12_285<='9')||(LA12_285>='A' && LA12_285<='Z')||LA12_285=='_'||(LA12_285>='a' && LA12_285<='z')) ) {
                                                alt12=55;
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=55;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 'r':
                    {
                    int LA12_105 = input.LA(4);

                    if ( (LA12_105=='i') ) {
                        int LA12_142 = input.LA(5);

                        if ( (LA12_142=='v') ) {
                            int LA12_179 = input.LA(6);

                            if ( (LA12_179=='e') ) {
                                int LA12_213 = input.LA(7);

                                if ( (LA12_213=='d') ) {
                                    int LA12_245 = input.LA(8);

                                    if ( ((LA12_245>='0' && LA12_245<='9')||(LA12_245>='A' && LA12_245<='Z')||LA12_245=='_'||(LA12_245>='a' && LA12_245<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=52;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                default:
                    alt12=55;}

                }
                break;
            case 'a':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'a':
                        {
                        int LA12_143 = input.LA(5);

                        if ( (LA12_143=='t') ) {
                            int LA12_180 = input.LA(6);

                            if ( (LA12_180=='y') ) {
                                int LA12_214 = input.LA(7);

                                if ( (LA12_214=='p') ) {
                                    int LA12_246 = input.LA(8);

                                    if ( (LA12_246=='e') ) {
                                        int LA12_273 = input.LA(9);

                                        if ( ((LA12_273>='0' && LA12_273<='9')||(LA12_273>='A' && LA12_273<='Z')||LA12_273=='_'||(LA12_273>='a' && LA12_273<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    case 'e':
                        {
                        int LA12_144 = input.LA(5);

                        if ( (LA12_144=='t') ) {
                            int LA12_181 = input.LA(6);

                            if ( (LA12_181=='i') ) {
                                int LA12_215 = input.LA(7);

                                if ( (LA12_215=='m') ) {
                                    int LA12_247 = input.LA(8);

                                    if ( (LA12_247=='e') ) {
                                        int LA12_274 = input.LA(9);

                                        if ( ((LA12_274>='0' && LA12_274<='9')||(LA12_274>='A' && LA12_274<='Z')||LA12_274=='_'||(LA12_274>='a' && LA12_274<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=46;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    default:
                        alt12=55;}

                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='l') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='i') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='n') ) {
                    int LA12_107 = input.LA(4);

                    if ( (LA12_107=='e') ) {
                        int LA12_145 = input.LA(5);

                        if ( (LA12_145=='S') ) {
                            int LA12_182 = input.LA(6);

                            if ( (LA12_182=='p') ) {
                                int LA12_216 = input.LA(7);

                                if ( (LA12_216=='e') ) {
                                    int LA12_248 = input.LA(8);

                                    if ( (LA12_248=='c') ) {
                                        int LA12_275 = input.LA(9);

                                        if ( ((LA12_275>='0' && LA12_275<='9')||(LA12_275>='A' && LA12_275<='Z')||LA12_275=='_'||(LA12_275>='a' && LA12_275<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'u':
                    {
                    int LA12_108 = input.LA(4);

                    if ( (LA12_108=='m') ) {
                        switch ( input.LA(5) ) {
                        case 'e':
                            {
                            int LA12_183 = input.LA(6);

                            if ( (LA12_183=='r') ) {
                                int LA12_217 = input.LA(7);

                                if ( (LA12_217=='a') ) {
                                    int LA12_249 = input.LA(8);

                                    if ( (LA12_249=='t') ) {
                                        int LA12_276 = input.LA(9);

                                        if ( (LA12_276=='i') ) {
                                            int LA12_289 = input.LA(10);

                                            if ( (LA12_289=='o') ) {
                                                int LA12_295 = input.LA(11);

                                                if ( (LA12_295=='n') ) {
                                                    int LA12_296 = input.LA(12);

                                                    if ( ((LA12_296>='0' && LA12_296<='9')||(LA12_296>='A' && LA12_296<='Z')||LA12_296=='_'||(LA12_296>='a' && LA12_296<='z')) ) {
                                                        alt12=55;
                                                    }
                                                    else {
                                                        alt12=26;}
                                                }
                                                else {
                                                    alt12=55;}
                                            }
                                            else {
                                                alt12=55;}
                                        }
                                        else {
                                            alt12=55;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
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
                            alt12=55;
                            }
                            break;
                        default:
                            alt12=34;}

                    }
                    else {
                        alt12=55;}
                    }
                    break;
                case 't':
                    {
                    int LA12_109 = input.LA(4);

                    if ( (LA12_109=='i') ) {
                        int LA12_147 = input.LA(5);

                        if ( (LA12_147=='t') ) {
                            int LA12_185 = input.LA(6);

                            if ( (LA12_185=='y') ) {
                                int LA12_218 = input.LA(7);

                                if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                default:
                    alt12=55;}

                }
                break;
            case 'x':
                {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='t') ) {
                    int LA12_110 = input.LA(4);

                    if ( (LA12_110=='e') ) {
                        int LA12_148 = input.LA(5);

                        if ( (LA12_148=='n') ) {
                            int LA12_186 = input.LA(6);

                            if ( (LA12_186=='d') ) {
                                int LA12_219 = input.LA(7);

                                if ( (LA12_219=='s') ) {
                                    int LA12_251 = input.LA(8);

                                    if ( ((LA12_251>='0' && LA12_251<='9')||(LA12_251>='A' && LA12_251<='Z')||LA12_251=='_'||(LA12_251>='a' && LA12_251<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=22;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0==':') ) {
            alt12=23;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='e') ) {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA12_111 = input.LA(4);

                    if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                        alt12=55;
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'g':
                    {
                    int LA12_112 = input.LA(4);

                    if ( (LA12_112=='e') ) {
                        int LA12_150 = input.LA(5);

                        if ( (LA12_150=='x') ) {
                            int LA12_187 = input.LA(6);

                            if ( (LA12_187=='p') ) {
                                int LA12_220 = input.LA(7);

                                if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=33;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                    }
                    break;
                default:
                    alt12=55;}

            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='p') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='p') ) {
                    int LA12_113 = input.LA(4);

                    if ( (LA12_113=='o') ) {
                        int LA12_151 = input.LA(5);

                        if ( (LA12_151=='s') ) {
                            int LA12_188 = input.LA(6);

                            if ( (LA12_188=='i') ) {
                                int LA12_221 = input.LA(7);

                                if ( (LA12_221=='t') ) {
                                    int LA12_253 = input.LA(8);

                                    if ( (LA12_253=='e') ) {
                                        int LA12_278 = input.LA(9);

                                        if ( ((LA12_278>='0' && LA12_278<='9')||(LA12_278>='A' && LA12_278<='Z')||LA12_278=='_'||(LA12_278>='a' && LA12_278<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=25;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='[') ) {
            alt12=27;
        }
        else if ( (LA12_0==']') ) {
            alt12=28;
        }
        else if ( (LA12_0==';') ) {
            alt12=29;
        }
        else if ( (LA12_0=='=') ) {
            alt12=30;
        }
        else if ( (LA12_0=='.') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='*') ) {
                alt12=31;
            }
            else {
                alt12=32;}
        }
        else if ( (LA12_0=='m') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_70 = input.LA(3);

                if ( (LA12_70=='n') ) {
                    switch ( input.LA(4) ) {
                    case 'V':
                        {
                        int LA12_152 = input.LA(5);

                        if ( (LA12_152=='a') ) {
                            int LA12_189 = input.LA(6);

                            if ( (LA12_189=='l') ) {
                                int LA12_222 = input.LA(7);

                                if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    case 'L':
                        {
                        int LA12_153 = input.LA(5);

                        if ( (LA12_153=='e') ) {
                            int LA12_190 = input.LA(6);

                            if ( (LA12_190=='n') ) {
                                int LA12_223 = input.LA(7);

                                if ( ((LA12_223>='0' && LA12_223<='9')||(LA12_223>='A' && LA12_223<='Z')||LA12_223=='_'||(LA12_223>='a' && LA12_223<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    default:
                        alt12=55;}

                }
                else {
                    alt12=55;}
                }
                break;
            case 'a':
                {
                int LA12_71 = input.LA(3);

                if ( (LA12_71=='x') ) {
                    switch ( input.LA(4) ) {
                    case 'L':
                        {
                        int LA12_154 = input.LA(5);

                        if ( (LA12_154=='e') ) {
                            int LA12_191 = input.LA(6);

                            if ( (LA12_191=='n') ) {
                                int LA12_224 = input.LA(7);

                                if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=39;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    case 'V':
                        {
                        int LA12_155 = input.LA(5);

                        if ( (LA12_155=='a') ) {
                            int LA12_192 = input.LA(6);

                            if ( (LA12_192=='l') ) {
                                int LA12_225 = input.LA(7);

                                if ( ((LA12_225>='0' && LA12_225<='9')||(LA12_225>='A' && LA12_225<='Z')||LA12_225=='_'||(LA12_225>='a' && LA12_225<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=37;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                        }
                        break;
                    default:
                        alt12=55;}

                }
                else {
                    alt12=55;}
                }
                break;
            default:
                alt12=55;}

        }
        else if ( (LA12_0=='X') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='S') ) {
                int LA12_72 = input.LA(3);

                if ( (LA12_72=='D') ) {
                    int LA12_116 = input.LA(4);

                    if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                        alt12=55;
                    }
                    else {
                        alt12=41;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='*') ) {
            alt12=42;
        }
        else if ( (LA12_0=='?') ) {
            alt12=43;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='o') ) {
                int LA12_75 = input.LA(3);

                if ( (LA12_75=='o') ) {
                    int LA12_117 = input.LA(4);

                    if ( (LA12_117=='l') ) {
                        int LA12_157 = input.LA(5);

                        if ( (LA12_157=='e') ) {
                            int LA12_193 = input.LA(6);

                            if ( (LA12_193=='a') ) {
                                int LA12_226 = input.LA(7);

                                if ( (LA12_226=='n') ) {
                                    int LA12_258 = input.LA(8);

                                    if ( ((LA12_258>='0' && LA12_258<='9')||(LA12_258>='A' && LA12_258<='Z')||LA12_258=='_'||(LA12_258>='a' && LA12_258<='z')) ) {
                                        alt12=55;
                                    }
                                    else {
                                        alt12=44;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_27 = input.LA(2);

            if ( (LA12_27=='t') ) {
                int LA12_76 = input.LA(3);

                if ( (LA12_76=='r') ) {
                    int LA12_118 = input.LA(4);

                    if ( (LA12_118=='i') ) {
                        int LA12_158 = input.LA(5);

                        if ( (LA12_158=='n') ) {
                            int LA12_194 = input.LA(6);

                            if ( (LA12_194=='g') ) {
                                int LA12_227 = input.LA(7);

                                if ( ((LA12_227>='0' && LA12_227<='9')||(LA12_227>='A' && LA12_227<='Z')||LA12_227=='_'||(LA12_227>='a' && LA12_227<='z')) ) {
                                    alt12=55;
                                }
                                else {
                                    alt12=45;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_28 = input.LA(2);

            if ( (LA12_28=='r') ) {
                int LA12_77 = input.LA(3);

                if ( (LA12_77=='i') ) {
                    int LA12_119 = input.LA(4);

                    if ( (LA12_119=='t') ) {
                        int LA12_159 = input.LA(5);

                        if ( (LA12_159=='a') ) {
                            int LA12_195 = input.LA(6);

                            if ( (LA12_195=='b') ) {
                                int LA12_228 = input.LA(7);

                                if ( (LA12_228=='l') ) {
                                    int LA12_260 = input.LA(8);

                                    if ( (LA12_260=='e') ) {
                                        int LA12_280 = input.LA(9);

                                        if ( ((LA12_280>='0' && LA12_280<='9')||(LA12_280>='A' && LA12_280<='Z')||LA12_280=='_'||(LA12_280>='a' && LA12_280<='z')) ) {
                                            alt12=55;
                                        }
                                        else {
                                            alt12=53;}
                                    }
                                    else {
                                        alt12=55;}
                                }
                                else {
                                    alt12=55;}
                            }
                            else {
                                alt12=55;}
                        }
                        else {
                            alt12=55;}
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='x') ) {
            int LA12_29 = input.LA(2);

            if ( (LA12_29=='s') ) {
                int LA12_78 = input.LA(3);

                if ( (LA12_78=='d') ) {
                    int LA12_120 = input.LA(4);

                    if ( (LA12_120==' ') ) {
                        alt12=54;
                    }
                    else {
                        alt12=55;}
                }
                else {
                    alt12=55;}
            }
            else {
                alt12=55;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_30 = input.LA(2);

            if ( ((LA12_30>='A' && LA12_30<='Z')||LA12_30=='_'||(LA12_30>='a' && LA12_30<='z')) ) {
                alt12=55;
            }
            else {
                alt12=61;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='B')||LA12_0=='E'||(LA12_0>='G' && LA12_0<='W')||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='c'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='q'||(LA12_0>='t' && LA12_0<='v')||(LA12_0>='y' && LA12_0<='z')) ) {
            alt12=55;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=56;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_33 = input.LA(2);

            if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFE')) ) {
                alt12=57;
            }
            else {
                alt12=61;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_34 = input.LA(2);

            if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFE')) ) {
                alt12=57;
            }
            else {
                alt12=61;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=58;
                }
                break;
            case '/':
                {
                alt12=59;
                }
                break;
            default:
                alt12=61;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=60;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='-')||LA12_0=='<'||LA12_0=='>'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=61;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 58 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 59 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 60 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}