package Dia1

import java.text.DecimalFormat

fun main() {

    println("ingrese el radio de un circulo en CM: ")
    var radioCM = readln().toDouble()

    calcularRadio(radioCM)
}

fun calcularRadio( radio : Double){

    val formato = DecimalFormat("#,###")
    var pi : Double = 3.1415



    var area : Double = pi * radio * radio
    var circunferencia : Double = pi * 2 * radio

    println("""
        el area del circulo es ${formato.format(area)} Cm
        y su circunferencia es ${formato.format(circunferencia)} Cm
    """.trimIndent())
}