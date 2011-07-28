package fr.chaunier.xtext.om.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.chaunier.xtext.om.OmExtensions;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Type;

/**
	 */
public class ImportManager {

	private Map<String, String> imports = newHashMap();

	private boolean organizeImports;

	private String seedSimpleName;

	public ImportManager(boolean organizeImports) {
		this(organizeImports, null);
	}

	public ImportManager(boolean organizeImports, String seedSimpleName) {
		this.organizeImports = organizeImports;
		this.seedSimpleName = seedSimpleName;
	}

	public void appendTypeRef(Type typeRef, StringBuilder builder) {
			OmExtensions o = new OmExtensions();
			String qn = o.packageName(typeRef);
			imports.put(qn, qn);
			System.out.println(qn);
	}


	public List<String> getImports() {
		ArrayList<String> result = newArrayList(imports.values());
		Collections.sort(result);
		return result;
	}
}
