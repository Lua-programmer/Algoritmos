package org.example.cap_1

fun List<Int>.buscaBinaria(valor: Int): Int {
    var inicio = 0
    var fim = size - 1

    while (inicio <= fim) {
        val meio = (inicio + fim) / 2
        val valorMeio = get(meio)

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
    val array = listOf(1,3,5,7,9)
    val valor = 5
    val posicao = array.buscaBinaria(valor)
    println("O valor $valor está na posição $posicao")
}