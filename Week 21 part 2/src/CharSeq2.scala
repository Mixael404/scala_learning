import scala.io.StdIn.readChar

object CharSeq2 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()

    println("End character? ")
    var end: Char = readChar()

    if(start.toInt > end.toInt){
      var tmp = start
      start = end
      end = tmp
    }

    while (start <= end) {
      print(start + " ")
      start = (start + 1).toChar
    }
  }
}
