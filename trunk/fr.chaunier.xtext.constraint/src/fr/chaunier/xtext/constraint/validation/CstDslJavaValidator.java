package fr.chaunier.xtext.constraint.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.cstDsl.TypeConstraint;
import fr.chaunier.xtext.om.omDsl.AbstractElement;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Feature;

 

public class CstDslJavaValidator extends AbstractCstDslJavaValidator {

	  @Check
	  public void checkAllConstraintAttribute(EntityConstraint entityCts) {
		  List<FeatureConstraint> featuresCst = entityCts.getFeatures();
		  List<Feature> features = entityCts.getEntity().getFeatures();
		  List<Attribute> toTest = new ArrayList<Attribute>() ;
	      Iterable<AttributeConstraint> _filterCts = IterableExtensions.<AttributeConstraint>filter(featuresCst, fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint.class);
	      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(features, fr.chaunier.xtext.om.omDsl.Attribute.class);
	      for (Attribute a : _filter) {
	    	  if ( a.getType().getReferenced() instanceof DataType )
	    		  toTest.add(a);
	      }
	      for (AttributeConstraint ac : _filterCts) {
    		  toTest.remove(ac.getAttribute());
	      }

	    if ( ! toTest.isEmpty() ) {
	      warning("Constraint attributes are not complete",
	          CstDslPackage.Literals.ENTITY_CONSTRAINT__ENTITY,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.MISSING_ATTRIBUTE_CONSTRAINT,
	          entityCts.getEntity().getName());
	    }
	  }

	  @Check
	  public void checkAllConstraintEntity(PackageConstraint packageCts) {
		  List<TypeConstraint> typesCst = packageCts.getTypes();
		  List<AbstractElement> types = packageCts.getPackageDeclaration().getElements();
		  List<Entity> toTest = new ArrayList<Entity>() ;
	      Iterable<EntityConstraint> _filterCts = IterableExtensions.<EntityConstraint>filter(typesCst, fr.chaunier.xtext.constraint.cstDsl.EntityConstraint.class);
	      Iterable<Entity> _filter = IterableExtensions.<Entity>filter(types, fr.chaunier.xtext.om.omDsl.Entity.class);
	      for (Entity e : _filter) {
    		  toTest.add(e);
	      }
	      for (EntityConstraint ac : _filterCts) {
    		  toTest.remove(ac.getEntity());
	      }

	    if ( ! toTest.isEmpty() ) {
	      warning("Constraint entities are not complete",
	          CstDslPackage.Literals.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION,
	          ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
	          IssueCodes.MISSING_ENTITY_CONSTRAINT,
	          packageCts.getPackageDeclaration().getName());
	    }
	  }
}
