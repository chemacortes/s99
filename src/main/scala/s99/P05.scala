// P05 (*) Reverse a list.
//     Example:
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
//     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

package s99

object P05 {

  def reverseBuildin[A](ls: List[A]) = ls.reverse

  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil          => Nil
    case head :: tail => reverseRecursive(tail) :+ head
  }

  def reverseFunctional[A](ls: List[A]) = ls.foldLeft(List[A]())((acc, h) => acc :+ h)

  // alias
  def reverse[A](ls: List[A]) = reverseBuildin(ls)

}