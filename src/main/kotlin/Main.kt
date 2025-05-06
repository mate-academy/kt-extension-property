// provide your solution below
private const val MATURE_AGE = 18

val Person.isAdult: Boolean
    get() = this.age >= MATURE_AGE

