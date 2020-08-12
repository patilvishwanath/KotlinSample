package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 12/08/20.
 */
/*For Sealed Classes its SubClasses must be in the same file*/
sealed class FirstSealed
class Add(val value: Int) : FirstSealed()
class Subtract(val value: Int) : FirstSealed()
class Multiply(val value: Int) : FirstSealed()
data class Person(val name : String,val email :String) : FirstSealed()

fun execute(x: Int, op: FirstSealed): Int = when (op) {
    is Add -> x + op.value
    is Subtract -> x - op.value
    is Multiply -> x * op.value
    is Person -> {  println("Hey this is Peron")
        10
    }


    // is FirstSealed.Divide -> x / op.value

}


fun main() {
    println(execute(2, op = Person(email = "test@gmail.com",name = "Test")))
}