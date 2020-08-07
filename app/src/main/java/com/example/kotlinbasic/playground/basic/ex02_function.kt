package com.example.kotlinbasic.playground.basic

    fun main(){
        normalFunchtion()   //คำสั่งแสดงฟังชั่น บรรทัด 7   อันนี้กูบอกมึงนะเนี่ย
        argumentFuntion(123, 321)  //แสดง 11 ใส่ค่าไรก็ได้ = ....
        //returnFuntion1()    รันแต่มันจะไม่มีอะไรเพราะไม่ได้สั่ง ปริ้น
        println(returnFuntion1())   // อันนี้จะแสดง
        println(returnFuntion2())
        println(returnFuntion3(2,3) )  //ไม่ต้องใส่xก็ได้่มันจะขึ้นให้อัตโนมัด
        println(optionFuntion(11,20))
        println(optionFuntion(x2 = 11,x1 = 20))  //อันสลับถ้าอยากให้x2 อยู่หน้าก็ให้เปลี่ยน ไม่บอกก็รู้
        //ต่อไปจะเขียนในเม็ดแตดmain เพราะอันก่อนหน้านี้เข้าข้างนอก เข้าใจไหม

        val lambdal1 :(Int, Int)->Int={x1, x2 -> x1+x2}
        println(lambdal1(1150,1112))
        val lambdal2 ={x1:Int, x2:Int -> x1+x2}
        println(lambdal2(1150,1112))       //มันเหมือนกันแค่พิมคนละแบบ    แต่มันใช้ทำไรกูไม่รู้ลืมฟัง

        fun xxx(x1: Int, x2: Int):Int{
            return x1+x2
        }
        println(xxx( 1112,1150))


    }
    fun normalFunchtion(){
        println("normalFunchtion")
    }

    fun argumentFuntion(x1 :Int,x2 :Int){
        println("sum: $x1 + $x2" )
        println("sum: ${x1 + x2}" )
    }
    fun returnFuntion1():String{
        return "iChanMaiMaMo"
    }
    fun returnFuntion2() = "iTiwKorYangMaiMaMo"  // เหมือนอัน 17 แต่สั่นกว่า

    fun returnFuntion3(x1: Int,x2: Int) =x1+x2

    fun optionFuntion(x1: Int,x2: Int = 0){
        println("SUM: ${x1 + x2}")
    }