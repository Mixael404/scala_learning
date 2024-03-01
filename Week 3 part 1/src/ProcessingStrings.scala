import scala.io.StdIn.readLine

object ProcessingStrings {
  def main(args: Array[String]): Unit = {
    println("Type in a sentence: ")
    var sentence = readLine()

    for (x <- sentence) {
      println(x)
    }

    var letterCount = 0
    var digitCount = 0
    for (x <- sentence if x.isLetter) {
      println("Letter: " + x)
      letterCount += 1
    }
    for (i <- sentence if i.isDigit){
      println("Digit: " + i)
      digitCount += 1
    }


    println("Number of letters? " + letterCount)
    println("Number of digits? " + digitCount)


  }
}