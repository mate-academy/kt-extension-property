# Extension property

In this task, you will implement an isAdult Extension Property for the Person Class in Kotlin

Suppose you have a `Person` class defined in your project or in a library you are using, which only includes basic
information like `name` and `age`:

```kotlin
class Person(val name: String, val age: Int)
```

Let's say you frequently need to check if a person is an adult (age 18 or older) across various parts of your
application. Instead of repeatedly writing this logic everywhere in your code, you need to define an extension property `isAdult`.

Usage example:

```kotlin
fun main() {
    val person = Person("John Doe", 20)

    if (person.isAdult) {
        println("${person.name} is an adult.")
    } else {
        println("${person.name} is not an adult.")
    }
}
```

Output:

```
John Doe is an adult.
```
