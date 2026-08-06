// Please, do not modify this class!
// Imagine, this class is provided by an external library,
// and you don't have access to its source code.
// Provide your solution in the Main.kt class
const val ADULT_AGE = 18

class Person(val name: String, val age: Int)

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE
