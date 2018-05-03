package com.softdeco.modern.defaultValues

object DefaultValues {
  /*
   * greet()
   * String = Hello User
   * greet("Efrain")
   * String = Hello Efrain
   */
  def greet(name: String = "User") = "Hello " + name
}