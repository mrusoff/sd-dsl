package fr.chaunier.xtext.omcst.om.generator.path

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.FeaturePathBuilderWithEntity
import fr.chaunier.xtext.omcst.om.InstancePathManager
import fr.chaunier.xtext.omcst.om.MergeConstraintInString
import fr.chaunier.xtext.omcst.om.OmHelper

class TextilePathToFeatureGenerator {

  def pathList(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
    	val contraint = new MergeConstraintInString()
    	val omHelper = new OmHelper()
    	for (p : instancePathManager.paths) {
    		val feature = instancePathManager.getFeature(p);
    		val att = omHelper.asAttribute(feature)
    		val typeName = omHelper.featureTypeName(feature)
    		builder.append(' | ');
    		if ( typeName.equals('Entity')) {
    			builder.append('**'+p+'**');
    		} 
    		else builder.append(p);
    		builder.append(' | ');
    		if (att != null) {
	    		builder.append(typeName);
    			builder.append(' | ');
	    		builder.append(contraint.cardinalityString(att));
    			builder.append(' | ');
//	    		builder.append(contraint.constraintByString(att)); dont work
	    		builder.append(contraint.constraintString(att));
    		} else builder.append(' | | ');
   			builder.append(' | ');
   			if ( att.description != null )
   				builder.append(att.description);
   			builder.append(' | | ');
//    		val type = instancePathManager.getType(p)
//    		builder.append(type)
    		builder.append('\n');
    	} 
    	builder.toString
  }

  def pathList2(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
    	for (p : instancePathManager.paths) {
    		builder.append(p);
//    		builder.append('\t');
//    		val type = instancePathManager.getType(p)
//    		builder.append(type)
    		builder.append('\n');
    	} 
    	builder.toString
  }

  def compileTxt(Entity entity) '''
	«val instancePathManager = new InstancePathManager(entity)»
	«val instance = new FeaturePathBuilderWithEntity()»
	«instance.compilePath(entity,instancePathManager)»
	«instancePathManager.paths.size»
	
h1. Enity source : «entity.name» 
	
table{border:1px solid black}.
|_. Path |_. Type |_. Cardinality |_. Constraint  |_. Documentation  |_.
	«pathList(instancePathManager)»
  '''



}