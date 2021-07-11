package com.cursosandroidant.kotlinbasics

fun main(){
    newTopic("Sentencias condicionales")
    subTopic("If")
    if(true) {
        println("Condición exitosa!")
    }

    // equality
    subTopic("Equality")
    if(1 == 1) {
        println("1 es sigual a 1")
    }

    // equals, es exclusivo para las cadenas de texto
    subTopic("Equals")
    val ju = "Juan"
    if(ju.equals("Juan")) {
        println("La cadenas son iguales")
    }

    // operadores lógicos
    subTopic("Logic operators")
    if(1 == 1 || 10 > 9){
        println("La condición es verdadera panchito")
    }

    if(1 == 1 && 2 == 2) {
        println("La condición también es verdadera panchito")
    }

    // uso del when
    subTopic("When")
    val option: String = "Juan"
    when(option){
        "Juan Jose" -> println(option)
        "Juan" -> println(option)
        "Celina" -> println(option)
        else -> println("Hola desconocido")
    }

    // estructura de datos
    newTopic("Collections")
    subTopic("Vararg")
    multiArguments("Juan", "Celina")

    // Arrays
    newTopic("Arrays")
    //array simple
    val array_simple = arrayOf('J', 'u', 'a', 'n')
    println(array_simple[0])
    println(array_simple.get(3))

    //listOf
    subTopic("listOf")
    //val readOnlyList = listOf<String>("Juan", "Celina", "Diana")
    val readOnlyList: List<String> = listOf("Juan", "Celina", "Diana")
    println("readOnlyList: $readOnlyList")
    println(readOnlyList.get(0))

    // mutableListOf
    subTopic("mutableListOf")
    val mutablelist = mutableListOf("Juan", "Celina", "Diana")
    println("mutableListOf: $mutablelist")
    mutablelist.add("José")
    println(mutablelist)
    mutablelist.removeAt(3)
    mutablelist.remove("Juan")
    mutablelist.set(1, "Sandra")//actualizar segun index
    println(mutablelist)

    // map o diccionarios
    subTopic("Map")
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("JU", "Juan")
    mutableMap.put("CE", "Celina")
    mutableMap.put("SA", "Sandra")
    println("Map: $mutableMap")
    println("Get by Key: ${mutableMap.get("SA")}")
    mutableMap.remove("JU")
    mutableMap.set("SA", "Sandra Lopez")
    println("Map: $mutableMap")
    println("Keys: ${mutableMap.keys}, values: ${mutableMap.values}")

    // arrayOfNull
    subTopic("arrayOfNull")
    val nullArray = arrayOfNulls<String>(3)
    nullArray[0] = "Karina"
    nullArray[2] = "Juan"
    println(nullArray[1])


    // methods collections
    subTopic("Metodos en colecciones")
    println(readOnlyList)
    println("Sort: ${readOnlyList.sorted()}")
    println("Reverse: ${readOnlyList.sorted().reversed()}")
    println("IndexOf: ${readOnlyList.indexOf("Juan")}")

    // loops
    newTopic("Bucles")
    loops("Juan", "Celina", "Sandra")
}

fun loops(vararg names: String) {
    // for
    subTopic("for")
    for(i in 1..10 step 2){
        println(i)
    }
    for (i in 0..names.size-1) {
        println("Nombres: ${names.get(i)}")
    }
    for (name in names) {
        println(name)
    }

    // foreach
    subTopic("forEach")
    names.forEach { name -> println(name) }
    (1..5).forEach { num -> println(num) }

    // while
    subTopic("While")
    var index = 0
    while(index < names.size){
        println("Index: $index")
        println("Name at index: ${names[index]}")
        //index = index + 1
        index++
    }

    // returns y breaks
    subTopic("return")
    /*
    (1..5).forEach { num ->
        if(num.equals(3)) return //return@forEach
        println(num)
    }
    */
    subTopic("break")
    for(i in 1..5){
        if(i.equals(3)){
            break
        }
        println(i)
    }

    println("Tarea")
    tareaEstructura()
}

// funciona idéntico al operador spread de Javascript
fun multiArguments(vararg name: String){
    println("vararg en la posicion 0: ${name[0]}, en la posicion 1: ${name[1]}")
}

fun tareaEstructura() {
    val dias = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    dias.forEach { dia ->
        println(dia)
        when(dia){
            "Lunes" -> println("Dia de trabajar")
            "Viernes"-> println("Por fiiin viernes")
        }

    }
}