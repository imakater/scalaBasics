package com.softdeco.modern.objects

/**
  * Case class does the following:
  * - overrides the hashcode method used by some collections from the standard library
  * - overrides the equals method, which makes two objects with the same set of values equal, so new Person("Joe") == new Person("Joe") will return true
  * - defines the unapply method used in pattern matching
  * @param name
  * @param lastName
  */
case class Person(val name: String, val lastName: String) {
  override def toString: String = "Person(" + name + ", " + lastName + ")"
}

object Person {
  def apply(name: String, lastName: String): Person = new Person(name, lastName)
}