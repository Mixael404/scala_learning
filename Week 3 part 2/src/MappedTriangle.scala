import scala.io.StdIn.readInt

object MappedTriangle {
  def main(args: Array[String]): Unit = {
    val baseHeight = readInt()
    (1 to baseHeight).map((x) => "* " * x).foreach(println(_))
  }
}
