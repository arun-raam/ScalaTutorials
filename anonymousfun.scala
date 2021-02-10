object anonymousfun {


  def main(args: Array[String]): Unit = {

    var function0 = (x: Int, y: Int) => x + y
    var function1 = (_: Int) - (_: Int)
    println(function0(5, 5))
    println(function1(50, 10))


  }
}