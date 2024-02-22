import scala.io.StdIn._

object Initials {
  def main(args: Array[String]): Unit = {
    println("Input your full name")
    var fullName: String = readLine()
    var spaceIndex = fullName.indexOf(" ")
    var name = fullName.substring(0, spaceIndex)
    var surname = fullName.substring(spaceIndex + 1)
    println(name(0).toString + surname(0).toString)
  }
}
