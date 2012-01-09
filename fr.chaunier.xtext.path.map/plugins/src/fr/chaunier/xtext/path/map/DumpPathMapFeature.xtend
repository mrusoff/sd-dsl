package fr.chaunier.xtext.path.map

import fr.chaunier.xtext.path.map.utils.PathMapFeature

class DumpPathMapFeature {
	
	def dump(PathMapFeature  p) '''
		«var n = println('Entity : '+ "" )»
		«FOR path:p.pathMaps»
			«var e = println(path.first + "  " + path.second)»
		«ENDFOR»
	'''

}