object traitwithclass {
  def main(args: Array[String]): Unit = {
    var x=new print1
    x.fun1()
    x.fun2()
  }
}


trait funct1{
  def fun1()

}
trait funct2{
  def fun2()


}
class print1 extends funct1 with funct2{

  def fun1(): Unit ={
    println("Hehe")
  }
  def fun2(): Unit ={
    println("haha")

  }




}

