import scala.io.StdIn.readChar
object DigitsToWords {
  def main(args: Array[String]): Unit = {
    println("Enter some digit")
    val input = readChar()
    if(input == 0){
      println("ZERO")
    } else if(input == '1'){
      println("ONE")
    } else if(input == '2'){
      println("TWO")
    } else if(input == '3'){
      println("THREE")
    } else if(input == '4'){
      println("FOUR")
    } else if(input == '5'){
      println("FIVE")
    } else if(input == '6'){
      println("SIX")
    } else if(input == '7'){
      println("SEVEN")
    } else if(input == '8'){
      println("EIGHT")
    } else if(input == '9'){
      println("NINE")
    } else {
      println("Not a digit")
    }
  }
}
