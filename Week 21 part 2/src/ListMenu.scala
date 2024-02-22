import scala.io.StdIn._

object ListMenu {
  def main(args: Array[String]): Unit = {
    println("Enter start value of list ")
    var start = readInt()

    print("Enter end value of list (exclusive) ")
    var end = readInt()

    var xs = List.range(start, end)

    var cmd = ""
    var amount: Int = 0
    while {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      println("Enter cmd")
      cmd = readLine()

      println("Enter amount")
      if(cmd != "End"){
        amount = readInt()
      }

      //TO COMPLETE...

      if(cmd == "Take"){
        println(xs.take(amount))
      } else if(cmd == "TakeR"){
        println(xs.takeRight(amount))
      } else if (cmd == "Drop"){
        println(xs.drop(amount))
      } else if (cmd == "DropR"){
        println(xs.dropRight(amount))
      }

      (cmd != "End")
    } do ()

    println("Exiting program...")
  }
}