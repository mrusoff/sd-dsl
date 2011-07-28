package fr.chaunier.xtext.constraint.generator;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.om.OmExtensions;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;
import fr.chaunier.xtext.om.omDsl.Type;

/**
	 */
public class PackageManager {

	// link package cts by package name
	private Map<PackageDeclaration,PackageConstraint> packageLinks = newHashMap();
//	private Map<String, PackageConstraint> packageLinks = newHashMap();

	// link package by name
	private Map<String, PackageDeclaration> packageDecls = newHashMap();

	public void appendPackage(PackageConstraint pc) {
		packageLinks.put(pc.getPackageDeclaration(),pc);
	}

	public void appendTypeRef(Type typeRef, StringBuilder builder) {
		OmExtensions o = new OmExtensions();
		PackageDeclaration pac = o.getPackage(typeRef);
		packageDecls.put(pac.getName(), pac);
	}

	public PackageConstraint getPackageConstraint(PackageDeclaration packageDeclaration) {
		return packageLinks.get(packageDeclaration) ;
	}
	
	public List<String> getImports() {
		ArrayList<String> result = newArrayList(packageDecls.keySet());
		Collections.sort(result);
		return result;
	}
	
	public List<PackageConstraint> getImportPackageConstraints() {
		ArrayList<PackageConstraint> result = newArrayList(packageLinks.values());
		return result;
	}
}
