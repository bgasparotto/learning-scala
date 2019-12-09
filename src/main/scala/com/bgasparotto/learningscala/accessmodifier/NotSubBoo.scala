package com.bgasparotto.learningscala.accessmodifier

class NotSubBoo {
  def cannotCallProtectedMethodSamePackage(boo: Boo): Unit = {
    boo.doSomethingProtected() // Doesn't compile
  }
}
