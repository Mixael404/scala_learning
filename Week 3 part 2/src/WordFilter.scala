import scala.io.StdIn._


object WordFilter {
  def main(args: Array[String]): Unit = {
    val words = new Array[String](5)
    val chars = new Array[Char](5)
    println("Enter words")
    for(i <- words.indices){
      words(i) = readLine()
    }
    println("Enter chars")
    for (i <- chars.indices) {
      chars(i) = readChar()
    }
    words.filter((word) => chars.contains(word(0))).foreach(println(_))

  }
}
