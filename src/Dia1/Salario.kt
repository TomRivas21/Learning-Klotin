package Dia1

fun main() {
    println("ingrese su salario actual: ")
    var salario = readln().toDouble()

    calcularSalario(sueldo = salario)
}

/*
en una funcion se puede poner un parametro predeterminado como el ejemplo de abajo,
 aunque si le pasamos el parametro en la funcion main, este se va a sobreescribir,
 sino va a usar el parametro predeterminado que le pusimos en el constructor de la funcion.
 */

fun calcularSalario(impuesto : Double = 16.0, sueldo: Double) {

    var totalImpuesto = (sueldo / 100) * impuesto

    println("""
        el total de dinero en impuestos es: ${totalImpuesto}
    """.trimIndent())

}
