package com.cursosandroidant.kotlinbasics

fun main(){
    newTopic("POO")
    subTopic("Class")
    println(School())

    // Constructor
    subTopic("Constructor")
    val school = School("Harv", "Calle Principal #14")
    println(school)

    // Override/sobreescritura
    subTopic("Override")
    val schoolInactive = School("Harv", "Calle Principal #14", false)
    println(schoolInactive)

    // this
    subTopic("this")
    val highSchool = School("Stan", "Independencia #232", mutableListOf(Person("Jose", "Rodriguez")))
    println(highSchool)

    // properties and methods
    subTopic("metodos y propiedades")
    val person = Person("Juan", "José")
    println(person.getFullName())
    println(person.showWork())
    println(person.salary)
    person.salary = 10000f
    println(person.salary)


    // set y get
    subTopic(" set & get")
    person.tax = 20f
    println(person.salary)

    // herencia
    subTopic("herencia")
    val teacher = Teacher("Aldo", "Benítez", 15)
    highSchool.staff.add(teacher)
    println(highSchool)
    val admin = Admin("Gerardo", "Torres", 1)
    highSchool.staff.add(admin)
    println(highSchool)

    //super
    subTopic("super")
    println("Admin: ${admin.showWork()}")
    println("Teacher: ${teacher.showWork()}")

    //visibilidad o encapsulación
    subTopic("visibilidad")
    println(teacher.firstName)
    //println(teacher.lastName)

    // Companion object
    subTopic("Companion object")
    println(School.ACTIVE)
    val schoolActive = School("OXf", "calle Roma #421", School.ACTIVE)
    println(schoolActive)

    // Enum
    subTopic("Enum")
    schoolActive.setType(TypeSchool.STATE)
    println(schoolActive.getType())

    // Nested class
    subTopic("Nested class")
    println(teacher.classroom)
    teacher.classroom.key = "4ªA"
    println(teacher.classroom)

    // Inner class
    subTopic("Inner class")
    println(teacher.classroom.getInfo())

    // Interface
    subTopic("Interface")
    teacher.salary = 10000f
    val boss: Boss = teacher
    println(boss.namePerson())
    println(boss.netSalary())

    // Data class
    subTopic("Data class")
    println("la escuela activa es $schoolActive")
    println(schoolActive.component1())//los components del data class son los atributos de la clase
    println(schoolActive.component2())
    val schoolCopy = schoolActive.copy()
    schoolCopy.name = "Ford"
    println(schoolCopy) // copia de la instancia
    // equal & hashcode
    subTopic("equal & hashcode")
    schoolActive.numCode = "356"
    schoolCopy.numCode = "357"
    println(schoolActive.equals(schoolCopy)) //evaluar objeto, si es igual

}