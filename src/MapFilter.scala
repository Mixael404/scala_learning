object MapFilter {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6,7,8,9,10)
    println("Start arr: ")
    arr.foreach((item) => print(item + " "))
    println("")


    def square(num: Int): Double = {
      math.pow(num, 2)
    }
    def printElements(elem: Double) = {
      print(elem + " ")
    }

    println("Start arr plus 1: ")
    arr.map(square).foreach(printElements)
    println("")


    def checkOnEven(num: Int): Boolean = {
      num % 2 == 0
    }

    println("Even numbers of start arr:")
    arr.filter(checkOnEven).foreach((elem) => print(elem + " "))
    println("")

//    println("Less than 20: ")
//    arr.filter((elem) => elem < 20)
//       .map((elem) => math.pow(elem, 2))
//       .foreach((elem) => println("Square of " + math.sqrt(elem) + " is " + elem))

//    val arrSum = arr.reduce((acc, elem) => acc + elem)
//    println("Sum of start arr:" + arrSum)
  }

}
