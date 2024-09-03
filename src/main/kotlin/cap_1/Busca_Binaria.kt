package org.example.cap_1

fun buscaBinaria(array: IntArray, valor: Int): Int {
    var inicio = 0
    var fim = array.size - 1

    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        val valorMeio = array[meio]

        if (valorMeio == valor) {
            return meio
        } else if (valorMeio < valor) {
            inicio = meio + 1
        } else {
            fim = meio - 1
        }
    }

    return -1
}

fun cap1() {
    println("Capítulo 1")
    println("Busca Binária")
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val valor = 5
    val posicao = buscaBinaria(array, valor)
    println("O valor $valor está na posição $posicao")
}