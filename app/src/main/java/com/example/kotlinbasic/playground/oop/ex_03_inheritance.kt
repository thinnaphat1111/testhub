package com.example.kotlinbasic.playground.oop

fun main() {
    var ob1 = Cat()
    ob1.say()
    ob1.run( speed = 2421)

}
open class animal {
    var name = "-"
    var age = 0
    open fun say(){
        println("$name say: foooooo")
    }
}
class Cat: animal(),Event{
    override fun say(){
        //super.say()
        name = "black"
        println("$name say: ໃສ່ໃຈໄດ້ແຕ່ມອງ")
    }
    override fun run(speed: Int){
        // TODO
    }

}
interface  Event{
    fun run(speed: Int)
}