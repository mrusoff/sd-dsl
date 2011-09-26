/*
 * generated by Xtext
 */
package fr.chaunier.xtext.constraint.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.om.omDsl.AbstractElement;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Feature;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class CstDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println(
				"Cst: scope_" + reference.getEContainingClass().getName() + "_" + reference.getName()
				+ "(" + context.eClass().getName() + ", ..)"
			);
		return super.getScope(context, reference);
	}

	/**
	 * Returns all attributes for an entity including the attributes of all
	 * super classes.
	 * 
	 * @param entity
	 * @return
	 */
	private List<Attribute> getAllAttributesForEntity(Entity entity) {
		List<Attribute> result = new ArrayList<Attribute>();
		if (entity.getSuperType() != null) {
			result.addAll(getAllAttributesForEntity(entity.getSuperType()));
		}
		for (Feature feature : entity.getFeatures()) {
			if ( feature instanceof Attribute )
				result.add((Attribute)feature);
		}
		return result;
	}

	/**
	 * Returns all attributes for an entity including the attributes of all
	 * super classes.
	 * 
	 * @param entity
	 * @return
	 */
	private List<Attribute> getAttributesForEntity(Entity entity) {
		List<Attribute> result = new ArrayList<Attribute>();
		for (Feature feature : entity.getFeatures()) {
			if ( feature instanceof Attribute )
				result.add((Attribute)feature);
		}
		return result;
	}

	/**
	 * Returns all entiies for a package
	 * 
	 * @param entity
	 * @return
	 */
	private List<Entity> getEntityForPackage(PackageDeclaration pack) {
		List<Entity> result = new ArrayList<Entity>();
		for (AbstractElement el : pack.getElements()) {
			if ( el instanceof Entity )
				result.add((Entity)el);
		}
		return result;
	}

	/**
	 * Utility method to turn a list of attributes into a SimpleScope.
	 */
	private IScope createScopeDataType(List<Attribute> attributes) {
		List<IEObjectDescription> scopedElements = new ArrayList<IEObjectDescription>();
		for (Attribute attr : attributes) {
			if ( ! (attr.getType().getReferenced() instanceof Entity ))
				scopedElements.add(EObjectDescription.create(attr.getName(), attr));
		}
		return new SimpleScope(scopedElements);
	}

	private IScope createScopePackage(List<Entity> elements) {
		List<IEObjectDescription> scopedElements = new ArrayList<IEObjectDescription>();
		for (AbstractElement el : elements) {
			if (el instanceof Entity)
				scopedElements.add(EObjectDescription.create(((Entity)el).getName() , el));
			if (el instanceof DataType)
				scopedElements.add(EObjectDescription.create(((DataType)el).getName() , el));
		}
		return new SimpleScope(scopedElements);
	}

	/*
	public IScope scope_EntityConstraint_entity(EntityConstraint context, EReference reference) {
		return createScope(getAttributesForEntity(context.getEntity()));
	}*/

	// retreive all features
	/*
	public IScope scope_AttributeConstraint_attribute(AttributeConstraint context, EReference reference) {
		EntityConstraint entityCst = (EntityConstraint)context.eContainer() ;
		Entity entity = entityCst.getEntity();
		System.out.println(entity.toString()+getAllAttributesForEntity(entity));
		return createScopeDataType(getAllAttributesForEntity(entity));
	}*/

	
	public IScope scope_AttributeConstraint_attribute(EntityConstraint context, EReference reference) {
		Entity entity = context.getEntity();
		return createScopeDataType(getAttributesForEntity(entity));
	}

/*	
	public IScope scope_PackageConstraint_package(PackageConstraint context, EReference reference) {
		PackageDeclaration p = context.getPackage() ;
		return createScopePackage(getEntityForPackage(p));
	}
*/	
}
