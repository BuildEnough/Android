package com.build.androidlab

import android.R.attr.name

open class Super() {
    open var someData = 10
    fun superFun() {
        println("I am super class function: $someData")
    }
}

class Sub: Super() {
    override var someData = 20
    fun someFun() {
        println("I am sub class function: $someData")
    }
}

fun main() {
    val obj = Sub()
    obj.someFun()
}