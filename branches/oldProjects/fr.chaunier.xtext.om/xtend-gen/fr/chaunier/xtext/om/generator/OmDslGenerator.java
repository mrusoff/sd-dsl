package fr.chaunier.xtext.om.generator;

import com.google.inject.Inject;
import fr.chaunier.xtext.om.generator.GeneratorExtensions;
import fr.chaunier.xtext.om.generator.ImportManager;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Feature;
import fr.chaunier.xtext.om.omDsl.Type;
import fr.chaunier.xtext.om.omDsl.TypeRef;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OmDslGenerator implements IGenerator {
  
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Entity> _filter = IterableExtensions.<Entity>filter(_allContentsIterable, fr.chaunier.xtext.om.omDsl.Entity.class);
    for (Entity entity : _filter) {
    }
  }
  
  public StringConcatenation body(final Entity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _superTypeClause = this.superTypeClause(e, importManager);
    _builder.append(_superTypeClause, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features, fr.chaunier.xtext.om.omDsl.Attribute.class);
      for(Attribute f : _filter) {
        _builder.append("  ");
        StringConcatenation _feature = this.feature(f, importManager);
        _builder.append(_feature, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String superTypeClause(final Entity e, final ImportManager importManager) {
    String _xifexpression = null;
    Entity _superType = e.getSuperType();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
    if (_operator_notEquals) {
      Entity _superType_1 = e.getSuperType();
      String _shortName = this.generatorExtensions.shortName(_superType_1, importManager);
      String _operator_plus = StringExtensions.operator_plus("extends ", _shortName);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " ");
      _xifexpression = _operator_plus_1;
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected StringConcatenation _feature(final Attribute a, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("private ");
    TypeRef _type = a.getType();
    Type _referenced = _type.getReferenced();
    String _shortName = this.generatorExtensions.shortName(_referenced, importManager);
    _builder.append(_shortName, "");
    _builder.append(" ");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    TypeRef _type_1 = a.getType();
    Type _referenced_1 = _type_1.getReferenced();
    String _shortName_1 = this.generatorExtensions.shortName(_referenced_1, importManager);
    _builder.append(_shortName_1, "");
    _builder.append(" get");
    String _name_1 = a.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return ");
    String _name_2 = a.getName();
    _builder.append(_name_2, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _name_3 = a.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    TypeRef _type_2 = a.getType();
    Type _referenced_2 = _type_2.getReferenced();
    String _shortName_2 = this.generatorExtensions.shortName(_referenced_2, importManager);
    _builder.append(_shortName_2, "");
    _builder.append(" ");
    String _name_4 = a.getName();
    _builder.append(_name_4, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("this.");
    String _name_5 = a.getName();
    _builder.append(_name_5, "  ");
    _builder.append(" = ");
    String _name_6 = a.getName();
    _builder.append(_name_6, "  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _body = this.body(e, importManager);
    final StringConcatenation body = _body;
    _builder.newLineIfNotEmpty();
    {
      String _packageName = this.generatorExtensions.packageName(e);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_packageName);
      boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
      if (_operator_not) {
        _builder.append("package ");
        String _packageName_1 = this.generatorExtensions.packageName(e);
        _builder.append(_packageName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      List<String> _imports = importManager.getImports();
      for(String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation compileXml(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<");
    String _name = e.getName();
    _builder.append(_name, "");
    {
      Entity _superType = e.getSuperType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
      if (_operator_notEquals) {
        _builder.append(" super=\"");
        Entity _superType_1 = e.getSuperType();
        String _name_1 = _superType_1.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features, fr.chaunier.xtext.om.omDsl.Attribute.class);
      for(Attribute p : _filter) {
        _builder.append("    ");
        _builder.append("<");
        String _name_2 = p.getName();
        _builder.append(_name_2, "    ");
        _builder.append(" type=\"");
        TypeRef _type = p.getType();
        Type _referenced = _type.getReferenced();
        String _name_3 = _referenced.getName();
        _builder.append(_name_3, "    ");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</");
    String _name_4 = e.getName();
    _builder.append(_name_4, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation feature(final Attribute a, final ImportManager importManager) {
    if ((a instanceof Attribute)
         && (importManager instanceof ImportManager)) {
      return _feature((Attribute)a, (ImportManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a, importManager).toString());
    }
  }
}