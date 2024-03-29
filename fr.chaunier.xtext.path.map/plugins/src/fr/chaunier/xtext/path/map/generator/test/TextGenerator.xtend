/*
 * generated by Xtext
 */
 
package fr.chaunier.xtext.path.map.generator.test

import fr.chaunier.xtext.path.map.utils.PathMappingBuilder
import fr.chaunier.xtext.path.map.utils.FunctionArgs
import fr.chaunier.xtext.path.map.utils.MapArgs
import fr.chaunier.xtext.path.map.utils.PathMapFeature
import fr.chaunier.xtext.path.map.utils.RuleArgs
import fr.chaunier.xtext.path.map.utils.SetArgs
import fr.chaunier.xtext.path.map.pathDsl.ModelMap
import fr.chaunier.xtext.path.map.pathDsl.FileSpecModel
import fr.chaunier.xtext.path.map.pathDsl.SpecInfo
import fr.chaunier.xtext.path.map.pathDsl.SpecVersion
import fr.chaunier.xtext.path.map.pathDsl.SpecLine
import fr.chaunier.xtext.omc.FeaturePathBuilder
import fr.chaunier.xtext.omc.Helpers
import fr.chaunier.xtext.omc.InstancePathManager
import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.generator.msg.MessageFactory
import fr.chaunier.xtext.omc.omcDsl.Attribute
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.internal.xtend.util.Pair
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import fr.chaunier.xtext.path.map.DumpPathMapFeature

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import fr.chaunier.xtext.omc.DumpInstancePath


class TextGenerator implements IGenerator {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		
		var generatorExtensions = new MapGeneratorExtensions()
	    for(modelMap : input.allContentsIterable.filter(typeof(ModelMap))) {
	    	if ( modelMap.spec != null && modelMap.spec.mapping != null )
		      	fsa.generateFile(generatorExtensions.fileName(modelMap), compileTxt(modelMap))
		}
	}

//    @Inject CompletePathMappingBuilder builder 
//    @Inject OmHelper omHelper 

//		// use the standard configuration
//		Xtend11_Modularization instance = Guice.createInjector().getInstance(Xtend11_Modularization.class);

//	�var dump = new DumpPathMapFeature()�
//	�var d = dump.dump(pairMap)�

	def compileTxt(ModelMap mdl) '''
	�IF mdl.spec.mapping == null� ""
	�ELSE�
	�var builder = new PathMappingBuilder()�
	�var pairMap = builder.map(mdl)�
	�FOR p :pairMap.pathMaps �
		�p.first�	�p.second�
	�ENDFOR�
	�ENDIF�
'''

}



	
