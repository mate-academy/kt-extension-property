const val MAJORITY_AGE = 18

val Person.isAdult: Boolean
    get() = age >= MAJORITY_AGE
