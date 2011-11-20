/*
 * generated by Xtext
 */
 
package fr.chaunier.xtext.mapping.generator

import fr.chaunier.xtext.mapping.CompletePathMappingBuilder
import fr.chaunier.xtext.mapping.FunctionArgs
import fr.chaunier.xtext.mapping.MapArgs
import fr.chaunier.xtext.mapping.PathMapFeatureRule
import fr.chaunier.xtext.mapping.RuleArgs
import fr.chaunier.xtext.mapping.SetArgs
import fr.chaunier.xtext.mapping.mapDsl.ModelMap
import fr.chaunier.xtext.mapping.mapDsl.FileSpecModel
import fr.chaunier.xtext.mapping.mapDsl.SpecInfo
import fr.chaunier.xtext.mapping.mapDsl.SpecVersion
import fr.chaunier.xtext.mapping.mapDsl.SpecLine
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

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*


class TextileGenerator implements IGenerator {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		var generatorExtensions = new MapGeneratorExtensions()
	    for(modelMap : input.allContentsIterable.filter(typeof(ModelMap))) {
	      	fsa.generateFile(generatorExtensions.fileName(modelMap), compileTxt(modelMap))
		}
	}

//    @Inject CompletePathMappingBuilder builder 
//    @Inject OmHelper omHelper 

//		// use the standard configuration
//		Xtend11_Modularization instance = Guice.createInjector().getInstance(Xtend11_Modularization.class);

	def compileTxt(ModelMap mdl) '''
	�var builder = new CompletePathMappingBuilder()�
	�var pairMap = builder.map(mdl)�
   	�val entityHelper = new OmHelper()�
    �val iconPath = '../' + Helpers::getRelativeRoot(entityHelper.QualifiedName(mdl)) + 'icons/'�
�dumpSpec(mdl)�
	�dumpMappingView(mdl,pairMap,iconPath)�
	�dumpFromView(mdl,pairMap)�
	�dumpToView(mdl,pairMap)�

'''

	def dumpSpec(ModelMap mdl) '''
�var omHelper = new OmHelper()�
�val entitySrc = omHelper.QualifiedName(mdl.entityFrom)�
�val entityTarget = omHelper.QualifiedName(mdl.entityTo)�
|**Model**�|�mdl.name�|
|**Source**|�entitySrc.toString�|
|**Target**|�entityTarget.toString�|
�dumpSpec(mdl.spec)�
'''
 
def dumpMappingView(ModelMap mdl,PathMapFeatureRule pairMap,String iconPath) '''
�var omHelper = new OmHelper()�

	h3. mapping

table{border:1px solid black}.
|_. **Source** |_. |_. Feature |_. [..] |_. Constraint |_. |_. **Target** |_. |_. Feature |_. [..] |_. Constraint  |_. Rule
		�FOR mapFromTo:pairMap.pathMaps�
	�var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute�
	�var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute�
	�var msgRenderer = MessageFactory::messageInstance�
	�msgRenderer.setIconPath(iconPath)�
    �val iconCf=msgRenderer.elementType(cf)�
    �val iconSt=msgRenderer.elementType(st)�
    �val src= getPath(mdl.sourcePath,mapFromTo.first)�
    �val target=getPath(mdl.targetPath,mapFromTo.second)�
 |�src� | �msgRenderer.constraintType(cf)� | �getReference(cf)� | �msgRenderer.cardinality(cf)� | �msgRenderer.constraintInFeature(cf)�  | -> | �target�  | �msgRenderer.constraintType(st)� | �getReference(st)� | �msgRenderer.cardinality(st)� | �msgRenderer.constraintInFeature(st)� | �renderArgs(pairMap,mapFromTo)� 
	�ENDFOR�
'''

	
	def getReference(Attribute a) {
	var omHelper = new OmHelper()
	if ( a == null ) return ""
	if ( a.type == null || a.type.referenced == null ) return ""
	omHelper.QualifiedName(a.type.referenced).toString
	}

	def dumpFromView(ModelMap mdl,PathMapFeatureRule pairMap) '''
	
	h3. source oriented mapping view
	
	�var path = new FeaturePathBuilder()�
	�var instanceManager = new InstancePathManager(mdl.entityFrom)�
	�path.compilePath(mdl.entityFrom,instanceManager)�
	
	table{border:1px solid black}.
	| **source** |  | **destination** | 
	�FOR pFrom:instanceManager.paths�
	�val pTo = pairMap.getPathFrom(pFrom)� 
    �val src= getPath(mdl.sourcePath,pFrom)�
    �val target=getPath(mdl.targetPath,pTo)�
	| �src� |  -> |  �target� |     
	�ENDFOR�
	'''

	def dumpToView(ModelMap mdl,PathMapFeatureRule pairMap) '''
		
	h3. taget oriented view mapping
	
	�var path = new FeaturePathBuilder()�
	�var instanceManager = new InstancePathManager(mdl.entityTo)�
	�path.compilePath(mdl.entityTo,instanceManager)�
	
	table{border:1px solid black}.
	| **source** |  | **destination** |  
	�FOR pTo:instanceManager.paths�
	�val pFrom = pairMap.getPathTo(pTo)� 
    �val src= getPath(mdl.sourcePath,pFrom)�
    �val target=getPath(mdl.targetPath,pTo)�
	| �src� |  -> |  �target�.�pTo� | 
	�ENDFOR�
	'''


def renderArgs(PathMapFeatureRule pathMap,Pair<String,String> mapFromTo) {
		val args = pathMap.getMapArgs(mapFromTo)
		if ( args != null ) renderArgs(args)
		else return ''	
	}

def dispatch renderArgs(MapArgs args) {
	return args.name
}
	
def dispatch renderArgs(SetArgs args) {
	return args.name //+ ' ' + args.value
}

def dispatch renderArgs(RuleArgs args) {
	return args.name + ' ' + args.args 
}

def dispatch renderArgs(FunctionArgs args) {
	return args.name + ' ' + args.operation 
}

	def getPath(String prefix,String body) {
		if ( body == null )
			return ""
		if ( prefix != null){
			return prefix+'.'+body
		} else return body
	}


	def dumpSpec(FileSpecModel specs) {
		if ( specs != null )
		for ( sl : specs.specLines )
			 dumpSpec(sl)
	} 
	

	def dispatch dumpSpec(SpecLine psec) '''
	'''

	def dispatch dumpSpec(SpecInfo spec) '''
		**�spec.title�** | �spec.label�
	''' 

	def dispatch dumpSpec(SpecVersion spec) '''
		**version : �spec.version�** | �spec.comment�
	''' 
}



	
