package com.softdeco.modern.classes

class PersonFormat2(val name: String) {
  override def toString: String = "Person(" + name + ")"
  def apply(): String = name
  def sayHello(): String = "Hi! I'm " + name
}