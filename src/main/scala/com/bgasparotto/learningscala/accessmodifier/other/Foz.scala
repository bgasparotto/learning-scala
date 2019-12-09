package com.bgasparotto.learningscala.accessmodifier.other

class Foz {
  def callPackagePrivateMethod(fuz: Fuz): Unit = {
    fuz.doSomethingAbroad()
  }

  def callBroaderPackageSpecificMethod(fuz: Fuz): Unit = {
    fuz.doSomethingFromPackage()
  }
}
