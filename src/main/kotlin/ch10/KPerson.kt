package ch10

import java.lang.IllegalArgumentException

// 코틀린 생성자는 constructor
class KPerson (val name: String, var age: Int) {
    // 자바 코드에 있는 getter, setter를 자동으로 만들어 줌

    // 초기화 시점에 호출되는 검증 로직
    init {
        if (age <= 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }
    constructor(): this("kose") {
        println("두번째 부생성자")
    }


}