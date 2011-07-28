package fr.chaunier.xtext.omcst.om.generator

import fr.chaunier.xtext.om.*
import fr.chaunier.xtext.om.omDsl.*
import fr.chaunier.xtext.constraint.cstDsl.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.common.types.*
import java.util.Set
import fr.chaunier.xtext.omcst.om.omcstDsl.*

class GeneratorExtensions  {
 
  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

//  def fileName(EntityConstraint e) {
//  e.packageName.folderName + '/' + e.entity.name + '.xsd'
//  }

  def fileName(PackageDeclaration e) {
  e.name + '.xsd'
  }

  def fileTxtName(PackageDeclaration e) {
  	e.name + '.textile'
  }

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
}