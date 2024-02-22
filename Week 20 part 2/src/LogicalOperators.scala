import scala.io.StdIn._

object LogicalOperators {
  def main(args: Array[String]): Unit = {
//    println("Enter first Boolean")
//    var bool1: Boolean = readBoolean()
//    println("Enter second Boolean")
//    var bool2: Boolean = readBoolean()
    var bool1: Boolean = true
    var bool2: Boolean = false
    println("" + bool1 + " && " + bool1 + " is: \t" + (bool1 && bool1))
    println("" + bool1 + " && " + bool2 + " is: \t" + (bool1 && bool2))
    println("" + bool2 + " && " + bool1 + " is: \t" + (bool1 && bool2))
    println("" + bool2 + " && " + bool2 + " is: \t" + (bool2 && bool2) + "\n")
    println("" + bool1 + " || " + bool1 + " is: \t" + (bool1 || bool1))
    println("" + bool1 + " || " + bool2 + " is: \t" + (bool1 || bool2))
    println("" + bool2 + " || " + bool1 + " is: \t" + (bool2 || bool1))
    println("" + bool2 + " || " + bool2 + " is: \t" + (bool2 || bool2))
  }
}
