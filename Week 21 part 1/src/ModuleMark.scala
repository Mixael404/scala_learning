import scala.io.StdIn.readInt

object ModuleMark {
  def main(args: Array[String]): Unit = {
    println("Enter coursework")
    var coursework = readInt()
    if(coursework > 100){
      println("Incorrect input")
    } else {
      coursework /= 2
    }
    println("Enter examination")
    var examination = readInt()

    if (examination > 100) {
      println("Incorrect input")
    } else {
      examination /= 2
    }
    if(coursework + examination >= 80){
      println("passed overall")
    } else {
      println("failed overall")
      if(coursework < 40){
        println("Resit Coursework")
      }
      if(examination < 40){
        println("Resit Examination")
      }
    }
  }
}
