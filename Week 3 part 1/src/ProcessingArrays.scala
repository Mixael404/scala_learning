import scala.io.StdIn.readInt

object ProcessingArrays {
  def main(args: Array[String]): Unit = {
    val length = readInt()
    var nums = new Array[Int](length)

    for (i <- 0 until nums.length) {
      nums(i) = readInt()
    }

    for (x <- nums) {
      print(x + " ")
    }
  }
}
