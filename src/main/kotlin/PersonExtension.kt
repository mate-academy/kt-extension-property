const val AGE = 17
val Person.isAdult: Boolean
    get() = this.age > AGE
