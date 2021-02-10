object methodoverloading {
  def main(args: Array[String]): Unit = {
    var x=new arithmethic()
    x.addition(10,10)
    x.addition(10.5,20.5)


  }

}

class arithmethic{
  def addition(a:Int,b:Int): Unit ={
    var sum= a+b
    println(sum)
  }
  def addition(a:Double,b:Double): Unit ={
    var sum =a+b
    println(sum)
  }


}