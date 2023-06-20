package class_interface

import jdk.jfr.Registered
import java.time.Instant

data class Person10(val name: String, val registered: Instant = Instant.now())

fun show(persons: List<Person10>) {
    for ((name, date) in persons)
        println("$name's registration date: $date")
}

fun main(args: Array<String>) {
    val persons = listOf(Person10("gose"), Person10("kose"))
    show(persons)
}