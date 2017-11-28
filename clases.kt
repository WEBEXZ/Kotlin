/*
 * Autor: Webexz
 * Objetos y métodos
*/

object Persona {
    // Atributos
    var nombre = "José"
    var edad = 20
    
    // Métodos
    fun obtenerNombre() = nombre + " tiene " + edad + " años";
}

fun main(args: Array<String>) {
    println(Persona.obtenerNombre())
}
