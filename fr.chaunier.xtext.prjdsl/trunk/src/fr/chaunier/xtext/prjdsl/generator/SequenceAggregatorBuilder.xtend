package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import java.util.HashMap

class SequenceAggregatorBuilder {

  def mergeSequence(TransformationGroup grp) {
	var inversePathsMap = new HashMap<String,String>();
    for (t:grp.sequences) {
       inversePathsMap = mergeTransformation(t,inversePathsMap)
    }
    println("END") 	
	dumpInverse(inversePathsMap)
  }


  def mergeTransformation(Transformation tr,HashMap<String,String> inversePathsMap) {
  	 var resultPath = mergeMapModel(tr.model,inversePathsMap)
  	 dumpInverse(resultPath)
  	 return resultPath
  }

  def dumpInverse(HashMap<String,String> inverseMap) {
  	 for ( pathTo : inverseMap.keySet ) {
  	    var to = inverseMap.get(pathTo) 	
  	    var from = pathTo
  	    println('from ' + from + ' to ' + to) 	
  	 }
  } 
  
  def mergeMapModel(ModelMap mdl,HashMap<String,String> inversePathsMap) {
		var builder = new PathMappingFeaturedBuilder()
		var pairMap = builder.map(mdl)
		if ( inversePathsMap.size == 0) {
			for ( mapPathFromTo:pairMap.pathMaps ) {
	  			var from = mapPathFromTo.first
	  			var to = mapPathFromTo.second
	  			inversePathsMap.put(to,from);
			}
		    println("INIT " + mdl.entityFrom) 	
			return inversePathsMap
		} else {
			var newInversePathsMap = new HashMap<String,String>();
			for ( mapPathFromTo:pairMap.pathMaps ) {
	  			var from = mapPathFromTo.first
	  			var to = mapPathFromTo.second
	  			var toPrecedent = inversePathsMap.get(from);
	  			if ( toPrecedent != null )
	  				newInversePathsMap.put(from,to)
			}
		    println("CONSOLIDE " + mdl.entityTo) 	
			return newInversePathsMap
		} 
  }
 	
}