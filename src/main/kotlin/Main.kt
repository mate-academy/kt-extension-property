
// provide your solution below
const val AGE_ADULT_START: Int = 18
val Person.isAdult: Boolean
  get() = age >= AGE_ADULT_START
