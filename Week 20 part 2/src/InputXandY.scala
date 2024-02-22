import scala.io.StdIn.readInt

object InputXandY {
  def main(args: Array[String]): Unit = {
    println("Print x")
    var x = readInt();
    println("Print y")
    var y = readInt();
    println("x: " + x)
    println("y: " + y)
    println("x + y: " + (x + y) + "\n" + "x * y: " + (x * y))
  }
}
