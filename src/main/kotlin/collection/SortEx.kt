package collection

class PersonSortEx(
    val firstName: String,
    val familyName: String,
    val age: Int,
) {
    override fun toString() = "$firstName $familyName $age"
}

val PersonSortEx.fullName
    get() = "$firstName $familyName"

val PersonSortEx.reverseFullName
    get() = "$familyName $firstName"

val FULL_NAME_COMPARATOR_EX = Comparator<PersonSortEx> { p1, p2 ->
    p1.fullName.compareTo(p2.fullName)
}

val REVERSE_FULL_NAME_COMPARATOR_EX = Comparator<PersonSortEx> { p1, p2 ->
    p1.reverseFullName.compareTo(p2.reverseFullName)
}

fun main() {
    val persons = listOf(
        PersonSortEx("Brook", "Hudson", 25),
        PersonSortEx("Silver", "Watts", 30),
    )

    println(persons.sortedWith(FULL_NAME_COMPARATOR_EX))

    /* 배열, 가변 리스트의 경우 원본 컬렉션 변경 가능 -> 제자리 정렬 가능 */
    val array = intArrayOf(4, 0, 1).apply { sort() }
    println("array = $array")

    val arrayToList = listOf(1, 2, 3, 4, 5)
    println("arrayToList = $arrayToList")

    val reversedArrayToList = arrayToList.asReversed()
    println("reversedArrayToList = $reversedArrayToList")
}