package com.cursosandroidant.kotlinbasics

// error, no se puede ni instanciar esta clase al ser private
open private class Task(val name: String, private val number: Short) {
    open fun doSomething(): String{
        return "tareas..."
    }
}