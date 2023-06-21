package collections

open class Pair<A, B> (val first: A, val second: B)

//class List<A> (val head: A, val tail: List<A>): Pair<A, List<A>>(head, tail)

sealed class List<A> {
    abstract fun isEmpty(): Boolean

    private object Nil : List<Nothing>() {
        override fun isEmpty() = true
    }

    private class Cons<A>(
        internal val head: A,
        internal val tail: List<A>) : List<A>() {
        override fun isEmpty() = false
        private tailrec fun toString(acc: String, list: List<A>): String =
            when (list) {
                is Nil -> acc
                is Cons -> toString("$acc{list.head}, ", list.tail)
            }

    }

    companion object {
        operator
        fun <A> invoke(vararg az: A): List<A> =
            az.foldRight(Nil as List<A>) {
                a: A, list: List<A> ->
                Cons(a, list)
            }
    }
}

tailrec fun fib(n: Int, a: Int = 0, b: Int = 1): Int =
    when (n) {
        0 -> a
        1 -> b
        else -> fib(n - 1, b, a + b)
    }


fun main() {
    println(fib(10))

    val a: Int = 3
    val b: Int = 7

    
}

