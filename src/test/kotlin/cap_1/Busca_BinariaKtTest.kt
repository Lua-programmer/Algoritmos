package cap_1

import org.example.cap_1.buscaBinaria
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Busca_BinariaKtTest {

    @Test
    fun `Busca Binária`() {
        val array = listOf(1,3,5,7,9)
        val valor = 5
        val posicao = array.buscaBinaria(valor)
        assertEquals(2, posicao)
    }
}