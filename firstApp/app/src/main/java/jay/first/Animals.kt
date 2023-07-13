package jay.first

fun main(){
    val cow = Mammals(nippleCount = 5, twoLegged = false, mamColor = "White", mamLegCount = 4)
    cow.walk()
}

open class Animals(val color:String, val legsCount:Int){
    fun walk(){
        println("Animal is walking")
    }
    fun makeSound(){
        println("Animal is Making sound")
    }
    fun eat(){
        println("Animal is eating")
    }
}

class Mammals(val nippleCount:Int,
              val twoLegged:Boolean,
              val mamLegCount:Int,
              val mamColor:String) : Animals(color = mamColor, legsCount = mamLegCount){
    fun givingBirth(){
        println("Mammal is giving birth")
    }
    fun feedingMilk(){
        println("Mammal i")
    }
}