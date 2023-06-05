package ch6

class RepeatCase {

    fun printList() {
        val numbers = listOf(1, 2, 3)
        for (number in numbers) {
            println(number)
        }

        for (number in numbers) println(number)
        for (i in 1 .. 3) println(i) // .. 연산자는 범위
        for (i in 3 downTo 1) println(i)
        for (i in 1 .. 7 step 2) println(i) // .. step 1 .. 3 -> 1 ~ 3 에서 시작하고 등차 시작과 끝

        // downTo, step도 중위함수

        var cnt = 1

        while(cnt < 5) {
            println(cnt)
            cnt++
        }
    }
}