const val ADULT_BOUNDARY = 18

val Person.isAdult: Boolean
    get() = this.age >= ADULT_BOUNDARY
