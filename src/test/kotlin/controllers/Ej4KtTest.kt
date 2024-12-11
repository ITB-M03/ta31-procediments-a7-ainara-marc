package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Ej4KtTest {

    @Test
    fun testTitolCentrado() {
        val titulo = "Hola"
        val resultado = titol(titulo)
        val expected = "                                      Hola                                      "
        assertEquals(expected, resultado)
    }

    @Test
    fun testTitolCentrado2() {
        val titulo = "electroencefalografista"
        val resultado = titol(titulo)
        val expected = "                             electroencefalografista                            "
        assertEquals(expected, resultado)
    }


    @Test
    fun testTitolVacio() {
        val titulo = ""
        val resultado = titol(titulo)
        val expected = "                                                                                "
            assertEquals(expected, resultado)
    }
}

