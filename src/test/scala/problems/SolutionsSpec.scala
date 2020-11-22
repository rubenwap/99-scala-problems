package problems

import org.scalatest._

class SolutionsSpec extends FlatSpec with Matchers {
  "P01" should "return last element from a list" in {
    Solutions.last(List(1, 2, 3)) shouldEqual 3
    Solutions.last(List("a", "b", "c")) shouldEqual "c"
  }
  "P02" should "return penultimate element from a list" in {
    Solutions.penultimate(List(1, 2, 3)) shouldEqual 2
    Solutions.penultimate(List("a", "b", "c")) shouldEqual "b"
  }
  "P03" should "find the Kth element of a list" in {
    Solutions.nth(2, List(1, 2, 3)) shouldEqual 3
    Solutions.nth(2, List("a", "b", "c")) shouldEqual "c"
  }
  "P04" should "find the number of elements of a list" in {
    Solutions.length(List(1, 2, 3)) shouldEqual 3
  }
  "P05" should "reverse a list" in {
    Solutions.reverse(List(1, 2, 3)) shouldEqual List(3, 2, 1)
  }
  "P06" should "find out whether a list is a palindrome" in {
    Solutions.isPalindrome(List(1, 2, 3, 2, 1)) shouldEqual true
  }
  "P07" should "flatten a nested list structure" in {
    Solutions.flatten(List[Any](List(1, 1), 2, List(3, List(5, 8)))) shouldEqual List(1, 1, 2, 3, 5, 8)
  }
  "P08" should "eliminate consecutive duplicates of list of elements" in {
    Solutions.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
