/*
 * generated by Xtext
 */
package fr.chaunier.xtext.mapping.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.map.mapDsl.*
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import fr.chaunier.xtext.omcst.om.MergeConstraintInString
import fr.chaunier.xtext.omcst.om.OmHelper 
import fr.chaunier.xtext.omcst.om.InstancePathManager
import fr.chaunier.xtext.omcst.om.FeaturePathBuilder
import fr.chaunier.xtext.mapping.PathMapFeature

class TextileGenerator  {

	def compileTxt(ModelMap mdl) '''
		�var builder = new PathMappingFeaturedBuilder()�
		�var pairMap = builder.map(mdl)�
	�dumpMappingView(mdl,pairMap)�
	�dumpFromView(mdl,pairMap)�
	�dumpToView(mdl,pairMap)�
'''

	def dumpMappingView(ModelMap mdl,PathMapFeature pairMap) '''
		�var omHelper = new OmHelper()�

h1. model �mdl.name� 

h2. source : �omHelper.QualifiedName(mdl.entityFrom)� 

h2. target : �omHelper.QualifiedName(mdl.entityTo)�

h3. mapping view

table{border:1px solid black}.
| **source** |  | **destination** | | | 
		�FOR mapFromTo:pairMap.pathMaps�
	     �var cf = pairMap.getFeatureFrom(mapFromTo.first) as Attribute�
	     �var st = pairMap.getFeatureTo(mapFromTo.second)  as Attribute�
	     �var cst = new MergeConstraintInString()�
	     | �mapFromTo.first� | �cst.cardinalityAndConstraintString(cf)� | -> | �mapFromTo.second�  ( �cst.cardinalityAndConstraintString(st)� |
	�ENDFOR�
'''
	

	def dumpFromView(ModelMap mdl,PathMapFeature pairMap) '''
		
	h3. source oriented view
	
	�var path = new FeaturePathBuilder()�
	�var instanceManager = new InstancePathManager(mdl.entityFrom)�
	�path.compilePath(mdl.entityFrom,instanceManager)�
	
	table{border:1px solid black}.
	| **source** |  | **destination** | source type | constraint | dest type | constraint | 
	�FOR pFrom:instanceManager.paths�
	�val pTo = pairMap.getPathFrom(pFrom)� 
	| �pFrom� |  -> |  �pTo� | | |    
	�ENDFOR�
	'''

	def dumpToView(ModelMap mdl,PathMapFeature pairMap) '''
		
	h3. taget oriented view
	
	�var path = new FeaturePathBuilder()�
	�var instanceManager = new InstancePathManager(mdl.entityTo)�
	�path.compilePath(mdl.entityTo,instanceManager)�
	
	table{border:1px solid black}.
	| **source** |  | **destination** | source type | constraint | dest type | constraint | 
	�FOR pTo:instanceManager.paths�
	�val pFrom = pairMap.getPathTo(pTo)� 
	| �pFrom� |  -> |  �pTo� | | |    
	�ENDFOR�
	'''

/*
	def dumpView(ModelMap mdl,PathMapFeature pairMap) '''
		
	h2. source oriented view
	
	�var path = new FeaturePathBuilder()�
	�var instanceManagerFrom = new InstancePathManager(mdl.entityFrom)�
	�var instanceManagerTo = new InstancePathManager(mdl.entityTo)�
	�path.compilePath(mdl.entityTo,instanceManagerTo)�
	�path.compilePath(mdl.entityFrom,instanceManagerFrom)�
	
	table{border:1px solid black}.
	| **source** |  | **destination** | source type | constraint | dest type | constraint | 
	�FOR pFrom:instanceManagerFrom.paths�
	�val pTo = pairMap.getPathTo(pFrom)� 
	| �pFrom� |  -> |  �pTo� | �pairMap.getFeatureFrom(pFrom)� | �pairMap.getFeatureTo(pTo)� |   
	�ENDFOR�
	
	h2. destination oriented view
	
	table{border:1px solid black}.
	| **source** |  | **destination** | source type | dest type |
	�FOR pTo:instanceManagerTo.paths�
	�val pFrom = pairMap.getPathFrom(pTo)� 
	| �pFrom� |  -> |  �pTo� | �pairMap.getFeatureFrom(pFrom)� | �pairMap.getFeatureTo(pTo)�  
	�ENDFOR�
	'''
 */
/*

def getFeatureString(String path) {
	var feature = instancePathManager.getFeature(path)
	var omHelper = new OmHelper()
	switch(feature) {
		Attribute : omHelper.QualifiedName(feature.type.referenced)
		Reference : omHelper.QualifiedName(feature.type.referenced)
	}
	*/ 
	
}



	