package controllers
import java.util.Scanner

fun main(){

    val pila = IntArray(10){Int.MIN_VALUE}
    val scanner = obrirScaner()
    menuPila(scanner, pila)
    tancarScaner(scanner)
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
    var i = 0
    var afegit = false
    while (i < arr.size && !afegit){
        if (arr[i] != Int.MIN_VALUE) i++
        else {
            arr[i] = num
            afegit = true
        }
    }
    if(afegit==false) println("La pila es trova plena")
}

fun pop(arr:IntArray){
    try {
        for(i in 0 until arr.size){
            if (arr[i]== Int.MIN_VALUE) arr[i-1] = Int.MIN_VALUE
            else if (i == arr.size-1) arr[i] = Int.MIN_VALUE
        }
    }
    catch (ex: IndexOutOfBoundsException){
        println("La pila esta buida")
    }

}

fun mostrar(arr:IntArray){
    for (i in arr) if (i != Int.MIN_VALUE) print("$i ")
    print("\n")
}