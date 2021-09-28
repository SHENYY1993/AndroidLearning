package com.shenyy.javabasicexercise.Kotlin

class Calculation(){
    fun addtion(a:Int,b:Int):Int = a + b
    fun subtract(a:Int,b:Int):Int = a - b
}

fun Calculation.multiply(a:Int,b:Int):Int = a * b

fun String.first():String = "$this -- WooHoo!"



open class Shape
class Rectangle :Shape()
fun Shape.getName():String = "shape"
fun Rectangle.getName():String = "rectangle"
fun printClassName(s:Shape):Unit = println(s.getName())


class Host(private val hostName:String){
    fun printHostName():Unit = print(hostName)
}

class Connection(private val host:Host,private val port:Int){
    private fun printPort():Unit = print(port)
    private fun Host.printConnectionString(){//定义Host类的扩展函数，本类使用
        printHostName() //调用Host.printHostName()
        print(":")
        printPort() //调用Connection.printPort()
        toString() //调用Host.toString()扩展接收者优先
        this@Connection.toString()
    }

    fun connect(){
        host.printConnectionString() //调用扩展函数
    }
}



open class Base
class Derived:Base()
open class BaseCaller{
    open fun Base.printFunctionInfo(){
        println("Base extension function in BaseCaller") // 基类的扩展函数在BaseCaller类里
    }

    open fun Derived.printFunctionInfo(){
        println("Derived extension function in BaseCaller") // 自理的扩展函数在BaseCaller类里
    }

    fun call(base:Base){
        base.printFunctionInfo()
    }
}

class DerivedCaller:BaseCaller(){
    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller") // 基类的扩展函数在DerivedCaller类里
    }

    override fun Derived.printFunctionInfo() {
        println("Derived extension function in DerivedCaller") // 自理的扩展函数在DerivedCaller类里
    }
}