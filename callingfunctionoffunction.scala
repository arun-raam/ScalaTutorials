object callingfunctionoffunction {
  def main(args: Array[String]): Unit = {

function0(10,function1)


    def function0(x:Int,f:Int =>AnyVal):Unit={

    println(f(x))


    }

def function1(x:Int):Int={

  x+50
}








  }

}
