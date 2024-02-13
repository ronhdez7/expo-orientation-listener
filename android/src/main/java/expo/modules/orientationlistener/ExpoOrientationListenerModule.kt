package expo.modules.orientationlistener

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoOrientationListenerModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoOrientationListener")

    Function("hello") {
      "Hello world! 👋"
    }
  }
}
