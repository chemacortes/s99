package s99

import org.scalatest._
import prop._
import scala.util.{ Try, Success, Failure }

class P00_test extends PropSpec with Matchers {

  val ls1 = List(1, 1, 2, 3, 5, 8)
  val ls2 = List("Hi", "Hello", "World!")

  property("lastBuiltin eq last") {
    P01.last(ls1) should be(8)
    P01.last(ls2) should be("World!")
    an [Exception] should be thrownBy P01.last(Nil)
  }

  property("nth") {
    P03.nth(2, ls1) should be(Success(2))
    P03.nth(1, ls2) should be(Success("Hello"))
    P03.nth(10, ls1) should be a 'failure
  }

  property("length") {
    P04.length(List(1, 1, 2, 3, 5, 8)) should be(6)
  }

  property("reverse") {
    P05.reverse(List(1, 1, 2, 3, 5, 8)) should be(List(8, 5, 3, 2, 1, 1))
  }

  property("isPalindrome") {
    P06.isPalindrome(List(1, 2, 3, 2, 1)) should be(true)
    P06.isPalindromeRecursive(List(1, 2, 3, 2, 1)) should be(true)
    P06.isPalindrome("zias6aiz".toList) should be(false)
  }

}
