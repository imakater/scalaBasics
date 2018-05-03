package com.softdeco.modern.loops

object While {
  def main(args: Array[String]): Unit = {
    var it = 5

    while (it > 0) {
      print(it)
      it -= 1
    }

    /*
     * here is more Scala-like code that does essentially the same thing
     */
    1.to(5).reverse.foreach{ num => print(num) }
  }
}