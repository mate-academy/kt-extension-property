const val AGE_THRESHOLD = 18
val Person.isAdult: Boolean
    get() = age >= AGE_THRESHOLD
