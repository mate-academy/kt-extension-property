const val OLD = 17
val Person.isAdult: Boolean
    get() = this.age>OLD

fun main() {
    val person = Person("John Doe", OLD)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
