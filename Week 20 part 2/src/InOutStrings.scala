import scala.io.StdIn._

object InOutStrings {
  def main(args: Array[String]): Unit = {
    println("Enter your first name ")
    var firstName: String = readLine()

    var lastName: String = readLine("Enter your last name ")

    var title: String = readLine("Enter title")
    println("Enter initial")
    var initial: Char = readChar()
    println("Enter house number")
    var house_number: Int = readInt()
    println("Enter address")
    var address: String = readLine()
    println("Enter telephone")
    var telephone: Long = readLong()
    println("Enter salary")
    var salary: Byte = readByte()
    println("Your name is " + title + " " + firstName + " " + lastName)
    println("Initial " + initial)
    println("House number: " + house_number)
    println("Address: " + address)
    println("Phone: " + telephone)
    println("Salary " + salary)
  }
}
