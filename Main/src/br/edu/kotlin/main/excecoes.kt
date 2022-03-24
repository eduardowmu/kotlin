fun main() {
    try {
        println("abc".toInt())
    } catch(nfe: NumberFormatException) {
        println("Valor inválido para conversão: ${nfe.message}")
    } catch(e: Exception) {
        println("${e.message}")
    }
    finally {
        println("Muito obrigado")
    }
}