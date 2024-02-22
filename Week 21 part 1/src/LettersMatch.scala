import scala.io.StdIn.readChar

object LettersMatch {
  def main(args: Array[String]): Unit = {
    println("Enter char")
    val vowels: List[Char] = List('a', 'i', 'e', 'o', 'u')
    var char = readChar().toLower
    if (char.toInt < 97 || char.toInt > 123) {
      println("Incorrect input")
    } else {
      (vowels.contains(char)) match
        case true => println(char + " is VOWEL")
        case false => println(char + " is CONSONANT")

    }
  }
}
