package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import fr.chaunier.xtext.omcst.om.MergeConstraintInString
import fr.chaunier.xtext.mapping.PathMapFeature
import org.eclipse.xtext.util.Pair
import static org.eclipse.xtext.util.Tuples
import java.util.List
import java.util.ArrayList

class Generator {
/* compile the sumury */
  def compileTxt(TransformationGroup grp,GeneratorExtensions generatorExtensions) '''
	«var mapPaths = new ArrayList<Pair<String,String>>()»
    «FOR t:grp.sequences»
       «dumpTransformation(t,mapPaths)»
    «ENDFOR»

	«var sq = new SequenceAggregatorBuilder()»
	«sq.mergeSequence(grp)»
	
SEQUENCE
	«mapPaths.size»
	«FOR mapFromTo:mapPaths»
	     «mapFromTo.first»  ->   «mapFromTo.second»  
    «ENDFOR»

  '''	
 
  def dumpTransformation(Transformation tr,ArrayList<Pair<String,String>> mapPair) '''
  	 Entity source «tr.model.entityFrom.name»
  	 EntityTarget «tr.model.entityTo.name»
  	 «spec(tr.fileFrom)»
  	 «spec(tr.fileTo)»
  	 «dumpMap(tr.model,mapPair)»
  '''
 
 	def dumpMap(ModelMap mdl,ArrayList<Pair<String,String>> mapPair) '''
	model «mdl.name»
		«var builder = new PathMappingFeaturedBuilder()»
		«var pairMap = builder.map(mdl)»
		«FOR mapFromTo:pairMap.pathMaps»
	     «var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute»
	     «var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute»
	     «var cst = new MergeConstraintInString()»
	     «mapFromTo.first» ( «cst.cardinalityAndConstraintString(cf)» )  ->   «mapFromTo.second»  ( «cst.cardinalityAndConstraintString(st)» )
	«ENDFOR»'''
//	     «linkPath(pairMap,mapPair)»

 	def linkPath(PathMapFeature pathMap, ArrayList<Pair<String,String>> mapPair) {
 		if ( mapPair.size == 0 ) {
			for( mapFromTo:pathMap.pathMaps ) {
				val t = Tuples::pair(mapFromTo.first,mapFromTo.second)
				mapPair.add(t)
			}
 		} else {
			for( mapFromTo:mapPair ) {
				var strTo = mapFromTo.second 
				var corresponding = pathMap.getPathTo(strTo) 
				val t = Tuples::pair(strTo,corresponding)
				mapPair.add(t)
			}
 		}
 	}


 //	     «linkPath(cummulate,pairMap)»
 
/* 
 	def linkPath(PathMapFeature cummulate, PathMapFeature source) {
 		if ( cummulate.pathMaps.size == 0 ) { 
 			// first sequence
			 cummulate.pathMaps.addAll(source.pathMaps);
			 cummulate.pathFromFeatures.addAll(source.pathFromFeatures)
			 cummulate.pathToFeatures.addAll(source.pathToFeatures)	
 		} else { // replace the to by correspondant from
 			for( mapFromTo:cummulate.pathMaps ) {
 				// recherche pair ds source coresondant au path from (second) du cummule
 				var pathToSource = source.getPathFromPair(mapFromTo.second);
 				// mise à jour pair dans cummul (to) avec de to de source
 				if ( pathToSource != null )
 					mapFromTo.second=pathToSource.second
 				else mapFromTo.second=null
// 				pathFrom.second=mapFromTo.second
 			} 			 
 		}
 			
 	}
 */
 
  def spec(FileNature file)   ''' 	
  ''' 		


def searchCorrespondingPathIn(String path,ArrayList<Pair<String,String>> mapPair) {
	for (map:mapPair) {
		if ( path.equals(map.first))
			return map.second  
	} 
	return null 
} 

def searchCorrespondingPathOut(String path,ArrayList<Pair<String,String>> mapPair) {
	for (map:mapPair) {
		if ( path.equals(map.second))
			return map.first  
	} 
	return null 
} 

}