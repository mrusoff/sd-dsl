package fr.chaunier.xtext.omc.generator.instance

import fr.chaunier.xtext.omc.generator.GeneratorExtensions
import fr.chaunier.xtext.omc.omcDsl.Entity

class InstanceGeneratorExtensions extends GeneratorExtensions {

  def fileName(Entity e) {
  	"insts/" + QualifiedName(e).toString.folderName + '.instance'
  }
	
}