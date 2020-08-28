package com.example.kotlinbasic.playground.oop

import java.util.*

fun main (){
    val ob1 =GetandSet()
    println(ob1.name)
    println(ob1.age)
    ob1.age = -1112
    println(ob1.age)
    println(ob1.isLogin)
}
class GetandSet {
    var name: String = "XxX"
        get() = field.toUpperCase(Locale.ROOT)    //ตัวใหญ่
    var age: Int = 0
        get() {
            if (field > 100){
                    field = 100
            }
            return field
            }
        set(value) {
            field = if (value < 0 ) 0 else value
        }
    var isLogin: Boolean = false
        private set

}