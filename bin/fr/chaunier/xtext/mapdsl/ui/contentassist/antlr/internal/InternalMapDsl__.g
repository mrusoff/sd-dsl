lexer grammar InternalMapDsl;
@header {
package fr.chaunier.xtext.mapdsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'model' ;
T12 : '.' ;
T13 : 'root' ;
T14 : 'module' ;
T15 : '{' ;
T16 : '}' ;
T17 : ';' ;
T18 : 'map' ;
T19 : '=>' ;
T20 : ',' ;
T21 : 'set left' ;
T22 : '=' ;
T23 : 'set right' ;
T24 : 'ignore left' ;
T25 : 'ignore right' ;
T26 : 'call module' ;
T27 : 'rule' ;

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2580
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2582
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2584
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2586
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2588
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2590
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.mapdsl.ui/src-gen/fr/chaunier/xtext/mapdsl/ui/contentassist/antlr/internal/InternalMapDsl.g" 2592
RULE_ANY_OTHER : .;


