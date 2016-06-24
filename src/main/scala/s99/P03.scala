// P03 (*) Find the Kth element of a list.
//     By convention, the first element in the list is element 0.
//
//     Example:
//     scala> nth(2, List(1, 1, 2, 3, 5, 8))
//     res0: Int = 2

package s99

object P03 {

  import scala.util.{ Try, Success, Failure }

  def nthBuiltin[A](k: Int, ls: List[A]) = Try(ls(k))

  def nthRecursive[A](k: Int, ls: List[A]): Try[A] =
    if (k == 0)
      Try(ls.head)
    else
      nthRecursive(k - 1, ls.tail)

  def nthOption[A](k: Int, ls: List[A]) = nthBuiltin(k, ls) match {
    case Success(e: Int) => Option(e)
    case _               => None
  }

  def nth[A](k: Int, ls: List[A]) = nthBuiltin(k, ls)
}