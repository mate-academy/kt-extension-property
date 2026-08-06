private const val ADULT_AGE = 20

fun main() {
    val person = Person("John Doe", ADULT_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
