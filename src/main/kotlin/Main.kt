const val ADULT_AGE = 18

val Person.isAdult get() = this.age >= ADULT_AGE
