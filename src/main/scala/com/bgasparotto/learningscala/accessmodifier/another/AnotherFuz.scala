package com.bgasparotto.learningscala.accessmodifier.another

import com.bgasparotto.learningscala.accessmodifier.other.Fuz

class AnotherFuz {
  def callAccessibleMethod(fuz: Fuz): Unit = {
    fuz.doSomethingAbroad()
  }

  def cannotCallTheOtherOne(fuz: Fuz): Unit = {
    fuz.doSomethingFromPackage() // Doesn't compile
  }
}
