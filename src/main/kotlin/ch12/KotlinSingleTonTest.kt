package ch12

object SingleTon {
    var a: Int = 0
}

fun test() {
    SingleTon.a = 10
}