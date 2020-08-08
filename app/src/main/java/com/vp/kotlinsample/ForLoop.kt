package com.vp.kotlinsample

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

    val list = listOf("VP","DP","SP","KP","AP")
    for((vishu,tishu) in list.withIndex()){
        println("$vishu === $tishu")
    }

    for(vpp in list){
       if(vpp != "VP"){
           println(vpp)
       }
    }

}

fun addNumbers() {
    var sum = 0L
    for(i in 100.. 100_000L){
        sum += i
    }
    println(sum)
}

fun printInverseNumber(rows: Int) {
    for (i in rows downTo 1){
        for(j in 1..i){
            print("$j ")

        }
        println()
    }

}

fun printInverse(rows: Int) {
    for(i in rows downTo 1){
        for(j in 1..i){
            print("* ")
        }
        println()
    }

}

fun printHalfPyramid(rows: Int) {
   var start = 'A'

    for(i in 1..rows){
      //  var v = start
        for (j in 1..i){
            print("$start ")


        }
        ++start
        println()


    }


}

fun printNumberAnlge(rows: Int) {

    for (i in 1..rows){
        for(j in 1..i){
            print("$j ")
        }
        println()
    }

}

fun printRightAngle(rows: Int) {
    for(i in 1..rows){
        for(j in 1..i){
            print("* ")
        }
        println()
    }
}
