import scala.io.StdIn.readInt

object YearOfBirth {
  def main(args: Array[String]): Unit = {
    println("Enter year")
    val year = readInt()
    val currentYear: Int = 2024
    var years = for (i <- year to currentYear) yield i
    for (i <- years) println(i)
  }
}
