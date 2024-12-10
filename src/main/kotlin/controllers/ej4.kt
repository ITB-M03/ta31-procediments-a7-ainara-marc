package controllers

fun main(){
    println(titol("electroencefalografista"))
}
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