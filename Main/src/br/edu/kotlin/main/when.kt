package br.edu.kotlin.main

fun isOverAge(age: Int): String {
    return when {
        age in 0..15 -> "Voto proibido"
        age in 16..17 || age > 64 -> "Voto facultativo"
        else -> "Voto obrigatorio"
    }
}

fun main() {
    println(isOverAge(10))
    println(isOverAge(17))
    println(isOverAge(30))
    println(isOverAge(70))
}