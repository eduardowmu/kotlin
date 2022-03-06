package br.edu.kotlin.main

fun showLength(len: Int) = len;

fun main() {
    val nome = """Eduardo
        |Watanabe
        |Murakoshi
    """.trimMargin()

    println("Tamanho do nome vale ${showLength(nome.length)}")
}