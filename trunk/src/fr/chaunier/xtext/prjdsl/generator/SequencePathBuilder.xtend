package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import java.util.HashMap

class SequencePathBuilder {


  def mergeSequence(TransformationGroup grp) {
	var manager = new SequencePathManager() ;
    for (t:grp.sequences) {
       mergeMapModel(t.model,manager)
    }
//    println("END") 	
//	dumpInverse(manager)
  }


//  def mergeTransformation(Transformation tr,SequencePathManager manager) {
//  	 mergeMapModel(tr.model,manager)
//  }

/*
  def dumpInverse(SequencePathManager manager) {
     println('source ' + manager.source.name + ' target ' + manager.target.name) 	
  	 for ( pathTo : manager.inversePathsMap.keySet ) {
  	    var to = manager.inversePathsMap.get(pathTo) 	
  	    var from = pathTo
//  	    println('from ' + from + ' to ' + to) 	
  	 }
  } 
 */
   
  def mergeMapModel(ModelMap mdl,SequencePathManager manager) {
		var builder = new PathMappingFeaturedBuilder()
		var pairMap = builder.map(mdl)
		if ( manager. fist ) {
			for ( mapPathFromTo:pairMap.pathMaps ) {
	  			var from = mapPathFromTo.first
	  			var to = mapPathFromTo.second
//	  			inversePathsMap.put(to,from);
	  			manager.inversePathsMap.put(to,from);
			}
//		    println("INIT " + mdl.entityFrom)
		    manager.source = mdl.entityFrom 	
		    manager.target = mdl.entityTo 	
//			return inversePathsMap
		} else {
			var newInversePathsMap = new HashMap<String,String>();
			for ( mapPathFromTo:pairMap.pathMaps ) {
	  			var from = mapPathFromTo.first
	  			var to = mapPathFromTo.second
//	  			var toPrecedent = inversePathsMap.get(from);
	  			var toPrecedent = manager.inversePathsMap.get(from);
	  			if ( toPrecedent != null )
	  				newInversePathsMap.put(from,to)
			}
			manager.inversePathsMap=newInversePathsMap
//		    println("CONSOLIDE " + mdl.entityTo) 	
		    manager.target = mdl.entityTo 	
//			return newInversePathsMap
		} 
  }
 	
}