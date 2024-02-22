import scala.io.StdIn.readChar

object Letters {
  def main(args: Array[String]): Unit = {
    println("Enter char")
    val vowels: List[Char] = List('a', 'i', 'e', 'o', 'u')
    var char = readChar().toLower
    if(char.toInt < 97 || char.toInt > 123){
      println("Incorrect input")
    } else {
      if(vowels.contains(char)){
        println(char + " is vowel")
      } else {
        println(char + " is CONSONANT")
      }
    }
  }
}
