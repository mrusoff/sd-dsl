package fr.chaunier.xtext.project.generator

import fr.chaunier.xtext.project.prjDsl.TransformationGroup
 
class PrjGeneratorExtensions  {
 
//  def fileName(TransformationGroup e) {
//  "prj/" + e.name + '.transfo'
//  }

  def fileName(TransformationGroup e) {
  "prj/" + e.name + '.transfo.textile'
  }

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
}