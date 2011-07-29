/*
 * generated by Xtext
 */
package fr.chaunier.xtext.instance.om.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import fr.chaunier.xtext.instance.om.instanceDsl.NewObject;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Feature;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class InstanceDslScopeProvider extends AbstractDeclarativeScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println(
				"Inst: scope_" + reference.getEContainingClass().getName() + "_" + reference.getName()
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
	private List<Attribute> getAttributesForEntity(Entity entity) {
		List<Attribute> result = new ArrayList<Attribute>();
		for (Feature feature : entity.getFeatures()) {
			if ( feature instanceof Attribute )
				result.add((Attribute)feature);
		}
		return result;
	}

	/**
	 * Utility method to turn a list of attributes into a SimpleScope.
	 */
	private IScope createScope(List<Attribute> attributes) {
		List<IEObjectDescription> scopedElements = new ArrayList<IEObjectDescription>();
		for (Attribute attr : attributes) {
			scopedElements.add(EObjectDescription.create(attr.getName(), attr));
		}
		return new SimpleScope(scopedElements);
	}
	
//	Inst: scope_NewObject_eClass(NewObject, ..)
//	Inst: scope_Feature_eFeature(NewObject, ..)

	public IScope scope_Feature_eFeature(NewObject context, EReference reference) {
		Entity entity = context.getEClass();
		return createScope(getAttributesForEntity(entity));
//		return createScopeDataType(getAttributesForEntity(entity));
	}

}