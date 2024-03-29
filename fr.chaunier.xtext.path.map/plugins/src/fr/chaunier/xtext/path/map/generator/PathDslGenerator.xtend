/*
 * generated by Xtext
 */
package fr.chaunier.xtext.path.map.generator

import fr.chaunier.xtext.path.map.generator.test.TextGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class PathDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	    val gen = new TextileGenerator() 
	    gen.doGenerate(resource,fsa); 	

	    val genTest = new TextGenerator() 
	    genTest.doGenerate(resource,fsa); 	
	}
}
