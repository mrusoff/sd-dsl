package fr.chaunier.xtext.omcst.om.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.chaunier.xtext.omcst.om.OmcstExtensions;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.EntityType;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import fr.chaunier.xtext.omcst.om.omcstDsl.Type;

/**
	 */
public class ImportManager {

	private Map<String, PackageDeclaration> imports = newHashMap();

	public void appendTypeRef(Type typeRef, StringBuilder builder) {
			OmcstExtensions o = new OmcstExtensions();
			PackageDeclaration pac = o.getPackage(typeRef);
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
