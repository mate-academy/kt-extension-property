

const val ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = this.age >= ADULT_AGE
