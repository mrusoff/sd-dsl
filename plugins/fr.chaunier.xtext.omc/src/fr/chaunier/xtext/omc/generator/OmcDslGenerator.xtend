/*
 * generated by Xtext
 */
package fr.chaunier.xtext.omc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import fr.chaunier.xtext.omc.generator.oo.OoTextileGenerator 
import fr.chaunier.xtext.omc.generator.msg.MessageTextileGenerator 
import fr.chaunier.xtext.omc.generator.instance.InstanceGenerator 

class OmcDslGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	    val ooGen = new OoTextileGenerator() 
	    ooGen.doGenerate(resource,fsa); 	

	    val msgGen = new MessageTextileGenerator() 
	    msgGen.doGenerate(resource,fsa); 	

	    val instGen = new InstanceGenerator() 
	    instGen.doGenerate(resource,fsa);
	    
	}
}