package controllers
/**
 * Función principal donde se muestra el resultado
 */
fun main(){
    println(titol("electroencefalografista"))
}

/**
 * Función para centrar un texto en la  distancia de 80 espacios
 * @author Marc Díaz
 * @version 1.0
 *
 * @param titol el texto a centrar
 */
fun titol(titol: String): String{
    val pantalla = CharArray(80){' '}
    var centre = pantalla.size/2 - titol.length/2
    for (lletra in titol){
        pantalla[centre] = lletra
        centre++
    }
    val titolCentrat = pantalla.joinToString("")
    return titolCentrat
}