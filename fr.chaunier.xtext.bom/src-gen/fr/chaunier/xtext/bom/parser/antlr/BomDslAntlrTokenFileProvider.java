/*
* generated by Xtext
*/
package fr.chaunier.xtext.bom.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BomDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.tokens");
	}
}
