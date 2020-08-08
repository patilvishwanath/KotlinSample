package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 26/07/20.
 */
fun main() {
    println("Hello World!!")

    val mode = 1;

    var st = "Vishwanath"
    var str = "Patil"
    println("$st $str")

    var a = 1
    var b = 2
    var c :Long= 2
    var d = 2.5
    var e = println("$st $str $a $b $c $d")


    var q :Any= a+b+c+d
    println(q)
    println(b == c.toInt())


    val bc = true
    if(!bc){
        println("true")
    }else{
        println("false")
    }


    var sd : Any = -3
    when(sd){

      true -> println( "hey it is greater")
        else->println( "hey it is smaller")


    }


    var we = "Hi my name is Vishwanath Patil"
    println(we.substring(13..17))

    val flaaat :Float = 3.5f
    println(flaaat)
var inter =0
    inter = flaaat.toInt()
    println(inter)



}