private const val AGE_ADULT = 18

val Person.isAdult: Boolean get() = this.age >= AGE_ADULT
