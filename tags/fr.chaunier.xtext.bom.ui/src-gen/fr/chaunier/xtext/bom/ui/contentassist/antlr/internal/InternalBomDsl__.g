lexer grammar InternalBomDsl;
@header {
package fr.chaunier.xtext.bom.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'abstract' ;
T12 : 'DTD' ;
T13 : 'FLAT' ;
T14 : 'CSV' ;
T15 : 'DB' ;
T16 : 'public' ;
T17 : 'private' ;
T18 : 'protected' ;
T19 : 'as String' ;
T20 : 'as Value' ;
T21 : 'import' ;
T22 : 'package' ;
T23 : '{' ;
T24 : '}' ;
T25 : 'prefix' ;
T26 : 'namespace' ;
T27 : 'format' ;
T28 : 'delimiter' ;
T29 : 'lineSpec' ;
T30 : 'datatype' ;
T31 : 'entity' ;
T32 : 'extends' ;
T33 : ':' ;
T34 : 'ref' ;
T35 : 'opposite' ;
T36 : 'enumeration' ;
T37 : '[' ;
T38 : ']' ;
T39 : ';' ;
T40 : '=' ;
T41 : '.*' ;
T42 : '.' ;
T43 : 'regexp' ;
T44 : 'enum' ;
T45 : 'fixeLen' ;
T46 : 'minVal' ;
T47 : 'maxVal' ;
T48 : 'minLen' ;
T49 : 'maxLen' ;
T50 : 'paddle' ;
T51 : 'XSD' ;
T52 : '*' ;
T53 : '?' ;
T54 : 'boolean' ;
T55 : 'string' ;
T56 : 'datetime' ;
T57 : 'default' ;
T58 : 'integer' ;
T59 : 'decimal' ;
T60 : 'fixed' ;
T61 : 'nullable' ;
T62 : 'derived' ;
T63 : 'writable' ;
T64 : 'xsd Att.' ;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6814
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6816
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6818
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6820
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6822
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6824
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g" 6826
RULE_ANY_OTHER : .;


