import scala.io.StdIn._

object Relational {
  def main(args: Array[String]): Unit = {
    println("Enter first value")
    var num1: Int = readInt()
    println("Enter second value")
    var num2: Int = readInt();
    println(num1 + " < " + num2 + " is: " + (num1 < num2))
    println(num1 + " > " + num2 + " is: " + (num1 > num2))
    println(num1 + " <= " + num2 + " is:  " + (num1 <= num2))
    println(num1 + " >= " + num2 + " is: " + (num1 >= num2))
    println(num1 + " == " + num2 + " is: " + (num1 == num2))
    println(num1 + " != " + num2 + " is: " + (num1 != num2))
  }
}
