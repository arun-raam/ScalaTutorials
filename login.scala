object login {
  def main(args: Array[String]){
    var n = new facebook("arun21@gmail.com","asdf");
    n.login1()
  }
}
class facebook (username:String,password:String) {
  def login1() {
    println(username+ " LOGGIN SUCESSFULL")
  }
}
