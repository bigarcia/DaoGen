/*
 * generated by Xtext 2.15.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.daogen2.ui.internal.Daogen2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Daogen2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Daogen2Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Daogen2Activator activator = Daogen2Activator.getInstance();
		return activator != null ? activator.getInjector(Daogen2Activator.ORG_XTEXT_DAOGEN2) : null;
	}

}
