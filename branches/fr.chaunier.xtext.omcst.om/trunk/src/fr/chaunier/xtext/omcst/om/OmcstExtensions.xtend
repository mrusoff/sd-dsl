package fr.chaunier.xtext.omcst.om

import org.eclipse.emf.ecore.EObject
//import org.eclipse.xtext.common.types.JvmDeclaredType
import fr.chaunier.xtext.omcst.om.omcstDsl.*
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class OmcstExtensions {
  /**
   * computes the qualified name if its
   *  a PackageDeclaration, an Entity or a JvmDeclaredType
   * returns null otherwise
   */
  def String packageName(Object o) {
    switch(o) {
      PackageDeclaration : concatPath(packageName(o.eContainer), o.name)
//      Entity : o.name
      EObject : packageName(o.eContainer)
//      DataType : packageName(o)
//      Entity : packageName(o)
      default: null
    }
  }
  
  def PackageDeclaration getPackage(Object o) {
    switch(o) {
      PackageDeclaration : o 
      EObject : getPackage(o.eContainer)
      default: null
    }
  }

  def concatPath(String prefix, String suffix) {
    if (prefix.nullOrEmpty)
      suffix
    else
      prefix + "." + suffix
  }

/*
  def String fullName(Object o) {
    switch(o) {
      PackageDeclaration : concatPath(fullName(o.eContainer), o.name)
      Entity : concatPath(fullName(o.eContainer),o.name)
      DataType : concatPath(fullName(o.eContainer),o.name)
      Enumeration : concatPath(fullName(o.eContainer),o.name)
      EObject : fullName(o.eContainer)
//      DataType : packageName(o)
//      Entity : packageName(o)
      default: null
    }
  }
 */

}