package com.cursosandroidant.kotlinbasics

fun main(){
    //Tarea
    subTopic("Tarea Kotlin Advance")
    var num: Any?
    num = 5.0
    safeTask(num)
    num = null
    safeTask(num)
    num = "J"
    safeTask(num)
}

fun safeTask(num: Any?) {
    try {
        if(num != null && num != "J" && num == 5.0){
            println("num: $num")
        }
    } catch (e: Exception){
        println(e)
    }
}