package com.shenyy.javabasicexercise.Kotlin

object ServiceLocator{
    fun getEngine():Engine = Engine()
}

class Engine(private val brand:String = "BMW"){
    fun start(){
        println("$brand start!")
    }
}

class Vehicle{
    private val engine = ServiceLocator.getEngine()
    fun start(){
        engine.start()
    }
}