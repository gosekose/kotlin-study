package collection

data class CollectionPerson(
    val firstName: String, val familyName: String, val age: Int
)

val CollectionPerson.fullName
    get() = "$firstName $familyName"

val CollectionPerson.reverseFullName
    get() = "$familyName $firstName"

val FULL_NAME_COMPARATOR = Comparator<CollectionPerson> { p1, p2 ->
    p1.fullName.compareTo(p2.fullName)
}

val FULL_NAME_REVERSE_COMPARATOR = Comparator<CollectionPerson> { p1, p2 ->
    p1.reverseFullName.compareTo(p2.reverseFullName)
}

fun main() {
    val list = listOf(1, 2, 3)

    println(list.first())
    println(list.last())

    println(list.firstOrNull())
    println(list.lastOrNull())

    println(list.first { it > 2 })
    println(list.firstOrNull { it > 3 })

    /* 조건 검사: all - 모든 원소가 성립할 경우 true */
    println(list.all() { it > 0 })
    println(list.all() { it < 2 })

    /* 조건 검사: none - 모든 원소가 성립 하지 않은 경우 true */
    println(list.none() { it > 0 })
    println(list.none() { it < 2 })

    /* 조건 검사: any - 어느 한 원소라도 만족할 경우 true */
    println(list.any() { it > 2 })

    /* 집계 / 무한 시퀀스에 대해서는 예외 발생 */
    println(list.count { it < 2 })
    println(list.sum())
    println(list.average())
    println(list.minOrNull())
    println(list.maxOrNull())

    val personList = listOf(
        CollectionPerson("g", "o", 100),
        CollectionPerson("g", "i", 100),
        CollectionPerson("h", "k", 100),
    )

    /* 가장 큰 것을 정렬 방식에서 가져오기 */
    println(personList.maxWithOrNull(FULL_NAME_COMPARATOR))

    /* 커스텀 정렬 방식으로 정렬하기 (with) */
    println(personList.sortedWith(FULL_NAME_REVERSE_COMPARATOR))

    /* 리스트 문자열로 합치기 */
    println(list.joinToString())
    println(list.joinToString(separator = "_"))
    println(personList.joinToString(
        separator = "_",
        prefix = "[",
        postfix = "]",
    ) { it.familyName })

    /* reduce 활용 */
    println(list.reduce { one, two -> one * two })
    println(listOf(1).reduce { one, two -> one * two })
    println(list.reduce { one, two -> one + two })

    /* 누적값에 홀수를 처리해도 초기값은 무조건 적용이 되는 문제 발생 */
    println(listOf(1, 2, 3, 4).reduceIndexed { i, one, two -> if (i % 2 == 1) one + two else one })

    /* 컬렉션을 다른 타입으로 만들기 */
    println(listOf(1, 2, 3, 4).fold("") { acc, n -> acc + ('a' + n - 1) })

    /* 초기값을 원하는 홀수부터 적용되도록 가능 */
    println(listOf(1, 2, 3, 4).foldIndexed("") { i, acc, n -> if (i % 2 == 1) acc + ('a' + n - 1) else acc })
}