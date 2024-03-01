import scala.io.StdIn.readInt

object Rectangle {
  def main(args: Array[String]): Unit = {
    print("Select height ")
    val height = readInt()
    print("Select width ")
    val width = readInt()

    println()

    for (row <- 1 to height) {
      for (col <- 1 to width) {
        print("* ")
      }
      print("\n")
    }

  }
}