
const val MAJORITY = 18

val Person.isAdult : Boolean
    get() = this.age >= MAJORITY
