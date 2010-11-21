lexer grammar InternalBomDsl;
@header {
package fr.chaunier.xtext.bom.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'package' ;
T13 : 'prefix' ;
T14 : 'namespace' ;
T15 : '{' ;
T16 : 'format' ;
T17 : 'XSD' ;
T18 : 'DTD' ;
T19 : 'FLAT' ;
T20 : 'CSV' ;
T21 : 'DB' ;
T22 : 'delimiter' ;
T23 : 'lineSpec' ;
T24 : '}' ;
T25 : 'datatype' ;
T26 : 'entity' ;
T27 : 'extends' ;
T28 : ':' ;
T29 : 'ref' ;
T30 : 'opposite' ;
T31 : 'enumeration' ;
T32 : '[' ;
T33 : ']' ;
T34 : '=' ;
T35 : ';' ;
T36 : '*' ;
T37 : '?' ;
T38 : '.*' ;
T39 : '.' ;
T40 : 'boolean' ;
T41 : 'default' ;
T42 : 'true' ;
T43 : 'false' ;
T44 : 'string' ;
T45 : 'fixed' ;
T46 : 'minLen' ;
T47 : 'maxLen' ;
T48 : 'fixeLen' ;
T49 : 'xsd Att.' ;
T50 : 'regexp' ;
T51 : 'datetime' ;
T52 : 'integer' ;
T53 : 'minVal' ;
T54 : 'maxVal' ;
T55 : 'paddle' ;
T56 : 'decimal' ;
T57 : 'enum' ;
T58 : 'as String' ;
T59 : 'as bool String' ;
T60 : 'as Value' ;
T61 : 'as bool Value' ;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2680
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2682
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2684
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2686
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2688
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2690
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2692
RULE_ANY_OTHER : .;


