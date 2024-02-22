import scala.io.StdIn.readDouble

object Checkout {
  def main(args: Array[String]): Unit = {
    var price: Double = 1.00
    var list: List[Double] = List()
    while(price != 0.00){
      println("Type some price")
      price = readDouble()
      list = list :+ price
    }

    var i: Int = 0
    var total: Double = 0.00
    while (i < list.length){
      println("Price: " + list(i))
      total += list(i)
      i += 1
    }
    println("\t ===")
    println("Total " + total + " amount of items: " + (list.length - 1))
  }
}
