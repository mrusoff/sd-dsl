/*
 * generated by Xtext
 */
package fr.chaunier.xtext.project.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class PrjDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	    val gen = new TextileGenerator() 
	    gen.doGenerate(resource,fsa); 	
	}
}