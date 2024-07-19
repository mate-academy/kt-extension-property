private const val ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = age >= ADULT_AGE
