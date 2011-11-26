/*
 * generated by Xtext
 */
package fr.chaunier.xtext.mapping.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import fr.chaunier.xtext.mapping.mapDsl.EmbeddedModelMap;
import fr.chaunier.xtext.mapping.mapDsl.FeaturePathFrom;
import fr.chaunier.xtext.mapping.mapDsl.FeaturePathTo;
import fr.chaunier.xtext.mapping.mapDsl.FeatureSet;
import fr.chaunier.xtext.mapping.mapDsl.FunctionParam;
import fr.chaunier.xtext.mapping.mapDsl.InOut;
import fr.chaunier.xtext.mapping.mapDsl.ModelMap;
import fr.chaunier.xtext.mapping.mapDsl.PathParam;
import fr.chaunier.xtext.mapping.mapDsl.impl.EmbeddedModelMapImpl;
import fr.chaunier.xtext.mapping.mapDsl.impl.ModelMapImpl;
import fr.chaunier.xtext.omc.omcDsl.Attribute;
import fr.chaunier.xtext.omc.omcDsl.Entity;
import fr.chaunier.xtext.omc.omcDsl.Feature;
import fr.chaunier.xtext.omc.omcDsl.StructuralFeature;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class MapDslScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		System.out.println(
				"Map: scope_" + reference.getEContainingClass().getName() + "_" + reference.getName()
				+ "(" + context.eClass().getName() + ", ..)"
			);
		return super.getScope(context, reference);
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

	/*
	 * Returns all attributes for an entity including the attributes of all
	 * super classes.
	 * 
	 * @param entity
	 * @return
	 */
	private List<Attribute> getAttributesForEntity(Entity entity) {
//		List<Entity> entities = new ArrayList<Entity>();

		List<Attribute> result = new  ArrayList<Attribute>();
/*
		OmHelper omHelper = new OmHelper();
		if ( entitySrc.isIsAbstract() )
			entities = omHelper.searchConcreteEntitiesOf(entitySrc);
		else entities.add(entitySrc);
		for ( Entity entity : entities ) {
*/
			if (entity.getSuperType() != null) {
				result.addAll(getAttributesForEntity(entity.getSuperType()));
			}
			for (Feature feature : entity.getFeatures()) {
				if ( feature instanceof Attribute )
					result.add((Attribute)feature);
			}
//		}
		return result;
	}

	/*
	private List<Attribute> getAttributesForEntity(Type type ) {
		List<Attribute> result = new ArrayList<Attribute>();
		if ( type instanceof Entity ) 
			return getAttributesForEntity((Entity)type);
		else return result ;
	}*/

	public IScope scope_PathParam_refAttribute(PathParam context,EReference reference) {
		Attribute attr = null;
		// Determine if the Target is a NestedFunctionParamter of a regular one 
		if (context.getTarget() instanceof PathParam) {
			try {
			StructuralFeature st = ((PathParam)context.getTarget()).getRefAttribute() ;
			if ( st instanceof Attribute )
				attr = (Attribute)st;
			} catch (AssertionError e) {
				return IScope.NULLSCOPE;
			}
		} else {
			attr = context.getTarget().getAttribute();
		}
		if ( attr == null )  
			return IScope.NULLSCOPE;
		if ( attr.getType().getReferenced() instanceof Entity ) {
			Entity entity = (Entity)attr.getType().getReferenced() ;
			return createScope(getAttributesForEntity(entity));
		} else return IScope.NULLSCOPE;
	}

	private Entity getMdlEntity(EObject current,InOut in) {
		EmbeddedModelMap emdl = getEmbeddedModel(current);
		Entity ent = null ;
		if ( emdl != null ) {
			if (in.getValue() == InOut.IN.getValue())
				ent = emdl.getEntityFrom() ;
			else ent =emdl.getEntityTo() ;
		}
		if ( ent != null) 
			return ent;
		ModelMap mdl = getModel(current) ;
		if (in.getValue() == InOut.IN.getValue())
			return mdl.getEntityFrom() ;
		else return mdl.getEntityTo() ; 
	}

	public ModelMap getModel(EObject current) {
		current = current.eContainer() ;
		if ( current instanceof ModelMapImpl )
			return (ModelMap)current ;
		else return getModel(current) ;
	}

	
	public EmbeddedModelMap getEmbeddedModel(EObject current) {
		current = current.eContainer() ;
		if ( current instanceof ModelMapImpl )
			return null ;
		if ( current instanceof EmbeddedModelMapImpl )
			return (EmbeddedModelMap)current ;
		else return getEmbeddedModel(current) ;
	}
	
	public IScope scope_Path_attribute(FeaturePathFrom context,EReference reference) {
		Entity from = getMdlEntity(context,InOut.IN) ;
		return createScope(getAttributesForEntity(from));
//		ModelMap mdl = getModel(context) ;
//		return createScope(getAttributesForEntity(mdl.getEntityFrom()));
	}
	
	public IScope scope_Path_attribute(FeaturePathTo context,EReference reference) {
		Entity to = getMdlEntity(context,InOut.OUT) ;
		return createScope(getAttributesForEntity(to));
//		ModelMap mdl = getModel(context) ;
//		return createScope(getAttributesForEntity(mdl.getEntityTo()));
	}
	
	
	public IScope scope_Path_attribute(FunctionParam context,EReference reference) {
//		ModelMap mdl = getModel(context) ;
		Entity ent = getMdlEntity(context,context.getIn()) ;
		return createScope(getAttributesForEntity(ent));
//		if (context.getIn().getValue() == InOut.IN.getValue())
//			return createScope(getAttributesForEntity(mdl.getEntityFrom()));
//		else return createScope(getAttributesForEntity(mdl.getEntityTo()));
	}
	
//				  scope_Path_attribute(FeatureSet, ..)
	public IScope scope_Path_attribute(FeatureSet context,EReference reference) {
		Entity ent = getMdlEntity(context,context.getIn()) ;
		return createScope(getAttributesForEntity(ent));
//		ModelMap mdl = getModel(context) ;
//		if (context.getIn().getValue() == InOut.IN.getValue())
//			return createScope(getAttributesForEntity(mdl.getEntityFrom()));
//		else return createScope(getAttributesForEntity(mdl.getEntityTo()));
	}

	// filter feature abstract 
	/*
	public IScope scope_Path_attribute(MapConcrete context,EReference reference) {
		ModelMap mdl = getModel(context) ;
		if (context.getIn().getValue() == InOut.IN.getValue()) {
			return createScope(getAttributesForEntity(mdl.getEntityFrom()));
		} else {
			return createScope(getAttributesForEntity(mdl.getEntityTo()));
		}
	}*/

	// filter feature  
	/*
	public IScope scope_Path_attribute(ConcreteFeaturePathFrom context,EReference reference) {
		ModelMap mdl = getModel(context) ;
		MapConcrete mc = getMapConcrete(context);
		if (mc.getIn().getValue() == InOut.IN.getValue()) 
			return createScope(getAttributesForEntity(mc.getConcreteEntity()));
		else return createScope(getAttributesForEntity(mdl.getEntityFrom()));
	}
	
	public IScope scope_Path_attribute(ConcreteFeaturePathTo context,EReference reference) {
		ModelMap mdl = getModel(context) ;
		MapConcrete mc = getMapConcrete(context);
		if (mc.getIn().getValue() == InOut.OUT.getValue()) 
			return createScope(getAttributesForEntity(mc.getConcreteEntity()));
		else return createScope(getAttributesForEntity(mdl.getEntityTo()));
	}*/
	
	// filter concrete entity
//	public IScope scope_MapConcrete_concreteEntity(MapConcrete, ..)
}
