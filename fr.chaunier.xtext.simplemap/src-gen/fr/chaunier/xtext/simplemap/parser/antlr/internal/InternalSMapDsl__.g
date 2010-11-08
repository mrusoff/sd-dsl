lexer grammar InternalSMapDsl;
@header {
package fr.chaunier.xtext.simplemap.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '.' ;
T12 : 'module' ;
T13 : '{' ;
T14 : ';' ;
T15 : '}' ;
T16 : 'map' ;
T17 : '=>' ;
T18 : 'set left' ;
T19 : '=' ;
T20 : 'set right' ;
T21 : 'ignore left' ;

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 485
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 487
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 489
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 491
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 493
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 495
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g" 497
RULE_ANY_OTHER : .;


