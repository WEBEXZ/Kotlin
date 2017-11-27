/*
 * Autor: Webexz
 * Errores comunes
*/

fun main(args: Array<String>) {
    // Cambiar valor de una constante
    val PI = 3.1416
    println(PI)
    PI = 3.0

    // Cambiar de tipo una variable
    var numero = 10
    numero = "20"
    println(numero)

    /*
        Solución 1:
        numero = "20".toInt()

        Solución 2:
        var numero: Any = 10
    */
}
