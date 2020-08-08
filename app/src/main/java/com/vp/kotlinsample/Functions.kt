package com.vp.kotlinsample

/**
 * Created by Vishwanath Patil on 28/07/20.
 */
fun main() {
    val list = listOf(1,2,3,4,5,5.5,5,6.5)
    println(reverseList(list))
//    var intArray:IntArray = intArrayOf(1,2,4)
//    paasRange(intArray)
}






fun reverseList(list: List<Any>) : List<Any>{

    val arryList = arrayListOf<Any>();
    for (i in list.size - 1 downTo 0){
        arryList.add(list[i])

    }
    return arryList

}
