const val ADULT_AGE = 18
const val PERSON_AGE = 20

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE

fun main() {
    val person = Person("John Doe", PERSON_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
