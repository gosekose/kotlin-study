package ch5

import java.lang.IllegalArgumentException

class ValidateScore {

    fun validateScoreIsNotNegative(score: Int) {
        if (score < 0) throw IllegalArgumentException("점수는 0보다 작을 수 없습니다. 현재 점수 : ${score}")
        println("현재 스코어는 ${score} 입니다.")
    }

    fun getPassOrFail(score: Int) : Boolean {
        if (score >= 50) return true
        return false
    }

    // 코틀린의 if-else 는
    fun getPassOrFailFromExpression(score: Int) {
        var pass = score >= 50
        println("합격여부 = ${pass}")
    }


    fun getGrade(score: Int) : String {
        if (score >= 80) return "A"
        else if (score >= 50) return "B"
        else if (score >= 30) return "C"
        return "D"
    }

    fun getGradeByIn(score: Int) : String {

        if (score in 0..100) return "A"
        if (score !in -100 .. 0) return "B"
        return "c"
    }

    fun getGradeWithSwitch(score: Int) : String {
        return when (score / 10) { // switch case 대체
            9 -> "A"
            8 -> "B"
            7 -> "C"
            else -> "D"
        }
    }

    fun getGradeWithWhenAndIn(score: Int) : String {
        return when (score) {
            in 90 .. 99 -> "A"
            in 80 .. 89 -> "B"
            else -> "D"
        }
    }

    fun startsWithA(obj: Any): Boolean {
        // 스마트 캐스트를 활용하여 String인 경우엔 자동으로 String으로 컴파일 -> A로 시작하는지 확인
        return when (obj) {
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println("정답입니다.")
            else -> println("틀렸습니다.")
        }
    }

    fun judgeNumber(number: Long) {
        when {
            number == 0L -> println("주어진 숫자는 0")
            number % 2L == 0L -> println("짝수")
            else -> println("홀수")
        }
    }


}