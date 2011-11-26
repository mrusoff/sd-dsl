package fr.chaunier.xtext.mapping

import fr.chaunier.xtext.mapping.mapDsl.FeatureAll
import fr.chaunier.xtext.mapping.mapDsl.FeaturePath
import fr.chaunier.xtext.mapping.mapDsl.FeatureSet
import fr.chaunier.xtext.mapping.mapDsl.EntityFeatureCall
import fr.chaunier.xtext.mapping.mapDsl.FunctionDef
import fr.chaunier.xtext.mapping.mapDsl.InOut
import fr.chaunier.xtext.mapping.mapDsl.MapGroup
import fr.chaunier.xtext.mapping.mapDsl.ModelMap
import fr.chaunier.xtext.mapping.mapDsl.Path
import fr.chaunier.xtext.mapping.mapDsl.PathParam
import fr.chaunier.xtext.mapping.mapDsl.RuleDef
import java.util.ArrayList



class CompletePathMappingBuilder {

	def map(ModelMap mdl) {
	  var mapPaths = new PathMapFeatureRule(mdl.entityFrom,mdl.entityTo)
	  for (f:mdl.actions) {
		mapActionTxt(f,mapPaths)
	  }
	  return mapPaths
	}

	 // associate in pair string the path_to and path_from for each mapping object
	
	def dispatch mapActionTxt(FunctionDef fd,PathMapFeatureRule maps) {
		var ins = new ArrayList<Path>()
		var outs = new ArrayList<Path>()
		for (param:fd.params) {
			if ( param.in == InOut::IN ) {
				ins.add(param.path);
			}
			else {
				outs.add(param.path);
			}	
		}
		for ( in  : ins  ) {
			for ( out  : outs  ) {
				var mapArgs = new FunctionArgs()
				mapArgs.name = fd.name
				mapArgs.description = fd.description
				mapArgs.operation = fd.operation
				maps.addMaps(pathString(in),pathString(out),getFeature(in),getFeature(out),mapArgs)
			}  
		}  
//				maps.addMaps(pathString(param.path),null,getFeature(param.path),null,null)
//			else maps.addMaps(null,pathString(param.path),null,getFeature(param.path),null)	
	    return null	
	}
	
	def dispatch mapActionTxt(RuleDef fd,PathMapFeatureRule maps) {}
	
//	def dispatch mapActionTxt(MapConcrete fd,PathMapFeatureRule maps) {}

	// for eatch featurePath in MapGroup
	def dispatch mapActionTxt(MapGroup mg,PathMapFeatureRule maps) {
	for (fp:mg.featurePath)
		mapFeatureString(fp,maps)
	return null	
	}

 // associate in pair string the path_to and path_from for each mapping object
	def dispatch mapFeatureString(FeatureAll fp,PathMapFeatureRule maps) {
		return null 
	}
	
	// dump sub model
	def dispatch mapFeatureString(EntityFeatureCall efc,PathMapFeatureRule maps) {
	  if ( efc.from != null )
	  	 maps.callPathFrom = pathString(efc.from.path)+'.'
	  else  maps.callPathFrom = "" ;
 	  if ( efc.to != null )
 	  	 maps.callPathFrom = pathString(efc.to.path)+'.'
	  else  maps.callPathTo = "" ;
	  for (f:efc.call.actions) {
		 mapActionTxt(f,maps)
	  }
	  return null
	}
	
	def dispatch mapFeatureString(FeatureSet fs,PathMapFeatureRule maps) {
		var mapArgs = new SetArgs()
		mapArgs.value = fs.value
		if ( fs.in == InOut::IN ) {
			maps.addMaps(prefixedPathString(maps.callPathFrom,fs.path),null,getFeature(fs.path),null,mapArgs)
		} else maps.addMaps(null,prefixedPathString(maps.callPathTo,fs.path),null,getFeature(fs.path),mapArgs) 
		return null 
	}
	
	def dispatch mapFeatureString(FeaturePath fp,PathMapFeatureRule maps) {
		var mapArgs = null as RuleArgs
		if ( fp.rule != null ) {
			mapArgs = new RuleArgs()
			mapArgs.name = fp.rule.name
//			mapArgs.args = fp.args
			mapArgs.rule = fp.rule 	
			mapArgs.description = fp.rule.description
//			mapArgs.operation = fp.rule.operation
		}
		maps.addMaps(prefixedPathString(maps.callPathFrom, fp.from.path),prefixedPathString(maps.callPathTo,fp.to.path),getFeature(fp.from.path),getFeature(fp.to.path),mapArgs)
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

	def prefixedPathString(String prefix,Path path) {
		var map = mapFeatureString(path,'')
		return prefix+map
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