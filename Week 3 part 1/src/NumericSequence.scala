import scala.io.StdIn.readInt

object NumericSequence {
  def main(args: Array[String]): Unit = {
    val first = readInt()
    val second = readInt()

    if (first < second){
      for (num <- first to second) println(num)
    } else {
      for (num <- first to second by -1) println(num)
    }
  }
}
