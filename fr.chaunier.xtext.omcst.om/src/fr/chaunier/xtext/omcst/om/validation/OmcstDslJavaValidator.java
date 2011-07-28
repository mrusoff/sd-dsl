package fr.chaunier.xtext.omcst.om.validation;

import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;
import fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature;

 

public class OmcstDslJavaValidator extends AbstractOmcstDslJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	  @Inject
	  private IQualifiedNameProvider qualifiedNameProvider;

	  @Check
	  public void checkTypeNameStartsWithCapital(Entity entity) {
	    if (!Character.isUpperCase(entity.getName().charAt(0))) {
	      warning("Name should start with a capital",
	          OmcstDslPackage.Literals.TYPE__NAME,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.INVALID_TYPE_NAME,
	          entity.getName());
	    }
	  }

	  @Check
	  public void checkFeatureNameStartsWithLowercase(StructuralFeature feature) {
	    if (!Character.isLowerCase(feature.getName().charAt(0))) {
	      warning("Name should start with a lowercase",
	          OmcstDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.INVALID_FEATURE_NAME,
	          feature.getName());
	    }
	  }

	  /**
	   * Validation: Entities must not have circular inheritances.
	   */
	  
	  
	  @Check
	  public void validateInheritanceHierarchy(Entity ctx) {
	    Set<QualifiedName> visited = Sets.newHashSet();
	    visited.add(qualifiedNameProvider.getFullyQualifiedName(ctx));
	    Entity current = null;
	    if (ctx.getSuperType()!=null)
//	      current = (JvmGenericType) ctx.getSuperType().getType();
		  current = (Entity) ctx.getSuperType() ;
	    while (current != null) {
	        QualifiedName qfn = qualifiedNameProvider.getFullyQualifiedName(current);
	        if (visited.contains(qfn)) {
	          error("Circular inheritance detected",
  	          OmcstDslPackage.Literals.ENTITY__SUPER_TYPE);
//	              DomainmodelPackage.Literals.ENTITY__SUPER_TYPE);
	          break;
	        }
	        // remember the visited Entity
	        visited.add(qfn);
	        // Set current to next in hierarchy. Might be null, which terminates
	        // the loop
	        if (!(current.getSuperType()==null))
	          current = (Entity) current.getSuperType() ;
	        else
	          current = null;
	    }
	  }
	
}
