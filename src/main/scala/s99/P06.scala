// P06 (*) Find out whether a list is a palindrome.
//     Example:
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true

package s99

object P06 {

  // direct
  def isPalindrome[A](ls: List[A]) = ls == ls.reverse

  def isPalindromeRecursive[A](ls: List[A]): Boolean = ls match {
    case Nil                                    => true
    case _ :: Nil                               => true
    case head +: body :+ last if (head == last) => isPalindromeRecursive(body)
    case _                                      => false
  }

}