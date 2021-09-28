package com.shenyy.javabasicexercise.Kotlin

class Customer constructor(    var name:String = "null",
                               var email:String = "null",
                               var phone:String = "null"){

    fun printInformation(){
        println("customer:$name, email:$email, phone:$phone")
    }
}