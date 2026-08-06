const val AGE_OF_MAJORITY = 18
const val AGE_OF_TWENTY = 20

val Person.isAdult: Boolean
    get() = age >= AGE_OF_MAJORITY

fun main() {
    val person = Person("John Doe", AGE_OF_TWENTY)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
