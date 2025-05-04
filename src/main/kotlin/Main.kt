const val EMANCIPATION = 18

val Person.isAdult: Boolean get() = this.age >= EMANCIPATION
