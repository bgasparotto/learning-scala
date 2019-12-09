package com.bgasparotto.learningscala.accessmodifier.other

/**
  * <strong>Package-specific</strong>. <br/>
  * Package-specific members will be available only to members of the current package, or members of an upper-level
  * package.
  */
class Fuz {
  private[accessmodifier] def doSomethingAbroad(): Unit = {
    println("Package-specific to packages [accessmodifier] and any of its sub-packages.")
  }

  private[other] def doSomethingFromPackage(): Unit = {
    println("Package-private method (specific to [other])")
  }
}
