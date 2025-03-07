package Dia2


fun main() {

    var topeDeDinero : Int = 1000

    println("""
        buen dia, Cajero automatico a sus ordenes
        Cuanto dinero necesita sacar?
    """.trimIndent())



    while (topeDeDinero != 0) {

        val dineroRetirado = readln().toIntOrNull()

        if (dineroRetirado == null || dineroRetirado <= 0) {
            println("por favor ingrese un numero valido")
            continue
        }

        if (dineroRetirado > topeDeDinero) {
            println("no tiene suficiente dinero en la cuenta, su saldo actual es de ${topeDeDinero}$")
        }
        else {
            println("usted a retirado ${dineroRetirado}$")
            topeDeDinero -= dineroRetirado
            println("su saldo actual es ${topeDeDinero}")
        }

        if (topeDeDinero == 0) {
            println("ya no tiene dinero en la cuenta")
        }

    }



}