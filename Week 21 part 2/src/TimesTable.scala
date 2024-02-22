import scala.io.StdIn.readInt

object TimesTable {
  def main(args: Array[String]): Unit = {
    println("Type some Int to be multiplied: ")
    val number = readInt()
    var i: Int = 1
    while (i <= 12){
      println(f"${i}%2d" + " * " + number + " = " + f"${i * number}%3d")
      i += 1
    }
  }
}
