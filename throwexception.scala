object throwexception {
  def main(args: Array[String]): Unit = {
var x= new throws
    x.validiate(17)

  }

}

class throws{
  def validiate(age:Int){
  if (age<18) {
    throw new ArithmeticException("You are not eligible")
  }
  else{
    println("You are eligible")



  }

  }
}