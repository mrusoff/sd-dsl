package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.mapping.mapDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*
import fr.chaunier.xtext.mapping.PathMappingFeaturedBuilder
import fr.chaunier.xtext.omcst.om.ConstraintInString
import fr.chaunier.xtext.mapping.PathMapFeature
import org.eclipse.xtext.util.Pair
import static org.eclipse.xtext.util.Tuples
import java.util.List
import java.util.ArrayList

class GeneratorSequence {
/* compile the sumury */

//	«var sq = new SequenceAggregatorBuilder()»
//	«sq.mergeSequence(grp)»

  def compileTxt(TransformationGroup grp) '''

	« println('-----------------------------------------------')»

	«var sq2 = new SequencePathBuilder()»
	«sq2.mergeSequence(grp)»
  '''	
 

}