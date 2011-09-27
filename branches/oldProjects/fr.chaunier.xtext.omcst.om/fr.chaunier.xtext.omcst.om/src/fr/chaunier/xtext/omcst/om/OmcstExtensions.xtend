package fr.chaunier.xtext.omcst.om

import org.eclipse.emf.ecore.EObject
//import org.eclipse.xtext.common.types.JvmDeclaredType
import fr.chaunier.xtext.omcst.om.omcstDsl.*

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
	
}