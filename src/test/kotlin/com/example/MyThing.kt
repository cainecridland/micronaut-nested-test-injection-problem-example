package com.example

import jakarta.inject.Singleton

interface MyThing {
    fun helloWorld()
}

@Singleton
class MyImplementationOfMyThing(): MyThing {
    override fun helloWorld() {
        println("hello world")
    }
}