package extension

/* 동반 확장 */
val IntRange.leftHalf: IntRange
    get() = start..(start + endInclusive) / 2


/* 람다와 수신 객체 지정 함수 타입 ₩*/
fun aggregate(numbers: IntArray, op: Int.(Int) -> Int): Int {
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("empty")

    for (i in 1..numbers.lastIndex) result = result.op(numbers[i])

    return result
}

fun sum(numbers: IntArray) = aggregate(numbers) { op -> this + op }

fun main() {
    println((1..3).leftHalf)
    println((1..5).leftHalf)
}