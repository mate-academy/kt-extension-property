
// provide your solution below
const val LEGAL_ADULT_AGE = 18

val Person.isAdult: Boolean
    get() = age >= LEGAL_ADULT_AGE
