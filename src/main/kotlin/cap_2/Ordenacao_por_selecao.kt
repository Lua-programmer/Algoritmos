package org.example.cap_2

fun ArrayList<Int>.ordenacaoPorSelecao(): ArrayList<Int> {
    /***Criação de um Novo ArrayList: Um novo ArrayList<Int> chamado novoArray é criado para armazenar os elementos na ordem correta.***/
    val novoArray = arrayListOf<Int>()

    /***O loop percorre todos os índices do ArrayList original (this).***/
    for (i in indices) {

        /***A função buscaMenor() é chamada para encontrar o menor elemento no ArrayList original (this).***/
        val menor = buscaMenor()
        /***O menor elemento é adicionado ao novo ArrayList (novoArray).***/
        novoArray += this[menor]
        /***O menor elemento é removido do ArrayList original (this).***/
        removeAt(menor)
    }

    /***O novo ArrayList é retornado.***/
    return novoArray
}

fun ArrayList<Int>.buscaMenor(): Int {
    var menor = this[0]
    var menorIndice = 0

    /***O loop percorre todos os elementos do ArrayList.***/
    for (i in 1 until size) /***Se o elemento atual for menor que o menor elemento encontrado até agora, o menor elemento é atualizado e seu índice é armazenado.***/
        if (this[i] < menor) {
            /***O menor elemento é atualizado.***/
        menor = this[i]
        menorIndice = i
    }
    return menorIndice
}


fun cap2() {
    val array = arrayListOf(0, 2, 5, 1, 8, 23, 31, 21, 93, 213, 31, 11, 1512, 231, 341, 516, 132, 322, 421, 643)
    print("sort: ${array.ordenacaoPorSelecao()}")
}