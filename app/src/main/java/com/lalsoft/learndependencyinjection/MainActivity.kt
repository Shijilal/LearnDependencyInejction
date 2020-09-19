package com.lalsoft.learndependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var first: First
    lateinit var second: Second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the classes
        second = Second()


        // Getting the functions inside the classes
        println(first.doAThing())
        println(first.doSomeOtherThing())

    }
}

class First @Inject constructor(
        private val second: Second
) {
    fun doAThing(): String {
        return "Look i did a thing!!"
    }

    fun doSomeOtherThing(): String {
        return second.doSomeOtherThing()
    }
}

class Second @Inject constructor() {
    fun doSomeOtherThing(): String {
        return "Look i did some other thing!!"
    }
}