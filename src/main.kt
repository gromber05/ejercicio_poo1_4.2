import kotlin.math.round
import kotlin.math.pow

class Persona(var peso: Double, var altura: Double) {
    var nombre: String = ""

    private var imc: Double = round((peso / altura.pow(2)) * 100) / 100

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso kg, Altura: $altura metros, IMC: $imc"
    }

}

fun main () {

    val persona = Persona(70.2, 1.80)

    persona.nombre = "Pepe"

    println(persona)
}