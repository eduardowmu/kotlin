package br.edu.kotlin.main

fun endereco(logradouro: String, cidade: String, estado: String) {
    println("$logradouro, $cidade, $estado")
}

fun main() {
    endereco(cidade = "Mogi das Cruzes",
        estado = "SP",
        logradouro = "Rua Cruzeiro do Sul")
}