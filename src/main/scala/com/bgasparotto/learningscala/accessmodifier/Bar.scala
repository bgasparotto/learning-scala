package com.bgasparotto.learningscala.accessmodifier

/**
  * <strong>Object-private</strong>. <br/>
  * Methods qualified with @{code private[this]} can only be accessed within the same instance.
  */
class Bar {
  private[this] def doSomethingVeryRestrictive()
      : Unit = { // private[this] is making it object-private.
    println("Object-private method.")
  }

  def callVeryRestrictiveMethod(): Unit = {
    doSomethingVeryRestrictive()
  }

  def cannotCallFromOtherObject(otherBar: Bar): Unit = {
    otherBar.doSomethingVeryRestrictive() // Can't call from another instance.
  }
}
