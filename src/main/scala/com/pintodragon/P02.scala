package com.pintodragon

object P02 {
  def secondLast[T](list: List[T]): T = if (list.size < 2) throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements") else list.init.last

  def secondLastRec[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case x :: xs => secondLastRec(xs)
    case _ => throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements")
  }
}
