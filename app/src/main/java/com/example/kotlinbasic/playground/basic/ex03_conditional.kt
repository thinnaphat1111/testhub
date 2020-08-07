package com.example.kotlinbasic.playground.basic

    fun main(){
        """
       var ex : Int
        if (true){
            ex = 1112
            
        }else{
            ex=1150
        }
        """
        var expectation1 = if (true){
            123
        }else{
            999
        }
        var expectation2 = if (true) 123 else 432 // เหมือนกันแต่สั่นกว่าาาาาาาาาาาาาาาาาาาา

        //switch case

        val name = "iBlur"  //งงงงงงงงงงงงงงงงงงงงงงงงงงง
        """
            when (name) {
            "iBlur" -> {
                "cat" -> {
                    "red" ->{
                    "green" ->{

                }
                }
                }
            }
        }
        """.trimIndent()
        when (name){
            "i" ->{
                //todo
            }
            "cat" ->{

            }
            "red","green", "blue" ->{
                //todo
            }
            else -> {
                println("มึงว่ากูงงป่ะ  กูว่ากูเริ่มงงละ ทำเยอะละสมองตามไม่ทัน")
            }
        }
        val score = 80  //อันนี้คือif  else ปกติไม่มีไร
        if (score>=100){
            //todo
        }else if (score >=80){
            //todo
        }else if (score >=50){
            //todo
        }else{
            //todo
        }
        when{
            score>=100 ->{
                //todo  //มันคือให้มึงใส่คำส่ง ส่งอะไรก็ได้
            }
            score>=80 ->{
                //todo
            }
            score>=50 ->{
                //todo
            }
            else ->{
                //todo
            }
        }
        when(score){
            in  0..10 ->{
                //todo
            }
            in 10..50 ->{
                //todo
            }
            in 50..100 ->{
                //todo
            }
            else ->{
                //todo
            }
        }
        val expectation3 = when("name"){
            "name" -> "iBlur"
            "age" -> 30
            else -> true    //ง่วงแล้ววววววววววววว T-T
        }
    }
