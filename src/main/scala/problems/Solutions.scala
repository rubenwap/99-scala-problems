package problems

object Solutions extends Helpers with App {
}

trait Helpers {
  def last(l: List[Any]): Any = l.last

  def penultimate(l: List[Any]): Any = l.reverse(1)

  def nth(n: Int, l: List[Any]): Any = l(n)

  def length(l: List[Any]): Int = l.size

  def reverse(l: List[Any]): List[Any] = l.reverse

  def isPalindrome(l: List[Any]): Boolean = l == l.reverse

  def flatten(l: List[Any]): List[Any] = l.flatten {
    case i: List[Any] => flatten(i)
    case e => List(e)
  }

  def compress(l: List[Any]): List[Any] = l.foldLeft(List[Any]()) {
    case (ls, e) if (ls.isEmpty || ls.last != e) => ls ::: List(e)
    case (ls, e) => ls
  }


}
