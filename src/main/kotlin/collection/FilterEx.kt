package collection

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4, "e" to 2)

    println(list.filter { it < 4 })
    println(list.filterNot { it < 2 })
    println(list.filterIndexed { i, v -> i < 3 && v < 2})

    println(map.filterKeys { it == "a" })
    println(map.filterValues { it == 2 })
}