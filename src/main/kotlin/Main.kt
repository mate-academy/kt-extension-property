const val ADULT = 18
const val CHECKADULT = 20

// provide your solution below
val Person.isAdult: Boolean
    get() = this.age >= ADULT

fun main() {
    val person = Person("John Doe", CHECKADULT)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
