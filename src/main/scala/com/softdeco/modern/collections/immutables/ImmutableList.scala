package com
package softdeco
package modern
package collections
package immutables

object ImmutableList {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    list :+ 5
    list.reverse.foreach(num => print(num))

    //List with data type
    val listType = List[Short](1,23,3,4)
    listType.reverse.foreach(num => print(num))

    println
    val listFunctionalProgramming1 = 1 :: 2 :: 3 :: 4 :: Nil
    listFunctionalProgramming1.foreach(print)
    println
    val listFunctionalProgramming2 = Nil.::(3).::(2).::(1)
    listFunctionalProgramming2.foreach(print)
    // Add all, but add a list in the begining of new list
    val listFunctionalProgramming3 = listFunctionalProgramming2.:::(listFunctionalProgramming1)
    println
    listFunctionalProgramming3.foreach(print)
    // Add all, but add a list in the begining of new list in reverse order of elements of the agregated list
    val listFunctionalProgramming4 = listFunctionalProgramming2.reverse_:::(listFunctionalProgramming1)
    println
    listFunctionalProgramming4.foreach{print}
  }
}