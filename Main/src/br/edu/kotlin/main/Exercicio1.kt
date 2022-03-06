package br.edu.kotlin.main

/*2 - Crie uma função que recebe uma String e mostre na
tela a quantidade de caracteres. Resultado esperado:
“A String -PARAMETRO- possui X caracteres.” Considere que
PARAMETRO é o nome do parâmetro recebido pela função.*/
fun showLength(text: String) = println("A String text possui ${text.length} caracteres")

fun main() {
    val text = """Crie uma função que recebe 
|                 uma String e retorne a quantidade
|                 de caracteres.""".trimMargin()

    showLength(text)
}