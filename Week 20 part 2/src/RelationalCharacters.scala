import scala.io.StdIn._

object RelationalCharacters {
  def main(args: Array[String]): Unit = {
    println("Enter first Char")
    var num1: Char = readChar()
    println("Enter second Char")
    var num2: Char = readChar()
    println(num1 + " < " + num2 + " is: " + (num1 < num2))
    println(num1 + " > " + num2 + " is: " + (num1 > num2))
    println(num1 + " <= " + num2 + " is:  " + (num1 <= num2))
    println(num1 + " >= " + num2 + " is: " + (num1 >= num2))
    println(num1 + " == " + num2 + " is: " + (num1 == num2))
    println(num1 + " != " + num2 + " is: " + (num1 != num2))
  }
}
