lexer grammar InternalSMapDsl;
@header {
package fr.chaunier.xtext.simplemap.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '.' ;
T12 : 'module' ;
T13 : '{' ;
T14 : '}' ;
T15 : ';' ;
T16 : 'map' ;
T17 : '=>' ;
T18 : 'set left' ;
T19 : '=' ;
T20 : 'set right' ;
T21 : 'ignore left' ;

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1267
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1269
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1271
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1273
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1275
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1277
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g" 1279
RULE_ANY_OTHER : .;


