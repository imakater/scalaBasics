package com.softdeco.modern.stringInterpolation

import com.softdeco.modern.objects.Person

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val name = "Efrain"
    val greeting = s"Hello $name"
    println(greeting)
    // prints Hello Efrain

    val person = Person("Joe", "Montana")
    val grettingPerson = s"Hello ${person.name} ${person.lastName}"
    println(grettingPerson)
  }
}