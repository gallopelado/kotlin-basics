package com.cursosandroidant.kotlinbasics

import java.time.LocalDate

class Libro: Biblioteca {
    private var titulo: String = ""
    private var ISBN: String = ""
    private var autor: String = ""
    private lateinit var fechaPublicacion: LocalDate
    private lateinit var editorial: String

    constructor(titulo: String, ISBN: String, autor: String, id: Int, nombreBiblio: String){
        this.titulo = titulo
        this.ISBN = ISBN
        this.autor = autor
        super.setIdBiblioteca(id)
        super.setNombreBiblioteca(nombreBiblio)
    }

    fun getTitulo(): String = titulo
    fun setTitulo(titulo: String){
        this.titulo=titulo
    }
    fun getISBN(): String = ISBN
    fun setISBN(ISBN: String){
        this.ISBN = ISBN.uppercase()
    }
    fun getAutor(): String = autor
    fun setAutor(autor: String){
        this.autor = autor
    }
    fun getFechaPublicacion(): LocalDate = fechaPublicacion
    fun setFechaPublicacion(fecha: LocalDate){
        this.fechaPublicacion = fecha
    }
    fun getEditorial(): String = editorial
    fun setEditorial(editorial: String){
        this.editorial = editorial
    }

    override fun toString(): String {
        return "Libro: $titulo, Autor: $autor, ISBN: $ISBN, Biblioteca: ${super.getNombreBiblioteca()}"
    }
}