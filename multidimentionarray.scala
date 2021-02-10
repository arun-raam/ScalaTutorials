object multdimarray3 {
  def main(args: Array[String]): Unit = {
      var x= new multi2
      x.show()

    }
  }
  class multi2{
    var arr4=Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
var arr5=Array(Array(11,12,13,14,15),Array(16,17,18,19,20))
    var arr3=Array.ofDim[Int](2,5)
    def show(): Unit ={
      for (i<- 0 to 1) {
        for (j<- 0 to 4){
          arr3(i)(j)=arr4(i)(j)+arr5(i)(j)
          println(" "+arr3(i)(j))

        }
        println()
      }

    }





}
