package ch7

import java.lang.IllegalArgumentException
import kotlin.NumberFormatException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str}은 문자열이 아닙니다.")
    }
}

// 코틀린 return - catch 로 익스프레션 가능
fun parseIntOrNull(str: String) : Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("str ${str}")
    }
}