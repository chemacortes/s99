// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

package s99

object P02 {

  import scala.util.Try

  def penultimateBuiltin[A](ls: List[A]) = Try(ls.init.last)

  def penultimateOption[A](ls: List[A]) = ls match {
    case _ :+ a :+ _ => Some(a)
    case _           => None
  }

  def penultimateRecursive[A](ls: List[A]): Option[A] = ls match {
    case a :: _ :: Nil => Some(a)
    case _ :: tail     => penultimateRecursive(tail)
    case _             => None
  }

  val penultimate = penultimateBuiltin _

}