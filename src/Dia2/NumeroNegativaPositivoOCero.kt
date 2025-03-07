package Dia2

fun main(){
    println("""
        ingresa un numero y el algoritmo determinara si es positivo, negativo o 0
    """.trimIndent())
  val numero = readln().toIntOrNull()

    if ( numero == null) {
        println("la entrada es nula")
    }
    else {
        determinarNumero(numero)
    }


}

fun determinarNumero(numero : Int) {

    when {

        numero < 0 -> println("este numero es negativo")
        numero > 0 -> println("este numero es positivo")
        numero == 0 -> println("es numero es 0")

    }

}