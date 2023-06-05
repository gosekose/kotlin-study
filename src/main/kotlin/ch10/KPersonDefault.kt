package ch10

import java.lang.IllegalArgumentException

class KPersonDefault (val name: String = "kose", var age: Int = 1) {

    init {
        if (age < 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // 프로퍼티처럼 생성 가능
    val isAdult: Boolean
        get() = this.age >= 20

    val isAdult2: Boolean
        get() {
            return this.age >= 20
        }

    val name2: String = name
        get() = field.uppercase()

    // 프로퍼티
    val name3: String
        get() = this.name.uppercase()


}