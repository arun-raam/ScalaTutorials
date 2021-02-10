object companionclass {
  def main(args: Array[String]): Unit = {
    new companionClass().hello
    println("this is companion object")
  }


class companionClass{
  def hello: Unit ={
    println("this is companion class")
  }
}
}