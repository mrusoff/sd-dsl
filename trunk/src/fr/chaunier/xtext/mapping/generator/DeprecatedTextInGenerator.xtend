


package fr.chaunier.xtext.mapping.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmcstExtensions
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.omcst.om.OmHelper
import fr.chaunier.xtext.omcst.om.FeaturePathBuilderWithEntity
import org.eclipse.xtext.util.Pair
import static org.eclipse.xtext.util.Tuples
import java.util.List
import java.util.ArrayList
import fr.chaunier.xtext.omcst.om.InstancePathManager
import fr.chaunier.xtext.omcst.om.PathByEntity

class DeprecatedTextInGenerator  {

  def concatPath(String prefix, String suffix) {
    if (prefix.nullOrEmpty)
      suffix
    else if (suffix.nullOrEmpty)
      prefix	
    else prefix + "." + suffix
  }

def compileTxt(ModelMap mdl) '''
«var omHelper = new OmHelper()»
model «mdl.name» from «omHelper.QualifiedName(mdl.entityFrom)» to «omHelper.QualifiedName(mdl.entityTo)»

				
«var path = new FeaturePathBuilderWithEntity()»
«var instanceManagerFrom = new InstancePathManager(mdl.entityFrom)»
«var instanceManagerTo = new InstancePathManager(mdl.entityTo)»
«path.compilePath(mdl.entityTo,instanceManagerTo)»
«path.compilePath(mdl.entityFrom,instanceManagerFrom)»

PATH
«var mapPaths = new ArrayList<Pair<String,String>>()»
«FOR f:mdl.actions»
	«mapActionTxt(f,mapPaths)»
«ENDFOR»
«FOR mapFromTo:mapPaths»
	«mapFromTo.first» -> «mapFromTo.second»  
«ENDFOR»

SOURCE
«FOR p:instanceManagerFrom.paths»
«p» -> «searchCorrespondingPathIn(p,mapPaths)» 
«ENDFOR»

DESTINATION
«FOR p:instanceManagerTo.paths»
«searchCorrespondingPathOut(p,mapPaths)» -> «p»  
«ENDFOR»

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

	 // associate in pair string the path_to and path_from for each mapping object
	
	def dispatch mapActionTxt(FunctionDef fd,List<Pair<String,String>> maps) {}
	//	«fd.params»
	
	def dispatch mapActionTxt(RuleDef fd,List<Pair<String,String>> maps) {}
	
	// for eatch featurePath in MapGroup
	def dispatch mapActionTxt(MapGroup mg,List<Pair<String,String>> maps) {
	for (fp:mg.featurePath)
		mapFeatureString(fp,maps)
	return null	
	}

 
 // associate in pair string the path_to and path_from for each mapping object
	def dispatch mapFeatureString(FeatureAll fp,List<Pair<String,String>> maps) {
		
	}
	
	def dispatch mapFeatureString(FeatureSet fp,List<Pair<String,String>> maps) {
		
	}
	
	def dispatch mapFeatureString(FeaturePath fp,List<Pair<String,String>> maps) {
		val t = Tuples::pair(pathString(fp.from.path),pathString(fp.to.path))
		maps.add(t)
	}



	// build the path string
	def pathString(Path path) {
		var omHelper = new OmHelper()
		var map = mapFeatureString(path,'')
		''+map
	}

	// dump the path for feature
	def dispatch mapFeatureString(Path p,String pathStr) {
	    return concatPath(p.attribute.name,pathStr)
    }

    def dispatch mapFeatureString(PathParam p,String pathStr) {
	   if (p.refAttribute != null) {
		   var path = concatPath(p.refAttribute.name,pathStr)
		   if ( p.target != null)
			   return mapFeatureString(p.target,path)
		   else return path	
	}
}

	// dump the paths for entity
	def pathList(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
    	for (p : instancePathManager.paths) {
    		builder.append(p);
    		builder.append('\n');
    	} 
    	builder.toString
  	}


}
	
