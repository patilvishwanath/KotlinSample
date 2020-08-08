package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 28/07/20.
 */

fun main() {

    for(char in "Ilovekoltin"){
        println(char)
    }

    println("Please enter some data")
    val readData = readLine()!!
    val stringArray = readData.split(",")
    println("${stringArray[0].toInt()},${stringArray[1].toInt()},${stringArray[2].toInt()}")
    addNumbers(stringArray[0].toInt(),stringArray[1].toInt(),stringArray[2].toInt())
//    checkForVowel(readData?.toCharArray())
// checkForEven(readData.toInt())
//    println("Please enter char to find")
//   val chrData = readLine()!!
//   checkForFrequency(readData,chrData[0])


}

fun addNumbers(toInt: Int, toInt1: Int, toInt2: Int) {
    println(toInt+toInt1+toInt2)
}

fun checkForFrequency(readData: String, chrData: Char) {
   var freq = 0;
    for(i in 1..readData.length-1){
     if(chrData == readData[i]){
         ++freq
     }
    }

    println(freq)


}

fun checkForEven(toInt: Int) {
    if(toInt % 2 == 0){
        println("Even")
    }else{
        println("Odd")
    }
}

fun checkForVowel(readData: CharArray?) {

    when(readData?.get(0)){
        'a','e','i','o','u'-> println("${readData[0]} is a vowel")
        else -> println("${readData?.get(0)} is a consontant")
    }

}
