package ch11

val NUM = 3

fun add(a: Int, b: Int): Int {
    return a + b + NUM
}

class Dog()

class Monkey private constructor()

// 유틸성 코드
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    var price = _price
        private set
}

class CarCall(val car: Car) {

    fun call() {

        println(car.name) // car name 호출 가능

        // car owner 호출 x

        println(car.price) // car price 호출 가능
    }
}