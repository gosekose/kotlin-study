package ch17

fun main() {
    val numbers = listOf(1, 2, 3)
    for (number in numbers) {
        println(number)
    }

    numbers.map { number -> number + 1 }.forEach{number -> println(number)}
    // forEach 문에서 continue와 break를 함께 쓰고 싶은 경우

    numbers.forEach {number ->
        if (number == 2) return@forEach // continue
        println(number)
    }

    loop@ for (i in 1 .. 100) { // 복잡도 증가...
        for (j in 1 .. 100) {
            if (j == 2) {
                println("break!!!")
                break@loop
            }
            println("${i}, ${j}")
        }
    }

    println()
    println(getNumberOrNull(-1))
    println(getNumberOrNullTakeIf(-1))
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) null else number
}

fun getNumberOrNullTakeIf(number: Int): Int? {
    return number.takeIf { n -> n > 0 } // 주어진 조건을 만족하면 그 값, 아니라면 null
}