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
		stringBuilder.append(dumpModel(t.model.name,current))
	}
	if (workOk)
	  stringBuilder.append(dumpModel("result mapping",previous))
    else
    	stringBuilder.append('Erreur entité destination premier mapping incompatible avec entité source second mapping')
    return stringBuilder.toString	
}


  def dumpModel(String title,PathMapFeatureRule pairMap) '''	

«val iconPath = '../../icons/'»

h3.	model «title»  source : «pairMap.source.name» target : «pairMap.target.name»
		
table{border:1px solid black}.
|_. **Source** |_. Name |_. [..] |_. Constraint |_. |_. **Target** |_. Name |_. [..] |_. Constraint  |_. Rule
	«FOR mapFromTo:pairMap.pathMaps»
	«var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute»
	«var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute»
	«var msgRenderer = MessageFactory::messageInstance»
	«msgRenderer.setIconPath(iconPath)»
    «val iconCf=msgRenderer.elementType(cf)»
    «val iconSt=msgRenderer.elementType(st)»
	     | «mapFromTo.first» | «getReference(cf)» | «msgRenderer.cardinality(cf)» | «msgRenderer.constraintInFeature(cf)» | -> | «mapFromTo.second»  | «getReference(st)» | «msgRenderer.cardinality(st)» | «msgRenderer.constraintInFeature(st)» | «renderRule(pairMap,mapFromTo)» 
	«ENDFOR»
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
  
  
  
}
