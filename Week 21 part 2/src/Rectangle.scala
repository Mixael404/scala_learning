import scala.io.StdIn.readInt

object Rectangle {
  def main(args: Array[String]): Unit = {
   println("Enter height")
   val height: Int = readInt()

    println("Enter width")
    val width: Int = readInt()

    var rows: Int = 1
    while (rows <= height){
      var col: Int = 1
      while (col <= width){
        print("* ")
        col += 1
      }
      println("")
      rows += 1
    }
  }
}
