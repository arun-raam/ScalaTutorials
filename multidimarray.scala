object multidimarray {
  def main(args: Array[String]): Unit = {
var x= new multi
    x.show()

  }
}
class multi{
  var arr=Array.ofDim[Int](2,2)
  arr(1)(0)=15
  def show(): Unit ={
    for (i<- 0 to 1) {
      for (j<- 0 to 1){
        println(" "+arr(i)(j))

      }
      println()
    }

  }


}
