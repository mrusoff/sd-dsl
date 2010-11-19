lexer grammar InternalBomDsl;
@header {
package fr.chaunier.xtext.bom.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'false' ;
T12 : 'as String' ;
T13 : 'as bool String' ;
T14 : 'as Value' ;
T15 : 'as bool Value' ;
T16 : 'import' ;
T17 : 'package' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'prefix' ;
T21 : 'namespace' ;
T22 : 'datatype' ;
T23 : 'entity' ;
T24 : 'extends' ;
T25 : ':' ;
T26 : 'ref' ;
T27 : 'opposite' ;
T28 : '.*' ;
T29 : '.' ;
T30 : 'minLen' ;
T31 : 'maxLen' ;
T32 : 'fixeLen' ;
T33 : 'regexp' ;
T34 : 'minVal' ;
T35 : 'maxVal' ;
T36 : 'paddle' ;
T37 : 'enumeration' ;
T38 : '[' ;
T39 : ']' ;
T40 : ';' ;
T41 : '=' ;
T42 : 'enum' ;
T43 : '*' ;
T44 : '?' ;
T45 : 'boolean' ;
T46 : 'default' ;
T47 : 'true' ;
T48 : 'string' ;
T49 : 'datetime' ;
T50 : 'integer' ;
T51 : 'decimal' ;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5791
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5793
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5795
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5797
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5799
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5801
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 5803
RULE_ANY_OTHER : .;


