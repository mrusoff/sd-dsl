package fr.chaunier.xtext.mapping.generator

import fr.chaunier.xtext.mapping.mapDsl.ModelMap
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
  "maps/" + map.name.folderName + '.textile'
  }
 
}