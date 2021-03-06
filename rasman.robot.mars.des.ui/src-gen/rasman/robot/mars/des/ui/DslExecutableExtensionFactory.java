/*
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import rasman.robot.mars.des.ui.internal.DesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DesActivator.getInstance().getInjector(DesActivator.RASMAN_ROBOT_MARS_DES_DSL);
	}
	
}
