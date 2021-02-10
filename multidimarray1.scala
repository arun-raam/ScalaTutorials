object multidimarray1 {


    def main(args: Array[String]): Unit = {
      var x= new multi1
      x.show()

    }
  }
  class multi1{
    var arr=Array(Array(1,2,3,4,5),Array(6,7,8,9,10))

    def show(): Unit ={
      for (i<- 0 to 1) {
        for (j<- 0 to 4){
          println(" "+arr(i)(j))

        }
        println()
      }

    }



}
