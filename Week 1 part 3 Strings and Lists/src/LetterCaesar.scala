import scala.io.StdIn._

object LetterCaesar {
  def main(args: Array[String]): Unit = {
    println("Enter sentence")
    var string = readLine()

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
      if (shift > 26) {
        shift %= 26
      }
      return shift
    }

    var shift: Int = getShift()

    def calculateNewChar(charNumber: Int, shift: Int): Char = {
      var newCharValue = charNumber + shift
      return newCharValue.toChar
    }

    var newCharValue = calculateNewChar(charIntValue, shift)

    var newString = string.replace(charIntValue.toChar, newCharValue)
    println("Your char: " + charIntValue.toChar)
    println("Encrypted char: " + newCharValue)
    println("New sentence: " + newString)
  }
}
