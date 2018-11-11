package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P01Test extends FunSpec with Matchers {
  it("should find last element") {
    val last = P01.last(List("a", "b", "c", "d"))
    last should be("d")
  }

  it("should throw exception when list is empty") {
    val thrown = the[NoSuchElementException] thrownBy P01.last(List())
    thrown.getMessage should equal(null)
  }

  it("rec: should find last element") {
    val last = P01.last_rec(List("a", "b", "c", "d"))
    last should be("d")
  }

  it("rec: should throw exception when list is empty") {
    val thrown = the[NoSuchElementException] thrownBy P01.last_rec(List())
    thrown.getMessage should equal("Unable to find last value")
  }
}