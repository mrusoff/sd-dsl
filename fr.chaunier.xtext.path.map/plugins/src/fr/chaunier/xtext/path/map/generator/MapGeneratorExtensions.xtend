package fr.chaunier.xtext.path.map.generator

import fr.chaunier.xtext.path.map.pathDsl.ModelMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider 

class MapGeneratorExtensions  {
 

  def QualifiedName(EObject o) {
	   val qn = new DefaultDeclarativeQualifiedNameProvider()
	   qn.getFullyQualifiedName(o)
  }  

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
  
  def fileName(ModelMap map) {
  "maping/" + map.spec.mapping.name.folderName + '.textile'
  }
 
}