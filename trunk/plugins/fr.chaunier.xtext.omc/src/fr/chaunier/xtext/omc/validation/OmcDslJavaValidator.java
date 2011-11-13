package fr.chaunier.xtext.omc.validation;

import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

import fr.chaunier.xtext.omc.features.ConstraintStatus;
import fr.chaunier.xtext.omc.features.FeaturesHelpers;
import fr.chaunier.xtext.omc.omcDsl.DataType;
import fr.chaunier.xtext.omc.omcDsl.Entity;
import fr.chaunier.xtext.omc.omcDsl.OmcDslPackage;
import fr.chaunier.xtext.omc.omcDsl.StructuralFeature;
 

public class OmcDslJavaValidator extends AbstractOmcDslJavaValidator {

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
	          OmcDslPackage.Literals.TYPE__NAME,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.INVALID_TYPE_NAME,
	          entity.getName());
	    }
	  }

	  @Check
	  public void checkTypeNameStartsWithCapital(DataType dataType) {
	    if (!Character.isUpperCase(dataType.getName().charAt(0))) {
	      warning("Name should start with a capital",
	          OmcDslPackage.Literals.TYPE__NAME,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.INVALID_TYPE_NAME,
	          dataType.getName());
	    }
	  }

	  @Check
	  public void checkFeatureNameStartsWithLowercase(StructuralFeature feature) {
	    if (!Character.isLowerCase(feature.getName().charAt(0))) {
	      warning("Name should start with a lowercase",
	          OmcDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.INVALID_FEATURE_NAME,
	          feature.getName());
	    }
	  }
/*
	  @Check
	  public void checkFeatureConstraint(StructuralFeature feature) {
		if  ( feature.getConstraint() != null ) {
			if ( feature instanceof Attribute ) {
				Type type = ((Attribute)feature).getType().getReferenced();
				if ( type instanceof DataType ) {
					if (((DataType)type).getConstraint() != null) {
					    warning("duplicate constraints on feature and datatype",
						          OmcstDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
						          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						          IssueCodes.INVALID_FEATURE_CONSTRAINT,
						          feature.getName());
					}
				}
			}
		}
	  }
*/			

	  @Check
	  public void checkFeatureConstraint(StructuralFeature feature) {
		  FeaturesHelpers helper = new FeaturesHelpers() ;
		  ConstraintStatus st = helper.surchageCompatibility(feature);
		  if ( st == ConstraintStatus.OVERRIDE_ERROR_TYPE) {
			    error("ovverided constraints on feature and datatype whith different type",
				          OmcDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
				          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
				          IssueCodes.INVALID_FEATURE_CONSTRAINT,
				          feature.getName());
		  } if ( st == ConstraintStatus.OVERRIDE_UNCOMPATIBLE_CONSTRAINT) {
			    error("ovverided constraints on feature and datatype incompatible",
				          OmcDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
				          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
				          IssueCodes.INVALID_FEATURE_CONSTRAINT,
				          feature.getName());
		  } else if ( st == ConstraintStatus.OVERRIDE_COMPATIBLE_CONSTRAINT) {
			    warning("ovverided constraints on feature and datatype whith same type",
				          OmcDslPackage.Literals.STRUCTURAL_FEATURE__NAME,
				          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
				          IssueCodes.INVALID_FEATURE_CONSTRAINT,
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
	          OmcDslPackage.Literals.ENTITY__SUPER_TYPE);
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
