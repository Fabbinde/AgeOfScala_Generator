
package de.xtext.mgse.aos;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AgeOfScalaStandaloneSetup extends AgeOfScalaStandaloneSetupGenerated{

	public static void doSetup() {
		new AgeOfScalaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

