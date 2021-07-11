package com.cursosandroidant.kotlinbasics

// Herencia con :(dos puntos)
// Implementación de interface con ,(coma)
class Teacher(firstName: String, lastName:String, var students: Short)
    : Person(firstName, lastName)
    , Boss {

    var classroom: Classroom = Classroom("N/A")

    override fun showWork(): String {
        return super.showWork() + "\nDando clases..."
    }

    // clase anidada, para inner se agrega
    // al ser inner automáticamente podremos utilizar la clase padre "Teacher"
    inner class Classroom(var key:String){
        override fun toString(): String {
            return "Classroom $key"
        }
        fun getInfo():String = "Classroom $key with Teacher $firstName and students $students"
    }

    override fun namePerson(): String = super.getFullName()

    override fun netSalary(): Float = super.salary

}