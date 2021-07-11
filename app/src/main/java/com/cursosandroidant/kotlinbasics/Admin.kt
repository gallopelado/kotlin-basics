package com.cursosandroidant.kotlinbasics

class Admin(firstName: String, lastName:String, val officeNumber: Short) : Person(firstName, lastName){
    override fun showWork(): String {
        return "Agendando... \n${super.showWork()}\n en la oficia ${this.officeNumber}"
    }
}