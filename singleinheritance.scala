object singleinheritance {
  def main(args: Array[String]): Unit = {
new programmer
  }

  class empsal{
    var salary:Float=20000
  }

  class programmer extends empsal{
    var bonus :Int=5500
    println("salary:"+salary)
    println("bonus:"+bonus)
  }











}
