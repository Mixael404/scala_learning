import scala.io.StdIn.*

object first_practise{
  def main(args: Array[String]): Unit = {

//    println("Enter name")
//    var name: String = readLine()
//
//    println("Enter age")
//    var age: Int = readInt()
//
//    println("Are you here?")
//    var avail: Boolean = readBoolean()
//    println(avail)
//    if(age >= 18){
//      println(name + " ,you passed")
//    } else{
//      println(name + " ,you don't pass")
//    }

    var name = readLine("Enter your name \n")
    var trimmedName = name.trim()
//    if(!trimmedName.toLowerCase().contains("u")){
//      println("Doesn't have U letter")
//    } else {
//      println("It has U letter")
//    }
    var arrName: Array[String] = name.split("")
    for (elem <- arrName) {
      println(elem)
    }
  }
}