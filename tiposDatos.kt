/*
 * Autor: Webexz
 * Tipos de datos
 * Variables
 * Constantes
*/

fun main(args: Array<String>) {
    // variable
    var numero = 10
    var verdadero = true
    var caracter = 'C'
    var cadena = "Hola"
    var decimal = 10.0
    
    // constantes
    val PI = 3.1416
    
    // Pregunta si es un entero
    if(numero is Int) {
        println("Numero")
    }
    
    // Pregunta si es un caracter
    if(caracter is Char) {
        println("Caracter")
    }
    
    // Pregunta si es una cadena
    if(cadena is String) {
        println("Cadena")
    }
    
    // Pregunta si es un decimal
    if(decimal is Double) {
        println("Decimal")
    }
    
    // Pregunta si es un booleano
    if(verdadero is Boolean) {
        println("Booleano")
    }
    
    // Pregunta si PI es 3.1416
    if(PI == 3.1416) {
        println("Valor de PI")
    }

    // Variable de cualquier tipo
    var cualquierTipo: Any
    cualquierTipo = 10
    println(cualquierTipo)
    cualquierTipo = "hola"
    println(cualquierTipo)
}
