import kotlin.math.round
import kotlin.math.pow

class Persona(var peso: Double, var altura: Double) {
    var nombre: String = ""

    var imc: Double = round((peso / altura.pow(2)) * 100) / 100

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso kg, Altura: $altura metros, IMC: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        return nombre == other.nombre && peso == other.peso &&  altura == other.altura && imc == other.imc
    }

    override fun hashCode(): Int {
        return  nombre.hashCode() * 31 + peso.hashCode() * 31 + altura.hashCode() * 31 + imc.hashCode()
    }
}
