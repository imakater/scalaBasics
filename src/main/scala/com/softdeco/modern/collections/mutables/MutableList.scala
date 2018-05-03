package com.softdeco.modern.collections.mutables

import scala.collection.mutable.ListBuffer;
object MutableList {
  def main(args: Array[String]): Unit = {
    val buffer = ListBuffer.empty[Int]
    buffer :+ 1
    buffer.toList
  }
}