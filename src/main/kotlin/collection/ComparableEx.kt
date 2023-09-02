package collection

class Person(
    private val firstName: String,
    private val familyName: String,
    val age: Int,
) : Comparable<Person> {
    private val fullName
        get() = "$firstName $familyName"

    override fun compareTo(other: Person) = fullName.compareTo(other.fullName)
}

val AGE_COMPARATOR = Comparator<Person> { p1, p2 ->
    p1.age.compareTo(p2.age)
}

val REVERSE_AGE_COMPARATOR = compareByDescending<Person> { it.age }

fun main() {
    val list = mutableListOf(31, 2, 35, 2, 3)

    list.sortBy { it }
    list.sortByDescending { it }

    list.forEach { println(it) }
}