package fr.chaunier.xtext.constraint.generator;

import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.generator.PackageManager;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;
import fr.chaunier.xtext.om.omDsl.Type;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions {
  
  public String shortName(final Type r, final PackageManager importManager) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      importManager.appendTypeRef(r, builder);
      String _string = builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public String fileName(final PackageConstraint e) {
    PackageDeclaration _packageDeclaration = e.getPackageDeclaration();
    String _name = _packageDeclaration.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".xsd");
    return _operator_plus;
  }
  
  public String folderName(final String javaPackageName) {
    String _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(javaPackageName, null);
    if (_operator_notEquals) {
      String _replace = javaPackageName.replace(".", "/");
      _xifexpression = _replace;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
}