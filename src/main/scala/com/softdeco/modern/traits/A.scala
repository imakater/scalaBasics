package com.softdeco.modern.traits

/**
  * Traits can contain both abstract (not implemented) and concrete (implemented) members
  */
trait A {
  def a(): Unit = println("a")
  def _a(): Unit
}
