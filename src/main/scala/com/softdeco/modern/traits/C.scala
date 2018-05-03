package com.softdeco.modern.traits

class C extends A with B {
  def _a(): Unit = println("_a")
  def b(): Unit = println("b")
}

object C {
  def main(args: Array[String]): Unit = {
    val c = new C()
    c.a()
    c._a()
    c.b()
  }
}
