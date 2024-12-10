package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

class Ej1KtTest {

    @Test
    fun calcularIVAGeneral2012EnAdelante() {
       val preu = 100.0
        val tipusIVA = "Iva General"
        val dataInici = LocalDate.parse("2013-01-01").toString()

        val resultat = calcularIVA(preu, tipusIVA, dataInici)
        assertEquals(121.0, resultat)
    }

    @Test
    fun calcularIVAReduit1992Hasta1993() {
        val preu = 1972.0
        val tipusIVA = "Iva Reduit"
        val dataInici = LocalDate.parse("1992-10-26").toString()

        val resultat = calcularIVA(preu, tipusIVA, dataInici)
        assertEquals(3155.2000000000003, resultat)
    }

    @Test
    fun calcularIVASuperreduit2011() {
        val preu = 52.32
        val tipusIVA = "Iva SuperReduit"
        val dataInici = LocalDate.parse("2011-10-26").toString()

        val resultat = calcularIVA(preu, tipusIVA, dataInici)
        assertEquals(73.24799999999999, resultat)
    }
}