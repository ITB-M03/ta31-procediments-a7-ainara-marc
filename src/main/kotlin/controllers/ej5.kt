package controllers
import java.util.Scanner

/**
 * Función main que ejecuta el codigo
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 */
fun main(){
    val pila = crearPila(10)
    val scanner = obrirScaner()
    menuPila(scanner, pila)
    tancarScaner(scanner)
}

/**
 * Funcion para crear la pila
 * Se reserva el ultimo elemento para usarse como puntero.
 * @param tamany tamaño usable de la pila
 * @return devuelve la pila con el tamaño adecuado
 * @author Marc Diaz
 * @version 1.0
 *
 */
fun crearPila(tamany: Int): IntArray{
    val arr = IntArray(tamany+1)
    return arr
}

/**
 * Función para mostrar el menu i pedir los distintos
 * datos al usuario.
 * @param scanner escaner que se usara para leer la entrada
 * @param arr pila que se modificara
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 */
fun menuPila(scanner: Scanner, arr: IntArray){
    var sortir = false
    while (!sortir) {
        println("Escolleix la operació que vols realizar:")
        println("1.- Afegir número (push)\n2.- Treure número (pop)\n3.- Mostrar contingut de la pila\n4.- Sortir")
        val operacio = scanner.nextInt()
        when (operacio){
            1 -> {
                println("Escriu el num que vols introduir")
                val num = scanner.nextInt()
                push(num, arr)
            }
            2 -> pop(arr)
            3 -> mostrar(arr)
            4 -> sortir = true
            else -> println("Operacio no trovada")
        }
        print("\n")
    }
}

/**
 * Funcion usada para añadir un numero a la pila
 * @param num numero que se quiere añadir
 * @param arr pila a la cual se va añadir el numero
 * @author Marc Díaz i Ainara Valdivieso
 * @verion 1.0
 */
fun push(num:Int, arr: IntArray){
    if (arr.last()==arr.size-1) println("La pila es trova plena")
    else{
        arr[arr.last()] = num
        arr[arr.lastIndex]++
    }
}

/**
 * Función usada para eliminar un numero de la pila
 * @param arr pila a la cual se eliminara un numero
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 */
fun pop(arr:IntArray){
    if (arr.last() == 0) println("La pila esta buida")
    else arr[arr.lastIndex]--
}

/**
 * Función usada para mostar la pila
 * @param arr pila que se quiere mostrar
 * @author Marc Díaz i Ainara Valdivieso
 * @version 1.0
 */
fun mostrar(arr:IntArray){
    for (i in 0 until  arr.last()) print("${arr[i]} ")
    print("\n")
}