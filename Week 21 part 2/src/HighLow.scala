import scala.io.StdIn._

object HighLow {
  def main(args: Array[String]): Unit = {
    val number = 52
    var input: Int = 0
    var times: Int = 0
    while {
      times += 1
      println("Type Int")
      input = readInt()
      if(input < number){
        println("Higher")
      } else if (input > number){
        println("Lower")
      } else {
        println("Correct! It took " + times + " times")
      }

      (input != number)
    } do()
  }
}
