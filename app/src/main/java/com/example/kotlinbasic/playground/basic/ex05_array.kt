package com.example.kotlinbasic.playground.basic

fun main(){
    val ar1 = arrayOf(1234,"blur",true)
    val ar2 = arrayOf<Any>(1234,"blur",true)
    val ar3 = arrayOf<Int>(1234,444,555)

    val ar4:IntArray = intArrayOf(123,456,789)
    val ar5 = intArrayOf(123,456,789)

    ar1[0]="cat"
    ar1.set(2,123)
    println(ar1[0])
    println(ar1.get(2))

    for (item in ar1){
        println("[for] ar1 $item")
    }
    ar1.forEach { item ->
        println("[for] ar1 $item")
    }
    for (index in ar1.indices){
        println("[for>index] ar1: ${ar1[index]}")
    }
    for ((index,item) in ar1.withIndex()){
        println("[for > Index] ar1 :$item [$index]")
    }
    ar1.forEachIndexed() {index,item ->
        println("[for > Index] ar1 :$item [$index]")
    }
}