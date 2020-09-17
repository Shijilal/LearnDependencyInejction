package com.lalsoft.learndependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class SomeClass(){
    fun doAThing():String{
        return "Look i did a thing!!"
    }
}

class SomeOtherClass(){
    fun doSomeOtherThing():String{
        return "Look i did some other thing!!"
    }
}