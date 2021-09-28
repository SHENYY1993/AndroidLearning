package com.shenyy.javabasicexercise.Kotlin

import android.view.View
import android.widget.Toast

class KotlinMain(
        var name:String = "null",
        var email:String = "null",
        var phone:String = "null") {
    //伴侣对象
    //Kotlin没有使用static成员的概念（因为Kotlin有自己的用于描述单例状态相关的属性和函数的object概念）
    //与Java的静态方法一样，这些函数可以从应用程序的任何位置调用，而不必创建它们类的实例
    //Kotlin成员函数默认是public
    //一个类的伴生对象只能有一个
    companion object {
        fun kotlinPrint(str:String) {
            println(str)
        }

        fun kotlinPrint(num:Int){
            println(num)
            println("\n")
        }

        fun getMax(num1:Int,num2:Int):Int{
            val max = if(num1 > num2) num1 else num2
            return max
        }

        fun getMax(a:Int,b:Int,c:Int):Int{
            return when{
                a>b && a>c ->a
                b>a && b>c ->b
                else ->c
            }
        }

        fun getMax(vararg elements:Int):Int{
            var max = 0
            for(i in elements){
                if(i > max){
                    max = i
                }
            }
            return max
        }
    }
}