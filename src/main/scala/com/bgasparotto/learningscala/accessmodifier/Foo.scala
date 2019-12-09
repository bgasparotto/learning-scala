package com.bgasparotto.learningscala.accessmodifier

/**
  * <strong>Public</strong>. <br/>
  * When no access modifiers are declared, the access level is automatically set to <em>public</em>. <br/>
  * This class and its method both have public access.
  */
class Foo {
  def doSomething(): Unit = {
    println("Public method.")
  }
}
