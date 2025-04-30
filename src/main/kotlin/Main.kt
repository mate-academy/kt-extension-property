// provide your solution below
private const val AGE_OF_ADULT = 18

val Person.isAdult : Boolean
    get() = (this.age >= AGE_OF_ADULT)
