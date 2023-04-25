package com.study.brown

interface I1 {
    fun calc(){
        println("I1 called")
    }
}

interface I2 {
    fun calc(){
        println("I2 called")
    }
}

class MyClass: I1, I2 {
    override fun calc() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val i1: I1 = MyClass()
    val i2: I2 = MyClass()

    i1.calc()
    i2.calc()
}