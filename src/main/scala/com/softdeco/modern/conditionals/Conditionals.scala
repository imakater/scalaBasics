package com.softdeco.modern.conditionals

object Conditionals {
  /*
   * Unlike Java with its if-statements, in Scala if-expressions always result in a value. In this respect,
   * they are similar to Java’s ternary operator ?:.
   */
  def isEven(num: Int): Boolean = {
    if (num % 2 == 0)
      true
    else
      false
  }
}