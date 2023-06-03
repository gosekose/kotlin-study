package ch2

import java.lang.IllegalArgumentException

class StartWith {

    fun startWithA1(str: String?): Boolean { // null 가능
        if (str == null) throw IllegalArgumentException("null!!")
        return str.startsWith("A")
    }

    fun startWithA2(str: String?): Boolean? { // null이 들어갈 수 잇으므로 Boolean에 ? 추가
        if (str == null) return null
        return str.startsWith("A")
    }

    fun startWithA3(str: String?): Boolean {
        if (str == null) return false;
        return str.startsWith("A") // 위에서 null 체크하면 컴파일러가 자동으로 str 추측
    }

    fun startWithA4(str: String?): Boolean? { // safe call 방법
        return str?.startsWith("A")
    }

    fun startWithA5(str: String?): Boolean { // safe call 호출 후 elvis 연산자 실행
        return str?.startsWith("A") ?: false
    }

    fun startWithA6(str: String?): Boolean { // 예외 던지기
        return str?.startsWith("A") ?:throw IllegalArgumentException("null!!")
    }


    fun startWithA7(str: String?): Boolean {
        str ?: return false; // early return 방법
        return str.startsWith("A")
    }

    fun startWithA8(str: String?): Boolean {
        return str!!.startsWith("A") // str이  null일 수 없는 경우 !! 로 컴파일러에게 알리기
    }
}