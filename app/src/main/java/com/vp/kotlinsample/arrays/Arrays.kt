package com.vp.kotlinsample.arrays

/**
 * Created by Vishwanath Patil on 27/07/20.
 */
fun main() {
    var titles = arrayListOf<String>(
        "Brain and Beauty",
        "Men are from Mars",
        "ChanakyaNiti",
        "The Monk who sold ferrari"
    )

    for (book in titles) {
        print(book)
        if (book.contains('e')) {
            for (character in book) {
                println(character + " ")
            }
        }
        println()
    }
//    for (title in titles){
//        if(title.contains('e')){
//            println(title)
//        }
//    }

    var states = arrayOf("Maharashtra", "Karnataka", "Goa", "TamilNadu")
    states.forEach { println(it) }
    states[0] = "Jammu"

    println("")
    states.forEach { println(it) }
    var mix = arrayOf("State", 1, 2, 5.6, true, null)
    println("")
    mix.forEach { println(it) }
    var add = states + arrayOf("India", "Aus", "Srilnak")
    println("")
    add.forEach { println(it) }

    var intArray = intArrayOf(1, 2, 3, 4)
    var inttArray = intArrayOf(5, 6, 7, 8)
    var mixx = intArray + inttArray
    println("")
    mixx.forEach { println(it) }
    println("")
    println("Size of mixx is ${mixx.size}")

    var str = "Udemy"
    println("")
    println("length $str is length ${str.length}")
    str.forEach { println(it) }

    if (mixx.isEmpty()) {
        println("Mixx is empty")
    } else {
        println("Mixx is not empty")
    }

    var subArray = mixx.copyOfRange(2, 6)
    mixx.forEach { print(it) }
    println()
    subArray.forEach { print(it) }
    println()
    subArray = mixx.clone()
    println(subArray.size)
    subArray = mixx.reversedArray()
    subArray.forEach { println(it) }
    var last = mixx.last()
    println("lst value $last")
    println()
    val fixx = states.plusElement("Manipur")
    fixx.forEach { println(it) }

    val numbers = intArrayOf(12, 10, 13, 13, 50)
    var sum = 0.0
    var largest = numbers[0]

    for (s in numbers) {
        sum += s
    }

    val av = sum / numbers.size
    println("Average of numbers is %1f".format(av))

    for (s in numbers) {
        if (s > largest) {
            largest = s
        }
    }
    println("Largest Number is $largest")
    for (s in numbers) {
        if (s < largest) {
            largest = s
        }
    }

    println("Smallest Number is $largest")

    var ss = "Vishwanath"
    var c = ss.toCharArray()
    c[0] = 'B'
    ss = String(c)


    println(ss)


    var list = listOf<String>("Vp", "Kp", "Sp", "VP")
    println(list)
    var ml = mutableListOf<String>("Vp", "SP", "KP", "AP")
    ml.add(0, "VP")
    println(ml)
    ml.removeAt(0)
    println(ml)

    val removed = ml.remove("Vp")
    println(removed)
    println(ml)

    ml = ml.subList(1, 2)
    println(ml)


}