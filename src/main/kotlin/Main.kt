
const val ADULT: Int = 18
val Person.isAdult: Boolean
    get() = this.age >= ADULT
