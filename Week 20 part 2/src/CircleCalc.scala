import scala.io.StdIn._

object CircleCalc {
  def main(args: Array[String]): Unit = {
    println("Enter some radius")
    var diameter: Double = readDouble()
    val pi: Double = scala.math.Pi
    var circumference: Double = pi * diameter
    var result = f"$circumference%1.2f"
    println("A circle with diameter " + diameter + " has a circumference of " + result)
  }
}
