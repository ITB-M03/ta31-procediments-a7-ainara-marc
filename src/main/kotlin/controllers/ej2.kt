package controllers

fun main(){
    println(roman(3999))
}

/**
 * Funcion que pasa de numero entero a romano
 * Usando 2 listas para tener listas las equivalencias
 * @param num Numero que se quiere transformar
 * @return Devuelve un string con el numero romano
 * @author Marc Diaz, Ainara Valdivieso
 * @version 1.0
 */
fun roman(num: Int): String {
    val numeros = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val simbolos = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    var numero = num
    var numeroRomano = ""
    for (i in numeros.indices) {
        while (numero >= numeros[i]) {
            numero -= numeros[i]
            numeroRomano += simbolos[i]
        }
    }
    return numeroRomano
}