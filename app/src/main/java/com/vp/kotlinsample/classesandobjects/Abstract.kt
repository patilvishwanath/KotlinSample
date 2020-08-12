package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 30/07/20.
 */

abstract class Sport(open var numberOfPlayers : Int){

  init {
      println("Total number of players are $numberOfPlayers")
  }

   abstract fun displayPlayers() : Int

   open fun funMethod(){
        println("Hey it is fun")

    }
}

class Cricket( var number : Int) : Sport(number) {


    override fun displayPlayers(): Int {
       println("Total number ofPlayera for cricket are $number")
        return number
    }

    override fun funMethod() {
        println("Hey it is funt to watch cricket")
    }

}

class TableTennis(var number : Int) : Sport(number) {




    override fun displayPlayers() : Int{
        println("Total number ofPlayers for TT are $number")
        return number
    }



}

fun main() {
    val crcik = Cricket(10)
    crcik.displayPlayers()
    crcik.funMethod()

    val tt = TableTennis(2)
    tt.displayPlayers()
    tt.funMethod()



}