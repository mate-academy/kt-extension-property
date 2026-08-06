const val ADULT_AGE = 18
const val TEST_AGE = 20

fun main() {
    val person = Person("John Doe", TEST_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}

val Person.isAdult: Boolean get() = this.age >= ADULT_AGE
