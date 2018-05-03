package com.softdeco.modern.funtions

object FunctionalTypes {
  def main(args: Array[String]): Unit = {
    //Functional types
    val greetVarFormat1: String => String = (name) => "Hello " + name
    val greetVarFormat2 = (name: String) => "Hello " + name
    val fn: Function1[String, String] = greetVarFormat1
  }
}