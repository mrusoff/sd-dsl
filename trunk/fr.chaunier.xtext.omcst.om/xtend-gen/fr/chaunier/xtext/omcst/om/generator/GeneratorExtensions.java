package fr.chaunier.xtext.omcst.om.generator;

import fr.chaunier.xtext.omcst.om.generator.ImportManager;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import fr.chaunier.xtext.omcst.om.omcstDsl.Type;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions {
  
  public String shortName(final Type r, final ImportManager importManager) {
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
  
  public String fileName(final PackageDeclaration e) {
    String _name = e.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".xsd");
    return _operator_plus;
  }
  
  public String fileTxtName(final PackageDeclaration e) {
    String _name = e.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".textile");
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