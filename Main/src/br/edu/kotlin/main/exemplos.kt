package br.edu.kotlin.main

fun main() {
    var str = "eduardo"
    println(str.capitalize())
    str = str.capitalize()
    println(str.decapitalize())
    println(str.contains("ardo"))
    println(str.startsWith("e", ignoreCase = true))

    /*declaração de listas*/
    val lista = arrayOf(1, 5, 6, 7, "Eduardo")
    lista.forEach { valor -> println(valor) }
}