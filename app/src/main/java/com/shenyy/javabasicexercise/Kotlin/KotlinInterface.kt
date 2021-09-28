package com.shenyy.javabasicexercise.Kotlin

interface USB {
    fun enable()
    fun close()
    val derivedName:String
        get()= "USB"

    private fun commonFun(){

    }
}


//接口和抽象类一样不能直接使用，需用实现类（子类）来实现
class Mouse:USB{
    override val derivedName :String
        get() = "Mouse"

    override fun enable() {
        println("Mouse inserted")
    }

    override fun close() {
        println("Unplugged the Mouse")
    }
}

class Keyboard:USB{
    override val derivedName :String
        get() = "Keyboard"

    override fun enable() {
        println("Keyboard inserted")
    }

    override fun close() {
        println("Unplugged the Keyboard")
    }
}

class Computer{
    fun bootUp(){
        println("Computer boot up")
    }
    fun shutDown(){
        println("Computer shut down")
    }
    fun useEquipment(usb:USB){
        usb.enable()
        usb.close()
    }
}