package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P04Test extends FunSpec with Matchers {
  it("should be zero when list is empty") {
    P04.length(List()) should be(0)
  }

  it("should be 5 when list has five elements") {
    P04.length(List(1, 2, 3, 4, 5)) should be(5)
  }

  it("map: should be zero when list is empty") {
    P04.lengthMap(List()) should be(0)
  }

  it("map: should be 5 when list has five elements") {
    P04.lengthMap(List(1, 2, 3, 4, 5)) should be(5)
  }

  it("Rec: should be zero when list is empty") {
    P04.lengthRec(List()) should be(0)
  }

  it("Rec: should be 5 when list has five elements") {
    P04.lengthRec(List(1, 2, 3, 4, 5)) should be(5)
  }
}