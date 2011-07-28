package fr.chaunier.xtext.omcst.om.generator;

import fr.chaunier.xtext.omcst.om.OmcstExtensions;
import fr.chaunier.xtext.omcst.om.generator.GeneratorExtensions;
import fr.chaunier.xtext.omcst.om.generator.ImportManager;
import fr.chaunier.xtext.omcst.om.omcstDsl.AbstractElement;
import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;
import fr.chaunier.xtext.omcst.om.omcstDsl.DataType;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration;
import fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationLiteral;
import fr.chaunier.xtext.omcst.om.omcstDsl.Feature;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import fr.chaunier.xtext.omcst.om.omcstDsl.Reference;
import fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature;
import fr.chaunier.xtext.omcst.om.omcstDsl.Type;
import fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TextileGenerator {
  
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
  
  public StringConcatenation compileTxt(final PackageDeclaration pac, final GeneratorExtensions generatorExtensions) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _compileTxtSummary = this.compileTxtSummary(pac);
    _builder.append(_compileTxtSummary, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _compileTxtBody = this.compileTxtBody(pac);
    _builder.append(_compileTxtBody, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation compileTxtSummary(final PackageDeclaration pac) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    ImportManager _importManager = new ImportManager();
    final ImportManager importManager = _importManager;
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _bodyTxt = this.bodyTxt(pac, importManager);
    final StringConcatenation body = _bodyTxt;
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("h1. package : ");
    String _name = pac.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("table{border:1px solid black}.");
    _builder.newLine();
    _builder.append("| **name** | **prefix** | **namspace** | ");
    _builder.newLine();
    _builder.append("| ");
    String _name_1 = pac.getName();
    _builder.append(_name_1, "");
    _builder.append("  | ");
    String _prefix = pac.getPrefix();
    _builder.append(_prefix, "");
    _builder.append(" | ");
    String _namespace = pac.getNamespace();
    _builder.append(_namespace, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("h2. Enumeration definition");
    _builder.newLine();
    _builder.newLine();
    {
      EList<AbstractElement> _elements = pac.getElements();
      Iterable<Enumeration> _filter = IterableExtensions.<Enumeration>filter(_elements, fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration.class);
      for(Enumeration t : _filter) {
        _builder.append("* !icons/Enumeration.gif!\"");
        String _name_2 = t.getName();
        _builder.append(_name_2, "");
        _builder.append("\":#");
        String _name_3 = t.getName();
        _builder.append(_name_3, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("h2. Data Type definition");
    _builder.newLine();
    _builder.newLine();
    {
      EList<AbstractElement> _elements_1 = pac.getElements();
      Iterable<DataType> _filter_1 = IterableExtensions.<DataType>filter(_elements_1, fr.chaunier.xtext.omcst.om.omcstDsl.DataType.class);
      for(DataType t_1 : _filter_1) {
        _builder.append("* !icons/Datatype.gif!\"");
        String _name_4 = t_1.getName();
        _builder.append(_name_4, "");
        _builder.append("\":#");
        String _name_5 = t_1.getName();
        _builder.append(_name_5, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("h2. Class definition");
    _builder.newLine();
    _builder.newLine();
    {
      EList<AbstractElement> _elements_2 = pac.getElements();
      Iterable<Entity> _filter_2 = IterableExtensions.<Entity>filter(_elements_2, fr.chaunier.xtext.omcst.om.omcstDsl.Entity.class);
      for(Entity t_2 : _filter_2) {
        _builder.append("* !icons/Entity.gif!\"");
        String _name_6 = t_2.getName();
        _builder.append(_name_6, "");
        _builder.append("\":#");
        String _name_7 = t_2.getName();
        _builder.append(_name_7, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("      ");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation compileTxtBody(final PackageDeclaration pac) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager();
    final ImportManager importManager = _importManager;
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    StringConcatenation _bodyTxt = this.bodyTxt(pac, importManager);
    final StringConcatenation body = _bodyTxt;
    _builder.newLineIfNotEmpty();
    List<PackageDeclaration> _importPackages = importManager.getImportPackages(pac);
    final List<PackageDeclaration> pcks = _importPackages;
    _builder.newLineIfNotEmpty();
    {
      for(PackageDeclaration i : pcks) {
        String _prefix = i.getPrefix();
        _builder.append(_prefix, "");
        _builder.append("=\"");
        String _namespace = i.getNamespace();
        _builder.append(_namespace, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation bodyTxt(final PackageDeclaration p, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractElement> _elements = p.getElements();
      Iterable<DataType> _filter = IterableExtensions.<DataType>filter(_elements, fr.chaunier.xtext.omcst.om.omcstDsl.DataType.class);
      for(DataType t : _filter) {
        StringConcatenation _typeTxt = this.typeTxt(t, importManager);
        _builder.append(_typeTxt, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_1 = p.getElements();
      Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(_elements_1, fr.chaunier.xtext.omcst.om.omcstDsl.Entity.class);
      for(Entity t_1 : _filter_1) {
        StringConcatenation _typeTxt_1 = this.typeTxt(t_1, importManager);
        _builder.append(_typeTxt_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_2 = p.getElements();
      Iterable<Enumeration> _filter_2 = IterableExtensions.<Enumeration>filter(_elements_2, fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration.class);
      for(Enumeration t_2 : _filter_2) {
        StringConcatenation _typeTxt_2 = this.typeTxt(t_2, importManager);
        _builder.append(_typeTxt_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _typeTxt(final Entity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("h3(#");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("). Class Name : ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append("  ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("p{color:blue}. ");
    String _description = e.getDescription();
    _builder.append(_description, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Entity _superType = e.getSuperType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
      if (_operator_notEquals) {
        _builder.append(" Super types  ");
        Entity _superType_1 = e.getSuperType();
        String _name_2 = _superType_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("h4. Attributes");
    _builder.newLine();
    _builder.newLine();
    _builder.append("table{border:1px solid black}.");
    _builder.newLine();
    _builder.append("|_.|_. Name |_. Type |_. Cardinality |_. Semantic |_. Constraint  |_. Documentation  |_.");
    _builder.newLine();
    {
      EList<Feature> _features = e.getFeatures();
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features, fr.chaunier.xtext.omcst.om.omcstDsl.Attribute.class);
      for(Attribute f : _filter) {
        _builder.append("    ");
        StringConcatenation _featureTxt = this.featureTxt(f, importManager);
        _builder.append(_featureTxt, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _featureTxt(final Attribute a, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    OmcstExtensions _omcstExtensions = new OmcstExtensions();
    final OmcstExtensions om = _omcstExtensions;
    _builder.append("  ");
    _builder.newLineIfNotEmpty();
    _builder.append("|!icons/Attribute.gif!| ");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(" | \"");
    TypeRef _type = a.getType();
    Type _referenced = _type.getReferenced();
    String _name_1 = _referenced.getName();
    _builder.append(_name_1, "");
    _builder.append("\":");
    TypeRef _type_1 = a.getType();
    Type _referenced_1 = _type_1.getReferenced();
    PackageDeclaration _package = om.getPackage(_referenced_1);
    String _name_2 = _package.getName();
    _builder.append(_name_2, "");
    _builder.append(".html#");
    TypeRef _type_2 = a.getType();
    Type _referenced_2 = _type_2.getReferenced();
    String _name_3 = _referenced_2.getName();
    _builder.append(_name_3, "");
    _builder.append(" | ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _featureTxt(final Reference r, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _typeTxt(final DataType d, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("h3(#");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append("). DataType Name : ");
    String _name_1 = d.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _typeTxt(final Enumeration e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("h3(#");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("). Enumeration Name : ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "");
    _builder.append(" [");
    _builder.newLineIfNotEmpty();
    {
      EList<EnumerationLiteral> _enumerationLiterals = e.getEnumerationLiterals();
      for(EnumerationLiteral l : _enumerationLiterals) {
        String _name_2 = l.getName();
        _builder.append(_name_2, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("      ");
      }
    }
    _builder.append(" ]\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation typeTxt(final Type d, final ImportManager importManager) {
    if ((d instanceof DataType)
         && (importManager instanceof ImportManager)) {
      return _typeTxt((DataType)d, (ImportManager)importManager);
    } else if ((d instanceof Entity)
         && (importManager instanceof ImportManager)) {
      return _typeTxt((Entity)d, (ImportManager)importManager);
    } else if ((d instanceof Enumeration)
         && (importManager instanceof ImportManager)) {
      return _typeTxt((Enumeration)d, (ImportManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(d, importManager).toString());
    }
  }
  
  public StringConcatenation featureTxt(final StructuralFeature a, final ImportManager importManager) {
    if ((a instanceof Attribute)
         && (importManager instanceof ImportManager)) {
      return _featureTxt((Attribute)a, (ImportManager)importManager);
    } else if ((a instanceof Reference)
         && (importManager instanceof ImportManager)) {
      return _featureTxt((Reference)a, (ImportManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a, importManager).toString());
    }
  }
}