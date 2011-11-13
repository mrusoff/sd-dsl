package fr.chaunier.xtext.omc.generator.msg

import fr.chaunier.xtext.omc.generator.GeneratorExtensions
import fr.chaunier.xtext.omc.omcDsl.Entity

class MsgGeneratorExtensions extends GeneratorExtensions {

  def fileName(Entity e) {
  	"msgs/" + QualifiedName(e).toString.folderName + '.msg.textile'
  }
	
}