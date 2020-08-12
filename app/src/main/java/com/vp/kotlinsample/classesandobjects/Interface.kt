package com.vp.kotlinsample.classesandobjects

import com.vp.kotlinsample.classesandobjects.IClickListener as IClickListener1

/**
 * Created by Vishwanath Patil on 31/07/20.
 */

interface IClickListener{
    fun OnClick(postion:Int, item : Any)

    fun display()

    var intvalue : Int

    fun show(){
        println("Hey this is IClickListener show")
    }

    fun drive()



}

interface Driveable{
    val publicInt : Int
        get() = 10


    fun drive()

    fun show(){
        println("Hey this is Driveable show")
    }

}

interface Action{
    fun act()
}

abstract class ImplementInterface : IClickListener1 {


    override final fun OnClick(postion: Int, item: Any) {
        println("Hey this is OnClick $postion===$item")
    }



}

class SubClass : ImplementInterface(),
    Driveable {

//    override fun OnClick(postion: Int, item: Any) {
//        super.OnClick(postion, item)
//
//    }

    override val publicInt: Int = super.publicInt+10
      //  get() = super.publicInt + 1

    override fun display() {
       println("This is display() in SubClass")
    }

    override var intvalue: Int = 11
    override fun drive() {

        println("This is drive() in SubClass")
    }

    override fun show() {
super<Driveable>.show()
        super<ImplementInterface>.show()
    }


}

class SClass : Driveable {
    override fun drive() {

    }

}


fun main() {

    val t = SubClass()

    println(t)
//    t.display()
//    t.OnClick(10,"VP")
    t.drive()
    t.show()
    println(t.intvalue)
  //  println(t.publicInt)

    val a = SClass()
   

}