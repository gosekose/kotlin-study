package class_interface

import java.io.Serializable
import java.time.Instant

class Person constructor(name: String) {
    val name: String = name
}

class Person2 constructor(val name: String) {

}

class Person3(val name: String)

class Person4(val name: String, val registered: Instant)

class Person5(
    val name: String,
    val registered: Instant
    ) : Serializable,
    Comparable<Person5> {

    override fun compareTo(other: Person5): Int {
        return this.registered.compareTo(other.registered)
    }
}

open class Person6(
    val name: String,
    val registered: Instant
)

fun objectTest(): Person6 {
    return Person6("gose", Instant.now())
}

class Person7(val name: String, val registered: Instant = Instant.now())

class Person8 private constructor(val name: String, val registered: Instant)

data class Person9(val name: String, val registered: Instant = Instant.now())