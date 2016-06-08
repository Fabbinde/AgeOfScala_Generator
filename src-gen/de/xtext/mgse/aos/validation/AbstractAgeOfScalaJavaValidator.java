package de.xtext.mgse.aos.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractAgeOfScalaJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage.eINSTANCE);
		return result;
	}

}
