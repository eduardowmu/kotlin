package br.edu.kotlin.main
/*para arrays de qualquer tipo, podemos usar a
palavra reservada var arg*/
fun media(vararg notas: Float) {
    if(notas.isNotEmpty()) {
        var soma = 0F
        for(nota in notas) {
            soma += nota
        }
        println("Media = ${soma/notas.size}")
    }
}

fun <T> media(vararg valores: T) {
    valores.forEach { v -> print("$v ") }
}

fun main() {
    media(10.0F, 9.5F, 8F, 7.4F, 10, 15.8, "Eduardo")
}