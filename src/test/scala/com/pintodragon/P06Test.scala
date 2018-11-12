package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P06Test extends FunSpec with Matchers {
  it("should return true when it is a palindrome") {
    P06.isPalindrome(List(1,2,3,2,1)) should be(true)
  }

  it("should be false when it isn't a palindrome") {
    P06.isPalindrome(List(1,2,3,4,5)) should be(false)
  }
}