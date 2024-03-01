import scala.io.StdIn.readInt

object MappedRectangle {
  def main(args: Array[String]): Unit = {
    println("Select how many units for the height?")
    val height = readInt()
    println("Select how many units for the width?")
    val width = readInt()
    val arr = (1 to height).map((row) => (1 to width).map((i) => "*"))
    arr.foreach((row) => {
      row.foreach((col) => print("* "))
      println()
    })
  }
}
