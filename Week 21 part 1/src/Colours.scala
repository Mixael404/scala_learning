import scala.io.StdIn.readInt

object Colours {
  def main(args: Array[String]): Unit = {
    println("Enter digit in range 1-7")
    val choise = readInt()
    choise match
      case 1 => {
        println("RED")
      }
      case 2 => {
        println("ORANGE")
      }
      case 3 => {
        println("YELLOW")
      }
      case 4 => {
        println("GREEN")
      }
      case 5 => {
        println("INDIGO")
      }
      case 6 => {
        println("BLUE")
      }
      case 7 => {
        println("VIOLET")
      }
      case _ => {
        println("INCORRECT INPUT")
      }
  }
}
