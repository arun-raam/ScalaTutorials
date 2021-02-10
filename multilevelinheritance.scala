object multilevelinheritance {
  def main(args: Array[String]): Unit = {
 var c= new C
c.print
  }
}
class A{
  var salary1:Float=20000
}
class B extends A{
  var salary2:Float=30000
}
class C extends B{
  def print: Unit = {


    println("salary1:" + salary1)
    println("salary2:" + salary2)
  }
}