package com.pintodragon

object P03 {
  def kth[T](list: List[T], index: Int): T = list(index)

  def kth1[T](list: List[T], index: Int): T = list.take(index + 1).last

  def kthRec[T](list: List[T], index: Int): T = list match {
    case x :: xs if index == 0 => x
    case _ :: xs => kthRec(xs, index - 1)
    case _ => throw new NoSuchElementException
  }
}
