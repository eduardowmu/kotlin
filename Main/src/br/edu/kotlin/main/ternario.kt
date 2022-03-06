package br.edu.kotlin.main

fun main() {
    val valor: Int? = null
    val op: Int = valor ?: 1
    val resp = if(op == 1) true else false
    println(resp)
}