const val TEST_EXAMPLE_AGE = 13
fun main() {
    val person = Person("Veronika", TEST_EXAMPLE_AGE)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
