package com.vp.kotlinsample.codingchallenge

/**
 * Created by Vishwanath Patil on 31/07/20.
 */

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(
    val title: String,
    val genere: String,
    val year: String,
    var isborrowed: Boolean

) : Lendable {

    override fun borrow() {
        if (isborrowed) {
            println("$title is lent out to somebody")
        } else {
            println("$title is available in library")
            isborrowed = true
        }
    }

    abstract fun copy(): InventoryItem

}

class BookName(
   val authorName: String, title: String,
    genere: String,
    year: String
) : InventoryItem(
    title,
    genere,
    year,
false){

    fun read(){
        println("Reading book $title by $authorName")
    }

    override fun copy(): InventoryItem {
        val copy = BookName(
            title,
            authorName,
            genere,
            year
        )
        copy.isborrowed = this.isborrowed

        return copy
    }

}

class DVD(
    val seconds: String, title: String,
    genere: String,
    year: String
) : InventoryItem(
    title,
    genere,
    year,
    false){

    fun read(){
        println("Watching DVD $title of $seconds seconds")
    }

    override fun copy(): InventoryItem {
        val copy =
            DVD(title, seconds, genere, year)
        copy.isborrowed = this.isborrowed

        return copy
    }

}

fun main() {
    val re = BookName(
        "VP",
        "Lord of Rings",
        "comdey",
        "1996"
    )
   // re.borrow()
    re.borrow()

    val rf = re.copy()
    rf.borrow()


}