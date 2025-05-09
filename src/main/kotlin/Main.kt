const val ADULTAGE = 18

val Person.isAdult: Boolean
get() = this.age >= ADULTAGE
