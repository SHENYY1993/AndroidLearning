package com.shenyy.javabasicexercise.Kotlin

abstract class KotlinAbstract {
    //抽象类作为许多子类的父类，是一种模板式的设计模式
    //在Android常用的抽象类主要针对activity和fragment

    //Kotlin中抽象类在顶层定义时只能使用public可见性修饰符

    //抽象类可分为抽象类、抽象方法、抽象属性

    //抽象类不能直接被实例化

    //如果属性的值或函数的实现未知，则将该类抽象化
}

abstract class Dwelling(private var residents:Int){
    abstract val buildingMaterial:String
    abstract val capacity:Int

    fun hasRoom():Boolean{
        return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling(residents){
    override val buildingMaterial: String
        get() = "wood"
    override val capacity: Int
        get() = 5
}

fun test(){
    val dwelling = SquareCabin(8)
    println("\n Square Cabin\n *******")
    println("Building Material: ${dwelling.buildingMaterial}")
    println("Capacity: ${dwelling.capacity}")
    println("HasRoom: ${dwelling.hasRoom()}")
}