import scala.collection.immutable.{HashSet, ListSet}

object set {
  def main(args: Array[String]): Unit = {
var games= Set("cricket","football","baseball","kabadi","Handball")
   val alphabets=Set("a","b","c","e","f","g","h","i","j")
    val mergeboth=games++alphabets
println("elements in games ="+games.size)
    println("elements in alphabets="+alphabets.size)
    println(mergeboth)
    println("elements in mergeboth="+mergeboth.size)
println("is there golf?in games"+games.contains("golf"))

    // adding and removing elements
games +="racing"
games -="Handball"
for(games<-games){
  println(games)}

//iterating using for each
    games.foreach((games)=>println(games))


    // using Hash Set

    var hashset=HashSet(4,3,6,7,10,13,15,1,2,0)
    hashset.foreach((hashset:Int)=>println(hashset))

// using list set

    var list1:ListSet[String]= new ListSet()
    var list2:ListSet[String]=ListSet.empty

    println(list1)
    println(list2)

    list1 += ("germany","India")
    list2 +=("tokyo","Berlin")
    println(list1)
    println(list2)


  }
}








