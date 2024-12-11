package controllers

import java.util.Scanner

/**
 * Función principal para ejecutar el programa
 */
fun main(){
    val scanner = obrirScaner()
    println(validarSuperUsuari(scanner))
    tancarScaner(scanner)
}

/**
 * Función para abrir el scanner y preguntar la contraseña al superusuario
 * @author Marc Díaz
 * @version 1.0
 *
 * @return el scanner abierto
 */
fun obrirScaner(): Scanner{
    val scanner = Scanner(System.`in`)
    return scanner
}

/**
 * Función para cerrar el scanner
 * @author Marc Díaz
 *
 * @param scanner el scanner abierto para cerrarlo al terminar el programa
 */
fun tancarScaner(scanner: Scanner){
    scanner.close()
}

/**
 * Función para introducir la contraseña del superusuario y comprobar que sea corrercta
 * @author Marc y Ainara Valdivieso
 * @version 1.0
 *
 * @param scanner para preguntar la contraseña al usuario
 * @return si la contraseña es correcta devuelve que ha pododido entrar (true)
 * en caso contrario te indica de volver a repetir la contraseña en uno de tus 3 intentos
 * si se quedan sin intentos se para el programa
 */
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