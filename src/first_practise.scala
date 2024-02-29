import scala.io.StdIn.*

object first_practise{
  def main(args: Array[String]): Unit = {

    var name = readLine("Enter your name \n")
    var trimmedName = name.trim()
    var arrName: Array[String] = name.split("")
    for (elem <- arrName) {
      println(elem)
    }
  }
}