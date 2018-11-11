package com.pintodragon

import org.scalatest.{FunSpec, Matchers}

class P02Test extends FunSpec with Matchers {
  it("should give second last element when list has more than two elements") {
    val numbers = List(1, 2, 11, 4, 5, 8, 10, 6)
    P02.secondLast(numbers) should be(10)
  }

  it("should throw exception when list is empty") {
    val thrown = the[NoSuchElementException] thrownBy P02.secondLast(List())
    thrown.getMessage should equal("Can't find secondLast element from a list with less than 2 elements")
  }

  it("should throw exception when list has one element") {
    val thrown = the[NoSuchElementException] thrownBy P02.secondLast(List(1))
    thrown.getMessage should equal("Can't find secondLast element from a list with less than 2 elements")
  }

  it("rec: should give second last element when list has more than two elements") {
    val numbers = List(1, 2, 11, 4, 5, 8, 10, 6)
    P02.secondLastRec(numbers) should be(10)
  }

  it("rec: should throw exception when list is empty") {
    val thrown = the[NoSuchElementException] thrownBy P02.secondLastRec(List())
    thrown.getMessage should equal("Can't find secondLast element from a list with less than 2 elements")
  }

  it("rec: should throw exception when list has one element") {
    val thrown = the[NoSuchElementException] thrownBy P02.secondLastRec(List(1))
    thrown.getMessage should equal("Can't find secondLast element from a list with less than 2 elements")
  }
}