
// provide your solution below
const val ADULT_AGE_THRESHOLD = 18
const val PERSON_NAME = "John Doe"
const val PERSON_AGE = 20

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE_THRESHOLD

fun main() {
    val person = Person(PERSON_NAME, PERSON_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
