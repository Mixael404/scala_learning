object FlatMap {
  def main(args: Array[String]): Unit = {
    var xs = List("apple","pear","banana", "kiwi")
    var intList: List[List[Int]] = List(List(1,2,3), List(4,5,6))
    //similar to flatten
    var chars = for (x <- xs; y <- x) yield y
    var digits = for(i <- intList; j <- i) yield j
    println(chars)
    println("digits: " + digits)

    //similar to flatMap
    chars = for (x <- xs; y <- x.take(3)) yield y
    println(chars)


    //similar to flatMap followed by map
    chars = for (x <- xs; y <- x.take(3)) yield y.toUpper
    println(chars)

  }
}
