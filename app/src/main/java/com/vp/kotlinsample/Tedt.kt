package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 29/07/20.
 */

class OOPP{
    var name : String = "Koltin"
    var year : Int = 2016

//    fun getNameInUpperCase() : String{
//      return name.toUpperCase()
//    }

    fun getNameInUpperCase(lang : String,b:Boolean) = lang.toUpperCase()





}

fun main() {
    var lang = OOPP()
    println("${lang.name}===${lang.year}")
    lang.name = "java"
    lang.year = 1993
    println("${lang.name}===${lang.year}")

    println(lang.getNameInUpperCase("python",true))
    //println("${lang.name}===${lang.year}")
}