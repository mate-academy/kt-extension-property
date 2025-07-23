const val EIGHTEEN = 18

val Person.isAdult: Boolean
    get() = this.age >= EIGHTEEN
