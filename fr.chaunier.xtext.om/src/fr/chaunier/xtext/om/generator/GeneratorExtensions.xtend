package fr.chaunier.xtext.om.generator

import fr.chaunier.xtext.om.*
import fr.chaunier.xtext.om.omDsl.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.common.types.*
import java.util.Set

class GeneratorExtensions extends OmExtensions {

  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

  def fileName(Entity e) {
  e.packageName.folderName + '/' + e.name + '.java'
  }

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }

/* 
  def parameterList(Operation o, ImportManager importManager) {
    o.params.map(p| p.parameterType.shortName(importManager) + ' ' + p.name).join(''',
      '''
    )
  }
*/

//  def isInterface(JvmTypeReference typeRef) {
//    (typeRef.type as JvmGenericType).isInterface
//  }

  def xmlFileName(Entity e) {
  e.packageName.folderName + "/" + e.name + '.xml'
  }
}