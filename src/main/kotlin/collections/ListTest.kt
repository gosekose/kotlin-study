package collections

fun main(args: Array<String>) {
    val immutableName = listOf("son", "cha", "park")
    for (i in immutableName.indices) { // 색인 연산자
        println(immutableName[i])
    }

    for (i in 0 until immutableName.size) { // until
        println(immutableName[i])
    }

    for (i in 0 .. immutableName.size - 1) {
        println(immutableName[i])
    }

    val mutableName = mutableListOf("son", "cha", "park")
    mutableName.add("kim")
    for (i in mutableName.indices) {
        println("name is ${mutableName[i]}")
    }

    val mutableNullName = mutableListOf("son", "cha", "park", null)

    for ((index, i) in mutableNullName.filterNotNull().withIndex()) {
        println("index = ${index}, name = ${i}")
    }

    val immutableMap = mapOf("a" to "b")

    val mutableMap = mutableMapOf("a" to "b")
    mutableMap["c"] = "d"
    mutableMap.remove("c")
    mutableMap.replace("c", "k")

    for ((key, value) in mutableMap.entries) {
        println("key = ${key}, value = ${value}")
    }

    val mutableMapMinusA = mutableMap - "a" // key -> "a"가 빠진 새로운 객체
    for (entry in mutableMapMinusA) {
        println("entry = ${entry}")
    }

    val mutableMapPlusE = mutableMap + ("e" to "g") // key -> "e"가 추가된 새로운 객체
    for (mutableEntry in mutableMap) {
        println("mutableEntry = ${mutableEntry}")
    }

    val immutableSet = mutableSetOf<String>("a")
    immutableSet.add("b")

}

