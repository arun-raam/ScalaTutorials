object singleton {
  def main(args: Array[String]): Unit = {
    singletonObject.hello
  }


  object singletonObject{
    def hello: Unit ={
      println("Created an singleton Object ")
    }

  }

}
