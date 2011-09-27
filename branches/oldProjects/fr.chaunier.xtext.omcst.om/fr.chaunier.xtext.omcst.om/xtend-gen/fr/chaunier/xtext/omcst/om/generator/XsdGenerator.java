package fr.chaunier.xtext.omcst.om.generator;

import fr.chaunier.xtext.omcst.om.Helpers;
import fr.chaunier.xtext.omcst.om.generator.ImportManager;
import fr.chaunier.xtext.omcst.om.omcstDsl.AbstractElement;
import fr.chaunier.xtext.omcst.om.omcstDsl.AllConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;
import fr.chaunier.xtext.omcst.om.omcstDsl.Constraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DataType;
import fr.chaunier.xtext.omcst.om.omcstDsl.DateTimeConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DecimalConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration;
import fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationLiteral;
import fr.chaunier.xtext.omcst.om.omcstDsl.Feature;
import fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import fr.chaunier.xtext.omcst.om.omcstDsl.Reference;
import fr.chaunier.xtext.omcst.om.omcstDsl.StringConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature;
import fr.chaunier.xtext.omcst.om.omcstDsl.Type;
import fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef;
import fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XsdGenerator {
  
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
  
  public PackageDeclaration getPackage(final Object o) {
    PackageDeclaration _switchResult = null;
    final Object o_1 = o;
    boolean matched = false;
    if (!matched) {
      if (o_1 instanceof PackageDeclaration) {
        final PackageDeclaration o_2 = (PackageDeclaration) o_1;
        matched=true;
        _switchResult = o_2;
      }
    }
    if (!matched) {
      if (o_1 instanceof EObject) {
        final EObject o_3 = (EObject) o_1;
        matched=true;
        EObject _eContainer = o_3.eContainer();
        PackageDeclaration _package = this.getPackage(_eContainer);
        _switchResult = _package;
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public String getPrefixe(final Object o) {
    PackageDeclaration _package = this.getPackage(o);
    String _prefix = _package.getPrefix();
    return _prefix;
  }
  
  public StringConcatenation compileXsd(final PackageDeclaration pac) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    ImportManager _importManager = new ImportManager();
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _body = this.body(pac, importManager);
    final StringConcatenation body = _body;
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<xsd:schema xmlns:");
    String _prefix = pac.getPrefix();
    _builder.append(_prefix, "");
    _builder.append("=\"");
    String _namespace = pac.getNamespace();
    _builder.append(_namespace, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("attributeFormDefault=\"unqualified\" ");
    _builder.newLine();
    _builder.append("elementFormDefault=\"unqualified\" ");
    _builder.newLine();
    _builder.append("targetNamespace=\"");
    String _namespace_1 = pac.getNamespace();
    _builder.append(_namespace_1, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"");
    _builder.newLine();
    List<PackageDeclaration> _importPackages = importManager.getImportPackages(pac);
    final List<PackageDeclaration> pcks = _importPackages;
    _builder.newLineIfNotEmpty();
    {
      for(PackageDeclaration i : pcks) {
        _builder.append("xmlns:");
        String _prefix_1 = i.getPrefix();
        _builder.append(_prefix_1, "");
        _builder.append("=\"");
        String _namespace_2 = i.getNamespace();
        _builder.append(_namespace_2, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(">");
    _builder.newLine();
    {
      for(PackageDeclaration i_1 : pcks) {
        _builder.append("<xsd:import schemaLocation=\"");
        String _name = i_1.getName();
        _builder.append(_name, "");
        _builder.append(".xsd\" namespace=\"");
        String _namespace_3 = i_1.getNamespace();
        _builder.append(_namespace_3, "");
        _builder.append("\"></xsd:import>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append(body, "    ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final PackageDeclaration p, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractElement> _elements = p.getElements();
      Iterable<DataType> _filter = IterableExtensions.<DataType>filter(_elements, fr.chaunier.xtext.omcst.om.omcstDsl.DataType.class);
      for(DataType t : _filter) {
        _builder.append("  ");
        StringConcatenation _type = this.type(t, importManager);
        _builder.append(_type, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_1 = p.getElements();
      Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(_elements_1, fr.chaunier.xtext.omcst.om.omcstDsl.Entity.class);
      for(Entity t_1 : _filter_1) {
        _builder.append("  ");
        StringConcatenation _type_1 = this.type(t_1, importManager);
        _builder.append(_type_1, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_2 = p.getElements();
      Iterable<Enumeration> _filter_2 = IterableExtensions.<Enumeration>filter(_elements_2, fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration.class);
      for(Enumeration t_2 : _filter_2) {
        _builder.append("  ");
        StringConcatenation _type_2 = this.type(t_2, importManager);
        _builder.append(_type_2, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_3 = p.getElements();
      Iterable<XsdElement> _filter_3 = IterableExtensions.<XsdElement>filter(_elements_3, fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement.class);
      for(XsdElement t_3 : _filter_3) {
        _builder.append("  ");
        StringConcatenation _element = this.element(t_3);
        _builder.append(_element, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<AbstractElement> _elements_4 = p.getElements();
      Iterable<Entity> _filter_4 = IterableExtensions.<Entity>filter(_elements_4, fr.chaunier.xtext.omcst.om.omcstDsl.Entity.class);
      for(Entity t_4 : _filter_4) {
        _builder.append("  ");
        StringConcatenation _substitutionGroup = this.substitutionGroup(t_4);
        _builder.append(_substitutionGroup, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</xsd:schema>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _type(final DataType d, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append("<xsd:documentation>");
    String _name = d.getName();
    _builder.append(_name, "");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _type(final Enumeration e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:simpleType name=\"");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("Enum\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<xsd:restriction base=\"xsd:string\">");
    _builder.newLine();
    {
      EList<EnumerationLiteral> _enumerationLiterals = e.getEnumerationLiterals();
      for(EnumerationLiteral l : _enumerationLiterals) {
        _builder.append("<xsd:enumeration value=\"");
        String _name_1 = l.getName();
        _builder.append(_name_1, "");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<xsd:enumeration value=\"INCONNU_");
    String _name_2 = e.getName();
    _builder.append(_name_2, "");
    EList<EnumerationLiteral> _enumerationLiterals_1 = e.getEnumerationLiterals();
    int _size = _enumerationLiterals_1.size();
    int _operator_plus = IntegerExtensions.operator_plus(((Integer)_size), ((Integer)1));
    _builder.append(_operator_plus, "");
    _builder.append("\"/> ");
    _builder.newLineIfNotEmpty();
    _builder.append("<xsd:enumeration value=\"INCONNU_");
    String _name_3 = e.getName();
    _builder.append(_name_3, "");
    EList<EnumerationLiteral> _enumerationLiterals_2 = e.getEnumerationLiterals();
    int _size_1 = _enumerationLiterals_2.size();
    int _operator_plus_1 = IntegerExtensions.operator_plus(((Integer)_size_1), ((Integer)2));
    _builder.append(_operator_plus_1, "");
    _builder.append("\"/> ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation getAbstract(final Entity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    Helpers _helpers = new Helpers();
    final Helpers helpers = _helpers;
    _builder.newLineIfNotEmpty();
    {
      boolean _isAbstract = helpers.isAbstract(e);
      if (_isAbstract) {
        _builder.append("abstract=\"true\"");
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _type(final Entity e, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:complexType name=\"");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("Type\" ");
    StringConcatenation _abstract = this.getAbstract(e, importManager);
    _builder.append(_abstract, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      Entity _superType = e.getSuperType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
      if (_operator_notEquals) {
        _builder.append("<xsd:complexContent>");
        _builder.newLine();
        _builder.append("<xsd:extension base=\"");
        Entity _superType_1 = e.getSuperType();
        String _prefixe = this.getPrefixe(_superType_1);
        _builder.append(_prefixe, "");
        _builder.append(":");
        Entity _superType_2 = e.getSuperType();
        String _name_1 = _superType_2.getName();
        _builder.append(_name_1, "");
        _builder.append("Type\"\u00BB>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append("<xsd:documentation>");
    String _description = e.getDescription();
    _builder.append(_description, "");
    _builder.append("</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    {
      EList<Feature> _features = e.getFeatures();
      int _size = _features.size();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_size), ((Integer)0));
      if (_operator_notEquals_1) {
        _builder.append("<xsd:sequence>");
        _builder.newLine();
        {
          EList<Feature> _features_1 = e.getFeatures();
          Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(_features_1, fr.chaunier.xtext.omcst.om.omcstDsl.Attribute.class);
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
      }
    }
    {
      Entity _superType_3 = e.getSuperType();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_superType_3, null);
      if (_operator_notEquals_2) {
        _builder.append("</xsd:extension>");
        _builder.newLine();
        _builder.append("</xsd:complexContent>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</xsd:complexType>  ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _feature(final Attribute a, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    TypeRef _type = a.getType();
    Type _referenced = _type.getReferenced();
    String _shortName = this.shortName(_referenced, importManager);
    _builder.append(_shortName, "");
    _builder.newLineIfNotEmpty();
    {
      Constraint _constraint = a.getConstraint();
      boolean _operator_equals = ObjectExtensions.operator_equals(_constraint, null);
      if (_operator_equals) {
        _builder.append("<xsd:element name=\"");
        String _name = a.getName();
        _builder.append(_name, "");
        _builder.append("\" ");
        TypeRef _type_1 = a.getType();
        StringConcatenation _cardinality = this.cardinality(_type_1);
        _builder.append(_cardinality, "");
        _builder.append(" ");
        TypeRef _type_2 = a.getType();
        Type _referenced_1 = _type_2.getReferenced();
        StringConcatenation _typeOfRef = this.typeOfRef(_referenced_1);
        _builder.append(_typeOfRef, "");
        _builder.append(">");
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
        _builder.append("</xsd:element>");
        _builder.newLine();} else {
        StringConcatenation _setXsdConstraint = this.setXsdConstraint(a);
        _builder.append(_setXsdConstraint, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _feature(final Reference ref, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _contraintXsd(final Constraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _contraintXsd(final StringConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AllConstraint _constraintRef = cst.getConstraintRef();
      int _minLen = _constraintRef.getMinLen();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_minLen), ((Integer)0));
      if (_operator_notEquals) {
        _builder.append("<xsd:minLength value= \"");
        AllConstraint _constraintRef_1 = cst.getConstraintRef();
        int _minLen_1 = _constraintRef_1.getMinLen();
        _builder.append(_minLen_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      AllConstraint _constraintRef_2 = cst.getConstraintRef();
      int _maxLen = _constraintRef_2.getMaxLen();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_maxLen), ((Integer)0));
      if (_operator_notEquals_1) {
        _builder.append("<xsd:maxLength value= \"");
        AllConstraint _constraintRef_3 = cst.getConstraintRef();
        int _maxLen_1 = _constraintRef_3.getMaxLen();
        _builder.append(_maxLen_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      AllConstraint _constraintRef_4 = cst.getConstraintRef();
      int _fixeLen = _constraintRef_4.getFixeLen();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_fixeLen), ((Integer)0));
      if (_operator_notEquals_2) {
        _builder.append("<xsd:minLength value= \"");
        AllConstraint _constraintRef_5 = cst.getConstraintRef();
        int _fixeLen_1 = _constraintRef_5.getFixeLen();
        _builder.append(_fixeLen_1, "");
        _builder.append("\"<xsd:maxLength value= \"");
        AllConstraint _constraintRef_6 = cst.getConstraintRef();
        int _fixeLen_2 = _constraintRef_6.getFixeLen();
        _builder.append(_fixeLen_2, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _contraintXsd(final DecimalConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    {
      NumberConstraint _constraintRef = cst.getConstraintRef();
      int _minLen = _constraintRef.getMinLen();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_minLen), ((Integer)0));
      if (_operator_notEquals) {
        _builder.append("<xsd:minLength value= \"");
        NumberConstraint _constraintRef_1 = cst.getConstraintRef();
        int _minLen_1 = _constraintRef_1.getMinLen();
        _builder.append(_minLen_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      NumberConstraint _constraintRef_2 = cst.getConstraintRef();
      int _maxLen = _constraintRef_2.getMaxLen();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_maxLen), ((Integer)0));
      if (_operator_notEquals_1) {
        _builder.append("<xsd:maxLength value= \"");
        NumberConstraint _constraintRef_3 = cst.getConstraintRef();
        int _maxLen_1 = _constraintRef_3.getMaxLen();
        _builder.append(_maxLen_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      NumberConstraint _constraintRef_4 = cst.getConstraintRef();
      int _fixeLen = _constraintRef_4.getFixeLen();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_fixeLen), ((Integer)0));
      if (_operator_notEquals_2) {
        _builder.append("<xsd:minLength value= \"");
        NumberConstraint _constraintRef_5 = cst.getConstraintRef();
        int _fixeLen_1 = _constraintRef_5.getFixeLen();
        _builder.append(_fixeLen_1, "");
        _builder.append("\"<xsd:maxLength value= \"");
        NumberConstraint _constraintRef_6 = cst.getConstraintRef();
        int _fixeLen_2 = _constraintRef_6.getFixeLen();
        _builder.append(_fixeLen_2, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation cardinality(final TypeRef ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isOption = ref.isOption();
      if (_isOption) {
        _builder.append("minOccurs=\"0\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _isMulti = ref.isMulti();
      if (_isMulti) {
        _builder.append("maxOccurs=\"unbounded\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _typeOfRef(final Type e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _typeOfRef(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type=\"");
    String _prefixe = this.getPrefixe(e);
    _builder.append(_prefixe, "");
    _builder.append(":");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("Type\"\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _typeOfRef(final DataType e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type=\"xsd:string\" ");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _typeOfRef(final Enumeration e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("type=\"");
    String _prefixe = this.getPrefixe(e);
    _builder.append(_prefixe, "");
    _builder.append(":");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("Enum\"\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation setXsdConstraint(final Attribute att) {
    StringConcatenation _switchResult = null;
    Constraint _constraint = att.getConstraint();
    final Constraint __valOfSwitchOver = _constraint;
    boolean matched = false;
    if (!matched) {
      if (__valOfSwitchOver instanceof StringConstraint) {
        matched=true;
        Constraint _constraint_1 = att.getConstraint();
        StringConcatenation _attributConstraint = this.attributConstraint(att, _constraint_1);
        _switchResult = _attributConstraint;
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof DecimalConstraint) {
        matched=true;
        Constraint _constraint_2 = att.getConstraint();
        StringConcatenation _attributConstraint_1 = this.attributConstraint(att, _constraint_2);
        _switchResult = _attributConstraint_1;
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof EnumerationConstraint) {
        matched=true;
        Constraint _constraint_3 = att.getConstraint();
        StringConcatenation _attributConstraint_2 = this.attributConstraint(att, _constraint_3);
        _switchResult = _attributConstraint_2;
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof DateTimeConstraint) {
        matched=true;
        Constraint _constraint_4 = att.getConstraint();
        StringConcatenation _attributConstraint_3 = this.attributConstraint(att, _constraint_4);
        _switchResult = _attributConstraint_3;
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  protected StringConcatenation _attributConstraint(final Attribute attribute, final Constraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:annotation>");
    _builder.newLine();
    _builder.append("<xsd:documentation>");
    String _name = attribute.getName();
    _builder.append(_name, "");
    _builder.append(" type interdit</xsd:documentation>");
    _builder.newLineIfNotEmpty();
    _builder.append("</xsd:annotation>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _attributConstraint(final Attribute attribute, final StringConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_or = false;
      boolean _operator_or_1 = false;
      boolean _operator_or_2 = false;
      AllConstraint _constraintRef = cst.getConstraintRef();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_constraintRef, null);
      if (_operator_notEquals) {
        _operator_or_2 = true;
      } else {
        AllConstraint _constraintRef_1 = cst.getConstraintRef();
        int _minLen = _constraintRef_1.getMinLen();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_minLen), ((Integer)0));
        _operator_or_2 = BooleanExtensions.operator_or(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_or_2) {
        _operator_or_1 = true;
      } else {
        AllConstraint _constraintRef_2 = cst.getConstraintRef();
        int _maxLen = _constraintRef_2.getMaxLen();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_maxLen), ((Integer)0));
        _operator_or_1 = BooleanExtensions.operator_or(_operator_or_2, _operator_notEquals_2);
      }
      if (_operator_or_1) {
        _operator_or = true;
      } else {
        AllConstraint _constraintRef_3 = cst.getConstraintRef();
        int _fixeLen = _constraintRef_3.getFixeLen();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(((Integer)_fixeLen), ((Integer)0));
        _operator_or = BooleanExtensions.operator_or(_operator_or_1, _operator_notEquals_3);
      }
      if (_operator_or) {
        _builder.append("<xsd:element name=\"");
        String _name = attribute.getName();
        _builder.append(_name, "");
        _builder.append("\" ");
        TypeRef _type = attribute.getType();
        StringConcatenation _cardinality = this.cardinality(_type);
        _builder.append(_cardinality, "");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<xsd:annotation>");
        _builder.newLine();
        _builder.append("<xsd:documentation>");
        String _description = attribute.getDescription();
        _builder.append(_description, "");
        _builder.append("</xsd:documentation>");
        _builder.newLineIfNotEmpty();
        _builder.append("</xsd:annotation>");
        _builder.newLine();
        _builder.append("<xsd:simpleType>");
        _builder.newLine();
        _builder.append("<xsd:restriction base=\"xsd:string\">");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        StringConcatenation _contraintXsd = this.contraintXsd(cst);
        _builder.append(_contraintXsd, "				");
        _builder.append("    \t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("</xsd:restriction>");
        _builder.newLine();
        _builder.append("</xsd:simpleType>");
        _builder.newLine();
        _builder.append("</xsd:element>");
        _builder.newLine();} else {
        _builder.append("<xsd:element name=\"");
        String _name_1 = attribute.getName();
        _builder.append(_name_1, "");
        _builder.append("\" type=\"xsd:string\" ");
        TypeRef _type_1 = attribute.getType();
        StringConcatenation _cardinality_1 = this.cardinality(_type_1);
        _builder.append(_cardinality_1, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _attributConstraint(final Attribute attribute, final DecimalConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_or = false;
      boolean _operator_or_1 = false;
      boolean _operator_or_2 = false;
      NumberConstraint _constraintRef = cst.getConstraintRef();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_constraintRef, null);
      if (_operator_notEquals) {
        _operator_or_2 = true;
      } else {
        NumberConstraint _constraintRef_1 = cst.getConstraintRef();
        int _minLen = _constraintRef_1.getMinLen();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_minLen), ((Integer)0));
        _operator_or_2 = BooleanExtensions.operator_or(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_or_2) {
        _operator_or_1 = true;
      } else {
        NumberConstraint _constraintRef_2 = cst.getConstraintRef();
        int _maxLen = _constraintRef_2.getMaxLen();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_maxLen), ((Integer)0));
        _operator_or_1 = BooleanExtensions.operator_or(_operator_or_2, _operator_notEquals_2);
      }
      if (_operator_or_1) {
        _operator_or = true;
      } else {
        NumberConstraint _constraintRef_3 = cst.getConstraintRef();
        int _fixeLen = _constraintRef_3.getFixeLen();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(((Integer)_fixeLen), ((Integer)0));
        _operator_or = BooleanExtensions.operator_or(_operator_or_1, _operator_notEquals_3);
      }
      if (_operator_or) {
        _builder.append("<xsd:element name=\"");
        String _name = attribute.getName();
        _builder.append(_name, "");
        _builder.append("\" ");
        TypeRef _type = attribute.getType();
        StringConcatenation _cardinality = this.cardinality(_type);
        _builder.append(_cardinality, "");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<xsd:annotation>");
        _builder.newLine();
        _builder.append("      \t\t\t");
        _builder.append("<xsd:documentation>");
        String _description = attribute.getDescription();
        _builder.append(_description, "      			");
        _builder.append("</xsd:documentation>");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t");
        _builder.append("</xsd:annotation>");
        _builder.newLine();
        _builder.append("    \t\t\t");
        _builder.append("<xsd:simpleType>");
        _builder.newLine();
        _builder.append("    \t\t\t\t");
        _builder.append("<xsd:restriction base=\"xsd:integer\">");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        StringConcatenation _contraintXsd = this.contraintXsd(cst);
        _builder.append(_contraintXsd, "				");
        _builder.append("    \t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t\t\t");
        _builder.append("</xsd:restriction>");
        _builder.newLine();
        _builder.append("    \t\t\t");
        _builder.append("</xsd:simpleType>");
        _builder.newLine();
        _builder.append("    \t");
        _builder.append("</xsd:element>");
        _builder.newLine();} else {
        _builder.append("<xsd:element name=\"");
        String _name_1 = attribute.getName();
        _builder.append(_name_1, "");
        _builder.append("\" type=\"xsd:integer\" ");
        TypeRef _type_1 = attribute.getType();
        StringConcatenation _cardinality_1 = this.cardinality(_type_1);
        _builder.append(_cardinality_1, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _attributConstraint(final Attribute attribute, final EnumerationConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _attributConstraint(final Attribute attribute, final DateTimeConstraint cst) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public StringConcatenation element(final XsdElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<xsd:element name=\"");
    Entity _xsdElement = element.getXsdElement();
    String _name = _xsdElement.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("\" type=\"");
    Entity _xsdElement_1 = element.getXsdElement();
    String _prefixe = this.getPrefixe(_xsdElement_1);
    _builder.append(_prefixe, "");
    _builder.append(":");
    Entity _xsdElement_2 = element.getXsdElement();
    String _name_1 = _xsdElement_2.getName();
    _builder.append(_name_1, "");
    _builder.append("Type\"></xsd:element>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation substitutionGroup(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    Helpers _helpers = new Helpers();
    final Helpers helpers = _helpers;
    _builder.newLineIfNotEmpty();
    {
      Entity _superType = entity.getSuperType();
      boolean _isAbstract = helpers.isAbstract(_superType);
      if (_isAbstract) {
        _builder.append("<element name=\"");
        String _name = entity.getName();
        _builder.append(_name, "");
        _builder.append("\" type=\"");
        String _name_1 = entity.getName();
        _builder.append(_name_1, "");
        _builder.append("Type\" substitutionGroup=\"");
        Entity _superType_1 = entity.getSuperType();
        String _name_2 = _superType_1.getName();
        _builder.append(_name_2, "");
        _builder.append("\"></element>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isAbstract_1 = helpers.isAbstract(entity);
      if (_isAbstract_1) {
        _builder.append("<element name=\"");
        String _name_3 = entity.getName();
        _builder.append(_name_3, "");
        _builder.append("\" type=\"c:");
        String _name_4 = entity.getName();
        _builder.append(_name_4, "");
        _builder.append("Type\" abstract=\"true\"></element>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation type(final Type d, final ImportManager importManager) {
    if ((d instanceof DataType)
         && (importManager instanceof ImportManager)) {
      return _type((DataType)d, (ImportManager)importManager);
    } else if ((d instanceof Entity)
         && (importManager instanceof ImportManager)) {
      return _type((Entity)d, (ImportManager)importManager);
    } else if ((d instanceof Enumeration)
         && (importManager instanceof ImportManager)) {
      return _type((Enumeration)d, (ImportManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(d, importManager).toString());
    }
  }
  
  public StringConcatenation feature(final StructuralFeature a, final ImportManager importManager) {
    if ((a instanceof Attribute)
         && (importManager instanceof ImportManager)) {
      return _feature((Attribute)a, (ImportManager)importManager);
    } else if ((a instanceof Reference)
         && (importManager instanceof ImportManager)) {
      return _feature((Reference)a, (ImportManager)importManager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(a, importManager).toString());
    }
  }
  
  public StringConcatenation contraintXsd(final Constraint cst) {
    if ((cst instanceof DecimalConstraint)) {
      return _contraintXsd((DecimalConstraint)cst);
    } else if ((cst instanceof StringConstraint)) {
      return _contraintXsd((StringConstraint)cst);
    } else if ((cst instanceof Constraint)) {
      return _contraintXsd((Constraint)cst);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(cst).toString());
    }
  }
  
  public StringConcatenation typeOfRef(final Type e) {
    if ((e instanceof DataType)) {
      return _typeOfRef((DataType)e);
    } else if ((e instanceof Entity)) {
      return _typeOfRef((Entity)e);
    } else if ((e instanceof Enumeration)) {
      return _typeOfRef((Enumeration)e);
    } else if ((e instanceof Type)) {
      return _typeOfRef((Type)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(e).toString());
    }
  }
  
  public StringConcatenation attributConstraint(final Attribute attribute, final Constraint cst) {
    if ((attribute instanceof Attribute)
         && (cst instanceof DateTimeConstraint)) {
      return _attributConstraint((Attribute)attribute, (DateTimeConstraint)cst);
    } else if ((attribute instanceof Attribute)
         && (cst instanceof DecimalConstraint)) {
      return _attributConstraint((Attribute)attribute, (DecimalConstraint)cst);
    } else if ((attribute instanceof Attribute)
         && (cst instanceof EnumerationConstraint)) {
      return _attributConstraint((Attribute)attribute, (EnumerationConstraint)cst);
    } else if ((attribute instanceof Attribute)
         && (cst instanceof StringConstraint)) {
      return _attributConstraint((Attribute)attribute, (StringConstraint)cst);
    } else if ((attribute instanceof Attribute)
         && (cst instanceof Constraint)) {
      return _attributConstraint((Attribute)attribute, (Constraint)cst);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(attribute, cst).toString());
    }
  }
}