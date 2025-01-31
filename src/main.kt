

fun main () {

    val persona1 = Persona(70.2, 1.80)
    val persona2 = Persona(72.9 , 1.90)
    val persona3 = Persona(56.2, 1.55)

    println("Introduzca el nombre de la persona 1 »» ")
    persona1.nombre = readln()

    println("${persona1.nombre} ${persona1.peso} ${persona1.altura}")

    println("${persona3.peso} ${persona3.altura} ${persona3.imc}")
    persona3.altura = 1.80
    println("${persona3.peso} ${persona3.altura} ${persona3.imc}")

    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)

    println(persona2.equals(persona3))
}