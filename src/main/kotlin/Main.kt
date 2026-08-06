const val ADULT = 18

val Person.isAdult: Boolean
    get() = age >= ADULT
