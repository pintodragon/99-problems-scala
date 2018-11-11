package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P05Test extends FunSpec with Matchers {
  it("should reverse the list") {
    P05.reverse(List(1,2,3,4,5)) should be(List(5,4,3,2,1))
  }

  it("Rec: should reverse the list") {
    P05.reverseRec(List(1,2,3,4,5)) should be(List(5,4,3,2,1))
  }
}