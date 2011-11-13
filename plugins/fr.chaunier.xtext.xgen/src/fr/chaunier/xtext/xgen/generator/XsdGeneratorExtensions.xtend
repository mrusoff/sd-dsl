package fr.chaunier.xtext.xgen.generator

import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration

class XsdGeneratorExtensions extends GeneratorExtensions {

  def fileName(PackageDeclaration e) {
  	"xsds/" + e.name + '.xsd'
  }
	
}