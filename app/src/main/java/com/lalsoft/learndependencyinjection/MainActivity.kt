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
        someClass = SomeClass()
        someOtherClass = SomeOtherClass()

        // Getting the functions inside the classes
        println(someClass.doAThing())
        println(someOtherClass.doSomeOtherThing())

    }
}

class SomeClass() {
    fun doAThing(): String {
        return "Look i did a thing!!"
    }
}

class SomeOtherClass() {
    fun doSomeOtherThing(): String {
        return "Look i did some other thing!!"
    }
}