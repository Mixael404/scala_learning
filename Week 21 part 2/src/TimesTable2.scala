import scala.io.StdIn.readInt

object TimesTable2 {
  def main(args: Array[String]): Unit = {
    println("Type int to be multiplied")
    val value: Int = readInt()
    var rows = 1
    while(rows <= value){
      var col = 1
      while (col <= value){
        print(f"${(rows * col)}%4d")
        col += 1
      }
      println("")
      rows += 1
    }

  }

}
