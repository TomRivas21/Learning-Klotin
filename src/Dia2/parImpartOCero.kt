package Dia2

fun main() {
    println("ingresa un numero y el programa determira si es un par, impar o 0: ")
    var numero = readln().toInt()

    identificarNumero(numero)

}

fun identificarNumero( numero : Int) {

    if (numero % 2 == 0){
        println("el numero $numero es par")
    } else if (numero % 2 == 1) {
        println("el numero $numero es impar")
    } else {
        println("este numero es un 0")
    }

}