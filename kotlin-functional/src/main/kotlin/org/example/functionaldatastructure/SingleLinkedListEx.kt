package org.example.functionaldatastructure

/* 해당 클래스를 상속한 모든 구현이 같은 모듈의 같은 패키지에 존재 해야 함 */
sealed class List<out A> {
    companion object {
        fun <A> of(vararg aa: A): List<A> {
            val tail = aa.sliceArray(1..<aa.size)
            return if (aa.isEmpty()) Nil else Cons(aa[0], of(*tail))
        }

        fun sum(ints: List<Int>): Int =
            when (ints) {
                is Nil -> 0
                is Cons -> ints.head + sum(ints.tail)
            }

        fun product(doubles: List<Double>): Double =
            when (doubles) {
                is Nil -> 1.0
                is Cons ->
                    if (doubles.head == 0.0) 0.0
                else doubles.head * product(doubles.tail)
            }
    }
}

/* List<out A>를 구현한 빈 리스트 */
object Nil : List<Nothing>()

/* List<out A>를 구현한 헤더와 꼬리가 있는 데이터 클래스 */
data class Cons<out A>(val head: A, val tail: List<A>) : List<A>()

fun main() {
    val ex1 = Nil
    val ex2: List<Int> = Cons(1, Nil)
    val ex3: List<String> = Cons("a", Cons("b", Nil))
}
