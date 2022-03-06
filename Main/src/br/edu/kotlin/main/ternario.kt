package br.edu.kotlin.main

fun isOver18Age(age: Int): Boolean {
    return if (age > 17) {
        true
    } else {
        false
    }
}

fun main() {
    println(isOver18Age(10))
    println(isOver18Age(17))
    println(isOver18Age(30))
}