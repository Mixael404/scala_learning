import scala.io.StdIn._

object SumSqToN {
  def main(args: Array[String]): Unit = {
    println("Enter some int")
    var N: Int = readInt()
    val sumSq = N * (N + 1) * (2 * N + 1) / 6
    println(sumSq)
  }
}
