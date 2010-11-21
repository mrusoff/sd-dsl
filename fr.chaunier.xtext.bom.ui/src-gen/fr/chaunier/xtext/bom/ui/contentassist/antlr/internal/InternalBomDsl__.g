lexer grammar InternalBomDsl;
@header {
package fr.chaunier.xtext.bom.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'DTD' ;
T12 : 'FLAT' ;
T13 : 'CSV' ;
T14 : 'DB' ;
T15 : 'false' ;
T16 : 'as String' ;
T17 : 'as bool String' ;
T18 : 'as Value' ;
T19 : 'as bool Value' ;
T20 : 'import' ;
T21 : 'package' ;
T22 : '{' ;
T23 : '}' ;
T24 : 'prefix' ;
T25 : 'namespace' ;
T26 : 'format' ;
T27 : 'delimiter' ;
T28 : 'lineSpec' ;
T29 : 'datatype' ;
T30 : 'entity' ;
T31 : 'extends' ;
T32 : ':' ;
T33 : 'ref' ;
T34 : 'opposite' ;
T35 : 'enumeration' ;
T36 : '[' ;
T37 : ']' ;
T38 : ';' ;
T39 : '=' ;
T40 : '.*' ;
T41 : '.' ;
T42 : 'minLen' ;
T43 : 'maxLen' ;
T44 : 'fixeLen' ;
T45 : 'regexp' ;
T46 : 'minVal' ;
T47 : 'maxVal' ;
T48 : 'paddle' ;
T49 : 'enum' ;
T50 : 'XSD' ;
T51 : '*' ;
T52 : '?' ;
T53 : 'boolean' ;
T54 : 'default' ;
T55 : 'true' ;
T56 : 'string' ;
T57 : 'fixed' ;
T58 : 'xsd Att.' ;
T59 : 'datetime' ;
T60 : 'integer' ;
T61 : 'decimal' ;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6959
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6961
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6963
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6965
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6967
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6969
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6971
RULE_ANY_OTHER : .;


