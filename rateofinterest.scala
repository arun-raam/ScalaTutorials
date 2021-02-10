object rateofinterest {
  def main(args: Array[String]): Unit = {
var a=new axis
    var b=new kvb
    println("Rate of Interest in AXIS is:"+a.getRateOfInterest())
println("Rate of Interest in KVB is:"+b.getRateOfInterest())


  }
}

class bank{
 def getRateOfInterest()={
   0
 }

}
class axis extends bank {
   override def getRateOfInterest()={
    1
  }

}
class kvb extends axis {
  override def getRateOfInterest()={
    2
  }
}