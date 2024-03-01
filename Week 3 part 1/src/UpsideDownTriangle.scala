import scala.io.StdIn.readInt

object UpsideDownTriangle {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    println()

    for (row <- baseHeight to 1 by -1) {
      for (col <- 1 to baseHeight - row + 1) {
        print("* ")
      }
      print("\n")
    }

  }
}
