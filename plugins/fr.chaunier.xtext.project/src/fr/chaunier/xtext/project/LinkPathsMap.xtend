package fr.chaunier.xtext.project

import fr.chaunier.xtext.mapping.PathMapFeatureRule

class LinkPathsMap {

//		from 	->	to
//		a		->	b
//		b		->	c

	
	def link(PathMapFeatureRule first,PathMapFeatureRule second) {
		var result = new PathMapFeatureRule(first.source,second.target)
		for (mapFromToFirst:first.pathMaps) {
			var pathFromFirst = mapFromToFirst.first 				// lecture from 1° 	(a)
			var pathToFist = mapFromToFirst.second 					// lecture to 1° 	(b)
			var pathsToSecond = second.getPathsFrom(pathToFist) 	// recheche correspondance ds 2° pour le from (c) 
//			println("find from first " + pathToSecond);
			if ( pathsToSecond.size != 0 ) {							// si presence du (c)
			    for ( pathToSecond : pathsToSecond ) {
					var featureFirst = first.getFeatureFrom(pathFromFirst)  // recheche feature 1°	
					var featureSecond = second.getFeatureTo(pathToSecond)
//				println("add " + pathFromFirst + ' ' + pathToSecond);
					result.addMaps(pathFromFirst,pathToSecond,featureFirst,featureSecond,null)			
			    }
//				println("find to second " + pathToSecond);
			}
		}
		return result
	} 
}