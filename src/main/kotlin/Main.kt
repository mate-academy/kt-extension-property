const val PERMIT_AGE = 18

val Person.isAdult : Boolean
    get() = this.age >= PERMIT_AGE
