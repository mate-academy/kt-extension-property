const val MIN_ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = this.age >= MIN_ADULT_AGE
