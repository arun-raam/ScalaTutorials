object empdetails {
  def main(args: Array[String]): Unit = {
var employee1= new employee(1,"arun","engineer",60000)
    var employee2 = new employee(2,"selva","architect",50000)
    var employee3 = new employee(3,"abish","artist",40000)
    employee1.getrecord()
    employee2.getrecord()
    employee3.getrecord()
  }

}
class employee(id:Int,empname:String,role:String,salary:Int){
def getrecord(): Unit ={
  println(id+"\t"+ empname + "\t" + role +"\t"+  salary)
}
}

