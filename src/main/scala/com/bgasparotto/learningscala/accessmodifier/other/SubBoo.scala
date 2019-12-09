package com.bgasparotto.learningscala.accessmodifier.other

import com.bgasparotto.learningscala.accessmodifier.Boo

class SubBoo extends Boo {
  def callProtectedMethodHere(boo: Boo): Unit = {
    doSomethingProtected()
  }

  def callProtectedMethodThere(boo: Boo): Unit = {
    boo.doSomethingProtected()
  }
}