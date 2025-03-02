package Dia1



fun main() {
    println("Hola Usuario... Como es tu nombre?")
    val nombre : String = readln().toString()

    preguntarDatos(nombre)

}


fun preguntarDatos (nombre: String) {

    println("hola $nombre, nos podrias compartir estos datos?")


    println("que edad tenes?")
    var edad = readln()
    println("de donde sos?")
    var origen = readln()
    println("nomero de documento?")
    var dni = readln()
    println("y por ultimo... su numero de telefono")
    var numeroTelefono = readln()


   println("""
        datos del Usuario:
        Nombre del usuario: ${nombre}
        Edad del usuario: ${edad}
        origen del usuario: ${origen}
        Dni del Usuario: ${dni}
        numero de Telefono: ${numeroTelefono}
    """.trimIndent())

}

