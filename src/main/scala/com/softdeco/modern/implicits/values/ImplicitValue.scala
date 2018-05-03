package com.softdeco.modern.implicits.values

object ImplicitValue {
  /*
   * implicit val user = "User"
   * greet
   * String = Hello User
   */
  def greet(implicit name: String) = "Hello " + name
}