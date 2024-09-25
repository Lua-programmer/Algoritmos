package org.example.cap_3

fun contagemRegressiva(n: Int) {
    if (n == 0) {
        println("Fogo!")
    } else {
        println(n)
        contagemRegressiva(n - 1)
    }
}

fun saudar(nome: String) {
    println("Olá, $nome!")
    saudar2(nome)
    println("Me preparando para dizer tchau...")
    tchau()
}

fun tchau() = println("Tchau!")

fun saudar2(nome: String) = println("Como vai, $nome?")

fun fact(n: Int): Int = when(n) {
    1 -> 1
    else -> n * fact(n - 1)
}

fun main() {
    contagemRegressiva(3)
    saudar("Alice")
    println(fact(3))
}