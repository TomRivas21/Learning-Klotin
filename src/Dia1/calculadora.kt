package Dia1

import java.security.Principal

fun main() {
    println("ingrese dos numeros:")
    println("primer numero: ")
    var numeroUno = readln().toInt()
    println("segundo numero: ")
    var numeroDos = readln().toInt()

    println("ingrese la operacion que desee hacer.")
    var operacion : String  = readln().toString()



    calcular(numeroUno, numeroDos, operacion)


}

fun calcular (numeroUno: Int, numeroDos: Int, operacion: String) {

    var numero1 = numeroUno
    var numero2 = numeroDos

    if (operacion == "+") {
        println( numero1 + numero2)
    } else if (operacion == "-") {
        println( numero1 - numero2)
    }else if (operacion == "*") {
        println( numero1 * numero2)
    } else if (operacion == "/") {
        println( numero1 / numero2)
    } else {
        print("no pusiste ningun operador")
    }
}

