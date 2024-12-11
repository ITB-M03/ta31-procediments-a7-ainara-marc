package controllers
import java.util.Scanner

fun main(){

    val pila = crearPila(10)
    val scanner = obrirScaner()
    menuPila(scanner, pila)
    tancarScaner(scanner)
}

fun crearPila(tamany: Int): IntArray{
    val arr = IntArray(tamany+1)
    return arr
}
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

fun push(num:Int, arr: IntArray){
    if (arr.last()==arr.size-1) println("La pila es trova plena")
    else{
        arr[arr.last()] = num
        arr[arr.lastIndex]++
    }
}

fun pop(arr:IntArray){
    if (arr.last() == 0) println("La pila esta buida")
    else arr[arr.lastIndex]--
}

fun mostrar(arr:IntArray){
    for (i in 0 until  arr.last()) print("${arr[i]} ")
    print("\n")
}