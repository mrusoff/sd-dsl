package fr.chaunier.xtext.omc.generator.oo

import fr.chaunier.xtext.omc.generator.GeneratorExtensions
import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration

class OOGeneratorExtensions extends GeneratorExtensions {

  def fileName(PackageDeclaration e) {
  	"emc/" + QualifiedName(e).toString.folderName + '.emc.textile'
  }
	
}