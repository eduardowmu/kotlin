package br.edu.kotlin.main

fun main() {
    for(i in 1..10) {
        print("$i ")
    }
    println("")

    /*Varredura de 2 em 2*/
    for(i in 0..10 step 2) {
        print("$i ")
    }
    println("")

    /*DownTo*/
    for(i in 10 downTo 1) {
        print("$i ")
    }
}