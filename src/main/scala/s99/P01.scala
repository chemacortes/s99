// P01 (*) Find the last element of a list.
//
// Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

// The start of the definition of last should be
//     def last[A](l: List[A]): A = ...
// The `[A]` allows us to handle lists of any type.

package s99

object P01 {

  import scala.util.Try

  def lastBuiltin[A](ls: List[A]) = Try(ls.last)

  def lastRecursive[A](ls: List[A]): Option[A] = ls match {
    case Nil          => None
    case h :: Nil     => Some(h)
    case head :: tail => lastRecursive(tail)
  }

  //alias
  def last[A](ls: List[A]) = lastBuiltin(ls)
}