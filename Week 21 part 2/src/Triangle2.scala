import scala.io.StdIn.readInt

object Triangle2 {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    var baseHeight = readInt()

    println()

    val row: Int = 1

    while (row <= baseHeight) {

      var col: Int = 1

      while (col <= baseHeight) {
        print("* ")
        col += 1
      }

      print("\n")
      baseHeight -= 1
    }
  }
}
