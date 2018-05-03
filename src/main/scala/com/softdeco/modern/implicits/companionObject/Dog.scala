package com.softdeco.modern.implicits.companionObject

class Dog(val name: String) {}

object Dog {
  implicit val dog: Dog = new Dog("Fido")
}

object Greeting {
  /*
   * Let’s also create a method with one parameter of type Dog and mark it as implicit
   * scala> sayHello
   * res0: String = Hello User
   *
   * scala> sayHello(new Person("Joe"))
   * res1: String = Hello Joe
   */
  def sayHello(implicit dog: Dog): String = "Hello " + dog.name

  def main(args: Array[String]): Unit = {
    println(sayHello)
  }
}