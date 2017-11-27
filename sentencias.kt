/*
 * Autor: Webexz
 * if, else, while, when
*/

fun main(args: Array<String>) {
    val PAR = 2
    var numero = 18

    // if
    if(numero % PAR == 0) {
        println("Es un número par")
    } else {
        println("Es un número impar")
    }
    
    // when
    var mes = 7
    when(mes) {
        1 -> println("Es Enero")
        2 -> println("Es Febrero")
        3 -> println("Es Marzo")
        4 -> println("Es Abril")
        5 -> println("Es Mayo")
        6 -> println("Es Junio")
        7 -> println("Es Julio")
        else -> println("No se tiene el dato")
    }
}
