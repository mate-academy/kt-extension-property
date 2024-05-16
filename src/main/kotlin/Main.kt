const val  ADULT = 18
val Person.isAdult: Boolean  get() = this.age >= ADULT
