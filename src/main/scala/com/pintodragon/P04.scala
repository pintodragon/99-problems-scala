package com.pintodragon

import scala.annotation.tailrec

object P04 {
  def length[T](list: List[T]): Int = list.size

  def lengthMap[T](list: List[T]): Int = list.map(_ => 1).sum

  def lengthRec[T](list: List[T]): Int = {
    @tailrec
    def rec(list: List[T], size: Int): Int = list match {
      case x :: xs => rec(xs, size + 1)
      case _ => size
    }
    rec(list,0)
  }
}
