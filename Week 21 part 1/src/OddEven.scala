import scala.io.StdIn.readInt

object OddEven {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number: Int = readInt()

    var result = if (number % 2 == 0)
      "even"
    else
      "odd"

    if(number > 0){
      println("Positive")
    } else {
      println("Zero or less")
    }
    println(10/3)

    println("Your number is " + result)
  }
}
