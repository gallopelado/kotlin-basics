package com.cursosandroidant.kotlinbasics

private var nullStrGlobal:String? = null

private lateinit var lateinitGlobal:String//mas adelante tendrá un valor de forma segura, sólo var
private val lazyGlobal:Any by lazy { "gLazyKotlin" } // para val, solo la primera vez se carga, luego por referencia

fun main() {
    newTopic("Métodos de String I")
    val course = "Kotlin course by Cursos Android ANT"
    val target = "Android"
    println(course.length)
    println(course.compareTo(target))
    println(course.equals(target))
    println(course.contains(target))
    println(course.lowercase())
    println(course.uppercase())
    println(course.subSequence(0, 6))
    println(course.indexOf("n"))//trae la posición de dicho elemento
    val empty = " "
    println(empty.isBlank())
    println(empty.isEmpty())
    println(course.lastIndexOf("n"))//en reversa
    println(course.lowercase().lastIndexOf("n"))
    println(course.replace("n", "k"))
    println(course.replaceBefore("by", "only "))
    println(course.reversed())
    println(course.slice(20..course.length-1))
    println(course.split(" "))
    println(course.startsWith('K'))//comienza con K
    println(course.substring(14, 16))
    println(" Android".trim())

    //nullable ? !!
    newTopic("Null Sub")
    subTopic("?")
    var nullStr: String? = null
    println(nullStr)
    println(nullStrGlobal?.reversed())

    subTopic("!!")
    nullStr = "Hola"
    showMessage(nullStr)
    nullStrGlobal = null//"Android"
    showMessage("Kotlin")

    subTopic("Operador Elvis")
    nullStrGlobal = "Kotlin"
    val elvis = nullStrGlobal
    println("Yo programo en ${elvis ?: "Java"}")


    subTopic("readline")
    print("Inserte un número: ")
    val first = readLine()
    val a = first?.toInt()
    println("a = $a")

    print("Inserte otro número: ")
    val second = readLine()
    val b = first!!.toInt()
    println("b = $b")


    newTopic("Safe Cast")
    subTopic("Smar cast")
    var obj: Any = "Kotlin course"
    //obj = 3
    //println(obj.toString().toInt() * b)
    val objNum:Any = "3t"
    if(objNum is Int){ //se verifica
        println("objNum es un número")
        println(objNum.toString().toInt() * b!!)
    } else {
        println("objNum no es número")
    }

    subTopic("Try-catch-finally")
    obj = 3
    try{
        println(obj.toString().toInt() * b)
        println("obj es un número y esta es la última línea")
    } catch (e: Exception) {
        println(e)
        println("Mensaje personaizado para el error en catch")
    } finally {
        println("Try-catch finalizado")
    }

    subTopic("Unsafe cast")
    obj = "true"
    val unsafestr:String = obj as String
    println(unsafestr)

    subTopic("Safe cast")
    obj = true
    val safestr = obj as? String// no lanza la excepción cuando los tipos son diferentes
    println(safestr)

    subTopic("throw")
    val job = 6//"Designer"
    checkType(job)

    // infix(extension)
    subTopic("infix")
    val name = "Android"
    println(name.uppercase())
    println(name.lowercase())
    println(name.toMixCase(true))

    // lazy & lateinit
    newTopic("Asignación tardía")
    subTopic("lateinit")
    if(setValueForLateinit()){
        println(lateinitGlobal)
        println(lateinitGlobal.toMixCase(true))
    }
    subTopic("lazy")
    println(lazyGlobal)//no reasignable

    // Scope functions
    newTopic("Funciones de alcance")
    val highSchool = School("Stan", "Independencia #232", mutableListOf(Person("Jose", "Rodriguez")))
    val teacher = Teacher("Aldo", "Benítez", 15)
    highSchool.staff.add(teacher)
    println(highSchool)
    val admin = Admin("Gerardo", "Torres", 1)
    highSchool.staff.add(admin)

    // with
    subTopic("With") // CON este objeto, haz algo
    with(highSchool){
        // aquí podremos llamar a todos los métodos de la instancia sin estar repitiendo la instancia
        // para llamar al método
        println("Con este objeto , imprime lo siguiente:")
        println(getType())
        println(toString())
    }

    // apply
    subTopic("apply") // APLICA las siguientes configuraciones o propiedades
    teacher.apply {
        classroom.key = "4ºB"
        salary = 2000f
    }
    println("Valores asignados correctamente con apply:")
    println(teacher.classroom.key)
    println(teacher.salary)

    // run
    subTopic("run") // CORRE(ejecuta) el siguiente bloque...
    highSchool.run {
        println("Ejecuta o corre el siguiente bloque de código en el objeto")
        staff.add(teacher)
        staff.add(admin)
        println("Members: ${staff.size}")
        println(this)
    }

    // let
    subTopic("let") // PERMITE(deja) ejecutar un bloque de código a un objeto no null(verificado con ?)..
    var school: School? = null
    school = createSchool()
    // si la escuela es distinta de null, permite hacer lo siguiente
    school?.let {
        school.staff.add(admin)
        println("Si el objeto es diferente de null, permite imprimirlo: $it")
    }

    // also
    subTopic("also") // Y ADEMÁS... ejecuta el siguiente código...
    val udemy: School
    udemy = School().apply {
        numCode = "458".also {
            println("y también, notifica que el codigo de la escuela nueva es : $it")
        }
    }
}

private fun createSchool(): School? = School("Harv", "Calle Principal #14")//null

private fun setValueForLateinit():Boolean{
    lateinitGlobal = "gLateinitKotlin"
    return lateinitGlobal.isNotEmpty()
}

private infix fun String.toMixCase(firstUpper:Boolean):String{
    var mixString = ""
    var index = 0
    var module = 0

    if(firstUpper){
        this.uppercase()
    } else {
        this.lowercase()
        module = 1
    }

    while (index < this.length){
        if(index % 2 == module){
            mixString += this.get(index).uppercase()
        } else {
            mixString += this.get(index).lowercase()
        }
        index++
    }

    return mixString
}

private fun checkType(value: Any) { //usando any puede ser cualquier tipo
    /*
    if(value is String){
        println("String válido")
    } else {
        throw TypeCastException("No es un String")
    }
    */
    //tarea
    try {
        if(value is String){
            println("String válido")
        } else {
            throw TypeCastException("No es un String")
        }
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Tarea finalizada exitosamente")
    }
}

private fun showMessage(msg: String?){
    println("? ${msg?.get(0)}")

    if(msg != null){
        println("! ${msg.get(0)}")
    }

    if(nullStrGlobal != null){
        println("g!! ${nullStrGlobal!!.get(0)}") //cuidado, esto permite el nullpointerexception
    }
}
