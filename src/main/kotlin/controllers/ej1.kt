package controllers

import java.time.LocalDate


enum class IVA(val dataInci: String, val General: Double, val Reduit: Double, val SuperReduit: Double, val Excempt: Double = 0.0){
    IVA1986("01-01-1986", 0.12,0.6, 0.0,0.0),
    IVA1992("01-01-1992", 0.15,0.6, 0.0,0.0),
    IVA1993("01-01-1993", 0.15,0.6, 0.3,0.0),
    IVA1995("01-01-1992", 0.16,0.7, 0.4,0.0),
    IVA2010("01-01-2010", 0.18,0.8, 0.4,0.0),
    IVA2012("15-07-2012", 0.21,0.10, 0.4,0.0)
}
fun main(){
    println(IVA.entries.size)
}
fun calcularIVA(preu: Double, tipusIVA: String, dataInci: String): Double{
    val equivalencias = arrayOf("Iva General", "Iva Reduit", "Iva SuperReduit", "Iva Excempt")
    var preuIva = 0.0
    val data = LocalDate.parse(dataInci)

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