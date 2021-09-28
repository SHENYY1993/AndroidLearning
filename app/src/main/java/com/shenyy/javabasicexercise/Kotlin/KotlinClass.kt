package com.shenyy.javabasicexercise.Kotlin

class KotlinClass {
    /*****10.2类和伴侣对象*****/
    /*
    * Java中的类
    * 1.类像是一个容器，把变量、函数都封装在里面
    * 2.通过类的构造方法实例对象
    *
    * Kotlin中的类
    * 1.所有东西都是对象
    * 2.变量、函数不一定需要类
    * 3.不需要通过类来实例对象
    * 4.没有new关键字
    *
    * 类用来管理集合
    * */

    /*伴侣对象 伴生对象
    * 1.Kotlin没有使用static成员的概念（因为Kotlin有自己的用于描述单例状态相关的属性和函数的object概念）
    * 2.与Java的静态方法一样，这些函数可以从应用程序的任何位置调用，而不必创建它们类的实例
    * 3.Kotlin成员函数默认是public
    * 4.一个类的伴生对象只能有一个
    * */
    companion object{
        fun sayHello(name:String){
            println("Hey guys! My name is $name!")
        }
    }
}