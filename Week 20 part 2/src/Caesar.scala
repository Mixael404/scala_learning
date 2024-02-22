import scala.io.StdIn._

object Caesar {
  def main(args: Array[String]): Unit = {
    def getCharNumber(): Int = {
      println("Enter char")
      var charToBeEncrypted: Char = readChar().toLower
      var charNumber = charToBeEncrypted.toInt
      return charNumber
    }
    var charIntValue = getCharNumber()

    if (!(charIntValue >= 97 && charIntValue <= 122)) {
      println("Incorrect input. Please enter some English letter")
      return
    }

    def getShift(): Int = {
      println("Enter some Int value")
      var shift: Int = readInt()
      return shift
    }
    var shift: Int = getShift()

    if(shift > 26){
      shift %= 26
    }

    def calculateNewChar(charNumber: Int , shift: Int): Char = {
      var newCharValue = charNumber + shift
//      if (newCharValue > 122) {
//        newCharValue -= 26
//      }
      return newCharValue.toChar
    }
    var newCharValue = calculateNewChar(charIntValue, shift)

    println("Your char: " + charIntValue.toChar)
    println("Encrypted char: " + newCharValue)
  }
}
