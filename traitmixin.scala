object traitmixin {
  def main(args: Array[String]): Unit = {
    var x = new print
    x.fun2()
    x.fun1()
  }
}
  trait function1{
    def fun1()

  }
  abstract class function2{
    def fun2()
  }
  class print extends function2 with function1{

    def fun1(): Unit ={
      println("Hehe")
    }
    def fun2(): Unit ={
      println("haha")

    }

}
