package com.shenyy.javabasicexercise.Kotlin

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.shenyy.javabasicexercise.*
import com.shenyy.javabasicexercise.jump.AActivity


class KotlinActivity : AppCompatActivity(), View.OnClickListener {
    private var mBtnTextView: Button? = null
    private var mBtnButton: Button? = null
    private var mBtnActivity: Button? = null
    private var mBtnLifecycle: Button? = null
    private var mBtnJump: Button? = null

    private var mBtnKotlinTest: Button? = null
    private var mBtnKotlin: Button? = null
    private var mBtnKotlinClass: Button? = null
    private var mBtnAbstract: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.println(Log.INFO, "Tag", "Open the MainActivity")
        mBtnTextView = findViewById(R.id.btn_textview)
        //设置点击事件
        mBtnTextView!!.setOnClickListener(View.OnClickListener { //跳转到TextView演示界面
            val intent = Intent(this@KotlinActivity, TextViewActivity::class.java)
            startActivity(intent)
        })
        mBtnButton = findViewById(R.id.btn_button)
        mBtnButton!!.setOnClickListener(View.OnClickListener { //跳转到Button演示界面
            val intent = Intent(this@KotlinActivity, ButtonActivity::class.java)
            startActivity(intent)
        })
        mBtnActivity = findViewById(R.id.btn_activity)
        mBtnActivity!!.setOnClickListener(View.OnClickListener { //跳转到Button演示界面
            val intent = Intent(this@KotlinActivity, TestActivity::class.java)
            startActivity(intent)
        })
        mBtnLifecycle = findViewById(R.id.btn_lifecycle)
        mBtnLifecycle!!.setOnClickListener(View.OnClickListener { //跳转到Lifecycle演示界面
            val intent = Intent(this@KotlinActivity, LifeCycleActivity::class.java)
            startActivity(intent)
        })
        mBtnJump = findViewById(R.id.btn_jump)
        mBtnJump!!.setOnClickListener(View.OnClickListener { //跳转到AActivity演示界面
            val intent = Intent(this@KotlinActivity, AActivity::class.java)
            startActivity(intent)
        })
        mBtnKotlinTest = findViewById(R.id.btn_kotlin_test)
        mBtnKotlin = findViewById(R.id.btn_kotlin)
        mBtnKotlinClass = findViewById(R.id.btn_kotlin_class)
        mBtnAbstract = findViewById(R.id.btn_abstract)

        //设置点击监听事件
        mBtnKotlinTest!!.setOnClickListener(this)
        mBtnKotlin!!.setOnClickListener(this)
        mBtnKotlinClass!!.setOnClickListener(this)
        mBtnAbstract!!.setOnClickListener(this)
    }

    override fun onBackPressed() {
        //super.onBackPressed();
        val builder = AlertDialog.Builder(this@KotlinActivity)
        builder.setTitle("Mission is executing!").setMessage("Are you sure to quit?").setPositiveButton("YES") { dialog, which -> finish() }.setNegativeButton("NO") { dialog, which -> }.show()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_kotlin_test ->{
//                val myCar = Lamborghini("Lamborghini","BMW")
//                myCar.start()
//                val myVehicle = Vehicle()
//                myVehicle.start()
//                val calculation = Calculation()
//                println(calculation.multiply(2,3))
//                Connection(Host("Kotl.in"),4399).connect()
//                Host("kotl.in").printConnectionString() //错误，该扩展函数在Connection外不可用，需顶层函数才行

//                BaseCaller().call(Base())
//                DerivedCaller().call(Base())
//                BaseCaller().call(Derived())
//                DerivedCaller().call(Derived())

//                val computer = Computer()
//                computer.bootUp()
//                val mouse = Mouse()
//                computer.useEquipment(mouse)
//                val keyBoard = Keyboard()
//                computer.useEquipment(keyBoard)
//                computer.shutDown()

                val generics = KotlinGenerics()
                println(generics.isEquals(1,3))
            }
            R.id.btn_kotlin -> {
                Toast.makeText(this, "Hello Kotlin!", Toast.LENGTH_SHORT).show()
                KotlinMain.kotlinPrint(KotlinMain.getMax(1, 2))
                KotlinMain.kotlinPrint(KotlinMain.getMax(10, 20, 30))
                var arr = intArrayOf(100,200,300,400)
                KotlinMain.kotlinPrint(KotlinMain.getMax(*arr))

                var mKotlin = KotlinMain()
                println(mKotlin.name)
                var mKotlin2 = KotlinMain(email="shenyy@mail.com")
                println(mKotlin2.email)
            }
            R.id.btn_kotlin_class->{
                KotlinClass.sayHello("Tonny")
            }
            R.id.btn_abstract ->{
                var cabin = SquareCabin(10)
                println("\n Square Cabin\n *******")
                println("Building Material: ${cabin.buildingMaterial}")
                println("Capacity: ${cabin.capacity}")
                println("HasRoom: ${cabin.hasRoom()}")

                //with语句表示对该实例对象执行以下所有操作
                with(cabin){
                    println("\n Square Cabin\n *******")
                    println("Building Material: ${buildingMaterial}")
                    println("Capacity: ${capacity}")
                    println("HasRoom: ${hasRoom()}")
                }
            }
        }
    }
}