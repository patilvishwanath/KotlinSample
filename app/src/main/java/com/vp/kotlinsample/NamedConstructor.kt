package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 29/07/20.
 */

class Books(val name : String, val year : String, val author : String, val price : Double = 200.5 ){

    var publisherName : String = "Unkown"
    init {
        println("hey this is Books constructor")
    }

    constructor(name : String,  year : String,  author : String,  price : Double ,_publisherName : String) : this(name,year,author,price) {
        publisherName = _publisherName
    }



    infix fun display(name : String){
        println("hey this is display() $name $year")
    }
    override fun toString(): String {
        return ("$author has publised book $name in year $year at this ₹$price and publication house is $publisherName" )
    }



}

fun main() {
    val ab = Books("VP","1990","vishu",190.00)
    val abc = Books("SP","2019","sush",180.00,"Penguin Publication")
//    val ef = Books(name = "SP",author = "Suchila",year = "1967")
//    ab.display("Vishwa")
//    ab.display("kedar",year="1990")

    ab display "KP"
    println(ab)
    println(abc)

  //  println(cd.toString())
//    println(ef.toString())
}