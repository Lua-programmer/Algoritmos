package cap_2

import org.example.cap_2.buscaMenor
import org.example.cap_2.ordenacaoPorSelecao
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Ordenacao_por_selecaoKtTest {

    @Test
    fun `Ordenação Por Seleção`() {
        val array = arrayListOf(0, 2, 5, 1, 8, 23, 31, 21, 93, 213, 31, 11, 1512, 231, 341, 516, 132, 322, 421, 643)
        val ordenado = arrayListOf(0, 1, 2, 5, 8, 11, 21, 23, 31, 31, 93, 132, 213, 231, 322, 341, 421, 516, 643, 1512)
        assertEquals(ordenado, array.ordenacaoPorSelecao())
    }

    @Test
    fun `Busca Menor indice`() {
        val array = arrayListOf(0, 2, 5, 1, 8, 23, 31, 21, 93, 213, 31, 11, 1512, 231, 341, 516, 132, 322, 421, 643)
        val menor = array.buscaMenor()
        assertEquals(0, menor)
    }
}