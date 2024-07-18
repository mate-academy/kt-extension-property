private const val VALIDAGE = 18

val Person.isAdult: Boolean
    get() = this.age >= VALIDAGE
