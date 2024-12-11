package controllers

import java.time.LocalDate

/**
 * Elements enumerats per tenir el recompte dels canvis del IVA de tots els anys
 * Per afegir un altre només tindriem que afegir una fila més
 * @author Marc Díaz
 * @version 1.1
 */
enum class IVA(val dataInci: String, val General: Double, val Reduit: Double, val SuperReduit: Double, val Excempt: Double = 0.0){
    IVA1986("1986-01-01", 0.12,0.06, 0.0,0.0),
    IVA1992("1992-01-01", 0.15,0.06, 0.0,0.0),
    IVA1993("1993-01-01", 0.15,0.06, 0.03,0.0),
    IVA1995("1995-01-01", 0.16,0.07, 0.04,0.0),
    IVA2010("2010-01-01", 0.18,0.08, 0.04,0.0),
    IVA2012("2012-07-15", 0.21,0.10, 0.04,0.0)
}

/**
 * Función principal para ejecutar el programa
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 */
fun main(){
    println(calcularIVA(1.0, "Iva General", "2013-01-01"))
}

/**
 * Funció para calcular el preu del producte amb l'IVA inclüit
 * Segons el tipus d'IVA que es demani
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 * @param preu el preu del producte sense l'IVA inclòs
 * @param tipusIVA el tipus d'IVA que requereix el producte
 * @param dataInici la data de compra del producte
 * per calcular l'IVA que estava en vigor per aquelles dates
 * @return el preu amb l'IVA inclòs en format decimal
 */
fun calcularIVA(preu: Double, tipusIVA: String, dataInici: String): Double{
    val equivalencias = arrayOf("Iva General", "Iva Reduit", "Iva SuperReduit", "Iva Excempt")
    var preuIva = preu
    val data = LocalDate.parse(dataInici)

    for (iva in IVA.entries){
        if (data>LocalDate.parse(iva.dataInci)){
            when (equivalencias.indexOf(tipusIVA)){
                0 -> preuIva = preu * (1+iva.General)
                1 -> preuIva = preu * (1+iva.Reduit)
                2 -> preuIva = preu * (1+iva.SuperReduit)
                3 -> preuIva = preu * (1+iva.Excempt)
            }
        }
    }
    return preuIva
}