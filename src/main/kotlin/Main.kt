const val AGE_OF_ADULT_PERSON = 18

val Person.isAdult: Boolean
    get() = age >= AGE_OF_ADULT_PERSON

