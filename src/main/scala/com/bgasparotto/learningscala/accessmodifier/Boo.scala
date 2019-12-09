package com.bgasparotto.learningscala.accessmodifier

/**
 * <strong>Protected</strong>. <br/>
 * Protected members can be accessed only by subclasses.
 */
class Boo {
  protected def doSomethingProtected(): Unit = {
    println("Protected method.")
  }
}
