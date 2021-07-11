package com.cursosandroidant.kotlinbasics
// para usar data class se agrega data antes de class
data class School(var name:String, var address:String, val active: Boolean = true, var numCode: String = "") {

    var staff: MutableList<Person>
    private var typeSchool: TypeSchool = TypeSchool.FEDERAl

    init {
        staff = mutableListOf()
    }
    // Propiedades
    //var name: String = ""

    constructor(): this("", "")

    constructor(name: String, address:String, staff: MutableList<Person>): this(name, address){
        this.staff = staff
    }

    fun getType():String = this.typeSchool.type

    fun setType(type: TypeSchool){
        this.typeSchool = type
    }

    override fun toString(): String {
        if(active){
            return if(staff.size > 0){
                "name: $name at $address, with ${staff.size} members"
            } else {
                "name: $name at $address"
            }

        } else {
            return "Escuela inactiva"
        }

    }

    // generados
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as School

        if (numCode != other.numCode) return false

        return true
    }

    override fun hashCode(): Int {
        return numCode.hashCode()
    }


    companion object {
        const val ACTIVE = true
        const val INACTIVE = false
    }
}