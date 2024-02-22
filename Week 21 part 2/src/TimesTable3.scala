import scala.io.StdIn.readInt

object TimesTable3 {
  def main(args: Array[String]): Unit = {
    println("Type int to be multiplied")
    val value: Int = readInt()
    var rows = 0
    while(rows <= value){
      var col = 0
      while (col <= value){
        if(rows == 0){
          if(col != 0){
            print(f"${col}%4d")
          } else {
            print("          ")
          }
        } else {
          if(col == 0){
            print(f"${rows}%4d |    ")
          } else {
          print(f"${(rows * col)}%4d")
          }
        }
        col += 1
      }
      println("")
      rows += 1
    }
  }

}
