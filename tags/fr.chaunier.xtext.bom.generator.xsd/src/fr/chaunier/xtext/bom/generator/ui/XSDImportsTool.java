package fr.chaunier.xtext.bom.generator.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.PostProcessor;

import fr.chaunier.xtext.bom.bomDsl.PackageDeclaration;

public class XSDImportsTool implements PostProcessor {
	
	public final static String VAR_NAME = "__xsdImportTool";

	public void beforeWriteAndClose(FileHandle impl) {
		if (lastInsertMarker!=null) {
			String string = impl.getBuffer().toString();
			impl.setBuffer(new StringBuilder(string.replace(lastInsertMarker, getPackageSection())));
			
		}
		lastInsertMarker = null;
		packages.clear();
//		imports.clear();
	}
/*
	protected CharSequence getImportSection() {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<String>(imports);
		Collections.sort(list);
		for (String name : list) {
			sb.append("import ").append(name).append(";\n");
		}
		return sb;
	}
*/
	protected CharSequence getPackageSection() {
		StringBuilder sb = new StringBuilder();
		ArrayList<PackageDeclaration> list = new ArrayList<PackageDeclaration>(packages);
		list.remove(currentPackage);
		for (PackageDeclaration pck1 : list) {
			sb.append("xmlns:").append(pck1.getPrefix()).append("=\"").append(pck1.getNamespace()).append("\"").append("\n") ;
		}
		sb.append(">\n");
		for (PackageDeclaration pck : list) {
			sb.append("<xsd:import schemaLocation=\"").append(pck.getName()).append(".xsd\" namespace=\"").append(pck.getNamespace()).append("\"></xsd:import>").append("\n") ;
		}
		return sb;
	}

	public void afterClose(FileHandle impl) {
	}
	
	private String lastInsertMarker = null;
	
	public String addImportsHere() {
		if (lastInsertMarker!=null)
			throw new IllegalStateException("Multiple import sections? Did you forget to register the xsdImportsTool as postprocessor?");
		lastInsertMarker = "_Placeholder_for_a_lazy_import_section_"+System.currentTimeMillis()+"___";
		return lastInsertMarker;
	}



//	private Set<String> imports = new HashSet<String>();
	private Set<PackageDeclaration> packages = new HashSet<PackageDeclaration>();
	private PackageDeclaration currentPackage ;

	/*
	public String registerImport(String qualifiedName) {
		if (qualifiedName != null)
			imports.add(qualifiedName);
		return qualifiedName;
	}
*/
	
	public PackageDeclaration registerImportPackage(PackageDeclaration pck) {
		if (pck != null)
			packages.add(pck);
		return pck;
	}
	
	public void setCurrentPackage(PackageDeclaration pack) {
		currentPackage = pack ;
	}

}
