package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 04/08/20.
 */
class Generics<D>(vararg text : D) {
    val name : D
    init {
       name = text[0]
        println("$name")
    }
}

class GenericsD<out VI>(text :VI){
    val name : VI
    init {
        name = text
        println("$name")
    }

}

fun main() {
    val n = GenericsD("Hey, it is Vishwanath")

    val np = Generics<Any>(10/10)

    val ar = Generics<Any>(10,20,30)

}