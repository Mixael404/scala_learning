import scala.io.StdIn._

object SumCubesToN {
  def main(args: Array[String]): Unit = {
    println("Enter some Int")
    var n: Int = readInt()
    val sumCubes= scala.math.pow(n,2) * scala.math.pow((n+1),2) / 4
    println(sumCubes)
  }
}
