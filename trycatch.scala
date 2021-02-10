object trycatch {
  def main(args: Array[String]) {
var x= new exception
    x.divide(100,0)


  }

}

class exception{

  def divide(a:Int,b:Int)={

    try {
    a/b

   }
   catch
     {
     case e: ArithmeticException=>println(e)

   }

  }


}
