package fr.chaunier.xtext.constraint.generator

import fr.chaunier.xtext.om.*
import fr.chaunier.xtext.om.OmExtensions
import fr.chaunier.xtext.om.omDsl.*
import fr.chaunier.xtext.constraint.cstDsl.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.common.types.*
import java.util.Set

class GeneratorExtensions  {
/*
  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }
 */
 
  def shortName(Type r, PackageManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

//  def fileName(EntityConstraint e) {
//  e.packageName.folderName + '/' + e.entity.name + '.xsd'
//  }

  def fileName(PackageConstraint e) {
  e.packageDeclaration.name + '.xsd'
  }

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
}