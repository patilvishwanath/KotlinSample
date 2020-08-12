package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 13/08/20.
 */
//https://agrawalsuneet.github.io/blogs/object-expression-in-kotlin/
open class Shape() {
    open fun displayShape() {
        println("Hey i am shape")

    }
}

class Rectangle() {
    fun display(s: Shape) {
        //s.displayShape()
        println("Hey this is rectangle")
    }

    fun drawCircle(c:Circle){
        c.draw()
        println("Hey this is rectangle, drawn from circle")
    }

    fun area(i : IInterface){
        i.calculateArea()
        println("Hey this is rectangle, calculate area")

    }}

abstract class Circle{
    abstract fun draw()
}

interface IInterface{
    fun calculateArea()

}
fun main() {
    val a = Rectangle()
    val b = Shape()
   // a.display(b)
    a.display(object : Shape() {
        override fun displayShape() {
            //super.displayShape()
            println("Hey this is 1st obj expression")
        }
    })

    println()
    a.drawCircle(object :Circle(){
        override fun draw() {
            println("Hey this is 1st obj expression via abstract class")
        }

    })
    println()
    a.area(object :IInterface{
        override fun calculateArea() {
            println("Hey this is 1st obj expression via interface")
        }

    })
}