
// provide your solution below

const val THRESHOLD = 18

val Person.isAdult : Boolean
    get() = this.age >= THRESHOLD
