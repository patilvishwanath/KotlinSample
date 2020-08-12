package com.vp.kotlinsample.classesandobjects

/**
 * Created by Vishwanath Patil on 30/07/20.
 */

//open class Person(open val name : String,open val year : String) {
//    val type = "GeeksForGeeks"
//    init {
//        println("This is Person Class $name $year")
//    }
//
//    fun add(){
//        println("Hey this is add")
//    }
//
//}
//
//class Student( name: String,  year: String, val schoolName: String) :
//    Person(name, year) {
//
//    init {
//
//        println("This is Student Class $name $year $schoolName")
//
//    }
//
//    fun dis(){
//        println(type)
//    }
//
//
//
//}
//
//class Employee(override val name: String, override val year: String, val companyName: String) :
//    Person(name, year) {
//    init {
//        println("This is Employee Class")
//    }
//
//
//}
//
//
//open class Car constructor(open  var name: String , var model: String ) {
//
//
//   open  var year :String = ""
//
//   init {
//
//       println("This is primary const of Class Car and details  $name==$model")
//   }
//
//    constructor(_name: String, _model: String,_year:String) : this(_name,_model) {
//
//        year = _year
//        println("This is secondary const $name==$model==$year")
//    }
//
//    open fun display(){
//        println("This is parent display")
//    }
//
//
//
//
//}
//
//class Hyundai(override var name : String, model :String) : Car(name,model){
//
//    override var year:String = ""
//    init {
//        println("This is primary const of Class Hyundai and details  $name==$model")
//    }
//
//    constructor(name : String,model:String, isAuto:Boolean):this(name,model){
//        year = super.year
//        println("yeae ${super.year}")
//        println("This is secondary const of Hyundai $name==$model==$year==$isAuto")
//    }
//
//
//    override fun display() {
//        super.display()
//        println("This is child display")
//    }
//}

open class Employee(open val _name : String,val _age:String, val _salary : String){



    init {
        println("init Employee :: Hi, I am $_name and age is $_age. and my salary is $_salary")
    }

    fun displayEmployeeData(){
        println("Hi, I am $_name and age is $_age. and my salary is $_salary")
    }

}
class AndDev(override val _name : String, val age: String, val salary: String, val _profession : String ):
    Employee(_name, age, salary){

    init {
        println("init AndDev :: I am $_profession")
    }
    fun displayEmployeeProfess(){
        println("I am $_profession")
    }


}

class iOSDev(_name : String, _age: String,_salary: String, val _profession : String ):
    Employee(_name, _age, _salary){

    fun displayEmployeeProfess(){
        println("I am $_profession")
    }


}

    fun main() {
        // val pratik = Student("Pratik", "1997", "I.E.S")
        //  val vishu = Employee(year = "1990", name = "Vishu", companyName = "TOM")


       // val hy = Car("i20","Hachbstck")
    //    val hyy = Car("i20","Hachbstck","2016")
    //
    //   val hyndai = Hyundai("i10", "sedan",true)


      //  hyndai.display()

    //    val st= Student("Pk","1997","I.E.S")
    //    st.dis()
    //    st.add()

        val and = AndDev(
            "VP",
            "30",
            "10.22",
            "Android Dev"
        )
        and.displayEmployeeData()
        and.displayEmployeeProfess()

    //    val ios = iOSDev("KP","20","12.22","IOS Dev")
    //    ios.displayEmployeeData()
    //    ios.displayEmployeeProfess()


    }