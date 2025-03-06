package Dia2

fun main() {

    println("""
        buenas, ingresa un numero del 1 al 7 y te dire que dia es!
    """.trimIndent())
   var numero = readln().toInt()
    DiaSemana(numero)
}

fun DiaSemana(numero : Int) {

    when (numero) {

        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("miercoles")
        4 -> println("jueves")
        5 -> println("viernes")
        6 -> println("sabado")
        7 -> println("domingo")
        else -> println("no hay mas numeros")


    }

}