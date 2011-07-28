package fr.chaunier.xtext.constraint.generator;

import com.google.inject.Inject;
import fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.cstDsl.TypeConstraint;
import fr.chaunier.xtext.constraint.generator.GeneratorExtensions;
import fr.chaunier.xtext.constraint.generator.PackageManager;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Feature;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;
import fr.chaunier.xtext.om.omDsl.Type;
import fr.chaunier.xtext.om.omDsl.TypeRef;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CstDslGenerator implements IGenerator {
  
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    {
      PackageManager _packageManager = new PackageManager();
      final PackageManager constraintManager = _packageManager;
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<PackageConstraint> _filter = IterableExtensions.<PackageConstraint>filter(_allContentsIterable, fr.chaunier.xtext.constraint.cstDsl.PackageConstraint.class);
      final Iterable<PackageConstraint> packageCtss = _filter;
      for (PackageConstraint packageCts : packageCtss) {
        {
          constraintManager.appendPackage(packageCts);
          packageCts.getPrefix();
        }
      }
      for (PackageConstraint packageCts_1 : packageCtss) {
        this.genFile(constraintManager, packageCtss, fsa);
      }
    }
  }
  
  public void genFile(final PackageManager constraintManager, final Iterable<PackageConstraint> packageCts, final IFileSystemAccess fsa) {
    for (PackageConstraint PackageCts : packageCts) {
      String _fileName = this.generatorExtensions.fileName(PackageCts);
      StringConcatenation _compile = this.compile(constraintManager, PackageCts);
      fsa.generateFile(_fileName, _compile);
    }
  }
  
  public StringConcatenation body(final PackageConstraint p, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TypeConstraint> _types = p.getTypes();
      Iterable<DataTypeConstraint> _filter = IterableExtensions.<DataTypeConstraint>filter(_types, fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint.class);
      for(DataTypeConstraint t : _filter) {
        _builder.append("  ");
        DataType _dataType = t.getDataType();
        StringConcatenation _type = this.type(_dataType, importManager);
        _builder.append(_type, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<TypeConstraint> _types_1 = p.getTypes();
      Iterable<EntityConstraint> _filter_1 = IterableExtensions.<EntityConstraint>filter(_types_1, fr.chaunier.xtext.constraint.cstDsl.EntityConstraint.class);
      for(EntityConstraint t_1 : _filter_1) {
        _builder.append("  ");
        Entity _entity = t_1.getEntity();
        StringConcatenation _type_1 = this.type(_entity, importManager);
        _builder.append(_type_1, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</xsd:schema>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _type(final EntityConstraint e, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("<xsd:complexType name=\"");
    Entity _entity = e.getEntity();
    String _name = _entity.getName();
    _builder.append(_name, "  ");
    _builder.append("Type\">");
    _builder.newLineIfNotEmpty();
    {
      Entity _entity_1 = e.getEntity();
      Entity _superType = _entity_1.getSuperType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
      if (_operator_notEquals) {
        _builder.append("<xsd:complexContent>");
        _builder.newLine();
        _builder.append("<xsd:extension base=>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<xsd:documentation>");
    String _description = e.getDescription();
    _builder.append(_description, "      ");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    {
      EList<FeatureConstraint> _features = e.getFeatures();
      Iterable<AttributeConstraint> _filter = IterableExtensions.<AttributeConstraint>filter(_features, fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint.class);
      for(AttributeConstraint f : _filter) {
        _builder.append("    ");
        StringConcatenation _feature = this.feature(f, importManager);
        _builder.append(_feature, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("       ");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    {
      Entity _entity_2 = e.getEntity();
      Entity _superType_1 = _entity_2.getSuperType();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_superType_1, null);
      if (_operator_notEquals_1) {
        _builder.append("</xsd:extension>");
        _builder.newLine();
        _builder.append("</xsd:complexContent>");
        _builder.newLine();
      }
    }
    _builder.append("</xsd:complexType>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _type(final Entity e, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("<xsd:complexType name=\"");
    String _name = e.getName();
    _builder.append(_name, "  ");
    _builder.append("Type\">");
    _builder.newLineIfNotEmpty();
    {
      Entity _superType = e.getSuperType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
      if (_operator_notEquals) {
        _builder.append("<xsd:complexContent>");
        _builder.newLine();
        _builder.append("<xsd:extension base=>");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<xsd:documentation>");
    String _description = e.getDescription();
    _builder.append(_description, "      ");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    {
      EList<Feature> _features = e.getFeatures();
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features, fr.chaunier.xtext.om.omDsl.Attribute.class);
      for(Attribute f : _filter) {
        _builder.append("    ");
        StringConcatenation _feature = this.feature(f, importManager);
        _builder.append(_feature, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("       ");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    {
      Entity _superType_1 = e.getSuperType();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_superType_1, null);
      if (_operator_notEquals_1) {
        _builder.append("</xsd:extension>");
        _builder.newLine();
        _builder.append("</xsd:complexContent>");
        _builder.newLine();
      }
    }
    _builder.append("</xsd:complexType>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _type(final DataType d, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype ");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final DataTypeConstraint e, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("datatype ");
    DataType _dataType = e.getDataType();
    String _name = _dataType.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _feature(final Attribute a, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    TypeRef _type = a.getType();
    Type _referenced = _type.getReferenced();
    String _shortName = this.generatorExtensions.shortName(_referenced, importManager);
    _builder.append(_shortName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("<xsd:element name=\"");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\" type=xsd:string>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<xsd:documentation>");
    String _description = a.getDescription();
    _builder.append(_description, " 	");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</xsd:element>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _feature(final AttributeConstraint a, final PackageManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    Attribute _attribute = a.getAttribute();
    TypeRef _type = _attribute.getType();
    Type _referenced = _type.getReferenced();
    String _shortName = this.generatorExtensions.shortName(_referenced, importManager);
    _builder.append(_shortName, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("<xsd:element name=\"");
    Attribute _attribute_1 = a.getAttribute();
    String _name = _attribute_1.getName();
    _builder.append(_name, "");
    _builder.append("\" type=xsd:string>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("<xsd:documentation>");
    Attribute _attribute_2 = a.getAttribute();
    String _description = _attribute_2.getDescription();
    _builder.append(_description, " 	");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("</xsd:element>\t");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation compile(final PackageManager constraintManager, final PackageConstraint e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    StringConcatenation _body = this.body(e, constraintManager);
    final StringConcatenation body = _body;
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<xsd:schema xmlns:");
    String _prefix = e.getPrefix();
    _builder.append(_prefix, "");
    _builder.append("=\"");
    String _namespace = e.getNamespace();
    _builder.append(_namespace, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("attributeFormDefault=\"unqualified\" ");
    _builder.newLine();
    _builder.append("elementFormDefault=\"unqualified\" ");
    _builder.newLine();
    _builder.append("targetNamespace=\"");
    String _namespace_1 = e.getNamespace();
    _builder.append(_namespace_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"");
    _builder.newLine();
    {
      List<String> _imports = constraintManager.getImports();
      for(String i : _imports) {
        _builder.append("    ");
        _builder.append("import ");
        _builder.append(i, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    List<PackageConstraint> _importPackageConstraints = constraintManager.getImportPackageConstraints();
    final List<PackageConstraint> pks = _importPackageConstraints;
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("remove : ");
    boolean _remove = pks.remove(e);
    _builder.append(_remove, "    ");
    _builder.newLineIfNotEmpty();
    {
      for(PackageConstraint i_1 : pks) {
        _builder.append("    ");
        _builder.append("import ");
        PackageDeclaration _packageDeclaration = i_1.getPackageDeclaration();
        String _name = _packageDeclaration.getName();
        _builder.append(_name, "    ");
        _builder.append(" ");
        String _prefix_1 = i_1.getPrefix();
        _builder.append(_prefix_1, "    ");
        _builder.append(" ");
        String _namespace_2 = i_1.getNamespace();
        _builder.append(_namespace_2, "    ");
        _builder.append(" ;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(body, "    ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation type(final EObject d, final PackageManager importManager) {
    if ((d instanceof DataType)
         && (importManager instanceof PackageManager)) {
      return _type((DataType)d, (PackageManager)importManager);
    } else if ((d instanceof Entity)
         && (importManager instanceof PackageManager)) {
      return _type((Entity)d, (PackageManager)importManager);
    } else if ((d instanceof EntityConstraint)
         && (importManager instanceof PackageManager)) {
      return _type((EntityConstraint)d, (PackageManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(d, importManager).toString());
    }
  }
  
  public StringConcatenation feature(final EObject a, final PackageManager importManager) {
    if ((a instanceof Attribute)
         && (importManager instanceof PackageManager)) {
      return _feature((Attribute)a, (PackageManager)importManager);
    } else if ((a instanceof AttributeConstraint)
         && (importManager instanceof PackageManager)) {
      return _feature((AttributeConstraint)a, (PackageManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a, importManager).toString());
    }
  }
}