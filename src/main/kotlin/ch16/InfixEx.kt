package ch16

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4 // 중위함수
}