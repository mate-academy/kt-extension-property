
// provide your solution below
const val TEST_AGE = 20
const val TEST_AGE_STOP = 16

fun main() {

    val adult = Person("Олексій", TEST_AGE)
    val teenager = Person("Марія", TEST_AGE_STOP)

    println("${adult.name} дорослий? ${adult.isAdult}")      // true
    println("${teenager.name} доросла? ${teenager.isAdult}") // false

    // Приклад використання в умові
    if (adult.isAdult) {
        println("${adult.name} може отримати водійське посвідчення.")
    }
}
