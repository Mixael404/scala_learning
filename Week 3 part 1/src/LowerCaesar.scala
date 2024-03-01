import scala.io.StdIn._

object LowerCaesar {
  def main(args: Array[String]): Unit = {
    println("Enter string")
    var str = readLine()
    println("Enter digit")
    var digit = readInt()
    var encryptedLine = for (i <- str) yield if (i != ' ') (i.toInt + digit).toChar.toLower else i
    println(encryptedLine)
  }
}
