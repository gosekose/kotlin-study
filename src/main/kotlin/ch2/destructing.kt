package ch2

import jdk.jfr.Registered
import java.time.Instant

data class Person10(val name: String, val registered: Instant = Instant.now())

fun show(persons: List<Person10>) {
    for ((name, date) in persons)
        println("$name's registration date: $date")
}

fun add(a: Int, b: Int): Int = a + b

fun makePercent(a: Int, b: Int): Int {
    return if (b != 0) {
        val temp = a / b
        temp * 100
    } else {
        0
    }
}

fun makeWhen(country: String) {

    val capital = when (country) {
        "A" -> "Aan"
        "B" -> "Ban"
        "C" -> "Can"
        else -> "Unknown"
    }
}

fun printLoop1() {
    for (i in 0 until 10 step 2) println(i);
}

fun printLoop2() {
    for (i in 0 .. 10 step 2) println(i)
}

fun printLoop3() {
    for (i in 10 downTo 1 step 3) println(i)
}

fun main(args: Array<String>) {
    val persons = listOf(Person10("gose"), Person10("kose"))
    show(persons)

    println(add(3, 5))

    println(makePercent(5, 3))
    println(makePercent(5, 5))
    println(makePercent(5, 7))
    println(makePercent(5, 0))

    printLoop1()
    printLoop2()
    printLoop3()

}
