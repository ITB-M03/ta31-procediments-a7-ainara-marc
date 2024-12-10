package controllers

import java.util.Scanner

fun main(){
    val scanner = obrirScaner()
    println(validarSuperUsuari(scanner))
    tancarScaner(scanner)
}
fun obrirScaner(): Scanner{
    val scanner = Scanner(System.`in`)
    return scanner
}
fun tancarScaner(scanner: Scanner){
    scanner.close()
}
fun validarSuperUsuari(scanner: Scanner): Boolean{
    val contrasena = "qwerty"
    var comptador = 3
    var encertar = false
    print("Introdueix Constrasenya: ")
    while (comptador>0 && !encertar){
        comptador--
        val intent = scanner.nextLine()
        if (intent==contrasena) encertar = true
        else println("Incorrecte torna a intentar. Et queden $comptador intents")
    }
    return encertar
}