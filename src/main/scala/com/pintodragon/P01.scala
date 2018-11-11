package com.pintodragon

object P01 {
  def last[T](list: List[T]): T = list.last

  def last_rec[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => last_rec(xs)
    case _ => throw new NoSuchElementException("Unable to find last value")
  }
}
