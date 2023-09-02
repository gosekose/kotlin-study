package collection

fun main() {

    val emptyList = emptyList<String>()
    println(emptyList)

    val immutableList = listOf("Hello")
    println(immutableList)

    val mutableList = mutableListOf("Hello")
    mutableList.add("123")

    val singletonSet = setOf<String>()
    println(singletonSet)

    val sortedSet = sortedSetOf<String>()
    sortedSet.add("123")

    val mutableMap = mutableMapOf(1 to "one", 2 to "two")
    println(mutableMap.keys)

    val sortedMap = sortedMapOf(3 to "three", 1 to "one", 2 to "two")
    println(sortedMap.keys)
}