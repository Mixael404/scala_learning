import scala.io.StdIn.*
//@main

object main {

  def arrSum(arr: Array[Int]): Int = {
    var i = 0
    var res = 0
    while (i < arr.length) {
      res = res + arr(i)
      i = i + 1
    }
    return res
  }
  def sum(a: Int, b: Int): Int = {
     a + b
  }
  def binarySearch(arr: Array[Int], number: Int): Boolean = {
    var first = 0
    var last = arr.length
    var middle = Math.floor((arr.length / 2)).toInt
    var i = 0
    while (i < arr.length) {
      if (arr(middle) == number) {
        return true;
      }
      if (arr(middle) > number) {
        last = middle - 1;
        middle = Math.floor(((first + last) / 2)).toInt
      }
      if (arr(middle) < number) {
        first = middle + 1;
        middle = Math.floor(((first + last) / 2)).toInt
      }
      i += 1
    }
    return false
  }

  def factorial(n: Int): Int = {
    if (n == 0) {
      return 1
    }
    return n * factorial(n - 1)
  }
  def main(args: Array[String]): Unit = {
    println("Input some int to be founded")
    val toFind = readInt()
    val hasNumber = binarySearch(Array(1,2,3,4,6,9,11,25,67,198,19953), toFind)
    println("Does this number in Array?: " + hasNumber)

    println("Input some int to calculate it's factorial")
    val toCalculateFactorial = readInt()
    println("Factorial of " + toCalculateFactorial + ": " + factorial(toCalculateFactorial))

    val c1 = new Calculator()
    var res = c1.substract(10,4)
    println("Substraction: " + res)
  }
}

class Calculator{
  def substract(a: Int, b: Int): Int = {
    a - b
  }
}