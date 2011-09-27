package fr.chaunier.xtext.mapping

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import org.eclipse.xtext.util.Pair
import static org.eclipse.xtext.util.Tuples
import java.util.List
import java.util.ArrayList


class PathMappingFeaturedBuilder {

	def map(ModelMap mdl) {
	  var mapPaths = new PathMapFeature(mdl.entityFrom,mdl.entityTo)
	  for (f:mdl.actions) {
		mapActionTxt(f,mapPaths)
	  }
	  return mapPaths
	}

	 // associate in pair string the path_to and path_from for each mapping object
	
	def dispatch mapActionTxt(FunctionDef fd,PathMapFeature maps) {}
	//	«fd.params»
	
	def dispatch mapActionTxt(RuleDef fd,PathMapFeature maps) {}
	
	// for eatch featurePath in MapGroup
	def dispatch mapActionTxt(MapGroup mg,PathMapFeature maps) {
	for (fp:mg.featurePath)
		mapFeatureString(fp,maps)
	return null	
	}

 // associate in pair string the path_to and path_from for each mapping object
	def dispatch mapFeatureString(FeatureAll fp,PathMapFeature maps) {
		return null 
	}
	
	def dispatch mapFeatureString(FeatureSet fp,PathMapFeature maps) {
		return null 
	}
	
	def dispatch mapFeatureString(FeaturePath fp,PathMapFeature maps) {
		maps.addMaps(pathString(fp.from.path),pathString(fp.to.path),getFeature(fp.from.path),getFeature(fp.to.path))
		return null 
	}
	
	def getFeature(Path path) {
		switch (path) {
			PathParam : path.refAttribute
			Path : path.attribute
		}
	}

	// build the path string
	def pathString(Path path) {
		var map = mapFeatureString(path,'')
		''+map
	}

	// concatenation of préfixe with . separator
	  def concatPath(String prefix, String suffix) {
	    if (prefix.nullOrEmpty)
	      suffix
	    else if (suffix.nullOrEmpty)
	      prefix	
	    else prefix + "." + suffix
	  }

	// dump the path for feature
	def dispatch mapFeatureString(Path p,String pathStr) {
	    return concatPath(p.attribute.name,pathStr)
    }

    // recurse on PathParam element to composte the path
    def dispatch mapFeatureString(PathParam p,String pathStr) {
	   if (p.refAttribute != null) {
		   var path = concatPath(p.refAttribute.name,pathStr)
		   if ( p.target != null)
			   return mapFeatureString(p.target,path)
		   else return path	
	}
}

		
}