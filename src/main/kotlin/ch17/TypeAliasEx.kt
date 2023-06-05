package ch17

import ch17.java.Fruit as FruitAs

typealias FruitCustomFilter = (FruitAs) -> Boolean // 타입 별칭 사용

fun filterFruits2(fruits: List<FruitAs>, filter: FruitCustomFilter): List<FruitAs> {
    return fruits.filter(filter)
}


fun main() {
    val person = KDataPerson("kose", 1000) // data person
    val (name, age) = person // data person의 경우 구조 분해 문법 적용 (순서에 따라 값을 설정하므로 조심히 설정해야함
    println("name is ${name}, age is ${age}.")

    val name1 = person.component1() // field에 대 한 componentN 값 설정해줌
    val age1 = person.component2()

    val kNotDataPerson = KNotDataPerson("kose", 1000)
    val (name2, age2) = kNotDataPerson
}

// data class는 componentN이라는 함수를 자동으로 생성함
data class KDataPerson(val name: String, val age: Int)

// data class가 아닌경우 구조분해 가능 operator 연산자
class KNotDataPerson(val name: String, val age: Int) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}