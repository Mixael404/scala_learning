
object higherOrderFn {
  def main(args: Array[String]): Unit = {
//    val markedGreeter = printDecorator(() => println("Hello from arrow function"))
//    markedGreeter()
//
//    val decoratedSum = sumDecorator(10, (a: Int, b: Int) => a + b)
//    println(decoratedSum(1,2))
//
//    println("Sqrt from upper function: ")
//    val calculateSqrt = sqrt(25)
//    println("Sqrt of sum from inner function: ")
//    println(calculateSqrt(11))
    val arr: Array[Int] = Array(1,2,3,4,5)
    val arr2 = arr.map((elem) => elem + 1)
    val arr3 = arr.filter((elem) => elem%2 == 0)
    println("Arr + 1 to each elem")
    arr2.foreach(println(_))
    println("Even elements of arr: ")
    arr3.foreach((elem) => println(elem))
  }

//  def addBrackets(y: Int): String = {
//    return ("{ " + y + " }")
//  }
  def decorator(x: Int, cb: (Int) => String) = {
    println("Param: " + x)
    cb(x)
  }

  def printDecorator(cb: () => Unit): () => Unit = {
    def decorated() = {
      println("Functrion starts")
      cb()
      println("Function stops")
    }
    return decorated
  }

  def sumDecorator(adder: Int , cb: (Int, Int) => Int): (Int, Int) => Int = {
    def decorated(a: Int , b: Int): Int = {
      println("Now sum will be printed: ")
      return (cb(a,b) + adder)
    }
    return decorated
  }

  def sqrt(x: Double): (Double) => Double = {
    println(Math.sqrt(x))
    return (y: Double) => Math.sqrt(y + x)
  }
}
