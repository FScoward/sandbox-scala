object Sequence {
  def main(args: Array[String]): Unit = {
      val x = Map("1"->"one", "2" -> "two", "1" -> "wan").groupBy(_._1)
      println(x)
  }
}
