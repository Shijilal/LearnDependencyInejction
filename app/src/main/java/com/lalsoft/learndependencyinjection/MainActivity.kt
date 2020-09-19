package com.lalsoft.learndependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var first: First
    lateinit var second: Second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the classes
        second = Second()
        first = First(second)


        // Getting the functions inside the classes
        println(first.doAThing())
        println(first.doSomeOtherThing())

    }
}

class First(
        private val second: Second
) {
    fun doAThing(): String {
        return "Look i did a thing!!"
    }
    fun doSomeOtherThing():String{
        return second.doSomeOtherThing()
    }
}

class Second() {
    fun doSomeOtherThing(): String {
        return "Look i did some other thing!!"
    }
}