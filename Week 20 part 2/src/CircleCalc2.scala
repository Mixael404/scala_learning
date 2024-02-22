import scala.io.StdIn._


object CircleCalc2 {
  def main(args: Array[String]): Unit = {
    println("Enter some radius")
    var diameter: Double = readDouble()
    val pi: Double = scala.math.Pi
    //    var res = "%1.3f".format(pi * diameter)
    var circumference: String = "%1.2f".format(pi * diameter)
    println("A circle with diameter " + diameter + " has a circumference of " + circumference)
  }
}
