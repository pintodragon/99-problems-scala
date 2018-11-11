package com.pintodragon

import scala.annotation.tailrec

object P05 {
  def reverse[T](list: List[T]): List[T] = list.reverse

  def reverseRec[T](list: List[T]): List[T] = {
    @tailrec
    def rec(list: List[T], dest: List[T]): List[T] = list match {
      case x :: Nil => x +: dest
      case x :: xs => rec(xs, x +: dest)
      case _ => throw new NoSuchElementException
    }
    rec(list, List())
  }
}
