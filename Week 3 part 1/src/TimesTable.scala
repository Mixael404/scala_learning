import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    val num = readInt()
    for (i <- 1 to 12 ){
      println(f"${i}%2d" + " X " + num + " = " + f"${(i * num)}%2d")
    }
  }
}
