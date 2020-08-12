package com.vp.kotlinsample.classesandobjects
import com.vp.kotlinsample.classesandobjects.FirstSealed

/**
 * Created by Vishwanath Patil on 12/08/20.
 */

/*1. The primary constructor needs to have at least one parameter;
2. All primary constructor parameters need to be marked as val or var;
3. Data classes cannot be abstract, open, sealed or inner;
4. (before 1.1) Data classes may only implement interfaces.
5. https://medium.com/@shashankmohabia/kotlin-data-classes-de75e6dcc2d5 */

data class User(val name : String,val email :String,val players:Int = 5) : Sport(players)  {
    override fun displayPlayers(): Int {
        return players;
    }

    //For this property there will be no equals()/ hashcode() or toString()
    val mobileNo : String = "123456789"

}


fun main() {
    val df = User("VP","vp@g.com",10)
    println(df.displayPlayers())
    println(df.toString())

    //Creating a object thereby calling parameterized constructor
    val sf = User("CP","cp@g.com")
    println(sf.toString())
    val (name, email) = sf
    println()
    println("$name $email")


    val smaplePair : Pair<Double,String> = Pair(10.22,"test")
    val tedtPair : Pair<Double,String> = Pair(10.22,"test")
    val copyPari = smaplePair.copy()
    var sampleTriple :Triple<Double,String,Array<Int>> = Triple(10.33,"Dec", arrayOf(1,2,3,4,5))
    println(smaplePair.hashCode())
    println(tedtPair.hashCode())
    println()
    println(smaplePair.hashCode())
    println(tedtPair.hashCode())

    val a = "Vishwanath"
    val b = "Vishwanath"
    val c = 1
    val d = 2
    println("String check")
    println(a.equals(b))
    println(c.equals(d))

    val e = Integer(10)
    val f = Integer(10)

    println("Int check")
    println(e == f)
    println(e.equals(f))
    println(c === d)
    println("${e.hashCode()}===${f.hashCode()}")
    /*1. === checks reference
    * 2.\for primitive data types like (Int, String) === behaves as ==*/

}