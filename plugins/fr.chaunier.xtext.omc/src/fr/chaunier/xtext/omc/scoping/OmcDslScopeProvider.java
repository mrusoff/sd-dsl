/*
 * generated by Xtext
 */
package fr.chaunier.xtext.omc.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import fr.chaunier.xtext.omc.omcDsl.AbstractElement;
import fr.chaunier.xtext.omc.omcDsl.DomainModel;
import fr.chaunier.xtext.omc.omcDsl.Entity;
import fr.chaunier.xtext.omc.omcDsl.FileSpecModel;
import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration;


/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class OmcDslScopeProvider extends AbstractDeclarativeScopeProvider {

	// a refaire pour generique
	public IScope scope_FileSpecModel_entity(FileSpecModel specModel, EReference reference) {
		DomainModel mdl = (DomainModel)specModel.eContainer() ;
		List<Entity> result = new ArrayList<Entity>();
		for ( AbstractElement p: mdl.getElements() ) {
			if ( p instanceof PackageDeclaration )
				for ( AbstractElement e: ((PackageDeclaration)p).getElements() ) {
					if ( e instanceof Entity )
						result.add((Entity)e);
				}	
		}
		return createScope(result);
	}

	/**
	 * Utility method to turn a list of attributes into a SimpleScope.
	 */
	private IScope createScope(List<Entity> entities) {
		List<IEObjectDescription> scopedElements = new ArrayList<IEObjectDescription>();
		for (Entity e : entities) {
			scopedElements.add(EObjectDescription.create(e.getName(), e));
		}
		return new SimpleScope(scopedElements);
	}

}
