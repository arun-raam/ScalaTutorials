object funcompose {
  def main(args: Array[String]):Unit = {

    var result = multipleing(adding(10))
    println(result)

  }



    def adding(x:Int): Int ={

      x+50
    }
    def multipleing(x:Int):Int ={

      x*3

    }
  }

