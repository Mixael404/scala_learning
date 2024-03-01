object FlatMapCaesar {
  def main(args: Array[String]): Unit = {
    val words = Array("Mse", "crete", "t", "messiah", "s", "ageing")
    val rotation = 1
    val newArr = words.flatMap((word) => word.take(3))
    newArr.map((char) => char.toLower).foreach((char) => print(char + " "))
  }
}
