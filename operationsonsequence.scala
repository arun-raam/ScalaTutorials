import scala.collection.immutable._
object operationsonsequence {
  def main(args: Array[String]): Unit = {

    var seq:Seq[Int]=Seq(1,3,5,2,6,10,8,16,15,20)
    seq.foreach((seq)=>println(seq+""))

println("is empty:"+seq.isEmpty)
    println(" is contain:"+seq.contains(5))
    println("reversing:"+seq.reverse)
    println("last element:"+seq.lastIndexOf(seq))
    println("head ofseq:"+seq.head)
    println("tail of seq:"+seq.tail)


    // using lists
    var list=List(1,5,2,6,3,7,4,8,9,10)
    var list2= List(11,15,13,12,16,14,18,19,17,20)


    // operations
    var list3=list++list2
  list.foreach((list)=>  println(list+""))   // using for loop
    list2.foreach((list2)=>  println(list2+""))
    list3.foreach((list3)=>  println(list3+"")) // after mergeing two lits

    println("after sorting list 3:"+list3.sorted)   // sorting lists


    println("reversing list 3"+list3.reverse) // reversing list 3

    // using stream
     var stream = 100 #:: 200 #:: 300 #::Stream.empty
println(stream)

    var firstelement= stream.head
    println(firstelement)
    println(stream.map{_*2})




  }

}
