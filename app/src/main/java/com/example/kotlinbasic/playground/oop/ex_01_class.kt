package com.example.kotlinbasic.playground.oop

fun main() {
    val obj1 = primaryClass( name = "AA", age = 123)
    println("obl1.name: ${obj1.name}")
    val obj1111 = primaryClass( name = "AA", age = 123)
    println("xxxx: ${obj1==obj1111}")
    obj1.display()
    println()
    val obj2 = Secondray()
    println("obl2.name: ${obj2.name}")
    obj2.display()
    println()
    val obj3 = Secondray( name = "aa", age = 30)
    println("obl3.name: ${obj3.name}")
    obj3.display()
    println()
    val obj4 = PSClass(80,"aa")
    println("obl4.score: ${obj4.name},${obj4.score}")
    println()
    val obj5 = PSClass(80)
    println("obl5.score: ${obj5.name},${obj5.score}")
    println()
//    show true : compare instant check data
    val obj6 = DataClass("aa",123)
    val obj7 = DataClass("aa",123)
    val obj8 = primaryClass("aa",123)
    println("xxxx : ${obj6 .toString()}")
    println("xxxxx : ${obj6 == obj7}")
    println("xxxxxx : ${obj8 .toString()}")

    val (name,age)=DataClass("aa",123)
    println("name: $name , age: $age")
}
class primaryClass (val name: String,val  age: Int){
    init {
        println("primary init")
    }
    //  init {
    //  println("primary init2")
    //  }
    init {
        println("inti age: $age")
    }
    fun display(){
        val result = "name : $name, age: $age"
        println("Primary: $result")
    }
}
//class PrimaryClass constructor(val name: String,val age: Int){
//    fun display(){
//        val result = "name: $name, age: $age"
//        println("Primary: $result")
//    }
//}
//class  Primary{
//    val name: String = ""
//    val age: Int = 123
//    Primary (name: String, age: int){
//        this.name = name
//        this.age = age
//    }
class Secondray{
    var name: String = ""
    var age: Int = 0
//    val name: String
//    val  age: Int
    constructor(){
        this.name =""
        this.age = 0
    }
    constructor(name: String){
        this.name = name
        this.age = 0
    }
    constructor(age: Int){
        this.name = ""
        this.age = age
    }
//    overload
    constructor(name: String,age: Int){
    this.name = name
    this.age = age
}
    init {
        println("primary init")
    }
    //  init {
    //  println("primary init2")
    //  }
    init {
        println("inti age: $age")
    }
    fun display(){
        val result = "name : $name, age: $age"
        println("Primary: $result")
    }

}
class PSClass(val score:Int, val name: String){
    constructor(score: Int):this(name = "xx",score = score){

    }
}
data class DataClass(var name: String, var age: Int){
    constructor(age: Int):this(name="xx",age = age){

    }
}