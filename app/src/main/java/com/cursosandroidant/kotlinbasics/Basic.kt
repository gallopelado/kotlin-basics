package com.cursosandroidant.kotlinbasics

// variable global
var username = "Ju"
// constante
const val SPECIES = "Human" // Ya sabe que se va utilizar, no se reserva
const val SEPARATOR = "========================="
fun main() {
    var age = 29
    val name = "Juan"
    val job = "Developer"
    println("-----LECCION VARIABLES-----")
    leccionVariables()

    println("-----LECCION STRING TEMPLATES-----")
    leccionStringTemplates()

    println("-----FUNCIONES-----")
    // funciones
    basic()
    arguments(name)
    println(returnData())

    println("-----SOBRECARGA-----")
    // sobrecarga de métodos
    overload(age)
    overload(job)
}

fun leccionStringTemplates(){
    // String templates
    val name: String = "Juan"
    println("My name is $name")
    println("My username is $username")
    println("I'm ${SPECIES}")
}

fun leccionTiposDeDatos() {
    // tipos de datos
    // Char solamente admite un valor en comilla simple
    val char: Char = 'a'
    val char2: Char = 'j'
    println("Datos tipo Char: $char, $char2")

    // tipo String
    val string: String = "ju"
    println("Dato tipo String: $string")

    // tipo Boolean
    val boolean: Boolean = true
    println("Dato tipo Boolean: $boolean")

    // Tipos de datos numéricos
    // 8 bits -128 to 127
    val jobs: Byte = 120
    // 16 bits -32768 to 32767
    val workedDays: Short = 32000
    // 32 bits -2.147.483.648 to 2.147.483.674
    val workedMinute: Int = 2000000
    //64 bits
    val workedInMilliseconds: Long = ((workedMinute * jobs).toLong())
    // 32 bits
    val height: Float = 1.75f
    // float
    val heightDouble: Double = 1.7533333333333333333333
}

fun leccionVariables() {
    println("Hola Juan")

    // variable
    var age = 29
    println(age)
    val name = "Juan"
    println(name)

    // Otras formas de asignar variables
    var job: String
    job = "Developer"
    println(job)

    val language: String // reserva un espacio en memoria
    language = "Kotlin"
    println(language)

    // variable global
    println(username)

    // constante
    println(SPECIES)
}

fun overload(job: String) {
    println("Mi trabajo es $job")
}

fun overload(age: Int) {
    println("Mi edad es $age")
}

fun returnData(): String {
    return "Datos retornados"
}

fun arguments(name: String) {
    println("Name is $name")
}

fun basic(){
    println("Hi")
}

fun newTopic(topic: String){
    print("\n$SEPARATOR $topic $SEPARATOR\n")
}

fun subTopic(subTopic: String){
    print("\n$SEPARATOR $subTopic\n")
}