package com.shenyy.javabasicexercise.Kotlin

open class Car(
        private val brand:String = "null",
        private val engine:String = "null"
){
    open fun start(){
        println("Car brand:$brand, Engine:$engine all ready!")
    }
}

class Lamborghini(brand: String, engine: String) : Car(brand, engine) {
    override fun start(){
        super.start()
        println("My car ready!")
    }
}