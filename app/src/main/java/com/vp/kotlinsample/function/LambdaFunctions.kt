package com.vp.kotlinsample.function

/**
 * Created by Vishwanath Patil on 18/08/20.
 */

//    Syntax
//    val a : DataType = {argument_list -> code_body }
//With out annotation
//val a : (Int, Int) -> Int = { a, b -> a+b}
//With annotation
//val a = { a: Int, b: Int -> a + b }
val dfg = {lambdaa : Double ->

   val a = lambdaa * lambdaa
    a.toInt()
}
val ghk = {adqe : Boolean -> if(adqe == true){
    true
}else{
    false
} }

val qwety = { a : Int , b : Int -> a+b}
val a : (Int,String) -> String = { a, b -> a.toString() + b }
val b : (Int,String,Int) -> Pair<Int,Double> = { a,b,c -> Pair((a+b.toInt()+c),2.0) }
val df = { g :Int ->
    when(g){
        in 1..5 -> "yo 1 to 5"
        in 6..7 -> "yo 6 to 7"
        else -> "it is out of range"
    }

}

fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(2.1)
  //  return lambda(4.329)
}


fun main() {


//println(perform("testing",linking = df))
//  println(printName(1,link ))

    val aty = display(shrink = dfg)
    println(aty)

    println(qwety(1,2))
 println(dfg(2.0))



  val (a,b) =  b(1,"2",3)
    println(a)
    println(b)

   // println("Vishu,Patil".splitName())

    println(df(2.1.toInt()))

    println(invokeLambda { avcd -> false })

}



fun printName(name:Int, link:(Int) -> Unit){
     link(name)
}

fun perform(n:String, linking: (String)->Unit){
    linking(n)
}

fun display(shrink : (Double) -> Int) : Int{
   return shrink(4.25)
}
