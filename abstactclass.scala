object abstactclass {
  def main(args: Array[String]): Unit = {
   var x=new hero(10)
    x.function1()
    x.function2()


  }

}
abstract class bike(a:Int){
 var b:Int=20
 var c:Int=30
  def function1()
  def function2(): Unit ={
    println("Hi There!")
  }
}

class hero(a:Int)  extends bike(a){
c=35
  def function1(): Unit ={
    println("RUNNNING FINE")
    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
  }

}





