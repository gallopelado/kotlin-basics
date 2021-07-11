package com.cursosandroidant.kotlinbasics

import kotlin.properties.Delegates

open class Biblioteca {
    private var idBiblioteca by Delegates.notNull<Int>()
    private lateinit var nombreBiblioteca: String

    constructor()
    constructor(idBiblioteca: Biblioteca, nombreBiblioteca: Biblioteca)

    @JvmName("getIdBiblioteca1")
    fun getIdBiblioteca(): Int = idBiblioteca
    @JvmName("setIdBiblioteca1")
    fun setIdBiblioteca(id: Int){
        this.idBiblioteca = id
    }
    fun getNombreBiblioteca(): String = nombreBiblioteca
    fun setNombreBiblioteca(nombre: String){
        this.nombreBiblioteca = nombre
    }
}