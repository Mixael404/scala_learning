import scala.io.StdIn.readInt

object YearRange {
  def main(args: Array[String]): Unit = {
    val birthYear = readInt()
    (birthYear to 2024).filter((year) => year % 4 != 0).foreach((year) => println(year))
  }
}
