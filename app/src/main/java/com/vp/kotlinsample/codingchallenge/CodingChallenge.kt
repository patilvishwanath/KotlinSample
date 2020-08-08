package com.vp.kotlinsample.codingchallenge

import kotlin.random.Random

/**
 * Created by Vishwanath Patil on 27/07/20.
 */

fun main() {
    val random = Random.nextInt(50) + 1
    val value = when (random) {
        in 1..10 -> "Hey, $random is in between 1 to 10"
        in 11..20 -> "Hey, $random is in between 11 to 20"
        in 21..30 -> "Hey, $random is in between 21 to 30"
        in 31..40 -> "Hey, $random is in between 31 to 40"
        else -> "Hey, $random is above 40"
    }

    println(value)
}