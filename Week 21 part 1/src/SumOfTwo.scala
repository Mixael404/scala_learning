import scala.io.StdIn.readInt
object SumOfTwo {
  def main(args: Array[String]): Unit = {
    println("Enter first Int")
    var int1 = readInt()
    println("Enter second Int")
    var int2 = readInt()
    println("Enter third Int")
    var int3 = readInt()
    if(int1 + int2 == int3 || int2 + int3 == int1 || int1 + int3 == int2){
      println("YES")
    } else {
      println("NO")
    }
  }
}
