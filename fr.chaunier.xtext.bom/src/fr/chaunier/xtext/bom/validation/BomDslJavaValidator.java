package fr.chaunier.xtext.bom.validation;

import org.eclipse.xtext.validation.Check;

import fr.chaunier.xtext.bom.bomDsl.Attribute;
import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.Entity;
import fr.chaunier.xtext.bom.bomDsl.Reference;
 

public class BomDslJavaValidator extends AbstractBomDslJavaValidator {

	@Check
	public void checkEntityStartsWithCapital(Entity entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Name should start with a capital", BomDslPackage.ENTITY__NAME);
		}
	}
	@Check
	public void checkAttributeStartsWithLower(Attribute att) {
		if (!Character.isLowerCase(att.getName().charAt(0))) {
			warning("Name should start with a lower case", BomDslPackage.ATTRIBUTE__NAME);
		}
	}
	@Check
	public void checkReferenceStartsWithLower(Reference ref) {
		if (!Character.isLowerCase(ref.getName().charAt(0))) {
			warning("Name should start with a lower case", BomDslPackage.REFERENCE__NAME);
		}
	}
/*    public static final String INVALID_TYPE_NAME = "org.eclipse.xtext.DomainModel.InvalidTypeName";
    @Check
    public void checkTypeNameStartsWithCapital(Type type) {
        if (!Character.isUpperCase(type.getName().charAt(0))) {
            warning("Name should start with a capital", 
            		DomainmodelPackage.TYPE__NAME, 
            		INVALID_TYPE_NAME, 
            		type.getName());
        }
    }

    public static final String INVALID_FEATURE_NAME = "org.eclipse.xtext.DomainModel.InvalidFeatureName";
    @Check
    public void checkFeatureNameStartsWithLowercase(Feature feature) {
        if (!Character.isLowerCase(feature.getName().charAt(0))) {
            warning("Name should start with a lowercase", 
            		DomainmodelPackage.FEATURE__NAME, 
            		INVALID_FEATURE_NAME, feature.getName());
        }
    }
    
    @Check(CheckType.EXPENSIVE)
    public void checkPackage(PackageDeclaration packages) {
        if (packages.getName().equals("java")) {
            error("Invalid package name", 
            		DomainmodelPackage.PACKAGE_DECLARATION__NAME);
        }
    }
*/
}
