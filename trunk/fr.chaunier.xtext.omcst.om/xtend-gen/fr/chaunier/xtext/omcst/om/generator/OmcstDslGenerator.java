package fr.chaunier.xtext.omcst.om.generator;

import com.google.inject.Inject;
import fr.chaunier.xtext.omcst.om.generator.GeneratorExtensions;
import fr.chaunier.xtext.omcst.om.generator.TextileGenerator;
import fr.chaunier.xtext.omcst.om.generator.XsdGenerator;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OmcstDslGenerator implements IGenerator {
  
  @Inject
  private GeneratorExtensions generatorExtensions;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    {
      TextileGenerator _textileGenerator = new TextileGenerator();
      final TextileGenerator textileGenerator = _textileGenerator;
      XsdGenerator _xsdGenerator = new XsdGenerator();
      final XsdGenerator xsdGenerator = _xsdGenerator;
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
      Iterable<PackageDeclaration> _filter = IterableExtensions.<PackageDeclaration>filter(_allContentsIterable, fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration.class);
      for (PackageDeclaration packageDeclaration : _filter) {
        {
          String _fileName = this.generatorExtensions.fileName(packageDeclaration);
          StringConcatenation _compileXsd = xsdGenerator.compileXsd(packageDeclaration);
          fsa.generateFile(_fileName, _compileXsd);
          String _fileTxtName = this.generatorExtensions.fileTxtName(packageDeclaration);
          StringConcatenation _compileTxt = textileGenerator.compileTxt(packageDeclaration, this.generatorExtensions);
          fsa.generateFile(_fileTxtName, _compileTxt);
        }
      }
    }
  }
}