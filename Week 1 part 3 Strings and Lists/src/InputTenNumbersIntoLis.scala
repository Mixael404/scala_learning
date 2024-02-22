import scala.io.StdIn._

object InputTenNumbersIntoLis {
  def main(args: Array[String]): Unit = {
    var xs: List[Int] = List()

    println("First number? ")
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()
    xs = xs :+ readInt()

    //read remaining numbers here

    println(xs.reverse)
  }
}
