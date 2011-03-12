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
T41 : 'string' ;
T42 : 'regexp' ;
T43 : 'datetime' ;
T44 : 'default' ;
T45 : 'integer' ;
T46 : 'decimal' ;
T47 : 'enum' ;
T48 : 'fixeLen' ;
T49 : 'minVal' ;
T50 : 'maxVal' ;
T51 : 'fixed' ;
T52 : 'minLen' ;
T53 : 'maxLen' ;
T54 : 'paddle' ;
T55 : 'nullable' ;
T56 : 'derived' ;
T57 : 'writable' ;
T58 : 'xsd Att.' ;
T59 : 'public' ;
T60 : 'private' ;
T61 : 'protected' ;
T62 : 'abstract' ;
T63 : 'as String' ;
T64 : 'as Value' ;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2738
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2740
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2742
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2744
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2746
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2748
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g" 2750
RULE_ANY_OTHER : .;


