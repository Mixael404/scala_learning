import scala.io.StdIn._

@main
def main(): Unit = {
  var cart: List[String] = List()
  var select: Int = 0

  def getSelect(): Int = {
    print("Your choice: ")
    select = readInt()
    return select
  }

  def printPanel(): Unit = {
    println("Menu: ")
    print("1: Add Item \t 2: Delete Item \t 3: Clear List \t 4: Exit \n")
    println("====== Items Cart ======")
    if (cart.nonEmpty) {
      var i = 0
      while (i < cart.length){
        println((i + 1) + ") " + cart.apply(i))
        i += 1
      }
    } else {
      println("EMPTY")
    }
    println("========================")
    getSelect()
  }
  printPanel()
  while (select != 4){
    select match
      case 1 => {
        var product: String = readLine("Enter some product ")
        cart = cart :+ product
      }
      case 2 => {
        print("Enter product's number ")
        var productId: Int = readInt()
        cart = cart.take(productId - 1) ++ cart.takeRight(cart.length - productId)
      }
      case 3 => {
        cart = List()
      }
//      case 4 => {
//        println("Exit")
//      }
      case _ => {
        println("Incorrect input")
      }

//    if(select == 1){
//     var product: String = readLine("Enter some product ")
//     cart = cart :+ product
//    }
//    if(select == 2){
//      print("Enter product's number ")
//      var productId: Int = readInt()
//      cart = cart.take(productId - 1) ++ cart.takeRight(cart.length - productId)
//    }
//    if(select == 3) {
//      cart = List()
//    }
//    if(select > 4){
//      println("Incorrect input")
//    }
    printPanel()
  }
}