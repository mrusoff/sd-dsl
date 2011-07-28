package fr.chaunier.xtext.om.generator;

import fr.chaunier.xtext.om.OmExtensions;
import fr.chaunier.xtext.om.generator.ImportManager;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Type;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GeneratorExtensions extends OmExtensions {
  
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
  
  public String fileName(final Entity e) {
    String _packageName = this.packageName(e);
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _name = e.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
    return _operator_plus_2;
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
  
  public String xmlFileName(final Entity e) {
    String _packageName = this.packageName(e);
    String _folderName = this.folderName(_packageName);
    String _operator_plus = StringExtensions.operator_plus(_folderName, "/");
    String _name = e.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".xml");
    return _operator_plus_2;
  }
}