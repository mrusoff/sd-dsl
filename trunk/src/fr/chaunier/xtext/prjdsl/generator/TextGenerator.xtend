package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import fr.chaunier.xtext.omcst.om.MergeConstraintInString

class TextGenerator {

/* compile the sumury */
  def compileTxt(TransformationGroup grp) '''
	«var builder = new SequencePathBuilder()»
	«dumpMergeSequence(grp,builder)»
  '''	


  def dumpMergeSequence(TransformationGroup grp,SequencePathBuilder builder) '''
	«var manager = new SequencePathManager()»
    «FOR t:grp.sequences» 
       «builder.mergeMapModel(t.model,manager)»
       «dumpModel(t.model)»
	«ENDFOR»
	«dumpInverse(manager)»
  '''

  def dumpModel(ModelMap mdl) '''	
	model «mdl.name»
		«var builder = new PathMappingFeaturedBuilder()»
		«var pairMap = builder.map(mdl)»
		
		source : «pairMap.source.name» target : «pairMap.target.name»
		
		«FOR mapFromTo:pairMap.pathMaps»
	     «var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute»
	     «var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute»
	     «var cst = new MergeConstraintInString()»
	     «mapFromTo.first» ( «cst.cardinalityAndConstraintString(cf)» )  ->   «mapFromTo.second»  ( «cst.cardinalityAndConstraintString(st)» )
	«ENDFOR»
     '''

  
  def dumpInverse(SequencePathManager manager) '''

  	 result globale transformation  
  
     source : «manager.source.name» target : «manager.target.name» 	

  	 «FOR pathTo : manager.inversePathsMap.keySet » 
  	    «var to = manager.inversePathsMap.get(pathTo)» 	
  	    «var from = pathTo»
		from : «from» -> «to» 	
	«ENDFOR»
  ''' 
  
  
  
  
  
}
