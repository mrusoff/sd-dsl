package fr.chaunier.xtext.project.generator

import fr.chaunier.xtext.omc.generator.msg.MessageFactory
import fr.chaunier.xtext.mapping.CompletePathMappingBuilder
import fr.chaunier.xtext.mapping.PathMapFeatureRule
import fr.chaunier.xtext.mapping.mapDsl.ModelMap
import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.omcDsl.Attribute
//import fr.chaunier.xtext.project.LinkPathMap
import fr.chaunier.xtext.project.LinkPathsMap
import fr.chaunier.xtext.project.prjDsl.TransformationGroup
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.internal.xtend.util.Pair
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class TextileGenerator implements IGenerator {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		var generatorExtensions = new PrjGeneratorExtensions()
	    for(modelMap : input.allContentsIterable.filter(typeof(TransformationGroup))) {
	      	fsa.generateFile(generatorExtensions.fileName(modelMap), compileTxt(modelMap))
		}
	}

	def dumpSpec(String title,PathMapFeatureRule pairMap) '''
«var omHelper = new OmHelper()»
«val entitySrc = omHelper.QualifiedName(pairMap.source)»
«val entityTarget = omHelper.QualifiedName(pairMap.target)»
|**Model** |«title»|
|**Source** |«entitySrc.toString»|
|**Target** |«entityTarget.toString»|
	'''

	def getReference(Attribute a) {
	if ( a == null) 
		return ""
	if ( a.type == null) 
		return ""
	 if (a.type.referenced == null ) 
	 	return ""
	var omHelper = new OmHelper()
	omHelper.QualifiedName(a.type.referenced).toString
	}

	def getPath(ModelMap mdl) {
		var builder = new CompletePathMappingBuilder()
		return builder.map(mdl)
	} 
  
  
	def renderRule(PathMapFeatureRule pathMap,Pair<String,String> mapFromTo) {
		val rule = pathMap.getMapArgs(mapFromTo)
		if ( rule != null ) return rule.name
		else return ' '	
	}

  def dumpModel(PathMapFeatureRule pairMap) '''	

«val iconPath = '../../icons/'»

table{border:1px solid black}.
|_. **Source** |_. |_. Feature |_. [..] |_. Constraint |_. |_. **Target** |_. |_. « »Feature |_. [..] |_. Constraint  |_. Rule
	«FOR mapFromTo:pairMap.pathMaps»
	«var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute»
	«var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute»
	«var msgRenderer = MessageFactory::messageInstance»
	«msgRenderer.setIconPath(iconPath)»
    «val iconCf=msgRenderer.elementType(cf)»
    «val iconSt=msgRenderer.elementType(st)»
	     | «mapFromTo.first» | «msgRenderer.constraintType(cf)» | «getReference(cf)» | «msgRenderer.cardinality(cf)» | «msgRenderer.constraintInFeature(cf)» | -> | «mapFromTo.second»  | «msgRenderer.constraintType(st)» | «getReference(st)» | «msgRenderer.cardinality(st)» | «msgRenderer.constraintInFeature(st)» | «renderRule(pairMap,mapFromTo)» 
	«ENDFOR»
     '''

  def compileTxt(TransformationGroup grp) '''
h1. transformation group : «grp.name»
   
«dumpSequence(grp)»
'''	

def dumpSequence(TransformationGroup grp) {
	var stringBuilder = new StringBuilder()
	var builder = new LinkPathsMap()
	var previous = null as PathMapFeatureRule
	var workOk = true
	for (t:grp.sequences) {
	   var current = getPath(t.model)
	   if (previous == null) {
		  previous = current
	   }
	   else {
	     if  (current.source == previous.target)
	   	 	previous = builder.link(previous,current)
	   	 else
	   	 	workOk=false
	   	}
		stringBuilder.append(dumpSpec(t.model.name,current))
		stringBuilder.append("p. \n")
		stringBuilder.append(dumpModel(current))
		stringBuilder.append("p. \n")
	}
	if (workOk) {
	  	stringBuilder.append(dumpSpec("result mapping",previous))
		stringBuilder.append("p. \n")
	  	stringBuilder.append(dumpModel(previous))
		stringBuilder.append("p. \n")
	}
    else
    	stringBuilder.append('Erreur entité destination premier mapping incompatible avec entité source second mapping')
    return stringBuilder.toString	
}



	   
  
  
  
}
