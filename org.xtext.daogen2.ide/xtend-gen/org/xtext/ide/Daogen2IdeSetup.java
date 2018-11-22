/**
 * generated by Xtext 2.15.0
 */
package org.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.Daogen2RuntimeModule;
import org.xtext.Daogen2StandaloneSetup;
import org.xtext.ide.Daogen2IdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class Daogen2IdeSetup extends Daogen2StandaloneSetup {
  @Override
  public Injector createInjector() {
    Daogen2RuntimeModule _daogen2RuntimeModule = new Daogen2RuntimeModule();
    Daogen2IdeModule _daogen2IdeModule = new Daogen2IdeModule();
    return Guice.createInjector(Modules2.mixin(_daogen2RuntimeModule, _daogen2IdeModule));
  }
}