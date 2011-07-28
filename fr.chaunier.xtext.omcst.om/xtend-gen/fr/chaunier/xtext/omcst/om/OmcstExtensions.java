package fr.chaunier.xtext.omcst.om;

import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class OmcstExtensions {
  
  public String packageName(final Object o) {
    String _switchResult = null;
    final Object o_1 = o;
    boolean matched = false;
    if (!matched) {
      if (o_1 instanceof PackageDeclaration) {
        final PackageDeclaration o_2 = (PackageDeclaration) o_1;
        matched=true;
        EObject _eContainer = o_2.eContainer();
        String _packageName = this.packageName(_eContainer);
        String _name = o_2.getName();
        String _concatPath = this.concatPath(_packageName, _name);
        _switchResult = _concatPath;
      }
    }
    if (!matched) {
      if (o_1 instanceof EObject) {
        final EObject o_3 = (EObject) o_1;
        matched=true;
        EObject _eContainer_1 = o_3.eContainer();
        String _packageName_1 = this.packageName(_eContainer_1);
        _switchResult = _packageName_1;
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
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
  
  public String concatPath(final String prefix, final String suffix) {
    String _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(prefix);
    if (_isNullOrEmpty) {
      _xifexpression = suffix;
    } else {
      String _operator_plus = StringExtensions.operator_plus(prefix, ".");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, suffix);
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
}