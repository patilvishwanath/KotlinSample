package com.vp.kotlinsample.varaibles

/**
 * Created by Vishwanath Patil on 08/08/20.
 */

//Top - Level variables
val PI = 3.14
var u = 0

fun incrementX() {
    u += 1
}

fun main() {
    //Single line comment

    /*Multiple
    line
    comment*/

    var firstName = "Vishwanath"
    var lastName = "Patil"

    println(firstName + " " + lastName)//Places cursor on a new line
    print(firstName)
    print(lastName)//Places cursor on the same line

    //var - a.k.a Variables, whose value can be reassigned

    firstName = "Sushila"
    println()//Empty print() to take cursor to new line
    println(firstName)


    /* val - a.k.a Value.
    Read-only local variables are defined using the keyword val.
    They can be assigned a value only once.*/
    val carName = "Hyundai"

    println(carName)

    /*Cannot reassign value.
    carName = "Santro"*/

    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")

    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")


    println("x = $u; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $u; PI = $PI")
}