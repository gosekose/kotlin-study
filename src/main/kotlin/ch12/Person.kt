package ch12

import kotlin.text.StringBuilder

class Person private constructor (
    var name: String,
    var age: Int) {

    // 클래스와 동행하는 유일한 오브젝트 => 동행 객체 -> static 변수가 없음
    companion object Factory : Log {
        private const val MIN_AGE = 1 // const를 붙이면 컴파일시에 할당 --> 진짜 상수

        @JvmStatic // java에서 static을 사용하기 위함
        fun newBaby(name: String): Person {
            info(name)
            return Person(name, MIN_AGE)
        }

        override fun info(name: String) {
            println("This is kotlin Person, name = ${name}")
        }
    }

}