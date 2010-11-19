lexer grammar InternalMapDsl;
@header {
package fr.chaunier.xtext.map.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : '.*' ;
T13 : '.' ;
T14 : 'module' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'mapClass' ;
T18 : 'between' ;
T19 : 'and' ;
T20 : ';' ;
T21 : 'map' ;
T22 : '=>' ;
T23 : 'set left' ;
T24 : '=' ;
T25 : 'set right' ;
T26 : 'ignore left' ;

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 735
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 737
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 739
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 741
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 743
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 745
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g" 747
RULE_ANY_OTHER : .;


