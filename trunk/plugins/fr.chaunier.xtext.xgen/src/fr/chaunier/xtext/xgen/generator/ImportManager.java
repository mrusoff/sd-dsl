package fr.chaunier.xtext.xgen.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.chaunier.xtext.omc.OmHelper;
import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration;
import fr.chaunier.xtext.omc.omcDsl.Type;


/**
	 */
public class ImportManager {

	private Map<String, PackageDeclaration> imports = newHashMap();

	public void appendTypeRef(Type typeRef, StringBuilder builder) {
			OmHelper o = new OmHelper();
			PackageDeclaration pac = o.getPackageDeclaration(typeRef);
			imports.put(pac.getName(), pac);
	}

	public List<String> getImports() {
		ArrayList<String> result = newArrayList(imports.keySet());
		Collections.sort(result);
		return result;
	}

	public List<PackageDeclaration> getImportPackages(PackageDeclaration currentPackage) {
		ArrayList<PackageDeclaration> result = newArrayList(imports.values());
		result.remove(currentPackage);
		return result;
	}

}
