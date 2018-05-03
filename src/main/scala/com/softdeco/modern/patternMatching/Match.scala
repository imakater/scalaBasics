package com.softdeco.modern.patternMatching

import com.softdeco.modern.objects.Person

object Match {
  def main(args: Array[String]): Unit = {
    val list = 1 :: 2 :: 3 :: 4 :: Nil

    list match {
      case Nil => println("The list is empty")
      case ::(head, tail) => println("The list is non-empty 1")
    }

    //another form to use the second case
    list match {
      case Nil => println("The list is empty")
      case head :: tail => println("The list is non-empty 2")
      case _ => println("Default")
    }

    val person = Person("Efrain", "Romero")
    val person2 = Person("Efrain", "Romero")

    println(person == person2)

    //The _ symbol defines a so-called catch-all case that will be chosen if all previous cases failed to
    //match the expression, like default in JAVA
    person match {
      case Person(name, lastName) => println(s"Hello ${person.name} ${person.lastName}")
      case _ => println("Not a person")
    }
  }
}
