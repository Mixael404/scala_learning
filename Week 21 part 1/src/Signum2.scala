import scala.io.StdIn.readInt

object Signum2 {
  def main(args: Array[String]): Unit = {
    println("Type in a number ")
    var number = readInt()
    var message: String = ""
    if (number > 0) {
      message += s"$number is positive"
    } else if (number < 0) {
      message += s"$number is negative"
    } else {
      message += s"$number is zero"
    }
    println(message)
  }
}