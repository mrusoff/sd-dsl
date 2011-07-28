package fr.chaunier.xtext.constraint.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.chaunier.xtext.om.OmExtensions;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;
import fr.chaunier.xtext.om.omDsl.Type;

/**
	 */
public class ImportManager {

	private Map<String, String> imports = newHashMap();

	public void appendTypeRef(Type typeRef, StringBuilder builder) {
			OmExtensions o = new OmExtensions();
			PackageDeclaration pac = o.getPackage(typeRef);
			imports.put(pac.getName(), pac.getName());
	}

	public List<String> getImports() {
		ArrayList<String> result = newArrayList(imports.values());
		Collections.sort(result);
		return result;
	}
}
