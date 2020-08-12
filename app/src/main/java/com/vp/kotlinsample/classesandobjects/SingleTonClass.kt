package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 12/08/20.
 */

object StudentMapper{

    var sd : Int = 0

    fun displayName (): () -> String = {
        sd = 1
        "Vishwanath" + " Patil"}

}