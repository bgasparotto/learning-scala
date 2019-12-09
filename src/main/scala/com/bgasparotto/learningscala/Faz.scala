package com.bgasparotto.learningscala

import com.bgasparotto.learningscala.accessmodifier.other.Fuz

class Faz {
  def callAccessibleMethod(fuz: Fuz): Unit = {
    fuz.doSomethingAbroad() // Doesn't compile
  }

  def cannotCallTheOtherOne(fuz: Fuz): Unit = {
    fuz.doSomethingFromPackage() // Doesn't compile either
  }
}
