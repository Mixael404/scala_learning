import scala.io.StdIn._

object Operators {
  def main(args: Array[String]): Unit = {
    println("Enter y")
    var y: Int = readInt()
    println("Enter z")
    var z: Int = readInt()
    println("Sum: " + (z + y))
    println("Product: " + (z * y))
    println("Diff: " + (z - y))
    println("Squares sum: " + (Math.pow(z,2) + Math.pow(y,2)))


//    println("1 x " + y + " = " + (1 * y))
//    println("10 x " + y + " = " + (10 * y))
//    println("100 x " + y + " = " + (100 * y))
  }
}
