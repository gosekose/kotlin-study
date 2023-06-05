package ch17

import ch17.java.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 2_000),
        Fruit("사과", 1_100),
        Fruit("바나나", 1_040),
        Fruit("사과", 1_400),
        Fruit("바나나", 1_200),
        Fruit("사과", 1_300),
        Fruit("사과", 1_100),
    )

    // 이름없는 함수 람다
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

//    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
//        return fruit.name == "사과"
//    }

    // -> 를 할용한 람다
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0]) // 직접 넣기
    isApple.invoke(fruits[0]) // invoke 호출

    val filterFruits1 = filterFruits(fruits, isApple)
    println("kotlin 스트림 확인")
    for (fruit in filterFruits1) {
        println("fruit.price = ${fruit.price}")
    }

    // 람다식에 바로 fruit를 바로 작성하기
    val filterFruits2 = filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    println("kotlin 스트림2 확인")
    for (fruit in filterFruits1) {
        println("fruit.price = ${fruit.price}")
    }

    filterFruits(fruits) {it.name == "사과"}
    println("kotlin 스트림3 확인")
    for (fruit in filterFruits1) {
        println("fruit.price = ${fruit.price}")
    }

    // expression의 경우 마지막 줄이 람다의 리턴 타입으로 설정
    filterFruits(fruits) {fruit: Fruit ->
        println("사과만 받는다.")
        fruit.name == "사과"
    }
    println("kotlin 스트림3 확인")
    for (fruit in filterFruits1) {
        println("fruit.price = ${fruit.price}")
    }

}

// 코틀린 고차함수 filter
fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}