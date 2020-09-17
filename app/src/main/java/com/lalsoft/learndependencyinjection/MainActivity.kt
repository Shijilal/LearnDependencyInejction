package com.lalsoft.learndependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var someClass: SomeClass
    lateinit var someOtherClass: SomeOtherClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the classes
        someOtherClass = SomeOtherClass()
        someClass = SomeClass(someOtherClass)


        // Getting the functions inside the classes
        println(someClass.doAThing())
        println(someClass.doSomeOtherThing())

    }
}

class SomeClass(
        private val someOtherClass: SomeOtherClass
) {
    fun doAThing(): String {
        return "Look i did a thing!!"
    }
    fun doSomeOtherThing():String{
        return someOtherClass.doSomeOtherThing()
    }
}

class SomeOtherClass() {
    fun doSomeOtherThing(): String {
        return "Look i did some other thing!!"
    }
}