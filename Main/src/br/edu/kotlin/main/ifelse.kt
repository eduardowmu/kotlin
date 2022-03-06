package br.edu.kotlin.main

fun isOver18(age: Int): String {
    return if (age > 17) {
        "Voto obrigatorio"
    } else if((age > 15 && age < 18) || age > 60) {
        "Voto facultativo"
    } else {
        "Voto proibido"
    }
}

fun main() {
    println(isOver18(10))
    println(isOver18(17))
    println(isOver18(30))
}