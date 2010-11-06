lexer grammar InternalMapDsl;
@header {
package fr.chaunier.xtext.map.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
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

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1937
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1939
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1941
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1943
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1945
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1947
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g" 1949
RULE_ANY_OTHER : .;


