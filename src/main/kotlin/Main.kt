private const val ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE

private const val SAMPLE_AGE = 20

fun main() {
    val person = Person("John Doe", SAMPLE_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
