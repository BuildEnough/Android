package com.build.androidlab

import android.R.attr.name


class User(name:String) {
    constructor(name:String, count:Int): this(name) {
        println("constructor(name: ${name}, count: ${count} call...")
    }
    constructor(name:String, count:Int, email: String): this(name) {
        println("constructor(name: ${name}, count: ${count}, email: ${email} call...")
    }
}


fun main() {
    val user1 = User("enough1")
    val user2 = User("enough2", 30)
    val user3 = User("enough3", 30, "enough@google.com")
}