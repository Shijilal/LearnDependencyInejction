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
        first = First()
        second = Second()

        // Getting the functions inside the classes
        println(first.doAThing())
        println(second.doSomeOtherThing())

    }
}

class First() {
    fun doAThing(): String {
        return "Look i did a thing!!"
    }
}

class Second() {
    fun doSomeOtherThing(): String {
        return "Look i did some other thing!!"
    }
}