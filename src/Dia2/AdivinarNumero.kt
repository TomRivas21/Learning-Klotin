package Dia2

import kotlin.random.Random

fun main() {

    val numeroSecreto = Random.nextInt(1,11)

    var intento: Int? = null
    var intentos = 0

    println("""
        Hola, esto es un juego de adivinar el numero generado por la maquicna, por favor ingrese un numero del 1 al 10
        En el caso de que el numero sea incorrecto tendras una pista y la oportunidad de repetir numero.
    """.trimIndent())

    while (intento != numeroSecreto) {

        intento = readln().toIntOrNull()

        if (intento == null){
            println("la entrada es NULL")
        } else {

            when {

                intento < numeroSecreto -> println("este numero es menor")
                intento > numeroSecreto -> println("este numero es mayor")
                intento == numeroSecreto -> println("""
                    es correcto, el numero secreto era ${intento}
                """.trimIndent())
            }
            intentos ++
        }

    }

    println("numero de intentos: ${intentos}")





}