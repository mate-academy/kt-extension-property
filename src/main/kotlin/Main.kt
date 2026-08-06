const val AGE = 18

val Person.isAdult: Boolean
    get() { if (age >= AGE) {
        return true
    } else {
        return false
    }    }

