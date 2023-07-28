package com.example.kotlinbasics

fun main(){
//    var name:String? = "hello"
//
//    name = null
//
//    var x = 2
//    when(x){
//        1 -> println("Hello")
//        2 -> println("yuss")
//        3 -> println("Omk")
//    }

    var x = Car("Toyota", "T8", "Innova Crysta", 200000)
    var y = Car("Audi", "FSI", "A4", 5000000)
    var z = Car("BMW", "L6", "X3", 5342000)
    var b = Car("Mahindra", "Centuro", "XUV", 230000)

}

class coding(name:String, age:Int){

    init {
        println("name $name of age $age")
        print("\n\n")
    }
}

class Car(name:String, engine:String, model:String, cost:Int){
    init {
        println("Car Name is $name with engine - $engine")
        println("Model is $model")
        println("Cost of $name is $cost")
        print("\n")
    }
}