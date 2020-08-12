package com.vp.kotlinsample.controlflow

/**
 * Created by Vishwanath Patil on 28/07/20.
 */

fun main() {


    // printRightAngle(4)

    // printNumberAnlge(4)
    // printHalfPyramid(15)

    // printInverse(5)

//printInverseNumber(14)

    //addNumbers()


    // printFlyodTriangle(5)

    //  printArray()

   // foo()



    leapYear(2016)


}

fun leapYear(year: Int) {
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            // year is divisible by 400, hence the year is a leap year
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false


    println("Leap $leap")

//    if (i % 4 == 0) {
//        if (i % 100 == 0) {
//            if (i % 400 == 0) {
//                println("Leap Year")
//            }
//        }else{
//            println("leap year")
//
//        }
//    } else {
//        println("Not a leap year")
//
//    }
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3)
            return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun printArray() {
    val arr = arrayOf("Vp", 30, "Kp", 26, "SP", 53)
//    for(i in arr.indices){
//        println("$i and ${arr[i]}")
//    }

    for ((index, value) in arr.withIndex()) {
        println("$index and ${value}")
    }
}

fun printFlyodTriangle(num: Int) {
    var temp = 1
    for (i in 1..num) {
        for (j in 1..i) {
            print(" $temp ")
            temp++
        }
        println()
    }

}

fun addNumbers() {
    var sum = 0L
    for (i in 100..100_000L) {
        sum += i
    }
    println(sum)
}

fun printInverseNumber(rows: Int) {
    for (i in rows downTo 1) {
        for (j in 1..i) {
            print("$j ")

        }
        println()
    }

}

fun printInverse(rows: Int) {
    for (i in rows downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

}

fun printHalfPyramid(rows: Int) {
    var start = 'A'

    for (i in 1..rows) {
        //  var v = start
        for (j in 1..i) {
            print("$start ")


        }
        ++start
        println()


    }


}

fun printNumberAnlge(rows: Int) {

    for (i in 1..rows) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }

}

fun printRightAngle(rows: Int) {
    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}
