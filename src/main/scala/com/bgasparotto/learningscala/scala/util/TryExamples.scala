package com.bgasparotto.learningscala.scala.util

import java.time.Instant

import scala.util.{Failure, Success, Try}

object TryExamples {
  def tryIt(value: String): Try[Instant] = Try(Instant.parse(value))

  def tryThat(): Try[Instant] = Try(Instant.now())

  def singleTry(): Unit = {
    tryIt("2020-11-17T00:00:00Z") match {
      case Success(instant)   => println(s"Success at $instant!")
      case Failure(exception) => println(s"Not good: $exception")
    }
  }

  def singleTryWithFailure(): Unit = {
    tryIt("not an instant") match {
      case Success(instant)   => println(s"Success at $instant!")
      case Failure(exception) => println(s"Not good: $exception")
    }
  }

  def chainedTry(): Unit = {
    tryIt("won't work") orElse tryIt("won't work either") orElse tryThat match {
      case Success(instant)   => println(s"Success at $instant!")
      case Failure(exception) => println(s"Not good: $exception")
    }
  }

  def chainedTryWithFailure(): Unit = {
    tryIt("won't work") orElse tryIt("nothing will work") match {
      case Success(instant)   => println(s"Success at $instant!")
      case Failure(exception) => println(s"Not good: $exception")
    }
  }

  def main(args: Array[String]): Unit = {
    singleTry()
    singleTryWithFailure()
    chainedTry()
    chainedTryWithFailure()
  }
}
