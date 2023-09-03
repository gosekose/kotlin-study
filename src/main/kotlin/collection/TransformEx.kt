package collection

fun main() {
    println(setOf("red", "blue").map { it.length })
    println(listOf(1, 2, 3).map { it + it })
    println(generateSequence(50) { if (it == 0) null else it / 3 })
    println(setOf("ab", "cde").flatMap { it.asIterable() })

    val flatMapToString = listOf(listOf("abc", "bcd"), setOf("ghi")).flatMapTo(mutableListOf()) { it }
    val flatMapToAny = listOf(listOf("abc", "bcd"), setOf(1, 2, 3)).flatMapTo(mutableListOf()) { it }

    println(flatMapToString::class.qualifiedName)
    println(flatMapToAny::class.qualifiedName)

    val colorMap = listOf("red", "green", "blue").associateWith { it.length }
    println(colorMap)
    println(colorMap::class.qualifiedName)
}