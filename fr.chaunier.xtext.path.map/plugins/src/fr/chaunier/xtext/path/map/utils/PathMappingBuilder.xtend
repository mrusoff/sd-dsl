package fr.chaunier.xtext.path.map.utils

import fr.chaunier.xtext.path.map.pathDsl.FeaturePath
import fr.chaunier.xtext.path.map.pathDsl.FeatureSet
import fr.chaunier.xtext.path.map.pathDsl.Document
import fr.chaunier.xtext.path.map.pathDsl.FunctionDef
import fr.chaunier.xtext.path.map.pathDsl.CallMapEntity
import fr.chaunier.xtext.path.map.pathDsl.InOut
import fr.chaunier.xtext.path.map.pathDsl.ModelMap
import fr.chaunier.xtext.path.map.pathDsl.RuleDef
import fr.chaunier.xtext.path.map.pathDsl.PathTail
import fr.chaunier.xtext.omc.OmHelper
import java.util.ArrayList



class PathMappingBuilder {

	def map(ModelMap mdl) {
	  var mapPaths = new PathMapFeature(mdl.spec.mapping.entityFrom,mdl.spec.mapping.entityTo)
	  println("action size "+ mdl.spec.mapping.actions.size)
	  for (f:mdl.spec.mapping.actions) {
		mapActionTxt(f,mapPaths,"","")
	  }
	  return mapPaths
	}

	def dispatch mapActionTxt(CallMapEntity cme,PathMapFeature maps,String pathFrom,String pathTo) {
		var from = ""
		var to = ""
		if ( cme.featurePath != null ) {
			from = mapFeatureString(cme.featurePath.from.path,pathFrom)
			to = mapFeatureString(cme.featurePath.to.path,pathTo)
		} 
//		println("from "+from)
//		println("to "+to)
	  	for (f:cme.mapping.actions) {
		 	mapActionTxt(f,maps,from,to)
	 	}
	 	return null
	 }

	 // associate in pair string the path_to and path_from for each mapping object
	
	def dispatch mapActionTxt(FunctionDef fd,PathMapFeature maps,String pathFrom,String pathTo) {
		var ins = new ArrayList<PathTail>()
		var outs = new ArrayList<PathTail>()
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
//				mapArgs.operation = fd.operation
				maps.addMaps(mapFeatureString(in,pathFrom),mapFeatureString(out,pathTo),getFeature(in),getFeature(out),mapArgs)
			}  
		}  
//				maps.addMaps(pathString(param.path),null,getFeature(param.path),null,null)
//			else maps.addMaps(null,pathString(param.path),null,getFeature(param.path),null)	
	    return null	
	}
	
	def dispatch mapActionTxt(RuleDef fd,PathMapFeature maps,String pathFrom,String pathTo) {}
//	def dispatch mapActionTxt(MapEntity mce,PathMapFeature maps) {}
	
	def dispatch mapActionTxt(Document mce,PathMapFeature maps,String pathFrom,String pathTo) {}

	def dispatch mapActionTxt(FeatureSet fs,PathMapFeature maps,String pathFrom,String pathTo) {
		mapFeatureString(fs,maps,pathFrom,pathTo)
	}

	def dispatch mapActionTxt(FeaturePath fp,PathMapFeature maps,String pathFrom,String pathTo) {
//		println("fp from "+pathFrom)
//		println("fp to "+pathTo)
		mapFeatureString(fp,maps,pathFrom,pathTo)
	}

	def dispatch mapFeatureString(FeatureSet fs,PathMapFeature maps,String pathFrom,String pathTo) {
		var mapArgs = new SetArgs()
		mapArgs.value = fs.value
		mapArgs.description = fs.description
		if ( fs.in == InOut::IN ) {
			maps.addMaps(mapFeatureString(fs.path,pathFrom),null,getFeature(fs.path),null,mapArgs,fs.description)
		} else maps.addMaps(null,mapFeatureString(fs.path,pathTo),null,getFeature(fs.path),mapArgs,fs.description) 
		return null 
	}
	
	def dispatch mapFeatureString(FeaturePath fp,PathMapFeature maps,String pathFrom,String pathTo) {
		var mapArgs = null as RuleArgs
		if ( fp.rule != null ) {
			mapArgs = new RuleArgs()
			mapArgs.name = fp.rule.name
//			mapArgs.args = fp.args
			mapArgs.rule = fp.rule 	
			mapArgs.description = fp.rule.description
//			mapArgs.operation = fp.rule.operation
		}
//		maps.addMaps(mapFeatureString(fp.from.path,pathFrom),mapFeatureString(fp.to.path,pathTo),getFeature(fp.from.path),getFeature(fp.to.path),mapArgs)
		maps.addMaps(mapFeatureString(fp.from.path,pathFrom),mapFeatureString(fp.to.path,pathTo),getFeature(fp.from.path),getFeature(fp.to.path),mapArgs,fp.description)
		return null 
	}
	
	def getFeature(PathTail path) {
		path.lastTail.feature 
	}

	// build the path string
	/*
	def pathString(PathTail path) {
		var map = mapFeatureString(path,'')
		''+map
	} */

	// concatenation of préfixe with . separator
	  def concatPath(String prefix, String suffix) {
	    if (prefix.nullOrEmpty)
	      suffix
	    else if (suffix.nullOrEmpty)
	      prefix	
	    else prefix + "." + suffix
	  }

    def String  mapFeatureString(PathTail p,String pathStr) {
//       var omHelpers = new OmHelper()
		var path =""
//       if ( omHelpers.isConcreteEntity(p.feature) )	{
//			println("Concrete " + p.feature.type.referenced.name)
//	   		path = concatPath(pathStr,p.feature.name+'['+p.feature.type.referenced.name+']')
//	   		}
//	   else 
	   		path = concatPath(pathStr,p.feature.name)

	   if (p.tail != null) { 
		   return mapFeatureString(p.tail,path)
		   }
	   else return path	
	}

	def private lastTail(PathTail tail) {
		if ( tail.tail != null ) 
			return lastTail(tail.tail) as PathTail
		else return tail 	
	}

		
}