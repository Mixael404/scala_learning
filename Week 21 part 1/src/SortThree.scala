import scala.io.StdIn.readInt

object SortThree {
  def main(args: Array[String]): Unit = {
//    println("Enter a")
//    val a: Int = readInt()
//    println("Enter b")
//    val b: Int = readInt()
//    println("Enter c")
//    val c: Int = readInt()
//    println("Enter d")
//    val d: Int = readInt()


    def createArr(length: Int): Array[Int] = {
      var arr = new Array[Int](length)
      var index = 0
      while (index < length) {
        println("Enter " + (index + 1) + "/" + length + " digit")
        arr(index) = readInt()
        index += 1
      }
      return arr
    }
    def copyArr(arrToCopy: Array[Int]): Array[Int] = {
      var arr = new Array[Int](arrToCopy.length)
      var i = 0
      for (i <- arrToCopy.indices){
        arr(i) = arrToCopy(i)
      }
      return arr
    }
    def insertionSort(): Unit = {
    println("Enter length of array")
    var arrLength = readInt()
    val initialArr: Array[Int] = createArr(arrLength)
    val arr = copyArr(initialArr)

    var i: Int = 0
    var j: Int = 0
    var tmp = 0
    val maxIndex: Int = arr.length - 1

    for (i <- 0 to maxIndex) {
      for (j <- i to maxIndex) {
        if (arr(i) > arr(j)) {
          tmp = arr(j)
          arr(j) = arr(i)
          arr(i) = tmp
        }
      }
    }
      println("Initial array:")
      println(initialArr.mkString("Array(", ", ", ")"))
      println("Sorted array:")
      println(arr.mkString("Array(", ", ", ")"))
  }
    insertionSort()
//    if(a < b){
//      if(c < a){
//        print(c)
//        print(a)
//        print(b)
//      } else if (c > b){
//        print(a)
//        print(b)
//        print(c)
//      } else {
//        print(a)
//        print(c)
//        print(b)
//      }
//    } else{
//      if (c < b) {
//        print(c)
//        print(b)
//        print(a)
//      } else if (c > a) {
//        print(b)
//        print(a)
//        print(c)
//      } else {
//        print(b)
//        print(c)
//        print(a)
//      }
//    }
  }
}
