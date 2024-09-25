package cap_3

import org.example.cap_3.contagemRegressiva
import org.example.cap_3.saudar
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class RecursaoKtTest {

    @Test
    fun `Contagem Regressiva`() {
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out

        System.setOut(printStream)

        contagemRegressiva(3)

        System.setOut(originalOut)

        val output = outputStream.toString().trim().split("\n")

        val expectedOutput = listOf("3", "2", "1", "Fogo!")
        assertEquals(expectedOutput, output)
    }
}