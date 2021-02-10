object bikeinfo {
  def main(args: Array[String]) {
    var n= new vehicle("Tvs",2020,"Bangalore");
  n.function()
  }

}

class vehicle(company:String,modelyear:Int,regloc:String){
  def function(){
    println(company+"\n" +modelyear+"\n"+ regloc+" Displayed Sucessfully")

  }
}
