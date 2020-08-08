package com.vp.kotlinsample.datatypes

/**
 * Created by Vishwanath Patil on 08/08/20.
 */

fun main() {
    /*In Kotlin,
    everything is an object in the sense that we can call
    member functions and properties on any variable*/

    val oneByte: Byte = 1 // Byte - 8 bits
    println("Byte $oneByte")
    val oneShort : Short = 1 //Short - 16 bits
    println("Short $oneShort")
    val one = 1 // Int 32 bits
    println("Int $one")
    val threeBillion = 3000000000 // Long 64 bits
    println(threeBillion)
    val oneLong = 1L // Long
    println(oneLong)


    val eFloat = 2.7182818284F // Float - 32 bits, actual value is 2.7182817. f or F
    println(eFloat)
    val pi = 3.14 // Double - 64 bits
    println(pi)
    val e = 2.7182818284 // Double
    println(e)


    val a :Int? = 1
    val b : Float? = a?.toFloat()
    println(b)

    val ab : Byte = 125
    val aInt:Int = ab.toInt()
    println(aInt)

    val s = "1.0"
    val d :Double = s.toDouble()//String to Double
    println(d)

    val v = "Vishwanath"
    val c: Char =v.get(0)// v.toCharArray()[1] // v[0];v.get(0)
    println(c)


    //Operations
    val df = 1 + 2.3f // Int + Float => Float
    println(df)

    val sd = 5 /2
    println(sd)
}


