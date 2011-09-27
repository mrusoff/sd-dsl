package fr.chaunier.xtext.omcst.om.generator.path

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.FeaturePathBuilderWithEntity
import fr.chaunier.xtext.omcst.om.InstancePathManager
import fr.chaunier.xtext.omcst.om.MergeConstraintInString
import fr.chaunier.xtext.omcst.om.OmHelper

class TextPathToFeatureEntityGenerator {

  def pathList(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
    	val contraint = new MergeConstraintInString()
    	val omHelper = new OmHelper()
    	for (p : instancePathManager.paths) {
    		val feature = instancePathManager.getFeature(p);
    		val att = omHelper.asAttribute(feature)
    		val typeName = omHelper.featureTypeName(feature)
    		builder.append('\n//');
    		if (att != null) {
	    		builder.append(typeName);
    			builder.append('\t');
	    		builder.append(contraint.cardinalityString(att));
    			builder.append('\t');
//	    		builder.append(contraint.constraintByString(att)); dont work
	    		builder.append(contraint.constraintString(att));
    		} else builder.append('\t');
   			builder.append('\t');
   			if ( att.description != null )
   				builder.append(att.description);
   			builder.append('\t');
    		builder.append('\n');
			builder.append('//');
			builder.append(p);
    	} 
    	builder.toString
  }


  def compileTxt(Entity entity) '''
	«val instancePathManager = new InstancePathManager(entity)»
//	«val instance = new FeaturePathBuilderWithEntity()»
	«instance.compilePath(entity,instancePathManager)»
	«instancePathManager.paths.size»

	«pathList(instancePathManager)»
  '''



}