package ch3

import java.util.Objects

class TypeCast {

    fun changeType() {
        val number1 = 3
        val number2: Long = number1.toLong() // 타입변환 to ->  로명시적으로 바꾸기
        val result = number1 / number2.toDouble()

        println(result)
    }

    fun printNameIfPerson(obj: Any) { // Object 대신 Any 사용
        // instanceOf 대신 is 사용
        if (obj is Person) {
            val person = obj as Person // () 캐스팅은 as 로 작성

            println(person.name)
            println(obj.name) // val person 생략 가능
        }
        // !is 사용 가능
    }

    fun printStr(person: Person) {
        val log = "이 사람의 이름은 ${person.name} 입니다."
        println(log)

        val longLog = """
            ABC
            DEF
            $log
        """.trimIndent()
        println(longLog)
    }

    fun printChar(person: Person) {
        val first = person.name[0];
        println(first);
    }

    fun printNameIfPersonNull(obj: Any?) {
        val person = obj as? Person
        println(person?.name)
    }


}

class Person(var name: String) {

}