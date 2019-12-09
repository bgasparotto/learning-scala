package com.bgasparotto.learningscala.accessmodifier

class NotBaz {
  def cannotCallPrivateMethodFromOtherClass(baz: Baz): Unit = {
    baz.doSomethingPrivate() // Doesn't compile
  }
}
