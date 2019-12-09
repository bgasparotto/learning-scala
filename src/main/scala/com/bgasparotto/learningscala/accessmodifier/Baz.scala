package com.bgasparotto.learningscala.accessmodifier

/**
 * <strong>Private</strong>. <br/>
 * Private methods can be called only by the same class.
 */
class Baz {
  private def doSomethingPrivate(): Unit = {
    println("Private method.")
  }

  def callPrivateMethod(otherBaz: Baz): Unit = {
    otherBaz.doSomethingPrivate()
  }
}
