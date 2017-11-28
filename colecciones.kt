/*
 * Autor: Webexz
 * Arreglos, Listas
*/

fun main(args: Array<String>) {
    // Arreglo de números
    var numeros: IntArray = intArrayOf(1, 2, 3, 4)
    // Arreglo de letras
    var letras: CharArray = charArrayOf('a', 'b', 'c', 'd')
    // Arreglo de cadenas
    var oracion = arrayOf("Buen", "dia")
    // Lista
    var lista: ArrayList<String> = arrayListOf("Hola", "buen")
    
    // Obtener contenido del arreglo
    println(oracion[0])
    println(oracion[1])
    
    // Obtener contenido del arreglo
    println(lista.get(0))
    println(lista.get(1))
    
    // Recorrer arreglo
    for(elemento in numeros) {
        println(elemento)
    }
    
    // Recorrer lista
    for(elemento in lista) {
        println(elemento)
    }
    
    // Recorrer lista
    lista.map{println(it)}
}
