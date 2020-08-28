package com.example.kotlinbasic.playground.oop

fun main() {
//InjectorUtils()
    //มึงป่าวกูงงอยู่
    println(InjectorUtils.name)
    println(InjectorUtils.getFool())
    println(InjectorUtils==InjectorUtils)
    println()
    println(MyClass() == MyClass())
    println(MyClass.cra()== MyClass.cra())
    MyClass.fingerSnap()

    val ob1 = object {
        var x1 = 9
        var x2 = 11

        fun sum() = x1 +x2
    }
    println(ob1.x1)
    println(ob1.sum())

}
//singleton
//static
object InjectorUtils {
    var name ="ChanChai"
        private set

    fun getFool() = 1234
}
class MyClass{
    var name = "iBlur"

    fun getFool() = 1234

    companion object Factorry{
        //static
        //singleton
        private var INSTANCE: MyClass? = null

        fun cra(): MyClass{
            if (INSTANCE == null){
                INSTANCE = MyClass()
            }
            return INSTANCE!!
        }

        fun fingerSnap(){
            println("OMGGGGGG")
        }
    }
}