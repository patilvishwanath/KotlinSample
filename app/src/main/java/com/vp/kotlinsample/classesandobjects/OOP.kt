package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 29/07/20.
 */
class Book (val name : String, val author : String,val year : String,var isBorrowed : Boolean) {

    fun printBook(){
        if(isBorrowed) {
            println("$name, whose author is $author published in $year is Borrowed ")
        }else{
            println("$name, whose author is $author published in $year is in library ")
        }
    }

}

fun main(){
    val lordOfRings = Book(
        "Lord Of Rings",
        "J.K.Rowling",
        "1990",
        true
    )
    val threeMistakes = Book(
        "Three Mistakes",
        "Chetan Bhagat",
        "2005",
        false
    )

    lordOfRings.printBook()
    threeMistakes.printBook()

}