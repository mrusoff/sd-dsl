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
T16 : '}' ;
T17 : 'datatype' ;
T18 : 'entity' ;
T19 : 'extends' ;
T20 : ':' ;
T21 : 'ref' ;
T22 : 'opposite' ;
T23 : '*' ;
T24 : '?' ;
T25 : '.*' ;
T26 : '.' ;
T27 : 'boolean' ;
T28 : 'default' ;
T29 : 'true' ;
T30 : 'false' ;
T31 : 'string' ;
T32 : 'minLen' ;
T33 : 'maxLen' ;
T34 : 'fixeLen' ;
T35 : 'regexp' ;
T36 : 'datetime' ;
T37 : 'integer' ;
T38 : 'minVal' ;
T39 : 'maxVal' ;
T40 : 'paddle' ;
T41 : 'decimal' ;
T42 : 'enumeration' ;
T43 : '[' ;
T44 : ']' ;
T45 : '=' ;
T46 : ';' ;
T47 : 'enum' ;
T48 : 'as String' ;
T49 : 'as bool String' ;
T50 : 'as Value' ;
T51 : 'as bool Value' ;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2312
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2314
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2316
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2318
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2320
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2322
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2324
RULE_ANY_OTHER : .;


