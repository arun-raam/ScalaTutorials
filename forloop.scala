object forloop {
  def main(args: Array[String]): Unit = {

    for (x <- 1 to 4) {
      val squared = x * x
      println(squared)
    }
  }

}
