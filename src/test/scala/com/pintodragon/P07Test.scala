package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P07Test extends FunSpec with Matchers {
  it("list of lists should be flatten to a single list") {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1,1,2,3,5,8))
  }
}